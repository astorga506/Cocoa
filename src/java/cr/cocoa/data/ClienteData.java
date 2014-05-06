/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.cocoa.data;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author Carlos
 */
public class ClienteData extends BaseData {

    public ClienteData() {
    }

    public boolean esValido(String contrasena, String email) throws SQLException {
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

}
