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

/**
 *
 * @author Carlos
 */
public class VerProductoAction extends ActionSupport implements Preparable{
    private int codProducto;
    private Producto producto;

    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    @Override
    public void prepare() throws Exception {
        producto = new ProductoBusiness().getProducto(codProducto);
    }

    public int getCodProducto() {
        return codProducto;
    }

    public Producto getProducto() {
        return producto;
    }
    
}
