/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.data;

import cr.topgadgets.domain.Categoria;
import cr.topgadgets.domain.Producto;
import cr.topgadgets.domain.Proveedor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class ProductoData extends BaseData {

    public ProductoData() {
    }

    public Producto getProducto(int codProducto) throws SQLException {
        Producto producto = new Producto();
        String sqlCall = "{CALL sp_obtener_producto(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setInt(1, codProducto);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setNumParte(rs.getString("num_parte"));
            producto.setFechaLanzamiento(rs.getDate("fecha_lanzamiento"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("can_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
            producto.setDisponible(rs.getBoolean("disponible"));
            producto.setNotas(rs.getString("notas"));
            producto.setProveedor(this.getProveedor(rs.getInt("cod_proveedor")));

        }
        con.close();
        return producto;
    }

    public LinkedList<Producto> getProductos() throws SQLException {
        LinkedList<Producto> productos = new LinkedList<Producto>();
        String sqlCall = "{CALL sp_obtener_producto}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setNumParte(rs.getString("num_parte"));
            producto.setFechaLanzamiento(rs.getDate("fecha_lanzamiento"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("can_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
            producto.setDisponible(rs.getBoolean("disponible"));
            producto.setNotas(rs.getString("notas"));
            producto.setProveedor(this.getProveedor(rs.getInt("cod_proveedor")));
            productos.add(producto);
        }
        con.close();
        return productos;
    }

    public LinkedList<Producto> getProductosCat(int codCategoria) throws SQLException {
        LinkedList<Producto> productos = new LinkedList<Producto>();
        String sqlCall = "{CALL sp_productos_por_categoria(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setInt(1, codCategoria);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setNumParte(rs.getString("num_parte"));
            producto.setFechaLanzamiento(rs.getDate("fecha_lanzamiento"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("can_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
            producto.setDisponible(rs.getBoolean("disponible"));
            producto.setNotas(rs.getString("notas"));
            producto.setProveedor(this.getProveedor(rs.getInt("cod_proveedor")));
            productos.add(producto);
        }
        con.close();
        return productos;
    }

    public LinkedList<Producto> getProductosNom(String nombreProducto) throws SQLException {
        LinkedList<Producto> productos = new LinkedList<Producto>();
        String sqlCall = "{CALL sp_productos_por_nombre(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setString(1, nombreProducto);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setNumParte(rs.getString("num_parte"));
            producto.setFechaLanzamiento(rs.getDate("fecha_lanzamiento"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("can_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
            producto.setDisponible(rs.getBoolean("disponible"));
            producto.setNotas(rs.getString("notas"));
            producto.setProveedor(this.getProveedor(rs.getInt("cod_proveedor")));
            productos.add(producto);
        }
        con.close();
        return productos;
    }

    public LinkedList<Producto> getProductosDesc(String palabraClave) throws SQLException {
        LinkedList<Producto> productos = new LinkedList<Producto>();
        String sqlCall = "{CALL sp_productos_por_clave(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setString(1, palabraClave);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setNumParte(rs.getString("num_parte"));
            producto.setFechaLanzamiento(rs.getDate("fecha_lanzamiento"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("can_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
            producto.setDisponible(rs.getBoolean("disponible"));
            producto.setNotas(rs.getString("notas"));
            producto.setProveedor(this.getProveedor(rs.getInt("cod_proveedor")));
            productos.add(producto);
        }
        con.close();
        return productos;
    }

    public LinkedList<Producto> getLanzamientos() throws SQLException {
        LinkedList<Producto> productos = new LinkedList<Producto>();
        String sqlCall = "{CALL sp_productos_recientes}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setNumParte(rs.getString("num_parte"));
            producto.setFechaLanzamiento(rs.getDate("fecha_lanzamiento"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("can_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
            producto.setDisponible(rs.getBoolean("disponible"));
            producto.setNotas(rs.getString("notas"));
            producto.setProveedor(this.getProveedor(rs.getInt("cod_proveedor")));
            productos.add(producto);
        }
        con.close();
        return productos;
    }

    public Categoria getCategoria(int codCategoria) {
        return null;
    }

    public Proveedor getProveedor(int codProveedor) {
        return null;
    }
}
