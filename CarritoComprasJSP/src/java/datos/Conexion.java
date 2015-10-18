/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.*;
import java.util.ArrayList;
import modelo.Producto;

/**
 *
 * @author -Angel
 */
public class Conexion {
    
    private Connection conn;
    private Statement state;
    
    public Conexion(){
        
    }
    
    public void conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb","root",null);
            state = conn.createStatement();
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
        }
    }
    
    public ArrayList<Producto> mostrarProductos() throws Exception{
        conexion();
        ArrayList<Producto> productos = new ArrayList<>();
        ResultSet result = state.executeQuery("SELECT * FROM Producto");
        while(result.next()){
            Producto producto = new Producto();
            producto.setId((Integer) result.getObject(1));
            producto.setNombre((String) result.getObject(2));
            producto.setTipo((String) result.getObject(3));
            producto.setPrecio((Integer) result.getObject(4));
            productos.add(producto);
        }return productos;
    }
}
