import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  firstNumber : number;
  secondNumber : number;
  calcu : string="+";
  result:number;
  constructor() { }

  ngOnInit(): void {
  }
  onClick() {
    this.result = eval(this.firstNumber + this.calcu + this.secondNumber) ;
  }
}
