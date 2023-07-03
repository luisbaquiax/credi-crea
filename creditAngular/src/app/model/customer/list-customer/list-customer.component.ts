import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../../service/customer.service';
import { Cliente } from '../../../entidad/Cliente';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css'],
})
export class ListCustomerComponent implements OnInit {

  clientes: Cliente[] = [];
  
  constructor(private serviceCliente: CustomerService) {}

  ngOnInit(): void {
    this.clientes = this.serviceCliente.getClientes();
  }
  
}
