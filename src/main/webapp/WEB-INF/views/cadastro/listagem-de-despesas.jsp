<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<html>
<head>
    <title>Listagem de Despesas</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css"/>
</head>
<body>

<nav class="navbar navbar-inverse navbar-static-top"></nav>
<div class="panel panel-default">
    <div class="panel-heading">
        <h1 class="panel-title">Despesas</h1>
    </div>
</div>

<div class="panel-body">
    <table class="table table-bordered table-striped">
        <thead>
        <tr>
            <th class="text-center col-md-1">#</th>
            <th class="text-center col-md-2">Descrição</th>
            <th class="text-center col-md-3">Categoria</th>
            <th class="text-center col-md-4">Data</th>
            <th class="text-center col-md-5">Valor</th>
            <th class="text-center col-md-6">Observações</th>
            <th class="col-md-1"></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${despesas}" var="despesas">
            <tr>
                <td class="text-center">${despesas.codigo}</td>
                <td class="text-left">${despesas.descricao}</td>
                <td class="text-center">${despesas.categoria.name}</td>
                <td class="text-center"><f:formatDate value="${despesas.data}" type="date"
                                                      pattern="dd/MM/yyyy"/></td>
                <td class="text-right"><f:formatNumber value="${despesas.valor}"
                                                       type="currency"/></td>
                <td class="text-center">${despesas.observacoes}</td>
                <td></td>
            </tr>
        </c:forEach>
        <c:if test="${despesa.isEmpty()}">
            <tr>
                <td class="text-center" colspan="7"><i>NUNHUMA DESPESA ENCONTRADA</i></td>
            </tr>
        </c:if>
        </tbody>
    </table>

</div>

</body>
</html>
