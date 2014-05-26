/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.application.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Carlos
 */
public class MyAction extends ActionSupport
{
        public String trueCall()
        {
                return SUCCESS;
        }

        public String falseCall()
        {
                return SUCCESS;
        }
}
