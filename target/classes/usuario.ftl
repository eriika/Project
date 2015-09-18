<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">

  </head>
  <body style= "background: #99CCFF">

    <ul>
        <#List lguser as ls>
        <li> ${ls.getusuario}</li>
        <li> ${pr.getpassword}</li>
    </ul>


  	<img src="http://findicons.com/files/icons/88/mac/512/lock.png" align="left">
    <div class="container">
    	<div class="row">
    		<p></br></p>
    		<div class="col-md-5" ></div>
    		<div class="col-md-6">
    		<div class="panel panel-default">
    			<div class="panel-body"> 
    				<div class="page-header">
    					<h1><b>Login</b></h1>
    					<hr/>
    					<p></br></p>
                                        
    					<form action="/registrarusu"  method="POST">
    						<div class="form-group">
    							<span class="glyphicon glyphicon-user"></span>
    							<label for="exampleInputUser1">User: </label>
    							<input type="user" class="form-control"  value="${usuario}" />
    						</div>

								<p></br></p>

    						<div class="form-group">
    							<span class="glyphicon glyphicon-star"></span>
    							<label for="exampleInputPassword1"> Password: </label>
    							<input type="password" class="form-control" value="${password}" />
    						</div>
    						<p></br></p>
    						<button type="submit" class="btn btn-success">Submit</button>
    						</form>
    				</div>
    			</div>
    			</div>
    			<p></br></p>
    		</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  </body>
</html>