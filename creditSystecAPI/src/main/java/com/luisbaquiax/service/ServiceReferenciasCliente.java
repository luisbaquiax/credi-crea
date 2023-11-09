/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luisbaquiax.service;

import com.luisbaquiax.data.modelDB.ReferenciaClienteDB;
import com.luisbaquiax.model.ReferenciaCliente;
import java.util.List;

/**
 *
 * @author luis
 */
public class ServiceReferenciasCliente {

    private final ReferenciaClienteDB referenciaClienteDB;

    public ServiceReferenciasCliente() {
        this.referenciaClienteDB = new ReferenciaClienteDB();
    }

    public void insertReferences(List<ReferenciaCliente> list) {
        list.forEach((element) -> {
            referenciaClienteDB.insert(element);
        });
    }
}
