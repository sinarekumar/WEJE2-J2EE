package com.jspiders.servlets.classes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hobbies")
public class Hobbies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hobbies() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String[] hobbies=request.getParameterValues("hobby");
		printWriter.println("<h3> your selected hobbies are : </h3>");
		for (String hobby : hobbies) {
			printWriter.println(hobby+"<br>");
		}
		
	}

}
