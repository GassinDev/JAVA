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
  <h1> INICIO DE SESIÓN</h1>
</head>
<body>

<form method="get" action="../perfilRegistro.jsp" class="fde">
  Usuario <input type="text" name="Usuario"/></br>
  Contraseña <input type="password" name="Contraseña"/></br>
  <input type="submit" value="Aceptar">
</form>

<br/>
<a  href="../perfilRegistro.jsp" >
  <img src="../Recursos/vueltaInicioIcon.png" alt="Volver al menú de Inicio" width="5%" height="5%"></a>
</body>
</html>
