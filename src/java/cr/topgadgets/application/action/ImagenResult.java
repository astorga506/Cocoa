/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.application.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Andrés Durán Hewitt
 */
public class ImagenResult implements Result {

    @Override
    public void execute(ActionInvocation ai) throws Exception {
        ContenidoAction action = (ContenidoAction) ai.getAction();
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType(action.getContentType());
        response.getOutputStream().write(action.getImagenProducto());
        response.getOutputStream().flush();
    }
    
}
