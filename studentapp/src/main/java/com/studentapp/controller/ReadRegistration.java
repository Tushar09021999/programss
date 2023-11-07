package com.studentapp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.ResultSet;

import com.studentapp.model.DAOService;
import com.studentapp.model.DAOServiceimpl;

@WebServlet("/fetch")
public class ReadRegistration extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    public ReadRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(10);
		if(session.getAttribute("email")!=null) {
		DAOService service = new DAOServiceimpl(); 
		service.connectDB();
		
		ResultSet result = service.getALLReg();
		request.setAttribute("res", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/list_registration.jsp");
		rd.forward(request, response);
	}
	else {
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
	}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

