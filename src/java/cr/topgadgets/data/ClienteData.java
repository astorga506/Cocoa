/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.data;

import cr.topgadgets.domain.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author Carlos
 */
public class ClienteData extends BaseData {

    public ClienteData() {
    }

    public boolean esValido(String email, String contrasena) throws SQLException {
        boolean valido;
        String sqlQuery = "{CALL sp_validar_usuario(?,?,?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlQuery);
        stmt.registerOutParameter(1, Types.BIT);
        stmt.setString(2, email);
        stmt.setString(3, contrasena);
        stmt.executeQuery();
        valido = stmt.getBoolean(1);
        con.close();
        return valido;
    }
    
    public Cliente getCliente(String email) throws SQLException{
        Cliente cliente = new Cliente();
        String sqlProc = "{CALL sp_obtener_usuario(?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlProc);
        stmt.setString(1, email);
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()){
            cliente.setIdCliente(rs.getInt("id_cliente"));
            cliente.setCorreo(rs.getString("correo"));
            cliente.setNombreCliente(rs.getString("nombre_cliente"));
            cliente.setApellidosCliente(rs.getString("apellidos_cliente"));
            cliente.setDireccion(new DireccionData().getDireccion(rs.getInt("cod_direccion")));                
        }
        con.close();
        return cliente;
    }
    
    public Cliente insertarCliente(Cliente cliente) throws SQLException{
        String sqlCall = "{CALL sp_insertar_cliente(?,?,?,?,?,?)}";
        Connection con = this.getConnection();
        CallableStatement stmt = con.prepareCall(sqlCall);
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setString(2, cliente.getCorreo());
        stmt.setString(3, cliente.getNombreCliente());
        stmt.setString(4, cliente.getApellidosCliente());
        stmt.setInt(5, cliente.getDireccion().getCodDireccion());
        stmt.setString(6, cliente.getContrasena());
        
        stmt.executeUpdate();
        
        cliente.setIdCliente(stmt.getInt(1));
        con.close();
    
        return cliente;
    }

}
