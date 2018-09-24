<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produto</title>
</head>
<body>
<form action="<c:url value='/produto/adiciona'/>">
    Nome:
    <input type="text" name="produto.nome"/><br/>
    Descrição:
    <input type="text" name="produto.descricao"/><br/>
    Preço:
    <input type="text" name="produto.preco"/><br/>

    <input type="submit" value="Salvar" />
</form>
</body>
</html>