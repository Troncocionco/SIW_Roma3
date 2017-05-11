<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="it.uniroma3.model.Prodotto" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista Prodotti</title>
</head>
<body>
<h1>Prodotti nel catalogo: </h1>
	<ul>
		<c:forEach var="prodotto" items="${prodotti}" > 
			<li>Oggetto:${prodotto.nome} Prezzo ${prodotto.prezzo}</li>
		</c:forEach>
	</ul>

</body>
</html>