import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-taskmanger',
  templateUrl: './taskmanger.component.html',
  styleUrls: ['./taskmanger.component.css']
})
export class TaskmangerComponent implements OnInit {

  constructor() { }
addTask=[];
  postTask(addtask){
   console.log(addtask.value);
   this.addTask.push(addtask.value);
   addtask.reset();
   console.log(this.addTask);
}

  deleteUser(tasks){
    this.addTask.splice(tasks,1,)
  }
 

  ngOnInit() {
  }

}
