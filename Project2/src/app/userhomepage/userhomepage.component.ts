import { Component, OnInit } from '@angular/core';
import { Follower } from '../models/follower';
import { FullFollower } from '../models/fullfollower';
import { FollowerService } from '../services/follower.service';

@Component({
  selector: 'app-userhomepage',
  templateUrl: './userhomepage.component.html',
  styleUrls: ['./userhomepage.component.css']
})
export class UserhomepageComponent implements OnInit {

/*for 2 way binding */
fans_id: number = 0;
musicians_id: number = 0;

followers: FullFollower[] = [];

follower!: Follower;

  constructor(private followerService: FollowerService) { }

  ngOnInit(): void {
    this.getFollowers();
  }

  getFollowers(){
    this.followerService.getFollowers() // returns observable of Song[]
    .subscribe(
      resp => {
        this.followers = resp;
      }
    )
  }

  followMusician()
  {
    const fi = this.fans_id;
    const mi= this.musicians_id; 
    console.log("fans_id is "+ fi);
    console.log(" musicians_id is "+ mi);

    this.follower = {
      fans_id: fi,
      musicians_id: mi,
    }

    console.log("this.follower is" + this.follower);

    this.followerService.addFollower(this.follower) 
    .subscribe(
      resp => {
        console.log("resp: "+resp);
       this.getFollowers()
      }
    )
  }

}
