/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.data;

import cr.topgadgets.data.ClienteData;
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
public class ClienteDataTest {
    ClienteData cd;
    
    public ClienteDataTest() {
    }
    
    @Before
    public void setUp() {
        cd = new ClienteData();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() {
        try {
            System.out.println(cd.esValido("carlos.astorgagomez@ucr.ac.cr", "lenguajes"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDataTest.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
}
