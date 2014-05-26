/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.domain;

/**
 *
 * @author Carlos
 */
public class Canton {
    
    private String codCanton;
    private String nombreCanton;

    public Canton() {
    }

    public Canton(String codCanton, String nombreCanton) {
        this.codCanton = codCanton;
        this.nombreCanton = nombreCanton;
    }

    public String getCodCanton() {
        return codCanton;
    }

    public void setCodCanton(String codCanton) {
        this.codCanton = codCanton;
    }

    public String getNombreCanton() {
        return nombreCanton;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }
    
}
