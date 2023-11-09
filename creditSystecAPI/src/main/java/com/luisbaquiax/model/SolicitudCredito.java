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
public class SolicitudCredito implements Serializable {

    private int id;
    private String tipoCredio;
    private String destino;
    private String garantia;
    private String fecha;
    private double montoSolicitado;
    private double saldoAnterior;
    private double montoFresco;
    private int plazo;
    private String diaPago;
    private double tasaInteres;
    private String estado;
}
