<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<head>
<meta charset="UTF-8" />
<title>Cadastro de Despesa</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-datepicker.standalone.min.css" />
</head>

<body>
	<nav class="navbar navbar-inverse navbar-static-top"></nav>

	<spring:form class="form-horizontal" method="POST" action="${pageContext.request.contextPath}/cadastrodespesa"	modelAttribute="despesa">

		<c:if test="${!empty mensagem}">
			<div class="alert alert-success">
				<span>${mensagem}</span>
			</div>
		</c:if>

		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="clearfix">
					<h1 class="panel-title impacta-titulo-panel">Nova Despesa</h1>
					<a class="btn btn-link impacta-link-panel" href="${pageContext.request.contextPath}/listagem">Listagem de Despesas</a>
				</div>
			</div>
			<div class="panel-body">

				<input type="hidden" value="${despesa.codigo}" />

				<div class="form-group">
					<label for="descricao" class="col-sm-2 control-label">Descrição</label>
					<div class="col-sm-4">
						<spring:input type="text" class="form-control" id="descricao"
							name="descricao" path="descricao" />
						<spring:errors path="descricao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label for="categoria" class="col-sm-2 control-label">Categoria</label>
					<div class="col-sm-2">
						 <spring:select class="form-control" name="categoria" path="categoria">
                                <option hidden>Selecione...</option>
                                <%-- opção não selecionavel--%>
                                <c:forEach items="${todasCategoria}" var="categoria">
                                     <c:set var = "qualquerNome" value = "${f:toUpperCase(categoria.name)}" />
                                     <option value="${categoria.codigo}">${qualquerNome}</option>
                                </c:forEach>
                         </spring:select>
                         <spring:errors path="categoria" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label for="data" class="col-sm-2 control-label">Data</label>
					<div class="col-sm-2">
						<spring:input type="text" class="form-control" id="data" name="data" path="data"
						    data-provide="datepicker"
							data-date-format="dd/mm/yyyy"
							data-date-language="pt-BR"
							data-date-autoclose="true"
							data-date-todayHighlight="true"
							data-date-orientation="bottom" />
						<spring:errors path="data" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label for="valor" class="col-sm-2 control-label">Valor</label>
					<div class="col-sm-2">
						<spring:input type="text" class="form-control javascript-moeda" id="valor"
							name="valor" path="valor" />
						<spring:errors path="valor" cssClass="error" />
					</div>
				</div>

				<div class="form-group">
					<label for="observacoes" class="col-sm-2 control-label">Observações</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="observacoes"
							name="observacoes" />
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




