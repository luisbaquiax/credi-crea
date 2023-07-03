/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisbaquiax.data.coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class ConeccionDB {

    private String URL = "jdbc:mysql://localhost:3306/credit?allowPublicKeyRetrieval=true&useSSL=false";
    private String USER = "root";
    private String PASSWORD = "luisbaquiax1234";

    private static ConeccionDB conexionSingleton = null;

    private static Connection CONECCION = null;

    public ConeccionDB() throws SQLException {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
          
            CONECCION = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conexion exitosa");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ConeccionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() throws SQLException {
        if (CONECCION == null) {
            conexionSingleton = new ConeccionDB();
        }
        return CONECCION;
    }

}
