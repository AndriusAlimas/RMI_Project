package com.andrius.project.RMI_Project.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.Naming;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andrius.project.RMI_Project.interfaces.AddI;

public class ClientServlet extends HttpServlet {

    public ClientServlet() {
        super(); 
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		int sum = 0;
		// As a client you dont know where is AddC object
		try{
		AddI obj = (AddI) Naming.lookup("ADD");
		 sum = obj.add(5,4);
		}catch(Exception exc){
			exc.printStackTrace();
		}
		

		pw.println("<h1>We get answer remote : " + sum + "</h1>");
	}

}
