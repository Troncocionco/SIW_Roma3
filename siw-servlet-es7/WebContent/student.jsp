<%@ page import="it.uniroma3.model.Student" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
	<title>student.jsp</title>
</head>
<body>

	<h1>${student.firstName} ${student.lastName}  </h1>
	<h2>Details</h2>
	<div>Matricola: ${student.matricola} </div>
	<!-- out.print(((Student)(session.getAttribute("student"))).getFirstName());  -->
	<!-- out.print(((Student)(session.getAttribute("student"))).getLastName()); -->
	<!-- out.print(((Student)(session.getAttribute("student"))).getMatricola()); -->
</body>
</html>