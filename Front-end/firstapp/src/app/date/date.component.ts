import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-date',
  templateUrl: './date.component.html',
  styleUrls: ['./date.component.css']
})
export class DateComponent implements OnInit {

  dateMassage: string ;
  somenum: number = 10;

  constructor() {
    setInterval(() => {
    let currentDate = new Date();
    this.dateMassage = currentDate.toDateString() + ' ' + currentDate.toLocaleTimeString();
    } , 1000)
   }
  addSomeNum(a:number, b:number){
    return a+b;
  }

  ngOnInit() {
  }

}
