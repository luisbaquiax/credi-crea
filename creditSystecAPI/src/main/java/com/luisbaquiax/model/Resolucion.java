/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luisbaquiax.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
public class Resolucion implements Serializable {

    private int idSolucion;
    private double cuotaCapital;
    private double intereses;
    private String fechaResolucion;
    private String modalidadCuotas;
    private int cantidadDesembolso;
    private String acta;
    private double totalPago;
    private double monto;
    private String montoLetras;
    private String garantias;
    private String comentarios;
}
