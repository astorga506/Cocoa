/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.cocoa.domain;

/**
 *
 * @author Carlos
 */
public class Provincia {
    
    private String codProvincia;
    private String nombreProvincia;

    public Provincia() {
    }

    public Provincia(String codProvincia, String nombreProvincia) {
        this.codProvincia = codProvincia;
        this.nombreProvincia = nombreProvincia;
    }

    public String getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
    
}
