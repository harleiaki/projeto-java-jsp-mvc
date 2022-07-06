<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<head>
<meta charset="UTF-8" />
<title>Listagem de Despesas</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>

	<nav class="navbar navbar-inverse navbar-static-top"></nav>

	<div class="panel panel-default">
		<div class="panel-heading">
			<div class="clearfix">
				<h1 class="panel-title impacta-titulo-panel">Listagem de Despesas</h1>
				<a class="btn btn-link impacta-link-panel" href="${pageContext.request.contextPath}/cadastrodespesa">Nova Despesa</a>
			</div>
		</div>

		<div class="panel-body">

			<form method="GET" class="form-horizontal" action="${pageContext.request.contextPath}/listagem/filtrar">
				<div class="form-group">
					<div class="col-sm-4">
						<div class="input-group">
							<input class="form-control"
										  placeholder="Busca por descrição..."
										  autofocus="autofocus"
										  name="descricao"/>

								<span class="input-group-btn">
								<button type="submit" class="btn btn-default">
									<i class="glyphicon glyphicon-search"></i>
								</button>
							</span>
						</div>
					</div>
				</div>
			</form>


			<table class="table table-bordered table-striped">
				<thead>
					<tr>
						<th class="text-center col-md-1">#</th>
						<th class="text-center col-md-3">Descrição</th>
						<th class="text-center col-md-2">Categoria</th>
						<th class="text-center col-md-2">Data</th>
						<th class="text-center col-md-2">Valor</th>
						<th class="text-center col-md-4">Observações</th>
						<th class="col-md-1"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${despesas}" var="despesa">
						<tr>
							<td class="text-center">${despesa.codigo}</td>
							<td class="text-left">${despesa.descricao}</td>
							<td class="text-center">${despesa.categoria.name}</td>
							<td class="text-center"><fmt:formatDate
									value="${despesa.data}" type="date" pattern="dd/MM/yyyy" /></td>
							<td class="text-right"><fmt:formatNumber
									value="${despesa.valor}" type="currency" /></td>
							<td class="text-left">${despesa.observacoes}</td>
							<td class="text-center">
							<a class="btn btn-link btn-xs"
								data-toggle="modal" data-target="#confirmaRemocaoModal"
								data-whatever="${despesa.codigo}">
								<span class="glyphicon glyphicon-remove"></span>
							</a>
							</td>
						</tr>
					</c:forEach>
					<c:if test="${despesas.isEmpty()}">
						<tr>
							<td class="text-center" colspan="7"><i>NENHUMA DESPESA
									FOI ENCONTRADA.</i></td>
						</tr>
					</c:if>
				</tbody>
			</table>
		</div>

		<div class="modal fade" id="confirmaRemocaoModal" tabindex="-1"
			data-keyboard="false" data-backdrop="static">
			<div class="modal-dialog">
				<form action="${pageContext.request.contextPath}/despesacadastro" method="POST">
					<input type="hidden" name="_method" value="DELETE" />

					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title">Confirmação</h4>
						</div>

						<div class="modal-body">
							<span>Deseja realmente remover a despesa ?</span>
						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-link" data-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-primary">Confirmar</button>
						</div>
					</div>
				</form>
			</div>
		</div>

	</div>
	<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/despesa.js"></script>

</body>
</html>

