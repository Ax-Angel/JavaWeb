/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import datos.Colecciones;
import datos.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Producto;

/**
 *
 * @author -Angel
 */
@WebServlet(name = "BuscarProducto", urlPatterns = {"/BuscarProducto"})
public class BuscarProducto extends HttpServlet {

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
            out.println("<title>Redireccionando...</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Colecciones.productoRetornado.clear();
            
            String buscar = request.getParameter("buscar");
            
            if(!buscar.equals("Seleccione")){
                
                Conexion conexion = new Conexion();
                ArrayList<Producto> producto = conexion.buscarProductos(buscar);
                for(Producto productoObtenido: producto){
                    Producto prod = new Producto();
                    prod.setId(productoObtenido.getId());
                    prod.setNombre(productoObtenido.getNombre());
                    prod.setPrecio(productoObtenido.getPrecio());
                    prod.setTipo(productoObtenido.getTipo());
                    Colecciones.productoRetornado.add(prod);
                }
                
                response.sendRedirect("index.jsp");
                
            }else{
                out.print("<script type=text/javascript>");
                out.print("alert('SELECCIONE UNA OPCION DISTINTA DE PRODUCTO');");
                out.print("location.href='index.jsp';");
                out.print("</script>");
            }
            
        }catch(Exception e){
            
        }finally {
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }
    
    public ArrayList<Producto> getRetorno(){
        return Colecciones.productoRetornado;
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
    }// </editor-fold
}
