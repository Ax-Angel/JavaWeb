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
public class DetalleVenta {
     private int codigoVenta;
    private int codigoProducto;
    private double cantidad;
    private double descuento;
    private Producto producto;
    private Venta venta;

    //Constructor sin parametros
    public DetalleVenta() {
    }
    //Constructor con parametros

    public DetalleVenta(int codigoVenta, int codigoProducto, double cantidad, double descuento) {
        this.codigoVenta = codigoVenta;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }
}
