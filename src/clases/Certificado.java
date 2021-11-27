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
    private Usuario usuario;
    private JuntaVecinos jV;

    public Certificado() {
    }

    public Certificado(int numFolio, String fecha, Usuario usuario, JuntaVecinos jV) {
        this.numFolio = numFolio;
        this.fecha = fecha;
        this.usuario = usuario;
        this.jV = jV;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public JuntaVecinos getjV() {
        return jV;
    }

    public void setjV(JuntaVecinos jV) {
        this.jV = jV;
    }

    @Override
    public String toString() {
        return "Certificado{" + "numFolio=" + numFolio + ", fecha=" + fecha + ", usuario=" + usuario + ", jV=" + jV + '}';
    }

}
