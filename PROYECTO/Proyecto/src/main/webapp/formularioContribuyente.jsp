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
  <link rel="stylesheet" type="text/css" href="CSS/menu.css">
  <h1> REGISTRO PARA CONTRIBUYENTES </h1>
</head>
<body>

<form method="get" action="recibeInfoContribuyente.jsp">
  Nombre    <input type="text" name="Nombre"/></br>
  Apellidos <input type="text" name="Apellidos"/></br>
  Teléfono  <input type="tel" name="Telefono"/></br>
  Especialidad <input type="text" name="Especialidad"/></br>
  Usuario <input type="text" name="Usuario"/></br>
  Contraseña <input type="password" name="Contraseña"/></br>
  <input type="submit" value="Aceptar">
</form>

<br/>
<a  href="index.jsp" >
  <img src="Recursos/vueltaInicioIcon.png" alt="Volver al menú de Inicio" width="5%" height="5%"></a>
</body>
</html>
