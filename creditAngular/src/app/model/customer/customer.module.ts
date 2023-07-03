import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClienteComponent } from './cliente/cliente.component';
import { ListCustomerComponent } from './list-customer/list-customer.component';
import { NavClienteComponent } from './nav-cliente/nav-cliente.component';
import { SildelbarCustomerComponent } from './sildelbar-customer/sildelbar-customer.component';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from '../../app-routing.module';



@NgModule({
  declarations: [
    ClienteComponent,
    ListCustomerComponent,
    NavClienteComponent,
    SildelbarCustomerComponent
  ],
  imports: [
    CommonModule, 
    ReactiveFormsModule,
    AppRoutingModule
  ]
})
export class CustomerModule { }
