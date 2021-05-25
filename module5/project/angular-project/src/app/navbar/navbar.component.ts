import { Router } from '@angular/router';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Location } from '@angular/common';
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {
  text : String = '' ;
  constructor(private location : Location,private route: Router) { }

  ngOnInit(): void {

  }
  onClick() {
   this.route.navigate(['/products/search'],{queryParams : {search : this.text}});
  }
}
