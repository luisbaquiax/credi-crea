/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luisbaquiax.model;

import java.io.Serializable;
import lombok.*;

/**
 *
 * @author luis
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {

    private String cui;
    private String nit;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String genero;
    private String estadoCivil;
    private String profesion;
    private String actividadEconomica;
    private String telefono;
    private String celular;
    private String direccion;
    private String email;
    private String fechaActualizacion;
    private String estado;
    private String tipoVivienda;
    private double ingresos;
    private double egresos;
    private double saldo;

}
