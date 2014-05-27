/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.business;

import cr.topgadgets.data.DireccionData;
import cr.topgadgets.domain.Canton;
import cr.topgadgets.domain.Direccion;
import cr.topgadgets.domain.Distrito;
import cr.topgadgets.domain.Provincia;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class DireccionBusiness {
    private DireccionData dd;

    public DireccionBusiness() {
        dd = new DireccionData();
    }
    
    public Direccion insertarDireccion(Direccion direccion) throws SQLException {
        return dd.insertarDireccion(direccion);
    }
    
    public Direccion getDireccion(int codDireccion) throws SQLException {
        return dd.getDireccion(codDireccion);
    }
    
    public Provincia getProvincia(String codProvincia) throws SQLException {
        return dd.getProvincia(codProvincia);
    }
    
    public Canton getCanton(String codCanton, String codProvincia) throws SQLException {
        return dd.getCanton(codCanton, codProvincia);
    }
    
    public Distrito getDistrito(String codDistrito, String codCanton, String codProvincia) throws SQLException {
        return  dd.getDistrito(codDistrito, codCanton, codProvincia);
    }
    
    public LinkedList<Distrito> getDistritos(String codCanton, String codProvincia) throws SQLException {
        return dd.getDistritos(codCanton, codProvincia);
    }
    
    public LinkedList<Canton> getCantones(String codProvincia) throws SQLException {
        return dd.getCantones(codProvincia);
    }
    
    public LinkedList<Provincia> getProvincias() throws SQLException {
        return  dd.getProvincias();
    }
        
}
