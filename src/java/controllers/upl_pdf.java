/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.dao.DBconnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author KHALID-RAMI
 */
@WebServlet(name = "upl_pdf", urlPatterns = {"/upl_pdf"})
public class upl_pdf extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
                InputStream inputStream = null;

                Random rand = new Random();
                int  n = rand.nextInt(9999) + 1;

                
                String title=(request.getParameter("title"));
                Part file = request.getPart("file");
                
                if (file != null) 
                {
                    System.out.println(file.getName());
                    System.out.println(file.getSize());
                    System.out.println(file.getContentType());

                    inputStream = file.getInputStream();
                }
        
                try 
                {
                    DBconnection dbconn=new DBconnection();
                    Connection conn= dbconn.getConnection();
                    
                    String sql = "INSERT INTO papier (title, file) values ( ?, ?)";
                    PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setString(1, title);
             
                    if (inputStream != null) 
                    {
                        statement.setBinaryStream(2, inputStream, (int) file.getSize());
                    }
                    
                    int row = statement.executeUpdate();
                    if (row > 0) 
                    {
                        out.println("File uploaded!!!");
                        
                        conn.close();
                        
                        RequestDispatcher rs = request.getRequestDispatcher("upload_form.jsp");
                        rs.include(request, response);
                    }
                    else
                    {
                        out.println("Couldn't upload your file!!!");
                        
                        conn.close();
                        
                        RequestDispatcher rs = request.getRequestDispatcher("upload_form.jsp");
                        rs.include(request, response);
                    }    

                }catch(Exception e){e.printStackTrace();}     
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
