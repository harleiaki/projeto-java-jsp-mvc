<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Cadastro de Despesa</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top"></nav>

<form class="form-horizontal" method="post" action="/cadastrodespesa">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h1 class="panel-title">Nova Despesa</h1>
        </div>
    </div>
    <div class="form-group">
        <label for="descricao" class="col-sm-2 control-label">Descrição</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" id="descricao" name="descricao">
        </div>
    </div>
    <div class="form-group">
        <label for="categoria" class="col-sm-2 control-label">Categoria</label>
        <div class="col-sm-2">
            <select class="form-control" name="categoria">
                <option>ALIMENTACAO</option>
                <option>TRANSPORTE</option>
                <option>VESTUARIO</option>
                <option>CUIDADOS_PESSOAIS</option>
                <option>MORADIA</option>
                <option>LAZER</option>
                <option>EDUCACAO</option>
                <option>COMPRAS</option>
                <option>DIVERSAO</option>
            </select>
        </div>
    </div>

    <div class="form-group">
        <label for="data" class="col-sm-2 control-label">Data</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" id="data" name="data">
        </div>
    </div>

    <div class="form-group">
        <label for="valor" class="col-sm-2 control-label">Valor</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" id="valor" name="valor">
        </div>
    </div>

    <div class="form-group">
        <label for="observacoes" class="col-sm-2 control-label">Observações</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" id="observacoes" name="observacoes">
        </div>
    </div>

    <div></div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10" >
            <input type="submit" class="btn btn-danger">
        </div>
    </div>
    <script src="/js/bootstrap.js"></script>

</form>
</body>
</html>
