<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" type="text/css" href="../CSS/menu.css">
</head>
<body>

<!-- FORMULARIO DE INICIO DE SESION -->

<h2 class="tfor"> INICIO DE SESIÓN</h2>
<div class="edicion">
  <ul>
    <li><a class=enla href=../index.jsp >Atrás</a></li>
  </ul>
</div>
<form method="get" action="perfilRegistro.jsp" class="fde">
  Usuario <input type="text" name="Usuario"/></br>
  Contraseña <input type="password" name="Contraseña"/></br>
  </br> <input type="submit" value="Aceptar" class="boton">
</form>

<br/>

</body>
</html>
