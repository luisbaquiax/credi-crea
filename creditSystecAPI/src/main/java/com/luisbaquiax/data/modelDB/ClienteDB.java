/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luisbaquiax.data.modelDB;

import com.luisbaquiax.data.coneccion.ConeccionDB;
import com.luisbaquiax.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class ClienteDB {

    private static final String INSERT
            = """
           INSERT INTO 
           cliente(cui,nombres,apellidos,fecha_nacimiento,genero,estado_civil,profesion,actividad_economica,telefono,celular,direccion,email,fecha_actualizacion) 
           VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)
           """;
    private ResultSet resultSet;

    public ClienteDB() {
    }

    /**
     *
     * @param cliente
     * @return
     */
    public boolean insert(Cliente cliente) {
        try (PreparedStatement statement = ConeccionDB.getConnection().prepareStatement(INSERT)) {
            statement.setString(1, cliente.getCui());
            statement.setString(2, cliente.getNombres());
            statement.setString(3, cliente.getApellidos());
            statement.setString(4, cliente.getFechaNacimiento());
            statement.setString(5, cliente.getGenero());
            statement.setString(6, cliente.getEstadoCivil());
            statement.setString(7, cliente.getProfesion());
            statement.setString(8, cliente.getActividadEconomica());
            statement.setString(9, cliente.getTelefono());
            statement.setString(10, cliente.getCelular());
            statement.setString(11, cliente.getDireccion());
            statement.setString(12, cliente.getEmail());
            statement.setString(13, cliente.getFechaActualizacion());

            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
