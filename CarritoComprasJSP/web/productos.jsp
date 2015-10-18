<%-- 
    Document   : productos
    Created on : Oct 18, 2015, 5:05:10 PM
    Author     : -Angel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Producto"%>
<%@page import="datos.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="BuscarProducto" method="post">
            <table border="0">
                <tr>
                    <td>
                        <select name="buscar" id="buscar">
                            <option value="Seleccione">Seleccione Producto...</option>
                            <%
                                Conexion conexion = new Conexion();
                                ArrayList<Producto> productos = conexion.mostrarProductos();
                                for(Producto producto: productos){
                            %>
                            <option value="<%out.print(producto.getNombre());%>"><%out.print(producto.getNombre());%></option>
                            <% } %>
                        </select>
                        <input type="submit" value="Buscar"/>
                    </td>
                </tr>
            </table>
        </form>
  
    </body>
</html>
