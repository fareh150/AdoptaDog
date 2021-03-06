<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
<div class="col-sm-2"></div>
<div class="col-sm-8">
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
				
				<!-- Se realiza el filtro de busqueda segun lo seleccionado por usuario, AnaSolorzano -->
				<form action="/AdoptaDog/PerroServlet" method="post">
					<p>Tamaño</p>
					<select name="tamanno">
						<option></option>
						<option value="pequeno">pequeño</option>
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
















				<h1>Casi 138.000 perros abandonados en España</h1>
				<p>Casi 138.000 perros abandonados fueron recogidos de las
					calles de España durante 2016 por protectoras de animales. Solo el
					16% volvio con sus dueños y 45% fue adoptado en un nuevo hogar,
					de acuerdo con el Estudio de Abandono y Adopcion 2017 elaborado
					por la Fundacion Affinity. La organizacion alerta de que la
					principal razon de abandono es el nacimiento de camadas
					indeseadas.</p>
				<hr>


				--------


				<div class="container-fluid bg-3 text-center">
					<h3>Algunos Peques</h3>
					<br>
					<div class="row">
					
					<c:forEach items="${listaPerros}" var="perro" >
					    <div class="col-lg-4 col-md-5 col-sm-6">
							<p><c:out value="${perro.nombre}" /></p>
							<!-- <p><c:out value="${perro.edad}" /></p>  -->
							<!-- <p><c:out value="${perro.genero}" /></p>  -->
							<!-- <p><c:out value="${perro.tamano}" /></p>  -->
							<!-- <p><c:out value="${perro.imagen}" /></p> -->
							<img src="${perro.imagen}"  class="img-responsive" style="width: 100%" alt="Image">
						</div>
					</c:forEach>
					
						
						
						<!-- <div class="col-sm-3">lg md sm
							<p>Pepe</p>
							<img src="https://placehold.it/150x80?text=IMAGE"
								class="img-responsive" style="width: 100%" alt="Image">
						</div>
						<div class="col-sm-3">
							<p>Juanito</p>
							<img src="https://placehold.it/150x80?text=IMAGE"
								class="img-responsive" style="width: 100%" alt="Image">
						</div>
						<div class="col-sm-3 col-lg-4 col-">
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
	</div>
	<div class="col-sm-2"></div>
	

</body>
</html>
