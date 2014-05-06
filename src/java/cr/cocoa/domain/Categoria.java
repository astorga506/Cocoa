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
public class Categoria {
    
    private int codCategoria;
    private String nombreCategoria;

    public Categoria() {
    }

    public Categoria(int codCategoria, String nombreCategoria) {
        this.codCategoria = codCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
}
