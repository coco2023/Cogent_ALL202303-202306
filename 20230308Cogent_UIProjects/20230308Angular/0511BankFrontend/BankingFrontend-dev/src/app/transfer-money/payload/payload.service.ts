import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Payload } from 'src/app/CustomersAccount';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PayloadService {

  private posAccounttUri = 'http://localhost:8080/api/customer/transfer'

  public currentPayload: Observable<any>;

  constructor(private http: HttpClient) { }


  public setPayload(mypayload: any){
    localStorage.setItem('payload', JSON.stringify(mypayload));
  }

  public postPayload(obj: Payload): Observable<any>{
    return this.http.post(this.posAccounttUri, obj)
  }

  public getPayload(){
    const payload = localStorage.getItem('mypayload')
    if (payload !== null) {
      const obj = JSON.parse(payload);
      return obj;
    }
  }

  public clearCurrentUser() {
    localStorage.removeItem('mypayload');
  }

}
