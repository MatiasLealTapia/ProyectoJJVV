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
import clases.Usuario;

/**
 *
 * @author matia
 */
public class Registro {

    //agregar
    public boolean agregarPersona(Usuario persona) {
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "INSERT INTO usuario(rut, dv, pnombre, snombre, apaterno, amaterno, correo, clave, nacimiento, region, provincia, comuna, calle, numerocalle) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, persona.getRut());
            stmt.setString(2, String.valueOf(persona.getDv()));
            stmt.setString(3, persona.getpNombre());
            stmt.setString(4, persona.getsNombre());
            stmt.setString(5, persona.getaPaterno());
            stmt.setString(6, persona.getaMaterno());
            stmt.setString(7, persona.getCorreo());
            stmt.setString(8, persona.getClave());
            stmt.setString(9, persona.getNacimiento());
            stmt.setString(10, persona.getRegion());
            stmt.setString(11, persona.getProvincia());
            stmt.setString(12, persona.getComuna());
            stmt.setString(13, persona.getCalle());
            stmt.setInt(14, persona.getNumeroCalle());

            stmt.executeUpdate();//insert
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar persona" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar persona" + e.getMessage());
            return false;
        }
    }

    //eliminar
    public boolean eliminarPersona(int rutBorrar) {
        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "DELETE FROM usuario WHERE rut = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, rutBorrar);
            stmt.executeUpdate();//insert
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar persona" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar persona" + e.getMessage());
            return false;
        }
    }

    //listar todos
    public List<Usuario> buscarTodos() {

        List<Usuario> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT rut, dv, pnombre, snombre, apaterno, amaterno, correo, clave, nacimiento, region, provincia, comuna, calle, numerocalle FROM usuario order by rut";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Usuario persona = new Usuario();
                persona.setRut(rs.getInt("rut"));
                persona.setDv(rs.getString("dv").charAt(0));
                persona.setpNombre(rs.getString("pnombre"));
                persona.setsNombre(rs.getString("snombre"));
                persona.setaPaterno(rs.getString("apaterno"));
                persona.setaMaterno(rs.getString("amaterno"));
                persona.setCorreo(rs.getString("correo"));
                persona.setClave(rs.getString("clave"));
                persona.setNacimiento(rs.getString("nacimiento"));
                persona.setRegion(rs.getString("region"));
                persona.setProvincia(rs.getString("provincia"));
                persona.setComuna(rs.getString("comuna"));
                persona.setCalle(rs.getString("calle"));
                persona.setNumeroCalle(rs.getInt("numerocalle"));

                lista.add(persona);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar" + e.getMessage());
        }
        return lista;
    }

    //listar por comuna
    public List<Usuario> buscarPorComuna(String comuna) {

        List<Usuario> lista = new ArrayList<>();

        try {
            ConexionBD conexion1 = new ConexionBD();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT rut, dv, pnombre, snombre, apaterno, amaterno, correo, clave, nacimiento, region, provincia, comuna, calle, numerocalle FROM usuario WHERE comuna = ? order by rut";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, comuna);

            ResultSet rs = stmt.executeQuery(); //select

            while (rs.next()) {
                Usuario persona = new Usuario();
                persona.setRut(rs.getInt("rut"));
                persona.setDv(rs.getString("dv").charAt(0));
                persona.setpNombre(rs.getString("pnombre"));
                persona.setsNombre(rs.getString("snombre"));
                persona.setaPaterno(rs.getString("apaterno"));
                persona.setaMaterno(rs.getString("amaterno"));
                persona.setCorreo(rs.getString("correo"));
                persona.setClave(rs.getString("clave"));
                persona.setNacimiento(rs.getString("nacimiento"));
                persona.setRegion(rs.getString("region"));
                persona.setProvincia(rs.getString("provincia"));
                persona.setComuna(rs.getString("comuna"));
                persona.setCalle(rs.getString("calle"));
                persona.setNumeroCalle(rs.getInt("numerocalle"));

                lista.add(persona);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar" + e.getMessage());
        }
        return lista;
    }
}
