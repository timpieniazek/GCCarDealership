<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body class="text-center">
	<div class="container mt-5">
		<h1>GC Car Database</h1>
	</div>
	<div class="container mt-5">
		<div class="row">

			<div class="col-sm">
				<h3>Search Make:</h3>
				<form class="form-group" action="searchMake">
					<input class="form-control" type="text" name="make"
						placeholder="Make">
					<button class="btn" type="submit">Search</button>
				</form>
			</div>

			<div class="col-sm">
				<h3>Search Model:</h3>
				<form class="form-group" action="searchModel">
					<input class="form-control" type="text" name="model"
						placeholder="Model">
					<button class="btn" type="submit">Search</button>
				</form>
			</div>

			<div class="col-sm">
				<h3>Search Year:</h3>
				<form class="form-group" action="searchYear">
					<input class="form-control" type="text" name="year"
						placeholder="Year">
					<button class="btn" type="submit">Search</button>
				</form>
			</div>

			<div class="col-sm">
				<h3>Search Color:</h3>
				<form class="form-group" action="searchColor">
					<input class="form-control" type="text" name="color"
						placeholder="Color">
					<button class="btn" type="submit">Search</button>
				</form>
			</div>

		</div>
	</div>

</body>
</html>