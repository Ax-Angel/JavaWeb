/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;
import modelo.Producto;

/**
 *
 * @author -Angel
 */
@WebServlet(name = "TerminarVenta", urlPatterns = {"/TerminarVenta"})
public class TerminarVenta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Boleta Detalle</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String nombre = request.getParameter("nombreCliente");
            String rut = request.getParameter("rut");
            
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setRut(rut);
            
            out.print("<table>");
            out.print("<tr>");
            out.print("<td><h1>DETALLE DE LA BOLETA</h1></td>");
            out.print("</tr>");
            out.print("</table>");
            
            
            for(Producto producto: Cliente.productos){
                out.print("<table>");
                out.print("<tr>");
                out.print("<td>Id Producto: "+producto.getId()+"</td>");
                out.print("</tr>");
                out.print("<tr>");
                out.print("<td>Nombre Producto: "+producto.getNombre()+"</td>");
                out.print("</tr>");
                out.print("<tr>");
                out.print("<td>Tipo Producto: "+producto.getTipo()+"</td>");
                out.print("</tr>");
                out.print("<tr>");
                out.print("<td>Precio Producto: $"+producto.getPrecio()+"</td>");
                out.print("</tr>");
                out.print("</table>");
                out.print("<br/><br/>");
            }
            
                out.print("<table>");
                out.print("<tr>");
                out.print("<td>Nombre Cliente: "+cliente.getNombre()+"</td>");
                out.print("</tr>");
                out.print("<tr>");
                out.print("<td>Rut Cliente: "+cliente.getRut()+"</td>");
                out.print("</tr>");
                out.print("</table>");
            
        }catch(Exception e){
            
        }finally {
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
