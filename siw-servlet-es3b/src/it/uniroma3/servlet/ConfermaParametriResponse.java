package it.uniroma3.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/confermaDati")
public class ConfermaParametriResponse extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			HttpSession session = request.getSession();
			
			//imposto il tipo di documento(HTML)
			response.setContentType("text/html");
			

			PrintWriter out = response.getWriter();
			
			out.println("<!DOCTYPE html>"); out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"ISO-8859-1\" />");
			out.println("<title>Conferma dati inseriti</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h2>Conferma dei dati inseriti</h2>");
			out.println("<ul>");
			out.println("<li>Nome: <b>"+session.getAttribute("NOME")+"</b></li>");
			out.println("<li>Cognome: <b>"+session.getAttribute("COGNOME")+"</b></li>");
			out.println("</ul>");
			out.println("<br /> <a href=\"mostraDati\" value=\"Conferma\">Conferma</a>");
			out.println("<br /> <a href=\"processaDati\" value=\"Modifica\"/>Modifica</a>");
			out.println("</body>\n</html> ");
			
		}

}
