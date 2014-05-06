/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.cocoa.application.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cr.cocoa.data.ClienteData;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class SesionAction extends ActionSupport {

    private String usuario;
    private String contrasena;

    public SesionAction() {
    }

    @Override
    public String execute() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String iniciar() {
        String val = ERROR ;
        ClienteData cd = new ClienteData();
        try {
            if (cd.esValido(usuario, contrasena)) {
                Map sesion = ActionContext.getContext().getSession();
                sesion.put("logined", "true");
                val = SUCCESS;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SesionAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        return val;
    }

    public String salir() {
        Map session = ActionContext.getContext().getSession();
        session.remove("logined");
        return SUCCESS;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
