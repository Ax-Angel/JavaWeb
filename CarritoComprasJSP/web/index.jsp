<%-- 
    Document   : index
    Created on : 18-10-2015, 05:03:15 PM
    Author     : -Angel
--%>

<%@page import="servlets.BuscarProducto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Producto"%>
<%@page import="datos.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simulacion Carrito Compra</title>
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
        <br/><br/>
        <form action="AgregarProducto" method="post">
            <table border="0">
                <%
                    BuscarProducto buscar = new BuscarProducto();
                    ArrayList<Producto> productosRetornados = buscar.getRetorno();
                    for(Producto producto: productosRetornados){
                %>
                <tr>
                    <td>Indentificacion Producto </td>
                    <td><input type="text" name="id" readonly value="<%out.print(producto.getId());%>"/></td>
                </tr>
                <tr>
                    <td>Nombre Producto </td>
                    <td><input type="text" name="nombre" readonly value="<%out.print(producto.getNombre());%>"/></td>
                </tr>
                <tr>
                    <td>Tipo Producto </td>
                    <td><input type="text" name="tipo" readonly value="<%out.print(producto.getTipo());%>"/></td>
                </tr>
                <tr>
                    <td>Precio Producto $</td>
                    <td><input type="text" name="precio" readonly value="<%out.print(producto.getPrecio());%>"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td>+ <input type="submit" value="Agregar"/></td>
                </tr>
                <% } %>
            </table>
        </form>
        <form action="TerminarVenta" method="post">
            <table>
                <tr>
                    <td></td>
                    <td><h4>Datos Personales</h4></td>
                </tr>
                <tr>
                    <td>NOMBRE CLIENTE</td>
                    <td><input type="text" name="nombreCliente"/></td>
                </tr>
                <tr>
                    <td>RFC CLIENTE</td>
                    <td><input type="text" name="rut"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Terminar Compra"/></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
