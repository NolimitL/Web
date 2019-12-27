import { Component, OnInit, Input } from '@angular/core';
import { User } from './user.model';

@Component({
  selector: 'app-address-card',
  templateUrl: './address-card.component.html',
  styleUrls: ['./address-card.component.css']
})
export class AddressCardComponent implements OnInit {

  @Input('usermy') user: User;
  isCollapse:boolean = true;

  constructor() { }

  isItCollapse(){
    this.isCollapse != this.isCollapse;
  }
  ngOnInit() {
  }
}
