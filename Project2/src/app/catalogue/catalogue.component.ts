import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { SimpleSong } from '../models/simplesong';
import { Song } from '../models/song';
import { SongForPut } from '../models/songforput';
import { SongService } from '../services/song.service';

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.css']
})
export class CatalogueComponent implements OnInit {

  /*for 2 way binding */
  musician_name: string = " ";
  song_name: string = " ";

  title: string = " ";
  musician_id: number = 0;
  url: string = " ";

  song_id: number = 0;

  songs: Song[] = [];

  song!: SimpleSong;

  song2!: Song;

  song3!: SongForPut;

  songObservable!: Song;

  constructor(private songService: SongService) { }

  ngOnInit(): void {
    this.getSongs();
  }

  getSongs(){
    this.songService.getSongs() // returns observable of Song[]
    .subscribe(
      resp => {
        this.songs = resp;
      }
    )
  }

  getASong(id: any): Observable<any>{
    console.log("Song id "+ id);
    const songObservable = new Observable();
    this.songService.getASong(id) // returns observable of Song
    .subscribe(
      resp => {
        this.song3 = {
          id: resp.id,
          title: resp.title,
          likes: resp.likes,
          dislikes: resp.dislikes,
          musician_id: resp.musician_id,
          url: resp.url
        };
        this.songObservable = resp;
        console.log("resp "+ JSON.stringify(resp));
        console.log("this.song3" + JSON.stringify(this.song3))
      }
    )
    console.log("songObservable: " + songObservable);
    console.log("JSON songObservable: " + JSON.stringify(songObservable));
    return songObservable;
  }

  addSong()
    {
      const tit = this.title.trim();
      const mi= this.musician_id; 
      const u= this.url.trim();     
      console.log("title is "+ tit);
      console.log(" musician id is "+ mi);

      this.song = {
        title: tit,
        musician_id: mi,
        url: u
      }

      console.log("this.song is" + this.song);

      this.songService.addSong(this.song) 
      .subscribe(
        resp => {
          console.log("resp: "+resp);
          this.getSongs();
        }
      )
    }

    likeSong(id: number)
    {
      const si = this.song_id;  
      const l = 1;
      //const song = this.getASong(id);
      console.log("song id is "+ si);
      this.getASong(id);
      console.log("this.song3:" + JSON.stringify(this.song3));
      
      this.songService.likeSong(this.song2) 
      .subscribe(
        resp => {
          console.log("resp: "+resp);
          this.getSongs();
        }
      )
    }

}