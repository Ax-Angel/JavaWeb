/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author -Angel
 */
public class Cliente {
    private String RFC;
    private String nombre;
    
     public static ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public Cliente(){
        RFC = "";
        nombre = "";
    }
}
