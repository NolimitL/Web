import { Component } from '@angular/core';
import axios from 'axios';
import { User } from './address-card/user.model';
import { ExtraIn } from './extra/extra-inf';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  userIN: User;
  extrainform: ExtraIn;
  
  constructor(){
    this.extrainform = new ExtraIn;
    this.extrainform.age = 23;
    this.extrainform.experience = '3 years';
    this.extrainform.work = 'Fullstack developer';
    this.extrainform.skills = [
      'Java Core',
      'Spring API',
      'HTML, CSS, JS',
      'Angular',
      'MongoDB'
    ];

    this.userIN = new User;
    this.userIN.name = 'Leo Grud';
    this.userIN.designation = 'Junior Developer';
    this.userIN.address = [
      '"My future Str. 54"',
      'Pal Alto, USA'
    ];
    this.userIN.phone = '+15689245721';
  }
 
 
  // items = [];
  // name = 'Leo';
  // getItems(){
  //   axios.get('http://localhost:8081/topic').then(response => this.items = response.data);
  // };

}