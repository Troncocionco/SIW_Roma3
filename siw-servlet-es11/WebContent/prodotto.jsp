
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista prodotti</title>
</head>
<body>
	<h1>Prodotti presenti nella lista:</h1>
	<ul>
	
			<li> <b>Nome:</b> ${prodotto.nome} <br>
				 <b>Prezzo:</b> ${prodotto.prezzo} euro <br>
				 <b>Descrizione:</b> ${prodotto.descrizione} <br>
				 <b>Data di Scadenza:</b> ${prodotto.dataScadenza}
				 
			</li>
	</ul>
	
	<p> <a href="newProdotto.jsp"> Inserisci un nuovo prodotto </a> </p>
</body>
</html>
