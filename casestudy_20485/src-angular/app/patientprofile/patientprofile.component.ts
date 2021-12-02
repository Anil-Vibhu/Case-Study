import { Component, OnInit } from '@angular/core';
import { PatientprofileService } from './patientprofile.service';

@Component({
  selector: 'app-patientprofile',
  templateUrl: './patientprofile.component.html',
  styleUrls: ['./patientprofile.component.css']
})
export class PatientprofileComponent {
  patientprofile:any;
    constructor(private patData : PatientprofileService) {
      this.patData.users().subscribe((data)=>{
        this.patientprofile=data;
      });
     }
    }
