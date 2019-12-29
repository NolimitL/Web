import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FuntionalService {

  constructor() { }
  
  printsomeText(text){
    console.log(text);
  }
}
