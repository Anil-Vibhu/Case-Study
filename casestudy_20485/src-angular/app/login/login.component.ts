import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public type !: string | null
  emailInput = ''
  password = ''
  error = ''
  loginForm = new FormGroup({
    email: new FormControl(this.emailInput,
      [
        Validators.required,
        Validators.email
      ]
    ),
    password: new FormControl(this.password,
      [
        Validators.required,
        Validators.minLength(6)
      ]
    )
  })
  get f() { return this.loginForm.controls; }

  constructor(private route: ActivatedRoute, private loginService: LoginService, private router: Router) { }

  ngOnInit(): void {
    this.type = this.route.snapshot.paramMap.get('type')
  }

  onLogin() {
    if (this.loginForm.valid) {
      console.log(this.type);
      if (this.type === 'patient') {
        let pat = {
          'password': this.loginForm.value.password,
          'patient': {
            'eMail': this.loginForm.value.email
          }
        }
        this.loginService.patLogin(pat).subscribe(res => {
          if (res) {
            console.log("Login successful");
            localStorage.setItem('isLoggedIn', "true");
            this.router.navigate(['/doctordetails']);
          } else if (res == null) {
            alert("Invalid credentials");
            console.log('error');
          } else {
            this.error = "Inavlid Password.Try again";
            console.log('error');
          }
          console.log(res);
        })
        console.log(this.loginForm.value);
      } else if (this.type === 'doctor') {
        let doc = {
          'password': this.loginForm.value.password,
          'doctor': {
            'eMail': this.loginForm.value.email
          }
        }
        this.loginService.docLogin(doc).subscribe(res => {
          if (res) {
            console.log("Login successful");
            localStorage.setItem('isLoggedIn', "true");
            this.router.navigate(['/patientdetails']);
          } else if (res == null) {
            alert("Invalid credentials");
            console.log('error');
          } else {
            this.error = "Inavlid Password.try again";
            console.log('error');
          }
          console.log(res);
        })
        console.log(this.loginForm.value);
      }
    }
  }
}