<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" type="text/css" href="../CSS/menu.css">
  <h2 class="tfor2"> REGISTRO PARA SOLICITANTES </h2>
</head>
<body>

<form method="get" action="../recibeInfoSolicitantes.jsp" class="fde">
  Nombre    <input type="text" name="Nombre"/></br>
  Apellidos <input type="text" name="Apellidos"/></br>
  Teléfono  <input type="tel" name="Telefono"/></br>
  Ayuda <input type="text" name="Ayuda"/></br>
  Usuario <input type="text" name="Usuario"/></br>
  Contraseña <input type="password" name="Contraseña"/></br>
  </br><input type="submit" value="Aceptar" class="boton">
</form>

<br/>

</body>
</html>
