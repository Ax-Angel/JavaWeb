/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;
import modelo.Producto;

/**
 *
 * @author -Angel
 */
public class Cliente {
    
    private String rut;
    private String nombre;
    
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public Cliente(){
        rut = "";
        nombre = "";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
