import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { RegisterComponent } from './register/register.component';
import { DoctorprofileComponent } from './doctorprofile/doctorprofile.component';
import { PatientprofileComponent } from './patientprofile/patientprofile.component';
import { PrescriptionComponent } from './prescription/prescription.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { UpdateComponent } from './update/update.component';


const routes: Routes = [
  { path: '', component: HomepageComponent},
  { path: 'login/:type', component: LoginComponent},
  { path: 'register/:type', component: RegisterComponent },
 { path: 'patientdetails', component:PatientprofileComponent  },
  { path: 'doctordetails', component: DoctorprofileComponent },
  {path : 'feed',component: FeedbackComponent},
  {path : 'presc',component: PrescriptionComponent},
  {path:'update', component: UpdateComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }