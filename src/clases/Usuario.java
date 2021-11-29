/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author matia
 */
public class Usuario {

    private int rut;
    private char dv;
    private String pNombre;
    private String sNombre;
    private String aPaterno;
    private String aMaterno;
    private String correo;
    private String clave;
    private String nacimiento;
    private String region;
    private String provincia;
    private String comuna;
    private String calle;
    private int numeroCalle;

    public Usuario() {
    }

    public Usuario(int rut, char dv, String pNombre, String sNombre, String aPaterno, String aMaterno, String correo, String clave, String nacimiento, String region, String provincia, String comuna,String calle, int numeroCalle) {
        this.rut = rut;
        this.dv = dv;
        this.pNombre = pNombre;
        this.sNombre = sNombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.correo = correo;
        this.clave = clave;
        this.nacimiento = nacimiento;
        this.region = region;
        this.provincia = provincia;
        this.comuna = comuna;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
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

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    @Override
    public String toString() {
        return "Usuario{" + "rut=" + rut + ", dv=" + dv + ", pNombre=" + pNombre + ", sNombre=" + sNombre + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", correo=" + correo + ", clave=" + clave + ", nacimiento=" + nacimiento + ", region=" + region + ", provincia=" + provincia + ", comuna=" + comuna + ", calle=" + calle + ", numeroCalle=" + numeroCalle + '}';
    }


    
    
}   