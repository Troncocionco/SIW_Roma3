<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista Prodotti</title>
</head>
<body>

		<h1>Prodotti nel catalogo:</h1>
		<form action="controller" method="get">
			<ul>
				<c:forEach var="product" items="${products}">
					<li>${product.name},${product.description}, ${product.price}E,
						SCADENZA: ${product.expDate}</li>
					<input type="submit"  name="commad" value="cancella" >
				</c:forEach>
			</ul>
		</form>
		
		<%-- 			<li> <b>Nome:</b> ${product.name} <br>
				 <b>Prezzo:</b> ${product.price} euro <br>
				 <b>Descrizione:</b> ${product.description} <br>
				 <b>Data di Scadenza:</b> ${product.expDate}
				 
			</li> --%>

</body>
</html>