/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luisbaquiax.service;

import com.luisbaquiax.data.modelDB.ClienteDB;
import com.luisbaquiax.model.Cliente;

/**
 *
 * @author luis
 */
public class ServiceCliente {

    private final ClienteDB clienteDB;

    public ServiceCliente() {
        this.clienteDB = new ClienteDB();
    }

    public boolean insert(Cliente cliente) {
        return this.clienteDB.insert(cliente);
    }
}
