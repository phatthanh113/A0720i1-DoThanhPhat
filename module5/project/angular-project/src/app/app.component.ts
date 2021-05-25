import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  textSearch : String ;
  textChangedHandler(text : String) {
    this.textSearch = text;
    console.log(text)
  }
  title = 'angular-project';
}
