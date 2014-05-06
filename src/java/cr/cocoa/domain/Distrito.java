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
public class Distrito {
    
    private String codDistrito;
    private String nombreDistrito;

    public Distrito() {
    }

    public Distrito(String codDistrito, String nombreDistrito) {
        this.codDistrito = codDistrito;
        this.nombreDistrito = nombreDistrito;
    }

    public String getCodDistrito() {
        return codDistrito;
    }

    public void setCodDistrito(String codDistrito) {
        this.codDistrito = codDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }
    
}
