import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Observable } from "rxjs";
import { map } from "rxjs";
import { DoctorprofileComponent } from "./doctorprofile.component";
@Injectable({
    providedIn:'root'
})

export class DoctorprofileService{
    private Geurl  = "http://localhost:8080/doctor/getDoc"
    private Pourl = "http://localhost:8080/slot/add"
constructor(private http : HttpClient){}
users(){
    return this.http.get(this.Geurl)
}

savelog(data:any){
    let s={
        doctor:{
            drID:data.drID
        },
        patient:{
            patID:data.patID
        },
            diseases:{
                disID:data.disID},
            date:data.date,
        
            startTime:data.startTime+":00",
        
    
            endTime:data.endTime+":00"
    
    }
    let header={'content-type':'Application/JSON'}
    return this.http.post(this.Pourl,s, {'headers':header})}}
