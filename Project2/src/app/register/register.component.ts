import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from '../models/user';
import { RegisterService } from '../services/register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm!: FormGroup;
  user!: User;

  constructor(private fb: FormBuilder, private rs: RegisterService) { 
    
  }

  ngOnInit() {
    this.registerForm = this.fb.group({
      first_name: ['', [
        Validators.required
      ]],
      last_name: ['', [
        Validators.required
      ]],
      username: ['', [
        Validators.required
      ]],
      password: ['', [
        Validators.required
      ]],
      user_type_id: [null, [
        Validators.required,
        Validators.minLength(1),
        Validators.min(1),
        Validators.max(2)
      ]],
    })

  }

    get first_name(){
      return this.registerForm.get('first_name');
    }

    get last_name(){
      return this.registerForm.get('last_name');
    }

    get username(){
      return this.registerForm.get('username');
    }

    get password(){
      return this.registerForm.get('password');
    }

    get user_type_id(){
      return this.registerForm.get('user_type_id');
    }

    register(){
      this.user = this.registerForm.value;
      this.rs.registerApplication(this.user);
    }

    
  

}
