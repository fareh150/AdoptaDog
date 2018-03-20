<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}

/*Submenun de perros */
.dropbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px;
	font-size: 16px;
	border: none;
	cursor: pointer;
}

/*carrusel*/
.mySlides {
	display: none;
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">AdoptaDog</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">Adopciones</a></li>
					<li><a href="#">Acogida</a></li>
					<li><a href="#">Quienes somos</a></li>
					<li><a href="#">Preguntas Frecuentes</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
							Login</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<p>
				<form>
					<p>TamaÃ±o</p>
					<select name="tamaÃ±o">
						<option></option>
						<option value="pequeÃ±o">pequeÃ±o</option>
						<option value="mediano">mediano</option>
						<option value="grande">grande</option>
					</select> <br>
					<br>
					<p>Edad</p>
					<select name="edad">
						<option></option>
						<option value="cachorro">cachorro</option>
						<option value="joven">joven</option>
						<option value="mayor">mayor</option>
					</select> <br>
					<br>
					<p>Genero</p>
					<select name="genero">
						<option></option>
						<option value="Hembra">Hembra</option>
						<option value="Macho">Macho</option>
					</select> <br> <br> <input type="submit" value="Enviar" />
				</form>

				<!--  <p><a href="#">Perros por tamaÃ±o</a></p>
      
      <p><a href="#"></a></p>
      <p><a href="#">Link</a></p>-->
			</div>
			<div class="col-sm-8 text-left">

				<div class="w3-content w3-section" style="max-width: 500px">




					--
					<div class="w3-display-container mySlides">
						<!-- <a href="#">-->
						<img src="image/perro1.jpg" style="width: 100%">
						<!--</a>-->
						<div
							class="w3-display-topright w3-large w3-container w3-padding-15 w3-black">
							Perriquitin</div>
					</div>

					-- --
					<div class="w3-display-container mySlides">
						<img src="image/perro2.jpg" style="width: 100%">
						<div
							class="w3-display-topright w3-large w3-container w3-padding-15 w3-black">
							loki</div>
					</div>

					-- --
					<div class="w3-display-container mySlides">
						<img src="image/perro3.jpg" style="width: 100%">
						<div
							class="w3-display-topright w3-large w3-container w3-padding-15 w3-black">
							ice</div>
					</div>

					--

					<!-- <img class="mySlides" src="imgroyec/perro1.jpg" style="width:100%">
  <img class="mySlides" src="imgroyec/perro2.jpg" style="width:100%">
  <img class="mySlides" src="imgroyec/perro3.jpg" style="width:100%">-->
				</div>

				<script>    
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
















				<h1>Casi 138.000 perros abandonados en EspaÃ±a</h1>
				<p>Casi 138.000 perros abandonados fueron recogidos de las
					calles de EspaÃ±a durante 2016 por protectoras de animales. Solo el
					16% volviÃ³ con sus dueÃ±os y 45% fue adoptado en un nuevo hogar,
					de acuerdo con el Estudio de Abandono y AdopciÃ³n 2017 elaborado
					por la FundaciÃ³n Affinity. La organizaciÃ³n alerta de que la
					principal razÃ³n de abandono es el nacimiento de camadas
					indeseadas.</p>
				<hr>


				--------


				<div class="container-fluid bg-3 text-center">
					<h3>Algunos Peques</h3>
					<br>
					<div class="row">
					
					<c:forEach items="${listaPerros}" var="perro">
					    <div class="col-sm-3">
							<p><c:out value="${perro}" /></p>
							<img src="https://placehold.it/150x80?text=IMAGE"
								class="img-responsive" style="width: 100%" alt="Image">
						</div>
					</c:forEach>
					
						
						
						<!-- <div class="col-sm-3">
							<p>Pepe</p>
							<img src="https://placehold.it/150x80?text=IMAGE"
								class="img-responsive" style="width: 100%" alt="Image">
						</div>
						<div class="col-sm-3">
							<p>Juanito</p>
							<img src="https://placehold.it/150x80?text=IMAGE"
								class="img-responsive" style="width: 100%" alt="Image">
						</div>
						<div class="col-sm-3">
							<p>TOfY</p>
							<img src="https://placehold.it/150x80?text=IMAGE"
								class="img-responsive" style="width: 100%" alt="Image">
						</div> -->
					</div>
				</div>
				<br> ---------


			</div>
			<div class="col-sm-2 sidenav">
				<div class="well">
					<p></p>
				</div>
				<div class="well">
					<p>ADS</p>
				</div>
			</div>
		</div>
	</div>

	<footer class="container-fluid text-center">
		<p>AdoptaDog S.A. (Todo por la pasta)</p>
	</footer>

</body>
</html>
