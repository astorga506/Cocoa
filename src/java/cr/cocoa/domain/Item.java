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
public class Item {
    
    private int codItem;
    private int cantDisponible;
    private float precioRegular;
    private int descuento;
    private boolean disponible;
    private String notas;
    private Producto producto;
    private Proveedor proveedor;

    public Item() {
        producto  = new Producto();
        proveedor = new Proveedor();
    }

    public Item(int codItem, int cantDisponible, float precioRegular, int descuento, boolean disponible, String notas, 
            Producto producto, Proveedor proveedor) {
        this.codItem = codItem;
        this.cantDisponible = cantDisponible;
        this.precioRegular = precioRegular;
        this.descuento = descuento;
        this.disponible = disponible;
        this.notas = notas;
        this.producto = producto;
        this.proveedor = proveedor;
    }
    

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public float getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(float precioRegular) {
        this.precioRegular = precioRegular;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }    
}


