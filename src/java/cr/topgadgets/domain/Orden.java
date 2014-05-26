/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.topgadgets.domain;

import java.sql.Date;
import java.util.LinkedList;

/**
 *
 * @author Carlos
 */
public class Orden {
    
    private int idOrden;
    private Date fechaOrden;
    private String estadoEnvio;
    private String courier;
    private float montoTotal;
    private String enviaraNombre;
    private String enviaraApellidos;
    private String numTarjeta;
    private Date fechaExpiracion;
    private String tipoTarjeta;
    private String canton;
    private String distrito;
    private String provincia;
    private String direccion;
    private String codPostal;
    private LinkedList<ItemOrden> itemesOrden ;

    public Orden() {
        itemesOrden = new LinkedList<ItemOrden>();
    }

    public Orden(int idOrden, Date fechaOrden, String estadoEnvio, String courier, float montoTotal, 
            String enviaraNombre, String enviaraApellidos, String numTarjeta, Date fechaExpiracion, String tipoTarjeta, 
            String canton, String distrito, String provincia, String direccion, String codPostal,
            LinkedList<ItemOrden> itemesOrden) {
        this.idOrden = idOrden;
        this.fechaOrden = fechaOrden;
        this.estadoEnvio = estadoEnvio;
        this.courier = courier;
        this.montoTotal = montoTotal;
        this.enviaraNombre = enviaraNombre;
        this.enviaraApellidos = enviaraApellidos;
        this.numTarjeta = numTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.tipoTarjeta = tipoTarjeta;
        this.canton = canton;
        this.distrito = distrito;
        this.provincia = provincia;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.itemesOrden = itemesOrden;
    }
    
    public LinkedList<ItemOrden> getItemesOrden() {
        return itemesOrden;
    }

    public void setItemesOrden(LinkedList<ItemOrden> itemesOrden) {
        this.itemesOrden = itemesOrden;
    }
    
    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getEnviaraNombre() {
        return enviaraNombre;
    }

    public void setEnviaraNombre(String enviaraNombre) {
        this.enviaraNombre = enviaraNombre;
    }

    public String getEnviaraApellidos() {
        return enviaraApellidos;
    }

    public void setEnviaraApellidos(String enviaraApellidos) {
        this.enviaraApellidos = enviaraApellidos;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

}
