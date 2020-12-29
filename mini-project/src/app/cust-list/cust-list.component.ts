import { Component, OnInit } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-cust-list',
  templateUrl: './cust-list.component.html',
  styleUrls: ['./cust-list.component.css']
})
export class CustListComponent implements OnInit {

  constructor(private custService: CustomerService) { }
  changedList = new Subject<Customer[]>();
  id: any;
  custList: Customer[];
  empObes: Observable<Customer[]>;
  ngOnInit(): void {
    this.custService.getCustList().subscribe(l => this.custList = l);
  }

  deleteCust(index) {
    const data = this.custList[index];
    this.custList.splice(index, 1);
    this.changedList.subscribe(list => this.custList = list);
    console.log(data);
    this.custService.deleteCust(data.customerId).subscribe(resp => {
      console.log('hello');
    });
  }

}
