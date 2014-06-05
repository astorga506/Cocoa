/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.application.action;

import com.opensymphony.xwork2.ActionSupport;
import cr.topgadgets.business.ProductoBusiness;
import cr.topgadgets.domain.Cliente;
import cr.topgadgets.domain.ItemCarrito;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Carlos
 */
public class ComprarAction extends ActionSupport implements SessionAware, ServletRequestAware {

    private Cliente cliente;
    private Map<String, Object> map;
    private HttpServletRequest request;
    private float total;

    @Override
    public String execute() throws Exception {
        boolean encontrado = false;
        if (map.get("user") != null) {
            cliente = (Cliente) map.get("user");
            for (ItemCarrito item : cliente.getCarrito()) {
                if (item.getProducto().getCodProducto() == Integer.parseInt(request.getParameter("codProducto"))) {
                    item.setCantidad(item.getCantidad() + 1);
                    encontrado = true;
                }//if                
            }//foreach
            if (!encontrado) {
                cliente.getCarrito().add(new ItemCarrito(new ProductoBusiness().getProducto(Integer.parseInt(request.getParameter("codProducto"))), 1));
            }
            actualizarMonto();
            return SUCCESS;
        } else {
            return ERROR;
        }//else
    }//execute

    public String disminuir() {
        if (map.get("user") != null) {
            cliente = (Cliente) map.get("user");
            for (ItemCarrito item : cliente.getCarrito()) {
                if (item.getProducto().getCodProducto() == Integer.parseInt(request.getParameter("codProducto"))) {
                    item.setCantidad(item.getCantidad() - 1);
                    if (item.getCantidad() == 0) {
                        cliente.getCarrito().remove(item);
                    }
                }//if                
            }//foreach

            actualizarMonto();
            return SUCCESS;
        } else {
            return ERROR;
        }//else
    }

    public String remover() {
        if (map.get("user") != null) {
            cliente = (Cliente) map.get("user");
            for (ItemCarrito item : cliente.getCarrito()) {
                if (item.getProducto().getCodProducto() == Integer.parseInt(request.getParameter("codProducto"))) {
                        cliente.getCarrito().remove(item);
                }//if                
            }//foreach
            actualizarMonto();
            return SUCCESS;
        } else {
            return ERROR;
        }//else

    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public float getTotal() {
        return total;
    }

    private void actualizarMonto() {
        for (ItemCarrito item : cliente.getCarrito()) {
            total = item.getCantidad() * item.getProducto().getPrecioRegular();
        }//foreach
    }
}
