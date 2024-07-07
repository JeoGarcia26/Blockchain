<%--
  Created by IntelliJ IDEA.
  User: Jeovany Afonso
  Date: 07/07/2024
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Criar Transação</title>
</head>
<body>
<h2>Criar Nova Transação</h2>

<form action="${pageContext.request.contextPath}/hello-servlet" method="get">
    <label for="remetente">Remetente:</label>
    <input type="text" id="remetente" name="remetente" required><br><br>

    <label for="destinatario">Destinatário:</label>
    <input type="text" id="destinatario" name="destinatario" required><br><br>

    <label for="valor">Valor:</label>
    <input type="number" id="valor" name="valor" min="0" step="0.01" required><br><br>

    <input type="submit" value="Criar Transação">
</form>
</body>
</html>
