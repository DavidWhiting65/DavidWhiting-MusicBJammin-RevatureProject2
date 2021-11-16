import { Injectable, MissingTranslationStrategy } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user';
import { Fan } from '../models/fan';
import { Musician } from '../models/musician';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  fan!: Fan;
  musician!: Musician;

  private baseUrl: string = "http://localhost:8080/users"

  private fanUrl: string= "http://localhost:8080/fans"

  private musicianUrl: string= "http://localhost:8080/musicians"

  constructor(private http: HttpClient) { }

  registerApplication(user: User){
    if (user.user_type_id == 1){
      console.log("1")
      this.addUser(user);
    } else if (user.user_type_id == 2){
      console.log("2")
      this.addUser(user);
    } else {
      console.log("failed")
    }

  }

  addUser(user: User): Observable<any>{
    const headers ={'content-type': 'application/json'}
    const body = JSON.stringify(user);
    console.log("user:"+user);
    console.log(body)
    return this.http.post(this.baseUrl, body, {'headers':headers})
  }

  fanTable(fan: Fan):Observable<any>{
    const headers ={'content-type': 'application/json'}
    const body = JSON.stringify(fan);
    console.log("fan:"+fan);
    console.log(body)
    return this.http.post(this.fanUrl, body, {'headers':headers})
  }

  musicianTable(musician: Musician):Observable<any>{
    const headers ={'content-type': 'application/json'}
    const body = JSON.stringify(musician);
    console.log("musician:"+musician);
    console.log(body)
    return this.http.post(this.musicianUrl, body, {'headers':headers})
  }
}
