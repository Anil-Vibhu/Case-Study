import { Component, OnInit } from '@angular/core';
import { DoctorprofileService } from './doctorprofile.service';
import { HttpClient } from '@angular/common/http';


@Component({

  selector: 'app-doctorprofile',
  templateUrl: './doctorprofile.component.html',
  styleUrls: ['./doctorprofile.component.css']
})
export class DoctorprofileComponent {
  doctorprofile:any;
    constructor(private docData : DoctorprofileService) {
      this.docData.users().subscribe((data)=>{
        this.doctorprofile=data;
      });
     }
     doctorprofileFormData(data:any){
      console.log(data)
      this.docData.savelog(data).subscribe((result)=>{
        console.log(result)
        
      })
    }
  }
   
  
  