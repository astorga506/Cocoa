/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.data;

import cr.topgadgets.domain.Categoria;
import cr.topgadgets.domain.Direccion;
import cr.topgadgets.domain.Producto;
import cr.topgadgets.domain.Proveedor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
public class ProductoDataTest {

    private ProductoData pd;

    @Before
    public void setUp() {
        pd = new ProductoData();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        try {
//            Producto prod1 = new Producto();
//            Producto prod2 = new Producto();
//            Producto prod3 = new Producto();
//            Producto prod4 = new Producto();
//            Producto prod5 = new Producto();
//            Producto prod6 = new Producto();
//            Producto prod7 = new Producto();
//            Producto prod8 = new Producto();
//            Producto prod9 = new Producto();
//            Producto prod10 = new Producto();
//            Producto prod11 = new Producto();
//
//            prod1.setNombreProducto("EVGA GeForce GTX760 w/EVGA ACX Cooler 2GB");
//            prod1.setDescripcionProducto("Tarjeta Grafica");            
//            File img1 = new File("C:\\Users\\Carlos\\Downloads\\71Be6JbkpHL._SL1500_.jpg");
//            byte[] cont1 = Files.readAllBytes(img1.toPath());
//            prod1.setImagen(cont1);        
//            prod1.setFabricante("EVGA");
//            prod1.setCategoria(new Categoria(1, ""));
//            prod1.setCantDisponible(53);        
//            prod1.setPrecioRegular(200000);
//            prod1.setDescuento(0);
//            prod1.setProveedor(new Proveedor(1,"", new Direccion()));
//
//            prod2.setNombreProducto("Corsair Vengeance K70 Cherry MX Brown");
//            prod2.setDescripcionProducto("Teclado mecanico retroiluminado");
//            File img2 = new File("C:\\Users\\Carlos\\Downloads\\41xYZkChDSL.jpg");
//            byte[] cont2 = Files.readAllBytes(img2.toPath());
//            prod2.setImagen(cont2);
//            prod2.setFabricante("Corsair");
//            prod2.setCategoria(new Categoria(1, ""));
//            prod2.setCantDisponible(27);
//            prod2.setPrecioRegular(125000);
//            prod2.setDescuento(0);
//            prod2.setProveedor(new Proveedor(1, "", new Direccion()));
//
//            prod3.setNombreProducto("Asus P8Z77-V LK");
//            prod3.setDescripcionProducto("Tarjeta madre");
//            File img3 = new File("C:\\Users\\Carlos\\Downloads\\51XovCPDOGL.jpg");
//            byte[] cont3 = Files.readAllBytes(img3.toPath());
//            prod3.setImagen(cont3);
//            prod3.setFabricante("ASUS");
//            prod3.setCategoria(new Categoria(1, ""));
//            prod3.setCantDisponible(73);
//            prod3.setPrecioRegular(120000);
//            prod3.setDescuento(0);
//            prod3.setProveedor(new Proveedor(1, "", new Direccion()));
//
//            prod4.setNombreProducto("Intel Core i5-3570K");
//            prod4.setDescripcionProducto("Procesador");
//            File img4 = new File("C:\\Users\\Carlos\\Downloads\\51E9qnkfxEL.jpg");
//            byte[] cont4 = Files.readAllBytes(img4.toPath());
//            prod4.setImagen(cont4);
//            prod4.setFabricante("Intel");
//            prod4.setCategoria(new Categoria(1, ""));
//            prod4.setCantDisponible(46);
//            prod4.setPrecioRegular(180000);
//            prod4.setDescuento(0);
//            prod4.setProveedor(new Proveedor(1, "", new Direccion()));

//            prod5.getFabricante().setCodigoFabricante(2);
//            prod5.setAlto(2.5400);
//            prod5.setAncho(7.6200);
//            prod5.setLargo(10.160);
//            prod5.setCantidad(37);
//            prod5.setDescripcion("Memoria RAM");
//            File img5 = new File("C:\\Users\\Carlos\\Downloads\\51VKO8GSGNL.jpg");
//            byte[] cont5 = Files.readAllBytes(img5.toPath());
//            prod5.setImagen(cont5);
//            prod5.setNombre("Corsair Vengeance 8GB DDR3 1600MHz");
//            prod5.setPeso(0.119);
//            prod5.setPrecio(80000);
//
//            prod6.getFabricante().setCodigoFabricante(7);
//            prod6.setAlto(0.762);
//            prod6.setAncho(7.112);
//            prod6.setLargo(9.906);
//            prod6.setCantidad(23);
//            prod6.setDescripcion("Unidad de estado solido");
//            File img6 = new File("C:\\Users\\Carlos\\Downloads\\61XgXJor1xL._SL1500_.jpg");
//            byte[] cont6 = Files.readAllBytes(img6.toPath());
//            prod6.setImagen(cont6);
//            prod6.setNombre("Samsung 840 EVO 250GB");
//            prod6.setPeso(0.41);
//            prod6.setPrecio(125000);
//
//            prod7.getFabricante().setCodigoFabricante(2);
//            prod7.setAlto(8.636);
//            prod7.setAncho(14.986);
//            prod7.setLargo(16.002);
//            prod7.setCantidad(42);
//            prod7.setDescripcion("Fuente de poder semimodular");
//            File img7 = new File("C:\\Users\\Carlos\\Downloads\\41zsoaWitgL.jpg");
//            byte[] cont7 = Files.readAllBytes(img7.toPath());
//            prod7.setImagen(cont7);
//            prod7.setNombre("Corsair TX 750 80 PLUS Bronze");
//            prod7.setPeso(3.4473);
//            prod7.setPrecio(125000);
//
//            prod8.getFabricante().setCodigoFabricante(2);
//            prod8.setAlto(26.924);
//            prod8.setAncho(55.88);
//            prod8.setLargo(50.546);
//            prod8.setCantidad(53);
//            prod8.setDescripcion("Unidad de estado solido");
//            File img8 = new File("C:\\Users\\Carlos\\Downloads\\61k+utIGpvL._SL1500_.jpg");
//            byte[] cont8 = Files.readAllBytes(img8.toPath());
//            prod8.setImagen(cont8);
//            prod8.setNombre("Corsair Carbide 200R ");
//            prod8.setPeso(7.2121);
//            prod8.setPrecio(95000);
//
//            prod9.getFabricante().setCodigoFabricante(5);
//            prod9.setAlto(2.032);
//            prod9.setAncho(14.732);
//            prod9.setLargo(14.732);
//            prod9.setCantidad(65);
//            prod9.setDescripcion("Sistema operativo Windows");
//            File img9 = new File("C:\\Users\\Carlos\\Downloads\\31oGjt4LCTL.jpg");
//            byte[] cont9 = Files.readAllBytes(img9.toPath());
//            prod9.setImagen(cont9);
//            prod9.setNombre("Microsoft Windows 8.1 - Full Version");
//            prod9.setPeso(0.1134);
//            prod9.setPrecio(80000);
//
//            prod10.getFabricante().setCodigoFabricante(4);
//            prod10.setAlto(4.572);
//            prod10.setAncho(11.938);
//            prod10.setLargo(6.604);
//            prod10.setCantidad(11);
//            prod10.setDescripcion("Mouse optico para videojuegos");
//            File img10 = new File("C:\\Users\\Carlos\\Downloads\\71ElpjpEE4L._SL1500_.jpg");
//            byte[] cont10 = Files.readAllBytes(img10.toPath());
//            prod10.setImagen(cont10);
//            prod10.setNombre("ROCCAT Lua");
//            prod10.setPeso(0.2806);
//            prod10.setPrecio(50000);
//
//            prod11.getFabricante().setCodigoFabricante(8);
//            prod11.setAlto(8.89);
//            prod11.setAncho(22.860);
//            prod11.setLargo(15.748);
//            prod11.setCantidad(7);
//            prod11.setDescripcion("Ventilador para CPU");
//            File img11 = new File("C:\\Users\\Carlos\\Downloads\\91wN1wFlqzL._SL1500_.jpg");
//            byte[] cont11 = Files.readAllBytes(img11.toPath());
//            prod11.setImagen(cont11);
//            prod11.setNombre("Cooler Master Hyper 212 EVO");
//            prod11.setPeso(0.9072);
//            prod11.setPrecio(45000);

//            pd.insertarProducto(prod1);
//            pd.insertarProducto(prod2);
//            pd.insertarProducto(prod3);
//            pd.insertarProducto(prod4);
//            pd.insertarProducto(prod5);
//            pd.insertarProducto(prod6);
//            pd.insertarProducto(prod7);
//            pd.insertarProducto(prod8);
//            pd.insertarProducto(prod9);
//            pd.insertarProducto(prod10);
//            pd.insertarProducto(prod11);
//            System.out.println(pd.getProducto(1).getNombreProducto());
//            System.out.println(pd.getProductos().getFirst().getNombreProducto());
//            System.out.println(pd.getProductosCat(1).getFirst().getNombreProducto());
//            System.out.println(pd.getProductosNom("GTX760").getFirst().getNombreProducto());
//            System.out.println(pd.getProductosDesc("Tarjeta").getFirst().getNombreProducto());
            
            for (Producto producto : pd.getLanzamientos()) {
                System.out.println(producto.getNombreProducto());
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDataTest.class.getName()).log(Level.SEVERE, null, ex);
        }
//        catch (IOException ex) {
//            Logger.getLogger(ProductoDataTest.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
}
