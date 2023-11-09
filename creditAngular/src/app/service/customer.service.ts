import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from '../entidad/Cliente';

@Injectable({
  providedIn: 'root',
})
export class CustomerService {
  clientes: Cliente[]=[];
  cliente: Cliente;

  constructor() {
    this.cliente = new Cliente();
    this.cliente.nit = '87520278'
    this.cliente.cui = '12345678';
    this.cliente.nombres = 'Luis Basilio';
    this.cliente.apellidos = 'Baquiax Sic';
    this.cliente.fechaNacimiento = '25/08/1995';
    this.clientes.push(this.cliente)
  }

  public getClientes():Cliente[]{
    return this.clientes;
  }
}
