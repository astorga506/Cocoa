/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.topgadgets.domain;

import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class Cliente {

    private int idCliente;
    private String correo;
    private String nombreCliente;
    private String apellidosCliente;
    private String contrasena;
    private Direccion direccion;
    private LinkedList<Orden> ordenes;
    private LinkedList<ItemCarrito> carrito;

    public Cliente() {
        direccion = new Direccion();
        ordenes = new LinkedList<Orden>();
        carrito = new LinkedList<ItemCarrito>();
    }

    public Cliente(int idCliente, String correo, String nombreCliente, String apellidosCliente, String contrasena, Direccion direccion, LinkedList<Orden> ordenes, LinkedList<ItemCarrito> carrito) {
        this.idCliente = idCliente;
        this.correo = correo;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.ordenes = ordenes;
        this.carrito = carrito;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public LinkedList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(LinkedList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public LinkedList<ItemCarrito> getCarrito() {
        return carrito;
    }

    public void setCarrito(LinkedList<ItemCarrito> carrito) {
        this.carrito = carrito;
    }
}
