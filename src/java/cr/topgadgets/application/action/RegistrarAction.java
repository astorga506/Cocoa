/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.application.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import cr.topgadgets.domain.Cliente;

/**
 *
 * @author Carlos
 */
public class RegistrarAction extends ActionSupport implements ModelDriven<Cliente>{
    private Cliente cliente;
    
    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    @Override
    public Cliente getModel() {
        return cliente;
    }
    
}
