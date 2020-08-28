<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
  
  <c:url value="/entrada" var="linkServletEntrada" />
  
  <!DOCTYPE hmtl>
  <html>
  <head>
  <meta charset="ISO-8859-1">
  <title>Lista de empresas</title>
  </head>
  <body>
      Lista de empresas: <br />

      <ul>
      	
      	<c:if test="${ empty empresas }">
      	
      		Não foi encontrado nenhum registro
      	
      	</c:if>
      	
          <c:forEach items="${empresas}" var="empresa">	
              <li>
              ${empresa.nome} - <fmt:formatDate value="${empresa.dataCadastro}" pattern="dd/MM/yyyy" />  
              <a href="${linkServletEntrada}?acao=MostraEmpresa&id=${empresa.id}">  editar  </a> 
              <a href="${linkServletEntrada}?acao=RemoveEmpresa&id=${empresa.id}">  excluir </a>  
              </li>
          </c:forEach>
      </ul>

  </body>
  </html>