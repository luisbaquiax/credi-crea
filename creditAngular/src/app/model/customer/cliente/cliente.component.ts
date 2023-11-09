import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../../service/customer.service';
import { Cliente } from '../../../entidad/Cliente';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css'],
})
export class ClienteComponent implements OnInit {
  cliente!: Cliente;
  form = new FormGroup({
    nit: new FormControl(),
    cui : new FormControl(),
    nombre: new FormControl(),
    apellido: new FormControl(),
    fechaNacimiento:new FormControl(),
    genero: new FormControl(),
    estadoCivil:new FormControl(),
    profesion: new FormControl(),
    actividadEconomica: new FormControl(),
    telefono: new FormControl(),
    celular: new FormControl(),
    address: new FormControl(),
    email: new FormControl('',[Validators.email]), 
  });

 
  constructor(private serviceClientes: CustomerService, private router: Router) {
    this.cliente = new Cliente();
  }

  ngOnInit(): void {}

  saveCustomer() {
    this.cliente.nit = this.form.value.nit;
    this.cliente.cui = this.form.value.cui;
    this.cliente.nombres = this.form.value.nombre;
    this.cliente.apellidos = this.form.value.apellido;
    this.cliente.fechaNacimiento = this.form.value.fechaNacimiento;
    this.cliente.genero = this.form.value.genero;
    this.cliente.estadoCivil = this.form.value.estadoCivil;
    this.cliente.profesion = this.form.value.profesion;
    this.cliente.actividadEconomica = this.form.value.actividadEconomica;
    this.cliente.telefono = this.form.value.telefono;
    this.cliente.celular= this.form.value.celular;
    this.cliente.direccion = this.form.value.address;
    this.cliente.email = this.form.value.email;
    console.log(this.cliente)
    this.serviceClientes.getClientes().push(this.cliente);
    this.cliente = new Cliente();
    this.router.navigate(['/clienteListCustomer']);
  }
}
