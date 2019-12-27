import { Component, OnInit, Input } from '@angular/core';
import { ExtraIn } from './extra-inf';

@Component({
  selector: 'app-extra',
  templateUrl: './extra.component.html',
  styleUrls: ['./extra.component.css']
})
export class ExtraComponent implements OnInit {

  @Input('inform')extraInformation:ExtraIn;
  
  constructor() { }

  ngOnInit() {
  }

}
