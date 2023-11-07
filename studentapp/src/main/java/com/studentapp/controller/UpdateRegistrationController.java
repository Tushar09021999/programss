package com.studentapp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

import com.studentapp.model.DAOService;
import com.studentapp.model.DAOServiceimpl;

@WebServlet("/update")
public class UpdateRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	
	request.setAttribute("email", email);
	request.setAttribute("mobile", mobile);
	
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/update_regisatration.jsp");
	rd.forward(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		
		DAOService service = new DAOServiceimpl(); 
		service.connectDB();
		service.updateReg(email, mobile);
		
		
		ResultSet result = service.getALLReg();
		request.setAttribute("res", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/list_registration.jsp");
		rd.forward(request, response);
		
		
	}

}
