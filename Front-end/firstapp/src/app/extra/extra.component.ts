import { Component, OnInit, Input } from '@angular/core';
import { ExtraIn } from './extra-inf';
import { FuntionalService } from '../funtional.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-extra',
  templateUrl: './extra.component.html',
  styleUrls: ['./extra.component.css']
})
export class ExtraComponent implements OnInit {

  @Input('inform')extraInformation:ExtraIn;

  isClick: boolean = true;
  userName:string = "";
  dataOfUser:any;

  constructor(private http:HttpClient) {
  }

  haveClicked(){
    this.isClick = !this.isClick;
  }

  search(){
    this.http.get('https://api.github.com/users/' + this.userName)
    .subscribe((response) => {
      this.dataOfUser = response;
      console.log(this.dataOfUser);
    },
    ()=>console.log("Not found this " + this.userName + " Person"));
    
  }

  ngOnInit() {
  }

}
