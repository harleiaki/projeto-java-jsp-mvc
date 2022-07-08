<%@page pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8" />
    <title>Cadastro de Usuario</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top"></nav>


<form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/usuario" modelAttribute="usuario">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h1 class="panel-title">Cadastro de usuario</h1>
        </div>
    </div>
    <div class="form-group">
        <label for="nome" class="col-sm-2 control-label">Nome</label>
        <div class="col-sm-4">
           <spring:input type="text" class="form-control" id="nome" name="nome" path="nome"/>
           <spring:errors path="nome" cssClass="error" />
        </div>
    </div>
    <div class="form-group">
        <label for="data" class="col-sm-2 control-label">Email</label>
        <div class="col-sm-2">
            <spring:input type="email" class="form-control" id="email" name="email" path="email"/>
            <spring:errors path="email" cssClass="error" />
        </div>
    </div>
    <div class="form-group">
        <label for="senha" class="col-sm-2 control-label">Senha</label>
        <div class="col-sm-2">
            <spring:input type="password" class="form-control" id="senha" name="senha" path="senha"/>
            <spring:errors path="senha" cssClass="error" />
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <input type="submit" class="btn btn-danger">
        </div>
    </div>
    	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</form>
</body>
</html>