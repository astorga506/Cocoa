/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.application.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import cr.topgadgets.business.ClienteBusiness;
import cr.topgadgets.business.ProductoBusiness;
import cr.topgadgets.domain.Cliente;
import cr.topgadgets.domain.Producto;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Carlos
 */
public class SesionAction extends ActionSupport implements SessionAware, Preparable{

    private String usuario;
    private String contrasena;
    private Cliente cliente;
    private Map<String,Object> map;
    private LinkedList<Producto> productos;

    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    public String iniciar() {
        String val = ERROR ;
        ClienteBusiness cb = new ClienteBusiness();
        try {
            if (cb.esValido(usuario, contrasena)) {
                map.put("logined", true);
                cliente = cb.getCliente(usuario);
                map.put("user", cliente);
                val = SUCCESS;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SesionAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        return val;
    }

    public String salir() {
        map.remove("user");
        map.put("logined", false);
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

    public Cliente getCliente() {
        return cliente;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }
    
    @Override
    public void setSession(Map<String, Object> map) {
        this.map = map;
    }    

    @Override
    public void prepare() throws Exception {
        cliente = new Cliente();
        map.put("logined", false);
        productos = new ProductoBusiness().getLanzamientos();        
    }

}
