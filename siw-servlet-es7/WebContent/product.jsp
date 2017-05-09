<%@ page import="it.uniroma3.model.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Product</title>
</head>
<body>
<h1><% out.print(((Product)(session.getAttribute("product"))).getName()); %>
<% out.print(((Product)(session.getAttribute("product"))).getCode()); %></h1>
<h2>Details</h2>
<div>Code: <% out.print(((Product)(session.getAttribute("product"))).getCode()); %></div>
<div>Price: <% out.print(((Product)(session.getAttribute("product"))).getPrice()); %></div>
<div>Description: <% out.print(((Product)(session.getAttribute("product"))).getDescription()); %></div>
</body>
</html>