import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-address-card',
  templateUrl: './address-card.component.html',
  styleUrls: ['./address-card.component.css']
})
export class AddressCardComponent implements OnInit {

  user: any;
  @Input('name') userName: string;

  constructor() { 
    
  }

  ngOnInit() {
    this.user = {
      name: this.userName,
      title: 'Junior developer',
      address: [
         'Budapester str 22',
         'Dreaden Germany'
      ],
      phone: '01792942886'
    }

    
  }

}
