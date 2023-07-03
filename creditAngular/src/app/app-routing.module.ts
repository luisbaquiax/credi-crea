import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NavClienteComponent } from './model/customer/nav-cliente/nav-cliente.component';
import { ClienteComponent } from './model/customer/cliente/cliente.component';
import { ListCustomerComponent } from './model/customer/list-customer/list-customer.component';
import { SildelbarCustomerComponent } from './model/customer/sildelbar-customer/sildelbar-customer.component';
import { LoginComponent } from './model/login/login.component';

const routes: Routes = [
  { path: '', redirectTo: 'login',pathMatch: 'full'
  },
  { path: 'login', component: LoginComponent },
  { path: 'cliente', component: ClienteComponent },
  { path: 'navCliente', component: NavClienteComponent },
  { path: 'clienteListCustomer', component: ListCustomerComponent },
  { path: 'clienteSidebar', component: SildelbarCustomerComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
