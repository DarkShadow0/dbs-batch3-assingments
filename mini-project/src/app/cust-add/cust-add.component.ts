import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';


@Component({
    selector: 'app-cust-add',
    templateUrl: './cust-add.component.html',
    styleUrls: ['./cust-add.component.css']
})
export class CustAddComponent implements OnInit {

    constructor(private empService: CustomerService) { }

    newCust: Customer;
    responeMsg: string;
    ngOnInit(): void {
        this.newCust = { customerId: -1, customerName: '', address: '', email: '', mobileNo: -1};
    }

    // tslint:disable-next-line:typedef
    addCust() {
        this.empService.addCust(this.newCust).subscribe(resp => {
            this.responeMsg = resp.message; console.log(resp.message);
        }
        );
        //console.log(this.newEmp);
    }
}
