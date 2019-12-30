import { Component } from '@angular/core';
import axios from 'axios';
import { User } from './address-card/user.model';
import { ExtraIn } from './extra/extra-inf';
import { FuntionalService } from './funtional.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  routes = [
    { linkName:"Home", url:"home"},
    { linkName:"Settings", url:"settings"},
  ]
  
  userIN: User;
  extrainform: ExtraIn;
  inputText: string = 'Write text';
  
  constructor(private funsvc:FuntionalService, private http:HttpClient){
    //obs (obsevable/observe - наблюдаемый/обзор)
    // let obs = this.http.get('https://api.github.com/users/NolimitL');
    // obs.subscribe(() => console.log("Got the response."));
    // obs.subscribe((response)=>console.log(response));

    funsvc.printsomeText('Hi everyone!');

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