//package it.uniroma3.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/mostraDati")
//public class MostraParametri extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//		throws ServletException, IOException {
//
//		
//		// gestione della RISPOSTA
//
//
//		
//		//preparo il tipo (HTML)
//		/* NOTA: Sto dicendo che il contenuto della mia risposta è 
//		un documento Html*/
//		response.setContentType("text/html");
//		
//		//preparo un oggetto su cui scrivere la risposta
//		/* NOTA: L'oggetto è un'istanza della classe PrintWriter che viene
//		 * creata invocando il metodo getWriter() sull'oggetto 
//		 * response*/
//		PrintWriter out = response.getWriter();
//		//scrivo il corpo
//		out.println("<!DOCTYPE html>"); out.println("<html>");
//		out.println("<head>");
//		out.println("<meta charset=\"ISO-8859-1\" />");
//		out.println("<title>mostra parametri</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Dati inseriti nella form</h1>");
//		out.println("<ul>");
//		out.println("<li>Nome: <b>"+request.getAttribute("nome")+"</b></li>");
//		out.println("<li>Cognome: <b>"+request.getAttribute("cognome")+"</b></li>");
//		out.println("<li><b>"+request.getAttribute("frase")+"</b></li>");
//		out.println("</ul>");
//		
//		out.println("<h6>Altri dati relativi alla richiesta</h6>");
//		out.println("<br />IP: <b>"+request.getRemoteAddr()+"</b>");
//		out.println("<br />Host: <b>"+request.getRemoteHost()+"</b>");
//		out.println("<br />User Agent: <b>"+request.getHeader("User-Agent")+"</b>");
//		out.println("</body>\n</html> ");
//		
//		}
//}
package it.uniroma3.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostraDati")
public class MostraParametri extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		
		// gestione della RISPOSTA

		//preparo il tipo (HTML)
		/* NOTA: Sto dicendo che il contenuto della mia risposta è 
		un documento Html*/
		response.setContentType("text/html");
		
		//preparo un oggetto su cui scrivere la risposta
		/* NOTA: L'oggetto è un'istanza della classe PrintWriter che viene
		 * creata invocando il metodo getWriter() sull'oggetto 
		 * response*/
		PrintWriter out = response.getWriter();
		//scrivo il corpo
		out.println("<!DOCTYPE html>"); out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\" />");
		out.println("<title>mostra parametri</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Dati inseriti nella form</h1>");
		out.println("<ul>");
		out.println("<li>Nome: <b>"+request.getAttribute("nome")+"</b></li>");
		out.println("<li>Cognome: <b>"+request.getAttribute("cognome")+"</b></li>");
		out.println("</ul>");
		out.println("<h1>Altri dati relativi alla richiesta</h1>");
		out.println("<br />IP: <b>"+request.getRemoteAddr()+"</b>");
		out.println("<br />Host: <b>"+request.getRemoteHost()+"</b>");
		out.println("<br />User Agent: <b>"+request.getHeader("User-Agent")+"</b>");
		out.println("</body>\n</html> ");
		
		}
}

