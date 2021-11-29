/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author matia
 */
public class Certificado {

    private int numFolio;
    private String fecha;

    public Certificado() {
    }

    public Certificado(int numFolio, String fecha) {
        this.numFolio = numFolio;
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "Certificado{" + "numFolio=" + numFolio + ", fecha=" + fecha + '}';
    }

}
