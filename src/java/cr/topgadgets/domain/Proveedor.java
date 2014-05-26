/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.domain;

/**
 *
 * @author Carlos
 */
public class Proveedor {
    private int codProveedor;
    private String nombreProveedor;
    private Direccion direccion;

    public Proveedor() {
        direccion = new Direccion();
    }

    public Proveedor(int codProveedor, String nombreProveedor, Direccion direccion) {
        this.codProveedor = codProveedor;
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
           
}
