/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.data;

import cr.topgadgets.domain.Canton;
import cr.topgadgets.domain.Direccion;
import cr.topgadgets.domain.Distrito;
import cr.topgadgets.domain.Provincia;
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
public class DireccionData extends BaseData {

    public DireccionData() {
    }

    public Direccion insertarDireccion(Direccion direccion) throws SQLException {
        String sqlCall = "{CALL sp_insertar_direccion(?,?,?,?,?,?,?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setString(2, direccion.getDireccion());
        stmt.setString(3, direccion.getCodPostal());
        stmt.setInt(4, direccion.getTelefono());
        stmt.setString(5, direccion.getProvincia().getCodProvincia());
        stmt.setString(6, direccion.getCanton().getCodCanton());
        stmt.setString(7, direccion.getDistrito().getCodDistrito());
        stmt.executeUpdate();
        direccion.setCodDireccion(stmt.getInt(1));
        con.close();
        return direccion;
    }

    public Direccion getDireccion(int codDireccion) throws SQLException {
        String sqlCall = "{CALL sp_obtener_direccion(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setInt(1, codDireccion);
        ResultSet rs = stmt.executeQuery();
        Direccion direccion = new Direccion();
        if (rs.next()) {
            direccion.setCodDireccion(codDireccion);
            direccion.setDireccion(rs.getString("direccion"));
            direccion.setCodPostal(rs.getString("cod_postal"));
            direccion.setTelefono(rs.getInt("telefono"));
            direccion.setProvincia(getProvincia(rs.getString("cod_provincia")));
            direccion.setCanton(getCanton(rs.getString("cod_canton"), rs.getString("cod_provincia")));
            direccion.setDistrito(getDistrito(rs.getString("cod_distrito"), rs.getString("cod_canton"),
                    rs.getString("cod_provincia")));
        }
        con.close();
        return direccion;
    }

    public Provincia getProvincia(String codProvincia) throws SQLException {
        String sqlCall = "{CALL sp_obtener_provincia(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setString("cod_provincia", codProvincia);
        ResultSet rs = stmt.executeQuery();
        Provincia provincia = new Provincia();
        if (rs.next()) {
            provincia.setCodProvincia(codProvincia);
            provincia.setNombreProvincia(rs.getString("nombre_provincia"));
        }
        con.close();
        return provincia;
    }

    public Canton getCanton(String codCanton, String codProvincia) throws SQLException {
        String sqlCall = "{CALL sp_obtener_canton(?,?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setString("cod_canton", codCanton);
        stmt.setString("cod_provincia", codProvincia);
        ResultSet rs = stmt.executeQuery();
        Canton canton = new Canton();
        if (rs.next()) {
            canton.setCodCanton(codCanton);
            canton.setNombreCanton(rs.getString("nombre_canton"));
        }
        con.close();
        return canton;
    }

    public Distrito getDistrito(String codDistrito, String codCanton, String codProvincia) throws SQLException {
        String sqlCall = "{CALL sp_obtener_distrito(?,?,?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setString("cod_distrito", codDistrito);
        stmt.setString("cod_canton", codCanton);
        stmt.setString("cod_provincia", codProvincia);
        ResultSet rs = stmt.executeQuery();
        Distrito distrito = new Distrito();
        if (rs.next()) {
            distrito.setCodDistrito(codDistrito);
            distrito.setNombreDistrito(rs.getString("nombre_distrito"));
        }
        con.close();
        return distrito;
    }

    public LinkedList<Distrito> getDistritos(String codCanton, String codProvincia) throws SQLException {
        LinkedList<Distrito> distritos = new LinkedList<Distrito>();
        String sqlCall = "{CALL sp_obtener_distritos(?,?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setString(1, codCanton);
        stmt.setString(2, codProvincia);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Distrito distrito = new Distrito();
            distrito.setCodDistrito(rs.getString("cod_distrito"));
            distrito.setNombreDistrito(rs.getString("nombre_distrito"));
            distritos.add(distrito);
        }

        con.close();

        return distritos;
    }

    public LinkedList<Canton> getCantones(String codProvincia) throws SQLException {
        LinkedList<Canton> cantones = new LinkedList<Canton>();
        String sqlCall = "{CALL sp_obtener_cantones(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.setString(1, codProvincia);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Canton canton = new Canton();
            canton.setCodCanton(rs.getString("cod_canton"));
            canton.setNombreCanton(rs.getString("nombre_canton"));
            cantones.add(canton);
        }

        con.close();

        return cantones;
    }

    public LinkedList<Provincia> getProvincias() throws SQLException {
        LinkedList<Provincia> provincias = new LinkedList<Provincia>();
        String sqlCall = "{CALL sp_obtener_provincias}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Provincia provincia = new Provincia();
            provincia.setCodProvincia(rs.getString("cod_provincia"));
            provincia.setNombreProvincia(rs.getString("nombre_provincia"));
            provincias.add(provincia);
        }

        con.close();

        return provincias;
    }

}
