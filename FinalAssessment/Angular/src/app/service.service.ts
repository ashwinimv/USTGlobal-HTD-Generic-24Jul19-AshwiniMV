import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  // url : string ='https://jsonplaceholder.typicode.com/users';

  // users : any=[];

  // getData(){
  //   return  this.http.get<any>(`${this.url}`).subscribe(data=>{
  //      this.users=data;
  //    },err=>{
  //      console.log(err)
  //    }
  //    );
  //  }

  constructor(public http:HttpClient) { }
}
