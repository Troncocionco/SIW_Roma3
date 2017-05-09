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
import javax.servlet.http.HttpSession;

@WebServlet("/processaDati")
public class LeggiParametriRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	/* GESTIONE DELLA RICHIESTA */
	
	// leggo i parametri
	String nome = request.getParameter("nome").toUpperCase();
	String cognome = request.getParameter("cognome").toUpperCase();
	
	// memorizzo i dati della sessione
	HttpSession session = request.getSession();
	session.setAttribute("NOME",nome);
	session.setAttribute("COGNOME",cognome);

	//encodeUrl();
	/****************************************************************/
	
	// inoltro RICHIESTA
	
	ServletContext application = getServletContext();
	RequestDispatcher rd = application.getRequestDispatcher("/conferma.jsp");
	rd.forward(request, response);
	return;
	
		
	}
}

