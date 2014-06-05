/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.application.action;

import com.opensymphony.xwork2.ActionSupport;
import cr.topgadgets.business.ProductoBusiness;
import cr.topgadgets.domain.Producto;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class ContenidoAction extends ActionSupport {

    private int codProducto;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public byte[] getImagenProducto() throws SQLException {
        Producto producto = new ProductoBusiness().getProducto(codProducto);
        
        
        return new ProductoBusiness().getProducto(codProducto).getImagen();
    }

    public String getContentType() {
        return "image/jpg";
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

}
