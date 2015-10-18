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
public class Producto {
     private int codigoProducto;
    private String nombre;
    private double precio;
    //Constructor de la clase sin parametros
    public Producto() {
    }
    //Constructor de la clase con parametros
    public Producto(int codigoProducto, String nombre, double precio) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precio = precio;
    }
}
