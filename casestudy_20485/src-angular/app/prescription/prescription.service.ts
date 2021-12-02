import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Observable } from "rxjs";
import { map } from "rxjs";
import { PrescriptionComponent } from "./prescription.component";
@Injectable({
    providedIn:'root'
})

export class PrescriptionService{
    private url  = "http://localhost:8080/pres/add"
    
constructor(private http : HttpClient){}
users(){
    return this.http.get(this.url)
}

savelog(data:any){
    
  let p = 
{   
       slot: {        slotID: data.slotID  },
           prescription: data.prescription  }
     let header={'content-type':'Application/JSON'}
    return this.http.post(this.url,p, {'headers':header})}}


