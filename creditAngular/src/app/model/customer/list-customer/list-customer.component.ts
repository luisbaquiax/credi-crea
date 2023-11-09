import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../../service/customer.service';
import { Cliente } from '../../../entidad/Cliente';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css'],
})
export class ListCustomerComponent implements OnInit {

  clientes: Cliente[] = [];
  form = new FormGroup({
    cuiSearch: new FormControl()
  })
  
  constructor(private serviceCliente: CustomerService) {}

  ngOnInit(): void {
    this.clientes = this.serviceCliente.getClientes();
  }
  search(){
    console.log('a');
    for (let i=0; i<this.clientes.length; i++) {
      if(this.form.value.cuiSearch==this.clientes[i].cui){
       console.log('hola');
      }
    }
  }
}
