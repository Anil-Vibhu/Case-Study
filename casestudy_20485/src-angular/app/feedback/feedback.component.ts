import { Component, OnInit } from '@angular/core';
import { FeedbackService } from './feedback.service';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent {

  
    feedback:any;
      constructor(private feedbackData : FeedbackService) {
        this.feedbackData.users().subscribe((data: any)=>{
          this.feedback=data;
        });
       }
       feedbackFormData(data:any){
        console.log(data)
        this.feedbackData.savelog(data).subscribe((result: any)=>{
          console.log(result)
          
        })
      }
    }
     