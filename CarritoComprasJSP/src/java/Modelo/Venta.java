/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.security.Timestamp;

/**
 *
 * @author -Angel
 */
public class Venta {
    private int codigoVenta;
    private String cliente;
    private Timestamp fecha;
    //Constructor de la clase sin parametros

    public Venta() {
    }
    //Constructor de la clase con parametros

    public Venta(int codigoVenta, String cliente, Timestamp fecha) {
        this.codigoVenta = codigoVenta;
        this.cliente = cliente;
        this.fecha = fecha;
    }
    
     public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

}
