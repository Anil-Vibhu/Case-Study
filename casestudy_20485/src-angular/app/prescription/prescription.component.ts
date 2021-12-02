import { Component, OnInit } from '@angular/core';
import { PrescriptionService } from './prescription.service';
@Component({
  selector: 'app-prescription',
  templateUrl: './prescription.component.html',
  styleUrls: ['./prescription.component.css']
})
export class PrescriptionComponent  {
  prescription:any;
  constructor(private prescData : PrescriptionService) {
    this.prescData.users().subscribe((data)=>{
      this.prescription=data;
    });
   }

  prescFormData(data:any){
    console.log(data)
    this.prescData.savelog(data).subscribe((result: any)=>{
      console.log(result)
      
    })
  }}