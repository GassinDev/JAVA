<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" type="text/css" href="../CSS/menu.css">
</head>
<body>
<h2 class="tfor"> INICIO DE SESIÓN</h2>
<form method="get" action="../perfilRegistro.jsp" class="fde">
  Usuario <input type="text" name="Usuario"/></br>
  Contraseña <input type="password" name="Contraseña"/></br>
  </br> <input type="submit" value="Aceptar" class="boton">
</form>

<br/>

</body>
</html>
