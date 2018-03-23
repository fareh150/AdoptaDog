<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en-US">
<head>
<link href="css/login.css" rel="stylesheet" type="text/css">
<meta charset="utf-8">

<title>Social Navigation</title>

<!--[if lt IE 9]>
		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

</head>

<body>

	<div id="login-form">

		<h1>Login</h1>

		<fieldset>

			<form action="LoginServlet?Decidir=Iniciar" method="post">

				<input type="email" required value="Email"
					onBlur="if(this.value=='')this.value='Email'"
					onFocus="if(this.value=='Email')this.value='' " name="Login">
				<!-- JS because of IE support; better: placeholder="Email" -->

				<input type="password" required value="Password"
					onBlur="if(this.value=='')this.value='Password'"
					onFocus="if(this.value=='Password')this.value='' " name="Contrasena">
				<!-- JS because of IE support; better: placeholder="Password" -->

				<input type="submit" value="Login">

				<footer class="clearfix">

				<p>
					<span class="info">?</span><a href="#">Forgot Password</a>
				</p>

				</footer>

			</form>

		</fieldset>

	</div>
	<!-- end login-form -->

</body>
</html>