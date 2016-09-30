/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.Login;

import com.event.Entity.AddingEventEntity;
import com.event.Entity.EvEntity;
import static com.event.Login.PdfServlet.getEvtTable;
import com.event.access.AccessManager;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name ="pdf", urlPatterns = {"/pdf"})
public class PDFGenServlet extends HttpServlet {

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
            throws ServletException, IOException, DocumentException, Exception {
        //response.setContentType("text/html;charset=UTF-8");
        // try (PrintWriter out = response.getWriter()) {
        /* TODO output your page here. You may use following sample code. */
        response.setContentType("application/pdf");
        AccessManager ac = new AccessManager();
        ArrayList<AddingEventEntity> accessList = new ArrayList<AddingEventEntity>();

        accessList = ac.getAccess_Event();

        try {

            Document document = new Document();
            try {
                PdfWriter.getInstance(document, response.getOutputStream());

            } catch (DocumentException ex) {
                Logger.getLogger(PdfServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.open();
            document.add(new Paragraph("EventDetails"));
            document.add(new Paragraph(new Date().toString()));
            document.add(getEvtTable(accessList));
            document.close();

        } catch (DocumentException de) {
            throw new IOException(de.getMessage());
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
        try {
            processRequest(request, response);

        } catch (Exception ex) {
            Logger.getLogger(PDFGenServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(PDFGenServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public static PdfPTable getEvtTable(ArrayList accessList) {
        Iterator EvIt = accessList.iterator();
        // a table with three columns
        PdfPTable table = new PdfPTable(5);

        // the cell object
        PdfPCell cell;
        // we add a cell with colspan 3
    
        cell = new PdfPCell(new Phrase("EVENT PDF Generated BY JavaLearners"));
    
        cell.setColspan(7);

        table.addCell(cell);
     
       
        while (EvIt.hasNext()) {
            AddingEventEntity em = (AddingEventEntity) EvIt.next();
            table.addCell("" + em.getEvent_id());
            table.addCell("" + em.getEvent_title());
            table.addCell("" + em.getEvent_address());
            table.addCell("" + em.getEvent_time());
            table.addCell("" + em.getEvent_organiser());

        }

        return table;
    }

}
