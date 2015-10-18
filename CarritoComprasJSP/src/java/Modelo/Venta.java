/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
}
