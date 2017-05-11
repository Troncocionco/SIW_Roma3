package it.uniroma3.validator;

public class ProductValidator {

	public ProductValidator() {
		
	}
	
	public boolean validate() {
		
		boolean tuttoOk = true;
		
		String nome = request.getParameter("nome");
		String descrizione = request.getParameter("descrizione");
		String prezzo = request.getParameter("prezzo");
		String dataScadenza = request.getParameter("dataScadenza");
		//String nextPage = "/student.jsp";
		
		if( nome == null || nome.equals("")) {
			request.setAttribute("NameErr", "First Name is mandatory");
			tuttoOk = false;
		}
		
		if( descrizione == null || descrizione.equals("")) {
			request.setAttribute("descrizioneErr", "Descrizione is mandatory");
			tuttoOk = false;
		}
		
		if( prezzo == null || prezzo.equals("")) {
			request.setAttribute("prezzoErr", "Prezzo is mandatory");
			tuttoOk = false;
		}

		if( dataScadenza == null || dataScadenza.equals("")) {
			request.setAttribute("dataScadenzaErr", "Data Scadenza is mandatory");
			tuttoOk = false;
		}
		
		
		try {
			Float.parseFloat(prezzo);
		}
		catch (NumberFormatException e) {
			request.setAttribute("prezzoErr","Prezzo deve essere un numero");
		}
		
		return tuttoOk;
	}
	
}
