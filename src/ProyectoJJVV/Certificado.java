/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoJJVV;

/**
 *
 * @author matia
 */
public class Certificado {
    private int numFolio;
    private String fecha;
    private String tipoCertificado;

    public Certificado() {
    }

    public Certificado(int numFolio, String fecha, String tipoCertificado) {
        this.numFolio = numFolio;
        this.fecha = fecha;
        this.tipoCertificado = tipoCertificado;
    }

    public int getNumFolio() {
        return numFolio;
    }

    public void setNumFolio(int numFolio) {
        this.numFolio = numFolio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoCertificado() {
        return tipoCertificado;
    }

    public void setTipoCertificado(String tipoCertificado) {
        this.tipoCertificado = tipoCertificado;
    }

    @Override
    public String toString() {
        return "Certificado{" + "numFolio=" + numFolio + ", fecha=" + fecha + ", tipoCertificado=" + tipoCertificado + '}';
    }
    
    
    
}
