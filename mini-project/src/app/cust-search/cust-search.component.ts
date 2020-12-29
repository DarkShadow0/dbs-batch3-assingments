import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-cust-search',
  templateUrl: './cust-search.component.html',
  styleUrls: ['./cust-search.component.css']
})
export class CustSearchComponent implements OnInit {

  cust: Customer;
  id: any;
  constructor(private custService: CustomerService, private router: Router) { }

  ngOnInit(): void {
    this.cust = null;
  }

  getEmp(id) {
    if (id !== '') {
      this.custService.getCust(id).subscribe(
        cust => this.cust = cust,
        error => this.router.navigate(['notfound'])
      );
    }
  }

}
