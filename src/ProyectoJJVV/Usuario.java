/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoJJVV;

import java.util.Date;

/**
 *
 * @author matia
 */
public class Usuario {

    private int rut;
    private char dv;
    private String nombre;
    private String correo;
    private String clave;
    private String nacimiento;

    public Usuario() {
    }

    public Usuario(int rut, char dv, String nombre, String correo, String clave, String nacimiento) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.nacimiento = nacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + ", correo=" + correo + ", clave=" + clave + ", nacimiento=" + nacimiento + '}';
    }

}
