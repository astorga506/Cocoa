
import cr.topgadgets.data.ProductoData;
import cr.topgadgets.domain.Producto;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class frame extends JFrame{
    
    Image img;
        
    public frame() {
        try {
            ProductoData pd = new ProductoData();
            Producto producto = pd.getProducto(4);        
                       
            ImageIcon img = new ImageIcon(producto.getImagen());
            JLabel label = new JLabel(img);
            add(label);
            
//            img = producto.getImagen();
            
        } catch (SQLException ex) {
            Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1024, 640);
        setVisible(true);
        
    }
    
    
    
}
