/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author -Angel
 */
public class VentaBD {
     //Metodo utilizado para insertar una Venta a nuestra Base de datos
    public static synchronized boolean insertarVenta(Venta varventa, ArrayList<DetalleVenta> detalle) {

        Connection cn = null;
        CallableStatement cl = null;
        boolean rpta = false;
        
        
}
