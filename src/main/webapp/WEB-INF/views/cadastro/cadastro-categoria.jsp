<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<head>
<meta charset="UTF-8" />
<title>Cadastro de Categoria</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-datepicker.standalone.min.css" />
</head>

<body>
	<nav class="navbar navbar-inverse navbar-static-top"></nav>

	<spring:form class="form-horizontal" method="POST" action="${pageContext.request.contextPath}/categoria" modelAttribute="categoria">

		<c:if test="${!empty mensagem}">
			<div class="alert alert-success">
				<span>${mensagem}</span>
			</div>
		</c:if>

		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="clearfix">
					<h1 class="panel-title impacta-titulo-panel">Nova Categoria</h1>
					<a class="btn btn-link impacta-link-panel" href="${pageContext.request.contextPath}/cadastrodespesa">Cadastro de despesa</a>
				</div>
			</div>
			<div class="panel-body">

            <div class="form-group">
   				<label for="name" class="col-sm-2 control-label">Nome da Categoria</label>
                <div class="col-sm-4">
            		<spring:input type="text" class="form-control" id="name" name="name"  path="name" />
            		<spring:errors path="name" cssClass="error" />
            	</div>
            </div>
            <div class="form-group">
            	<div class="col-sm-offset-2 col-sm-10">
            		<button type="submit" class="btn btn-primary">Salvar</button>
            	</div>
            </div>

			</div>
		</div>
	</spring:form>

	<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.maskMoney.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/despesa.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap-datepicker.pt-BR.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap-datepicker.min.js"></script>
</body>
</html>




