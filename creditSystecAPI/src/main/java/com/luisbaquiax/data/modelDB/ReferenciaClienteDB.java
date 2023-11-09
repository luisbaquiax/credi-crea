/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luisbaquiax.data.modelDB;

import com.luisbaquiax.data.coneccion.ConeccionDB;
import com.luisbaquiax.model.ReferenciaCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class ReferenciaClienteDB {

    private static final String INSERT
            = """
              INSERT INTO referencias_cliente(nombres,apellidos,telefono,cliente,tipo) 
              VALUES(?,?,?,?,?)
              """;

    private ResultSet resultSet;

    /**
     * Inserta a new Reference of Customer
     *
     * @param referencia
     * @return
     */
    public boolean insert(ReferenciaCliente referencia) {
        try (PreparedStatement statement = ConeccionDB.getConnection().prepareStatement(INSERT)) {
            statement.setString(1, referencia.getNombres());
            statement.setString(2, referencia.getApellidos());
            statement.setString(3, referencia.getTelefono());
            statement.setString(4, referencia.getCliente());
            statement.setString(5, referencia.getTipo());

            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ReferenciaClienteDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
