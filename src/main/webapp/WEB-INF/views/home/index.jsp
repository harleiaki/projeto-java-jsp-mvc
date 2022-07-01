<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta charset="UTF-8" />
<title>Home</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>

	<nav class="navbar navbar-inverse navbar-static-top"></nav>

	<div class="panel panel-default">
		<div class="panel-heading">
			<div class="clearfix">
				<h1 class="panel-title impacta-titulo-panel">Home</h1>
				<a class="btn btn-link impacta-link-panel" href="/usuario">Usuario</a><br/>
				<a class="btn btn-link impacta-link-panel" href="/cadastrodespesa">Nova Despesa</a><br/>
				<a class="btn btn-link impacta-link-panel" href="/listagem">Listagem de Despesas</a><br/>
			</div>
		</div>

		<div class="panel-body">


		</div>

	</div>
	<script src="/js/jquery-3.1.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/despesa.js"></script>

</body>
</html>

