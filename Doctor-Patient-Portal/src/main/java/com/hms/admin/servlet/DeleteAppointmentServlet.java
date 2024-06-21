package com.hms.admin.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteAppointmentServlet")
public class DeleteAppointmentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int appointmentId = Integer.parseInt(request.getParameter("id"));
        
        // Call your DAO method to delete the appointment
        // Example: appointmentDAO.deleteAppointment(appointmentId);
        
        // Redirect back to the appointment list page
        response.sendRedirect("ViewAppointmentPage.jsp");
    }
}
