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
import java.sql.Types;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class ProductoData extends BaseData {

    public ProductoData() {
    }

    public Producto insertarProducto(Producto producto) throws SQLException {
        String sqlCall = "{CALL sp_insertar_producto(?,?,?,?,?,?,?,?,?,?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);

        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setString(2, producto.getNombreProducto());
        stmt.setString(3, producto.getDescripcionProducto());
        stmt.setBytes(4, producto.getImagen());
        stmt.setString(5, producto.getFabricante());
        stmt.setInt(6, producto.getCategoria().getCodCategoria());
        stmt.setInt(7, producto.getCantDisponible());
        stmt.setDouble(8, producto.getPrecioRegular());
        stmt.setInt(9, producto.getDescuento());
        stmt.setInt(10, producto.getProveedor().getCodProveedor());

        stmt.execute();

        producto.setCodProducto(stmt.getInt(1));

        con.close();
        return producto;
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
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("cant_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
            producto.setProveedor(this.getProveedor(rs.getInt("cod_proveedor")));

        }
        con.close();
        return producto;
    }

    public LinkedList<Producto> getProductos() throws SQLException {
        LinkedList<Producto> productos = new LinkedList<Producto>();
        String sqlCall = "{CALL sp_obtener_productos}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("cant_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
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

        while (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("cant_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
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

        while (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("cant_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
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

        while (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("cant_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
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

        while (rs.next()) {
            Producto producto = new Producto();
            producto.setCodProducto(rs.getInt("cod_producto"));
            producto.setNombreProducto(rs.getString("nombre_producto"));
            producto.setDescripcionProducto(rs.getString("descripcion_producto"));
            producto.setImagen(rs.getBytes("imagen"));
            producto.setFabricante(rs.getString("fabricante"));
            producto.setFechaAgregado(rs.getDate("fecha_agregado"));
            producto.setCategoria(this.getCategoria(rs.getInt("cod_categoria")));
            producto.setCantDisponible(rs.getInt("cant_disponible"));
            producto.setPrecioRegular(rs.getFloat("precio_regular"));
            producto.setDescuento(rs.getInt("descuento"));
            producto.setProveedor(this.getProveedor(rs.getInt("cod_proveedor")));
            productos.add(producto);
        }
        con.close();
        return productos;
    }

    private Categoria getCategoria(int codCategoria) throws SQLException {
        Categoria categoria = new Categoria();
        String sqlCall = "{CALL sp_obtener_categoria(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setInt(1, codCategoria);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            categoria.setCodCategoria(rs.getInt("cod_categoria"));
            categoria.setNombreCategoria(rs.getString("nombre_categoria"));
        }
        con.close();
        return categoria;
    }

    public LinkedList<Categoria> getCategorias() throws SQLException {
        LinkedList<Categoria> categorias = new LinkedList<Categoria>();        
        String sqlCall = "{CALL sp_obtener_categorias}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Categoria categoria = new Categoria();
            categoria.setCodCategoria(rs.getInt("cod_categoria"));
            categoria.setNombreCategoria(rs.getString("nombre_categoria"));
            categorias.add(categoria);
        }
        con.close();
        return categorias;
    }

    public Proveedor getProveedor(int codProveedor) throws SQLException {
        Proveedor proveedor = new Proveedor();
        String sqlCall = "{CALL sp_obtener_proveedor(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setInt(1, codProveedor);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            proveedor.setCodProveedor(rs.getInt("cod_proveedor"));
            proveedor.setNombreProveedor(rs.getString("nombre_proveedor"));
            proveedor.setDireccion(new DireccionData().getDireccion(rs.getInt("cod_direccion")));
        }
        con.close();
        return proveedor;
    }
}
