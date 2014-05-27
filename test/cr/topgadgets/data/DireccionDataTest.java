/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.data;

import cr.topgadgets.domain.Canton;
import cr.topgadgets.domain.Cliente;
import cr.topgadgets.domain.Direccion;
import cr.topgadgets.domain.Distrito;
import cr.topgadgets.domain.Provincia;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Carlos
 */
public class DireccionDataTest {

    private DireccionData dd;

    @Before
    public void setUp() {
        dd = new DireccionData();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
//        try {
//         Direccion direccion = new Direccion();
//         direccion.setDireccion("Residencial Cartago, casa 4-5E");
//         direccion.setCodPostal("30105");
//         direccion.setTelefono(87654321);
//         direccion.setProvincia(new Provincia("03","Cartago"));
//         direccion.setDistrito(new Distrito("05","San Francisco"));
//         direccion.setCanton(new Canton ("01","Cartago"));

//         dd.insertarDireccion(direccion);
//         ClienteData cd = new ClienteData();
//         Cliente cliente = cd.getCliente("carlos.astorgagomez@ucr.ac.cr");
//         cliente.setDireccion(direccion);
//         cliente.setContrasena("lenguajes");
//         cd.editarCliente(cliente);
//            for (Canton canton : dd.getCantones("03")) {
//                System.out.println(canton.getNombreCanton());
//            }
//            for (Distrito distrito : dd.getDistritos("01","03")) {
//                System.out.println(distrito.getNombreDistrito());
//            }
//            for (Provincia provincia : dd.getProvincias()) {
//                System.out.println(provincia.getNombreProvincia());
//            }
//            
//            System.out.println(dd.getDistrito("05", "01", "03").getNombreDistrito());
//            System.out.println(dd.getProvincia("03").getNombreProvincia());
//            System.out.println(dd.getCanton("01", "03").getNombreCanton());

//        } catch (SQLException ex) {
//            Logger.getLogger(DireccionDataTest.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
}
