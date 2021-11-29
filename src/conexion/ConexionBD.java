/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author matia
 */
public class ConexionBD {

    public Connection obtenerConexion() {
        Connection cnx = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectojjvv", "root", "root");
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexion" + e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return cnx;
    }
}
