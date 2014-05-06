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
public class Direccion {
    
    private int codDireccion;
    private String direccion;
    private String codPostal;
    private int telefono;
    private Provincia provincia;
    private Distrito distrito;
    private Canton canton;
    
    public Direccion() {
        provincia = new Provincia();
        distrito = new Distrito();
        canton = new Canton();        
    }

    public Direccion(int codDireccion, String direccion, String codPostal, int telefono, Provincia provincia,
            Distrito distrito, Canton canton) {
        this.codDireccion = codDireccion;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.telefono = telefono;
        this.provincia = provincia;
        this.distrito = distrito;
        this.canton = canton;
    }

    public int getCodDireccion() {
        return codDireccion;
    }

    public void setCodDireccion(int codDireccion) {
        this.codDireccion = codDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }
        
}
