import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Observable } from "rxjs";
import { map } from "rxjs";
import { UpdateComponent } from "./update.component";
@Injectable({
    providedIn:'root'
})

export class UpdateService{
    private url  = "http://localhost:8080/patient/updatedetails"
   
constructor(private http : HttpClient){}
users(){
    return this.http.get(this.url)
}

savelog(data:any){
    let s={
       patID: data.patID,
      name: data.name,
      age: data.age,
      sex: data.sex,
      eMail: data.email,
      phoneNumber: data.phoneNumber,
      bloodGroup: data.bloodGroup,
    };
    let header={'content-type':'Application/JSON'}
    return this.http.post(this.url,s, {'headers':header})}}
