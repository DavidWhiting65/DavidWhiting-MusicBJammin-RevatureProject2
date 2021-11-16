import { Component, OnInit } from '@angular/core';
import { SimpleSong } from '../models/simplesong';
import { SongService } from '../services/song.service';
//import { Song } from '../models/song';

@Component({
  selector: 'app-musicianhomepage',
  templateUrl: './musicianhomepage.component.html',
  styleUrls: ['./musicianhomepage.component.css']
})

export class MusicianhomepageComponent implements OnInit {

  title: string = " ";
  musician_id: number = 0;
  url: string = " ";
  song!: SimpleSong;  

  constructor(private songService: SongService) { }

  ngOnInit(): void {

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
        }
      )
      window.location.reload();
    }
  /* playSong: boolean = false;

  makePlaySong() {
    this.playSong = !this.playSong;
  }
 */

}
