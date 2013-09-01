<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<strong>Funcionário:</strong>
	<c:out value="${funcionario.nome}" />
	<br />
	<strong>Salário base:</strong>
	<c:out value="${funcionario.salarioBase}" />
	<br />
	<strong>Salário calculado:</strong>
	<c:out value="${salarioCalculado}" />
	<br />
	<a href="index.html">Voltar para página inicial</a>
</body>
</html>