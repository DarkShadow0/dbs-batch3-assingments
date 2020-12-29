import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-cust-details',
  templateUrl: './cust-details.component.html',
  styleUrls: ['./cust-details.component.css']
})
export class CustDetailsComponent implements OnInit {

  id: any;
  constructor(private route: ActivatedRoute,
              private router: Router,
              private custService: CustomerService) { }
  cust: Customer;
  ngOnInit(): void {
    console.log(this.route.snapshot.params.id);
    this.id = this.route.snapshot.params.id;
    this.custService.getCust(this.id).subscribe(cust => this.cust = cust);
  }

  goBack() {
    this.router.navigate(['list']);
  }

}
