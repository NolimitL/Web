import { Component } from '@angular/core';
import axios from 'axios';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'firstapp';
  items = [];
  name = 'Leo';
  getItems(){
    axios.get('http://localhost:8081/topic').then(response => this.items = response.data);
  };
  getNewSite(name){
    axios.get('');
  };

}