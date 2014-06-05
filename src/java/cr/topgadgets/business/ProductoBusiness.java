/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.business;

import cr.topgadgets.data.ProductoData;
import cr.topgadgets.domain.Categoria;
import cr.topgadgets.domain.Producto;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class ProductoBusiness {
    private ProductoData pd;

    public ProductoBusiness() {
        pd = new ProductoData();
    }
    
    public Producto insertarProducto(Producto producto) throws SQLException {
        return pd.insertarProducto(producto);
    }
    
    public Producto getProducto(int codProducto) throws SQLException {
        return pd.getProducto(codProducto);
    }
    
    public LinkedList<Producto> getProductos() throws SQLException {
        return pd.getProductos();
    }
    
    public LinkedList<Producto> getProductosCat(int codCategoria) throws SQLException {
        return pd.getProductosCat(codCategoria);
    }
    
    public LinkedList<Producto> getProductosNom(String nombreProducto) throws SQLException {
        return pd.getProductosNom(nombreProducto);
    }
    
    public LinkedList<Producto> getProductosDesc(String palabraClave) throws SQLException {
        return pd.getProductosDesc(palabraClave);
    }
    
    public LinkedList<Producto> getLanzamientos() throws SQLException {
        return pd.getLanzamientos();
    } 
    
    public LinkedList<Categoria> getCategorias() throws SQLException {
        return pd.getCategorias();
    }
    
}
