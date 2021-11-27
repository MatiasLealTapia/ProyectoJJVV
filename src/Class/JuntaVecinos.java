/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author matia
 */
public class JuntaVecinos {

    private int id;
    private String region;
    private String provincia;
    private String comuna;
    private String barrioPoblacion;

    public JuntaVecinos() {
    }

    public JuntaVecinos(int id, String region, String provincia, String comuna, String barrioPoblacion) {
        this.id = id;
        this.region = region;
        this.provincia = provincia;
        this.comuna = comuna;
        this.barrioPoblacion = barrioPoblacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBarrioPoblacion() {
        return barrioPoblacion;
    }

    public void setBarrioPoblacion(String barrioPoblacion) {
        this.barrioPoblacion = barrioPoblacion;
    }

    @Override
    public String toString() {
        return "JuntaVecinos{" + "id=" + id + ", region=" + region + ", provincia=" + provincia + ", comuna=" + comuna + ", barrioPoblacion=" + barrioPoblacion + '}';
    }

}
