import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Observable } from "rxjs";
import { map } from "rxjs";
import { PatientprofileComponent } from "./patientprofile.component";
@Injectable({
    providedIn:'root'
})

export class PatientprofileService{
    private eurl  = "http://localhost:8080/slot/show"
    
constructor(private http : HttpClient){}
users(){
    return this.http.get(this.eurl)
}}