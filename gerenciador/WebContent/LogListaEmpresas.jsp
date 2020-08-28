<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
  <!DOCTYPE hmtl>
  <html>
  <head>
  <meta charset="ISO-8859-1">
  <title>LOG: Lista de empresas</title>
  </head>
  <body>
      LOG: Lista de empresas: <br />

      <ul>
      	
      	<c:if test="${ empty empresas }">
      	
      		Não foi encontrado nenhum registro...
      	
      	</c:if>
      	
          <c:forEach items="${empresas}" var="empresa">	
              <li>${empresa.nome} - <fmt:formatDate value="${empresa.logDataCadastro}" pattern="dd/MM/yyyy  HH:mm:ss"/> </li>
          </c:forEach>
      </ul>

  </body>
  </html>