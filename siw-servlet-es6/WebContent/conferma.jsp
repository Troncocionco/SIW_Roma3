<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pagina di conferma</title>
	</head>
	<body>
		<h2>Please confirm data:</h2>
		<ul>
			<li>First Name: 
				<b><% out.println(session.getAttribute("NOME"));%></b>
			</li>
				
			<li>Last Name:
				 <b><% out.println(session.getAttribute("COGNOME"));%></b>
			</li>
		</ul>
	<br /> <a href="/mostra.jsp" value="Conferma">Confirm</a>
	<br /> <a href="/inserimento.html" value="Modifica">Modify</a>
	</body>
</html>