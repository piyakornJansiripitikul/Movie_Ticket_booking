<html>
<head>
	<meta charset="UTF-8">
	<link href="bootstrap/bootstrap-3.2.0-dist/css/bootstrap.css" rel="stylesheet">
	<link href="bootstrap/bootstrap-3.2.0-dist/css/bootstrap-theme.css" rel="stylesheet">
	<script src="jquery-2.1.1.min.js"></script>
	<script src="bootstrap/bootstrap-3.2.0-dist/js/bootstrap.js"></script>
	<title>Sign In</title>
</head>
<body>

	<style type="text/css">
      body{
        background-attachment: fixed;
        background-image: url(img/bg.jpg);
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
      }
      div{
      	word-wrap:break-word; 
      	display:block;
      }
 	</style>


<!--Content -->
	<div class="page-header">
   
  	</div>

		<div class="well col-sm-8 col-sm-offset-2">
			<div class="wrap">
				<header>
					<span class="col-sm-1"></span><h1><b>Sign In</b></h1>
				</header>
				<br>
				<div class="signin">
                                    <form class="form-horizontal" role="form" name = "input" action="login" method="post">
		       				<center>
                                                     
							 	<div class="input-group col-sm-7">
	  								<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
	  								<input type="username" name="username" class="form-control" placeholder="Username">
								</div>
								<br>
								<div class="input-group col-sm-7">
	  								<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
	  								<input type="password" name="password" class="form-control" placeholder="Password">
								</div>
								<br>
		            			<!--<p><input type="checkbox"> Remember Me </p>-->
                                                 
		            		</center>
						</div>
						<span class="col-sm-8"></span><button type="submit" class="btn btn-default" data-dismiss="modal"><b>Sign In</b></button>
                                                </form>
				</div>
			</div>
		</div>


</body>
</html>