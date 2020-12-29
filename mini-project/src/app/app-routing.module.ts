import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustAddComponent } from './cust-add/cust-add.component';
import { CustDetailsComponent } from './cust-details/cust-details.component';
import { CustListComponent } from './cust-list/cust-list.component';
import { CustSearchComponent } from './cust-search/cust-search.component';
import { NotFoundComponent } from './not-found/not-found.component';

const routes: Routes = [
  {path: '', redirectTo: 'details', pathMatch: 'full'},
  {path: 'list', component: CustListComponent},
  {path: 'details/:id', component: CustDetailsComponent},
  {path: 'search', component: CustSearchComponent},
  {path: 'add-cust', component: CustAddComponent},
  {path: 'notfound', component: NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
