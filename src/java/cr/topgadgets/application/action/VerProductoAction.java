/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.application.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import cr.topgadgets.business.ProductoBusiness;
import cr.topgadgets.domain.Producto;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Carlos
 */
public class VerProductoAction extends ActionSupport implements Preparable, ServletRequestAware {

    private Producto producto;
    private HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    @Override
    public void prepare() throws Exception {
        producto = new ProductoBusiness().getProducto(Integer.parseInt(request.getParameter("codProducto")));
    }

    public Producto getProducto() {
        return producto;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

}
