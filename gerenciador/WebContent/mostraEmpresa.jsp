<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualização de cadastro </title>
</head>

	<form action="${linkServletAlteraEmpresa}" method="POST">
	
		Nome da Empresa: <input type="text" name="nome" value="${empresa.nome}"/>
		
		Data de abertura: <input type="date" name="data" value="<fmt:formatDate value="${empresa.dataCadastro}" pattern="yyyy-MM-dd"/>" />
		
		<input type="hidden" name="id" value="${empresa.id }"/>
		<input value="Enviar" type="submit"/>
	
	</form>

<body>

</body>
</html>