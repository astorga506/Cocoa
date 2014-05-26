/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.domain;

import java.sql.Date;

/**
 *
 * @author Carlos
 */
public class Producto {
    
    private int codProduco;
    private String nombreProducto;
    private String descripcionProducto;
    private byte[] imagen;
    private String fabricante;
    private String numParte;
    private Date fechaLanzamiento;
    private Categoria categoria;

    public Producto() {
        categoria = new Categoria();
    }

    public Producto(int codProduco, String nombreProducto, String descripcionProducto, byte[] imagen, String fabricante,
            String numParte, Date fechaLanzamiento, Categoria categoria) {
        this.codProduco = codProduco;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.imagen = imagen;
        this.fabricante = fabricante;
        this.numParte = numParte;
        this.fechaLanzamiento = fechaLanzamiento;
        this.categoria = categoria;
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
    
    public int getCodProduco() {
        return codProduco;
    }

    public void setCodProduco(int codProduco) {
        this.codProduco = codProduco;
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
      
}
