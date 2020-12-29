import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';
import { ResponseMessage } from './response-message';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  url: string;
  constructor(private http: HttpClient) {
    this.url = 'http://localhost:8181/customer/';
  }

  getCustList(): Observable<Customer[]> {
    return this.http.get<Customer[]>(this.url + 'list');
  }

  getCust(id): Observable<Customer> {
    return this.http.get<Customer>(this.url + 'find/' + id);
  }

  addCust(data): Observable<ResponseMessage> {
    return this.http.post<ResponseMessage>(this.url + 'save', data);
  }

  deleteCust(id): Observable<Customer> {
    return this.http.delete<Customer>(this.url + 'delete/' + id);
  }
}
