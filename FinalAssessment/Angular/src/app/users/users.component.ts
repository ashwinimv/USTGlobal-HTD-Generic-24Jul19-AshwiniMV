import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
users=[];

  constructor(private http:HttpClient) { 

    this.http.get<any>('https://jsonplaceholder.typicode.com/users').subscribe(data=>{
      this.users=data;
      

    },err=>{
      console.log(err);
    })
  }

  ngOnInit() {
    // this.services.getData();
  }

}
