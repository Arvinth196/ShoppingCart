import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cart } from './cart/cart';
import { Users } from './loginupdated/users';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  
  private loginUrl: string;
  private validateUrl: string;

  constructor(private http:HttpClient, private cart:Cart) { 
    this.loginUrl='http://localhost:8020/USER-SERVICE/login';
    this.validateUrl='http://localhost:8020/USER-SERVICE/validate';
  }

  loginMember(user: Users) {
    return this.http.post(`${this.loginUrl}`, user);
  }

  validateToken(token: string){
    const header = {
      headers: {
        'Authorization': `Bearer ${token}`
      }
    }
    return this.http.get(`${this.validateUrl}`, header);
  }

  
}
