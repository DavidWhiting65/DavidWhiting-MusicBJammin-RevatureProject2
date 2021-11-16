import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Follower } from '../models/follower';
import { FullFollower } from '../models/fullfollower';

@Injectable({
  providedIn: 'root'
})
export class FollowerService {

  private baseUrl: string = "http://localhost:8080/followers";

  constructor(private http: HttpClient) { }

  getFollowers(): Observable<FullFollower[]>{
    return this.http.get<FullFollower[]>(this.baseUrl);
  }

  addFollower(follower: Follower): Observable<any>{
    const headers ={'content-type': 'application/json'}
    const body = JSON.stringify(follower);
    console.log("follower:"+follower);
    console.log(body)
    return this.http.post(this.baseUrl, body, {'headers':headers})
  }
}
