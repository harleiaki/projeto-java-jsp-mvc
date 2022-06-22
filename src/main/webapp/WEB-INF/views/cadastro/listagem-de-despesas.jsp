<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<html>
<head>
    <title>Listagem de Despesas</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css"/>
    <script src="/js/jquery-3.1.1.js"></script>
    <script src="/js/bootstrap.js"></script>
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
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${despesas}" var="despesas">
                <tr>
                    <td class="text-center">${despesas.codigo}</td>
                    <td class="text-left">${despesas.descricao}</td>
                    <td class="text-center">${despesas.categoria.name}</td>
                    <td class="text-center"><f:formatDate value="${despesas.data}" type="date" pattern="dd/MM/yyyy"/></td>
                    <td class="text-right"><f:formatNumber value="${despesas.valor}" type="currency"/></td>
                    <td class="text-center">${despesas.observacoes}</td>
                    <td class="text-center">
                        <a class="btn btn-link btn-xs" data-toggle="modal" data-target="#confirmaRemocaoModal">
                            <span class="glyphicon glyphicon-remove"></span>
                        </a>
                    </td>
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

<div class="modal fade" id="confirmaRemocaoModal" tabindex="-1" data-keyboard="false" data-backdrop="static">
    <div class="modal-dialog">
        <form >


            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Confirmação</h4>
                </div>

                <div class="modal-body">
                   <span>Deseja realmente remover esta despesa?</span>
                </div>

                <div class="modal-footer">
                   <button type="button" class="btn btn-link" data-dismiss="modal">Cancelar</button>
                   <button type="submit" class="btn btn-primary" data-dismiss="modal">Confirmar</button>
                </div>
            </div>
        </form>
    </div>
</div>

</body>
</html>
