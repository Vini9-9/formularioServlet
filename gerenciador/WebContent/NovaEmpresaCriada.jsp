<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/listaEmpresas" var="linkServletListaEmpresas" />
<c:url value="/logListaEmpresas" var="linkServletLogListaEmpresas" />


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de empresa</title>
</head>
<body>

	<c:if test= "${ empty nomeDaEmpresa}">
	
	Não foi possível cadastrar a empresa pois o nome informado é inválido.

	</c:if>
	
	<c:if test= "${ not empty nomeDaEmpresa}">
	
	Empresa ${nomeDaEmpresa} cadastrada com sucesso.

	</c:if>
	
	<br>
	
	<a href="${linkServletListaEmpresas }"> Lista de empresas </a>
	
	<br>
	
	<a href="${linkServletLogListaEmpresas }"> LOG - Lista de empresas </a>
	

</body>
</html>