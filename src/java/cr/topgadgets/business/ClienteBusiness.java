/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.business;

import cr.topgadgets.data.ClienteData;
import cr.topgadgets.domain.Cliente;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class ClienteBusiness {
    private ClienteData cd;

    public ClienteBusiness() {
        cd = new ClienteData();
    }
    public boolean esValido(String email, String contrasena) throws SQLException {
        return cd.esValido(email, contrasena);
    }
    
    public Cliente getCliente(String email) throws SQLException {
        return cd.getCliente(email);
    }
    
    public Cliente insertarCliente(Cliente cliente) throws SQLException {
        return cd.insertarCliente(cliente);
    }
    
    public Cliente editarCliente(Cliente cliente) throws SQLException {
        return cd.editarCliente(cliente);
    }
}
