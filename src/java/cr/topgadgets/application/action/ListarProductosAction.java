/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.application.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import cr.topgadgets.business.ProductoBusiness;
import cr.topgadgets.domain.Categoria;
import cr.topgadgets.domain.Producto;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class ListarProductosAction extends ActionSupport implements Preparable{
    private LinkedList<Categoria> categorias;
    private LinkedList<Producto> productos;
    private int  codCategoria;
    private String nombreProducto;

    @Override
    public String execute() throws Exception {
        return INPUT;
    }
    
    public String listar(){
        try {
            System.out.println(codCategoria);
            ProductoBusiness pb = new ProductoBusiness();
            productos = pb.getProductosCat(codCategoria);                
            
            return SUCCESS;
        } catch (SQLException ex) {
            return ERROR;
        }
    }

    @Override
    public void prepare() throws Exception {
        categorias = new ProductoBusiness().getCategorias();
        
    }

    public LinkedList<Categoria> getCategorias() {
        return categorias;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }
    
}
