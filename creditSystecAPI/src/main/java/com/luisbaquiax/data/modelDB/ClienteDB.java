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
import java.util.ArrayList;
import java.util.List;
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
           cliente(
              cui,
              nombres,
              apellidos,
              fecha_nacimiento,
              genero,
              estado_civil,
              profesion,
              actividad_economica,
              telefono,
              celular,
              direccion,
              email,
              fecha_actualizacion,
              tipo_vivienda,
              nit,
              estado,
              ingresos,
              egresos) 
           VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
           """;
    private static final String SELECT = """
                                         SELECT * FROM CLIENTE WHERE estado = ?
                                         """;
    private ResultSet resultSet;

    public ClienteDB() {
    }

    /**
     * Insert a new CLiente in the database
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
            statement.setString(14, cliente.getTipoVivienda());
            statement.setString(15, cliente.getNit());
            statement.setString(16, cliente.getEstado());
            statement.setDouble(17, cliente.getIngresos());
            statement.setDouble(18, cliente.getEgresos());

            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * Get a list of customers
     *
     * @param estado
     * @return
     */
    public List<Cliente> getClientes(String estado) {
        List<Cliente> clientes = new ArrayList<>();
        try (PreparedStatement statement = ConeccionDB.getConnection().prepareStatement(SELECT)) {
            statement.setString(1, estado);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                clientes.add(getCliente(resultSet));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }

    /**
     *
     * @param resulSet
     * @return
     * @throws SQLException
     */
    private Cliente getCliente(ResultSet resulSet) throws SQLException {
        return Cliente.builder().actividadEconomica(resulSet.getString("cui")).
                nombres(resulSet.getString("nombres")).
                apellidos(resulSet.getString("apellidos")).
                fechaNacimiento(resulSet.getString("fecha_nacimiento")).
                genero(resulSet.getString("genero")).
                estadoCivil(resulSet.getString("estado_civil")).
                profesion(resulSet.getString("profesion")).
                actividadEconomica(resulSet.getString("actividad_economica")).
                telefono(resulSet.getString("telefono")).
                celular(resulSet.getString("celular")).
                direccion(resulSet.getString("direccion")).
                email(resulSet.getString("email")).
                fechaActualizacion(resulSet.getString("fecha_actualizacion")).
                tipoVivienda(resulSet.getString("tipo_vivienda")).
                fechaActualizacion(resulSet.getString("fecha_actualizacion")).
                nit(resulSet.getString("nit")).
                estado(resulSet.getString("estado")).
                ingresos(resulSet.getDouble("ingresos")).
                egresos(resulSet.getDouble("egresos")).
                saldo(resulSet.getDouble("ingresos") - resulSet.getDouble("egresos")).
                build();
    }

}
