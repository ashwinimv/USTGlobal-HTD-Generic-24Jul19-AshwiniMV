import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-viewtask',
  templateUrl: './viewtask.component.html',
  styleUrls: ['./viewtask.component.css']
})
export class ViewtaskComponent implements OnInit {
  @Input() taskdetails : any ='';

  constructor() { }

  ngOnInit() {
  }

}
