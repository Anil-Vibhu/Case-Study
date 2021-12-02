import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Observable } from "rxjs";
import { map } from "rxjs";

@Injectable({
    providedIn:'root'
})

export class FeedbackService{
    private url  = "http://localhost:8080/feedback/add"
   
constructor(private http : HttpClient){}
users(){
    return this.http.get(this.url)
}

savelog(data:any){
    let s={
        slot:{
            slotID:data.slotID
        },
        feedback:data.feedback
      
    };
    let header={'content-type':'Application/JSON'}
    return this.http.post(this.url,s, {'headers':header})}}
