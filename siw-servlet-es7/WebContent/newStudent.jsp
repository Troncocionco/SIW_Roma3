<!DOCTYPE html>
<html>
<head>
	<meta charset=UTF-8">
	<title>newStudent.jsp</title>
</head>
<body>

	<form action="<% out.print(response.encodeURL("student")); %>" method="get">	
	<div>
		First Name: <input type="text" name="firstName" value= "<% if (request.getParameter("firstName") != null) out.print(request.getParameter("firstName"));  %>"/> 
		<% if (request.getAttribute("FirstNameErr") != null) out.print(request.getAttribute("FirstnameErr")); %>
		</div>
	
	<div>
		Last Name: <input type="text" name="lastName" value="<%  if (request.getParameter("lastName") != null) out.print(request.getParameter("lastName")); %>"/> 
  		<% if (request.getAttribute("LastNameErr") != null) out.print(request.getAttribute("LastNameErr")); %>
  		 </div>
	
	<div>
		Matricola: <input type="text" name="matricola" value="<% if (request.getParameter("matricola") != null) out.print(request.getParameter("matricola")); %>"/> 
		<% if (request.getAttribute("MatricolaErr") != null) out.print(request.getAttribute("MatricolaErr")); %>
		</div>
	
	<div><input type="submit" name="submit" value="invia" /></div>
	</form>
	<h1><% out.print(request.getAttribute("test")); %></h1>
	<h1><% out.print(request.getAttribute("test1")); %></h1>
	<h1><% out.print(request.getAttribute("test2")); %></h1>

</body>
</html>