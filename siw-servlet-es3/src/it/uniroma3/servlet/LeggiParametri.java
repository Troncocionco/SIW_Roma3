//package it.uniroma3.servlet;
//
//import java.io.IOException;
////import java.io.PrintWriter;
//import java.util.Objects;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/processaDati")
//public class LeggiParametri extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		
//	// gestione della RICHIESTA
//	
//	// leggo i parametri
//	String nome = (String)request.getParameter("nome").toUpperCase();
//	String cognome = (String)request.getParameter("cognome").toUpperCase();
//		
//	String frase = getPersona(nome, cognome);
//	
//	// aggiorno i dati processati da inoltrare alla gestione della RISPOSTA
//	request.setAttribute("nome",nome);
//	request.setAttribute("cognome",cognome);
//	request.setAttribute("frase",frase);
//
//	/****************************************************************/
//	
//	// inoltro RICHIESTA
//	
//	ServletContext application = getServletContext();
//	RequestDispatcher rd = application.getRequestDispatcher("/mostraDati");
//	rd.forward(request, response);
//	return;
//	
//		
//	}
//	
//	private String getPersona(String nome, String cognome) {
//		String frase = "";

//		IL CONFRONTO TRA STRING NON PUÒ ESSERE FATTO CON '=='
//		
//		if(Objects.equals(nome,"CHIARA") && Objects.equals(cognome,"CAPPONI")) {
//			frase = "Ma allora sei Pidi Pidi!!!! Ciao Amore mio<3";
//		} 
//		
//		return frase;
//	}
//	
//
//}

package it.uniroma3.servlet;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/processaDati")
public class LeggiParametri extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	// gestione della RICHIESTA
	
	// leggo i parametri
	String nome = request.getParameter("nome").toUpperCase();
	String cognome = request.getParameter("cognome").toUpperCase();
	
	
	
	// leggo (alcune) intestazioni http della richiesta
	//	String address = (String)request.getRemoteAddr();
	//	String host = (String)request.getRemoteHost();
	//	String userAgent = request.getHeader("User-Agent");
	
	
	// aggiorno i dati processati da inoltrare alla gestione della RISPOSTA
	request.setAttribute("nome",nome);
	request.setAttribute("cognome",cognome);

	/****************************************************************/
	
	// inoltro RICHIESTA
	
	ServletContext application = getServletContext();
	RequestDispatcher rd = application.getRequestDispatcher("/mostraDati");
	rd.forward(request, response);
	return;
	
		
	}
}

