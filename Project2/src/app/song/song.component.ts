import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-song',
  templateUrl: './song.component.html',
  styleUrls: ['./song.component.css']
})
export class SongComponent implements OnInit {

  /* for ngIf */
  condition: boolean = true;
  anotherCondition: boolean = true;

  changeCondition(): void {
    this.condition = !this.condition;
    this.anotherCondition = !this.anotherCondition;
  }

  /* for ngFor */
  songs: string[] = [
    'Free Bird',
    'Stairway To Heaven',
    'Strawberry Fields',
    'American Pie',
    'Ripple',
    'Satisfaction',
    'Not Fade Away',
    'Lean On Me',
    'Purple Rain'
  ];



  // ngSwitch
  time: string = '';

  changeTimeOfDay(desiredTime: string) {
    this.time = desiredTime;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
