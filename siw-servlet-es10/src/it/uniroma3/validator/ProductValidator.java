package it.uniroma3.validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import it.uniroma3.model.Product;

public class ProductValidator {

	//VALIDATORE FORM
	public boolean validate(HttpServletRequest request) {
		
		//forma valida
		boolean formCheck = true;
		
		/*Lettura da REQUEST(dati sono tutte string quando estratti)*/
		
		String name = request.getParameter("name");
		String description =request.getParameter("description");
		String price = request.getParameter("price");
		String expDate = request.getParameter("expDate");
		
//		Recupero riferimento ad oggetto prodotto
		Product product = (Product) request.getAttribute("product");
		
		
//		Check Name
		if(name==null || name.equals("")) {
			request.setAttribute("errName","Campo obbligatorio");
			formCheck = false;
		}
		else {
			product.setName(name);
		}
		//Check Description
		if(description==null || description.equals("")) {
			request.setAttribute("errDescription","Campo obbligatorio");
			formCheck = false;
		}
		else {
			product.setDescription(description);
		}
		//Check Price
		if(price==null || price.equals("")) {
			request.setAttribute("errPrice","Campo obbligatorio");
			formCheck = false;
		}
		else {
			try {
				product.setPrice(Float.parseFloat(price));
			}
			catch (NumberFormatException exception) {
				request.setAttribute("errPrice", "Deve essere un numero");
				formCheck = false;
			}
		}
		//Check expDate
		if(expDate==null || expDate.equals("")) {
			request.setAttribute("errExpDate","Campo obbligatorio");
			formCheck = false;
		}
		else {
			try {
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				product.setExpDate(df.parse(expDate));
			}
			catch (ParseException exception) {
				request.setAttribute("errExpDate", "Inserire un data valida");
				formCheck = false;
			}
		}
		
		return formCheck;
		
	}//End of Validate() 

}//End of Class
