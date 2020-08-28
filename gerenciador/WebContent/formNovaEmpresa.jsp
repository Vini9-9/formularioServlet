<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada" var="linkServletEntrada" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de nova empresa</title>
</head>

	<form action="${linkServletEntrada}" method="POST">
	
		Nome da Empresa: <input type="text" name="nome"/>
		
		Data de abertura: <input type="date" name="data"/>
		
		<input type="hidden" name="id" value="${empresa.id }"/>
		<input type="hidden" name="acao" value="NovaEmpresa">
		<input value="Enviar" type="submit"/>
	
	</form>

<body>

</body>
</html>