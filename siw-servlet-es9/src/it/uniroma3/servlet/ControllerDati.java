package it.uniroma3.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma3.model.*;

@WebServlet("/controllerDati")
public class ControllerDati extends HttpServlet {
	private static final long serialVersionUID= 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Prodotto> prodotti = new ArrayList<>();
		Prodotto prodotto1 = new Prodotto();
		prodotto1.setNome("penna blue");
		prodotto1.setPrezzo(2.0F);
		prodotto1.setCodice("47");
		prodotto1.setDescrizione("bla bla bla");
		prodotti.add(prodotto1);
		
		Prodotto prodotto2 = new Prodotto();
		prodotto2.setNome("penna nera");
		prodotto2.setPrezzo(2.0F);
		prodotto2.setCodice("48");
		prodotto2.setDescrizione("bla bla bla");
		prodotti.add(prodotto2);
		
		request.setAttribute("prodotti", prodotti);
		response.encodeURL("/prodotti.jsp");
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/prodotti.jsp");
		rd.forward(request, response);
		
	}

}
