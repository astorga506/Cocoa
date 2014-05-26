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
    private Item item;

    public ItemOrden() {
        item = new Item();
    }

    public ItemOrden(int cantidad, float precioUnd, Item item) {
        this.cantidad = cantidad;
        this.precioUnd = precioUnd;
        this.item = item;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
        
}
