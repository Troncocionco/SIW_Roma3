package it.uniroma3.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studente")
public class StudenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/*La servlet genera una pagina di risposta in cui mostra tutti i dati letti dalla form, il 
	 * numero ip e lo user-agent del client*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome =  request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String dataNascita = request.getParameter("birthDate");
		String facolta =(String) request.getParameter("facoltà");
		
		String address = (String) request.getRemoteAddr();
		String userAgent = (String) request.getHeader("User-Agent");
		
		//RISPOSTA
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>"); out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\" />");
		out.println("<title>Dati Inseriti</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Riepilogo inserimento</h1>");
		out.println("<ul>");
		out.println("<li>Nome: <b>"+nome+"</b></li>");
		out.println("<li>Cognome: <b>"+cognome+"</b></li>");
		out.println("<li>Data di Nascita: <b>"+dataNascita+"</b></li>");
		out.println("<li>Facoltà: <b>"+facolta+"</b></li>");
		out.println("</ul>");
		out.println("<h1>Richiesta Effettuata da:</h1>");
		out.println("<br />IP: <b>"+address+"</b>");
		out.println("<br />User Agent: <b>"+userAgent+"</b>");
		out.println("</body>\n</html> ");
		
		
		
	}

}
