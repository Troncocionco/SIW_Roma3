package it.uniroma3.controller;

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

import it.uniroma3.model.Product;
import it.uniroma3.service.ProductService;
import it.uniroma3.validator.ProductValidator;

@WebServlet("/controller")
public class ProductController extends HttpServlet{

	public ProductController() {
		
	}// End Costruttore

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/*If request.getParameter("command") != null )
		 * long id = Long.parseLong(request.getParameter("id");
		 * ProductService pv = new ProductService();
		 * Product p = getOneProduct(id);
		 * pv.delete(p);
		 * request.setAttribute("prodotti",pv.getProdotti());
		 * nextPage = "/linkProdotti.jsp";
		 * else { TUTTO IL RESTO*/
		
		
		//Creo e rendo disponibile riferimento a oggetto product
		Product  product = new Product();
		request.setAttribute("product", product);
				
		//La prossima pagina
		String nextPage;
		
		
		/*		VALIDAZIONE		*/
		
		//Creo oggetto validatore
		ProductValidator validator = new ProductValidator();
		
		if(validator.validate(request)) {
			//Rendi l'inserimento persistente
			ProductService service = new ProductService();
			service.insertProduct(product);
			nextPage = "/product.jsp";
		}
		else {
			//Ritorno alla pagina inserimento
			nextPage = "/index.jsp";
		}
		
		/*		INOLTRO PROSSIMA PAGINA		*/
		
		//Passo l'URI prossima pagina nel contesto dell'applicazione
		ServletContext application = getServletContext();
		RequestDispatcher rd;
		rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
		
	}//End doPost
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		//Creo e rendo disponibile riferimento a LISTA productS
		List<Product> products = new ArrayList<Product>();
		request.setAttribute("products", products);
		
		//Imposto la nuova pagina
		String nextPage = "/product.jsp";

		//Crea nuovo oggetto ProductService e richiedi la List dei prodotti
		ProductService service = new ProductService();
		products = service.getProducts();
		
		//Aggiornata la lista da passare alla prossima pagina. Altrimenti la lista rimane nuova
		request.setAttribute("products", products);	

		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);

	}//End doGet
	
}//End Class
