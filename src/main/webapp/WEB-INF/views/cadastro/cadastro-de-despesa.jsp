<!DOCTYPE html>
<%@page pageEncoding="UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title>Cadastro de Despesa</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css" />
</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top"></nav>

<form class="form-horizontal">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h1 class="panel-title">Nova Despesa</h1>
        </div>
    </div>
    <div class="form-group">
        <label for="descricao" class="col-sm-2 control-label">Descrição</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" id="descricao">
        </div>
    </div>

</form>
${pageContext.request.contextPath}

</body>
</html>
