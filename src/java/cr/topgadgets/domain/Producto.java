/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.domain;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author Carlos
 */
public class Producto {

    private int codProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private byte[] imagen;
    private String fabricante;
    private String numParte;
    private Date fechaLanzamiento;
    private Date fechaAgregado;
    private Categoria categoria;
    private int cantDisponible;
    private float precioRegular;
    private int descuento;
    private boolean disponible;
    private String notas;
    private Proveedor proveedor;

    public Producto() {
        Calendar calendar = Calendar.getInstance();
        fechaLanzamiento = new Date(calendar.getTime().getTime());
        fechaAgregado = new Date(calendar.getTime().getTime());
        categoria = new Categoria();
        proveedor = new Proveedor();
        
        
    }

    public Producto(int codProducto, String nombreProducto, String descripcionProducto, byte[] imagen,
            String fabricante, String numParte, Date fechaLanzamiento, Date fechaAgregado, Categoria categoria,
            int cantDisponible, float precioRegular, int descuento, boolean disponible, String notas,
            Proveedor proveedor) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.imagen = imagen;
        this.fabricante = fabricante;
        this.numParte = numParte;
        this.fechaLanzamiento = fechaLanzamiento;
        this.fechaAgregado = fechaAgregado;
        this.categoria = categoria;
        this.cantDisponible = cantDisponible;
        this.precioRegular = precioRegular;
        this.descuento = descuento;
        this.disponible = disponible;
        this.notas = notas;
        this.proveedor = proveedor;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNumParte() {
        return numParte;
    }

    public void setNumParte(String numParte) {
        this.numParte = numParte;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
        
    public Date getFechaAgregado() {
        return fechaAgregado;
    }

    public void setFechaAgregado(Date fechaAgregado) {
        this.fechaAgregado = fechaAgregado;
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
