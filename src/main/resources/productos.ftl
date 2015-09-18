<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">

</head>
<body style= "background: #99CCFF" >

	<ul>
		<#List products as pr>
		<li> ${pr.getid}</li>
		<li> ${pr.getproducto}</li>
		<li> ${pr.getprecio}</li>
		<li> ${pr.descripcion}</li>
	</ul>

	<div class="col-md-8">
    
	<p></br></br></br></br></br></br></p>
	<div class="row">
		

  
  <div class="col-md-2" align="center"><b>ID Producto</b>
		<input type="ID" class="form-control" value="${id}" />
	</div>

	<div class="col-md-3" align="center"><b>PRODUCTO</b>
		<input type="PRODUCTO" class="form-control"  value="${producto}" />
    </div>

    <div class="col-md-2" align="center"><b>PRECIO</b>
    	<input type="PRECIO" class="form-control"  value="${precio}" />
	</div>

	<div class="col-md-4" align="center"><b>DESCRIPCION</b>
		<input type="DESCRIPCION" class="form-control"  value="${descripcion}" />
	</div>
	</div>
</br>
<button type="submit" class="btn btn-success">Agregar</button>
</div>

</body>
</html>

<script type="text/javascript">



</script>
