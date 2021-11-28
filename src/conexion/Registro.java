/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import clases.JuntaVecinos;

/**
 *
 * @author matia
 */
public class Registro {

    //listar todos
    public List<JuntaVecinos> buscarTodosJJVV() {

        List<JuntaVecinos> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT id_jv, barrio_id_region, barrio_id_prov, barrio_comuna_id_comun, nom_barrio FROM junta_vecinos order by id_jv";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                JuntaVecinos jv = new JuntaVecinos();
                jv.setId(rs.getInt("ID"));
                jv.setRegion(rs.getString("Region"));
                jv.setProvincia(rs.getString("Provincia"));
                jv.setComuna(rs.getString("Comuna"));
                jv.setBarrioPoblacion(rs.getString("Barrio"));

                lista.add(jv);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar vehículos" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar vehículos" + e.getMessage());
        }
        return lista;
    }
}
