/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.application.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import cr.topgadgets.business.ClienteBusiness;
import cr.topgadgets.domain.Cliente;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class RegistrarAction extends ActionSupport implements ModelDriven<Cliente>, Preparable {

    private Cliente cliente;

    @Override
    public String execute() throws Exception {

        return INPUT;
    }

    public String registrar() {
        if (this.getFieldErrors().isEmpty()) {
            try {
                ClienteBusiness cb = new ClienteBusiness();
                cb.insertarCliente(cliente);
                return SUCCESS;
            } catch (SQLException ex) {
                return ERROR;
            }//catch
        }//if
        return INPUT;
    }

    @Override
    public Cliente getModel() {
        return cliente;
    }

    @Override
    public void validate() {
        if (cliente.getNombreCliente().equals("")) {
            this.addFieldError("nombreCliente", "Debe de ingresar un nombre");
        }
        if (cliente.getApellidosCliente().equals("")) {
            this.addFieldError("apellidosCliente", "Debe de ingresar un apellido");
        }
        if (cliente.getCorreo().equals("")) {
            this.addFieldError("correo", "Debe de ingresar un apellido");
        }
        if (cliente.getContrasena().equals("")) {
            this.addFieldError("contrasena", "Debe de ingresar un apellido");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void prepare() throws Exception {
        cliente = new Cliente();
    }

}
