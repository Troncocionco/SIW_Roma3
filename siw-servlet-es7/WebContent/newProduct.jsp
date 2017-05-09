<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<title>New Product</title>
</head>
<body>
	<form action="<% out.print(response.encodeURL("product")); %>" method="get">
	<div>Name: <input type="text" name="name" value= "<% if (request.getParameter("name") != null) out.print(request.getParameter("name"));  %>"/> 
		<% if (request.getAttribute("nameErr") != null) out.print(request.getAttribute("nameErr")); %></div>
	<div>Code: <input type="text" name="code" value="<%  if (request.getParameter("code") != null) out.print(request.getParameter("code")); %>"/> 
  		<% if (request.getAttribute("codeErr") != null) out.print(request.getAttribute("codeErr")); %> </div>
	<div>Price: <input type="text" name="price" value="<% if (request.getParameter("price") != null) out.print(request.getParameter("price")); %>"/> 
		<% if (request.getAttribute("priceErr") != null) out.print(request.getAttribute("priceErr")); %></div>
	<div>Description: <textarea rows="4" cols="50" name="description"><% if (request.getParameter("name") != null) out.print(request.getParameter("name")); %></textarea></div>
	<div><input type="submit" name="sumbit" value="invia" /></div>
	</form>
</body>
</html>
