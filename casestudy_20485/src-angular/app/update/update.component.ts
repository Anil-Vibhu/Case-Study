import { Component, OnInit } from '@angular/core';
import { UpdateService } from './update.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent {

  update:any;
    constructor(private patData : UpdateService) {
      this.patData.users().subscribe((data: any)=>{
        this.update=data;
      });
     }
    patFormData(data:any){
      console.log(data)
      this.patData.savelog(data).subscribe((result: any)=>{
        console.log(result)
        
      })
    }
  }