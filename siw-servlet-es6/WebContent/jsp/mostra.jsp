<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Riepilogo dati inseriti</title>
</head>
<body>

	<h1>Dati inseriti nella form</h1>
	<ul>
	<li>Nome: <b><% out.println(session.getAttribute("NOME"));%></b></li>
	<li>Cognome: <b><% out.println(session.getAttribute("COGNOME"));%></b></li>
	</ul>
	<h2>La conferma è stata inoltrata da: </h2>
	<br />IP: <b><% out.println(request.getRemoteAddr()); %></b>
	<br />Host: <b><% out.println(request.getRemoteHost()); %></b>
	<br />User Agent: <b><% out.println(request.getHeader("User-Agent")); %></b>

</body>
</html>