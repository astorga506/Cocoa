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
public class ItemOrden {
    
    private int cantidad;
    private float precioUnd;
    private Producto producto;

    public ItemOrden() {
        producto = new Producto();
    }

    public ItemOrden(int cantidad, float precioUnd, Producto producto) {
        this.cantidad = cantidad;
        this.precioUnd = precioUnd;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnd() {
        return precioUnd;
    }

    public void setPrecioUnd(float precioUnd) {
        this.precioUnd = precioUnd;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
        
}
