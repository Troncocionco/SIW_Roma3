<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="it.uniroma3.model.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="index_style.css">
<title>Insert title here</title>
</head>
<body>
<h1>Inserisci nuovo prodotto</h1>

<div class="container">
  <form action="controller" method="POST">
    <div class="row">
      <div class="col-lg-4">Name:</div>
      <div class="col-lg-4"><input type="text" name="name" value="${product.name}"></div>
      <div class="col-lg-4">${errName}</div>
    </div>
    <div class="row">
      <div class="col-lg-4">Description:</div>
      <div class="col-lg-4"><input type="text" name="description" value="${product.description}"></div>
      <div class="col-lg-4">${errDescription}</div>

    </div>
    <div class="row">
      <div class="col-lg-4">Price:</div>
      <div class="col-lg-4"><input type="text" name="price" value="${product.price}"></div>
      <div class="col-lg-4">${errPrice}</div>
    </div>
    <div class="row">
      <div class="col-lg-4">Expiration Date:</div>
      <div class="col-lg-4"><input type="text" name="expDate" value="${product.expDate}"></div>
      <div class="col-lg-4">${errExpDate}</div>
    </div>
    <div class="row">
      <div class="col-lg-12">
        <input type="submit" name="submit" value="submit">
      </div>
    </div>
   </form>
</div>


<a href="controller">Mostra prodotti</a>
</body>
</html>
