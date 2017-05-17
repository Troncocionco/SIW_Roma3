package it.uniroma3.validator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import it.uniroma3.model.Prodotto;

import java.text.ParseException;;

public class ProductValidator {
	
	public boolean validate(HttpServletRequest request)  {
		
		boolean tuttoOk = true;
		
		String nome = request.getParameter("nome");
		String descrizione = request.getParameter("descrizione");
		String prezzo = request.getParameter("prezzo");
		String dataScadenza = request.getParameter("dataScadenza");
		Prodotto prodotto = (Prodotto) request.getAttribute("prodotto");
		
		
		// controllo sul nome
		if(nome==null || nome.equals("")) {
			request.setAttribute("errNome", "Campo obbligatorio");
			tuttoOk = false;
		}
		else{
			prodotto.setNome(nome);
		}
		
		// controllo sulla descrizione
		if(descrizione==null || descrizione.equals("")) {
			request.setAttribute("errDescrizione", "Campo obbligatorio");
			tuttoOk=false;
		}
		else{
			prodotto.setDescrizione(descrizione);
		}
		
		// controllo sul prezzo
		if(prezzo==null || prezzo.equals("")) {
			request.setAttribute("errPrezzo", "Campo obbligatorio");
			tuttoOk=false;
		}
		else{
			try {
				prodotto.setPrezzo(Float.parseFloat(prezzo)); //prova a convertire prezzo in un numero
			}
			catch (NumberFormatException exception) {
				request.setAttribute("errPrezzo", "Deve essere un numero!");
				tuttoOk = false;
			}
			
		}
		
		// controlli sulla dataScadenza
		if(dataScadenza==null || dataScadenza.equals("")) {
			request.setAttribute("errDataScadenza", "Campo obbligatorio");
			tuttoOk=false;
		}
		else{	
			try {
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
				prodotto.setDataScadenza(df.parse(dataScadenza));
			}
			catch (ParseException exception) {
				request.setAttribute("errDataScadenza", "inserire una data valida");
				tuttoOk = false;
			}
			 
		}
		
		return tuttoOk;
	}
	
	
}
