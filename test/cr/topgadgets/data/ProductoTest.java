/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.data;

import cr.topgadgets.domain.Producto;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Carlos
 */
public class ProductoTest {
    
    public ProductoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void hello() {
         Producto producto = new Producto();
         System.out.println(producto.getFechaLanzamiento());
     }
}
