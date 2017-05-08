<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<script src="http://cdn.bootcss.com/jquery/3.0.0/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link
	href="https://cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-grid.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<form role="form" class="form-inline" action="dataBase/find.do"
					method="post">
					<div class="form-group">
						<label for="databaseName">Please enter the database name</label> <input
							type="text" class="form-control" name="databaseName" />
					</div>
					<div class="form-group">
						<label for="tableName">Please enter the tableName</label> <input
							type="text" class="form-control" name="tableName" />

					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
	</div>
	

</body>
</html>
