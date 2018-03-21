<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>1.0 ${perro.nombre}</title>
<meta charset="UTF-8">
</head>
<body>
    
    
    
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
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
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
     
    </div>
    <div class="col-sm-8 text-left"> 
     
     <div class="w3-content w3-section" style="max-width:500px">
      
         <div class="row">
             <div class="col-sm-6">
      
      <table style="width:100%">
  <tr>
    <th>ID : </th>
    <td><strong>${perroFinal.ID}</strong></td>
  </tr>
  <tr>
    <th>Nombre : </th>
    <td><strong>${perroFinal.nombre}</strong></td>
  </tr>
  <tr>
    <th>Edad : </th>
    <td><strong>${perroFinal.edad}</strong></td>
  </tr>
  <tr>
    <th>Genero : </th>
    <td><strong>${perroFinal.genero}</strong></td>
  </tr>
  <tr>
    <th>Tamaño : </th>
    <td><strong>${perroFinal.tamano}</strong></td>
  </tr>
  
</table>
    
      
    </div>
                         <div class="col-sm-6">
     <img src="imgroyec/perro2.jpg" class="img-responsive" style="width:100%" alt="Image">
    </div>
             
         </div>
      
      
</div>


</div><br>
      
      
      
      
    </div>
    <div class="col-sm-2 sidenav">
     
    </div>
  </div>

</body>
</html>