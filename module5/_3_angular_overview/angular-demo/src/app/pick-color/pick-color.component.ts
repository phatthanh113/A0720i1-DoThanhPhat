import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pick-color',
  templateUrl: './pick-color.component.html',
  styleUrls: ['./pick-color.component.css']
})
export class PickColorComponent implements OnInit {
  color:String = "red";
  students  = ['1','2','3'];
  constructor() { }

  ngOnInit(): void {
  }

}
