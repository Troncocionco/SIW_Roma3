
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Form Prodotto</title>
</head>

<body>

	<form action="prodotto" method="get">
		<p>Inserire i dati:</p>
		
		<div>Nome*: <input type="text" name="nome" value="${prodotto.nome}" />
		${errNome} 
		</div>
		
		<div>Descrizione*: <input type="text" name="descrizione" value="${prodotto.descrizione}"/>
		${ errDescrizione }
		</div>
		
		<div>Prezzo*: <input type="text" name="prezzo" value="${prodotto.prezzo}"/>
		${errPrezzo}
		</div>
		
		<div>Data scadenza*: <input type="text" name="dataScadenza" value="${prodotto.dataScadenza}" placeholder="dd/mm/yyyy" />
		${errDataScadenza}
		</div>
		
		<div>
		*Campo obbligatorio
		</div>
		
		<input type="submit" name="sumbit" value="invia" />
	</form>
</body>
</html>