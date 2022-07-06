<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta charset="UTF-8" />
<title>Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>

	<nav class="navbar navbar-inverse navbar-static-top"></nav>

	<div class="panel panel-default">
		<div class="panel-heading">
			<div class="clearfix">
				<h1 class="panel-title impacta-titulo-panel">Home</h1>
				<a class="btn btn-link impacta-link-panel" href="${pageContext.request.contextPath}/usuario">Usuario</a><br/>
			</div>
			<div class="clearfix">
				<a class="btn btn-link impacta-link-panel" href="${pageContext.request.contextPath}/cadastrodespesa">Nova Despesa</a><br/>
			</div>
			<div class="clearfix">
				<a class="btn btn-link impacta-link-panel" href="${pageContext.request.contextPath}/listagem">Listagem de Despesas</a><br/>
			</div>
		</div>

		<div class="panel-body">


		</div>

	</div>
	<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/despesa.js"></script>

</body>
</html>

