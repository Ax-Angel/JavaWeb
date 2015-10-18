<%-- 
    Document   : index
    Created on : Oct 18, 2015, 5:04:34 PM
    Author     : -Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <div id="primera">
            <p>
                Bienvenido a la PrebeTienda. Por favor ingrese sus datos personales para iniciar la compra
            </p>
            
        </div>
        <div id="datos">
        <form action="" method="post">
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
                    <td><input type="text" name="rfc"/></td>
                </tr>
                <tr>
                    <td>Dinero Disponible</td>
                    <td><input type="text" name="dinero"/></td>
                </tr>
                <tr>
                    <td></td>
                <a href="productos.jsp"><td><input type="submit" value="Enviar"/></td></a>
                </tr>
            </table>
        </form>
        </div>
    </body>
</html>
