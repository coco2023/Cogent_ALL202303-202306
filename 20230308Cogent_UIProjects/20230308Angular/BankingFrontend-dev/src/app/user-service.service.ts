import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  public currentUser: Observable<any>;

  constructor() { }

  public setCurrentUser(user: any) {
    const currentUser = JSON.stringify(user);
    localStorage.setItem('currentUser', JSON.stringify(user));
    console.log("serUser", currentUser);
  }

  public getCurrentUser() {
    const customer = localStorage.getItem('currentUser')
    if(customer!==null) {
       const obj = JSON.parse(customer);
       console.log("getUser", obj)
       return obj;
    } 
  }

  public clearCurrentUser() {
    localStorage.removeItem('currentUser');
  }
}
