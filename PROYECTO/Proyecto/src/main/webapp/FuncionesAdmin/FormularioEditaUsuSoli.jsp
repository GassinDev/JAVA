<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>EDICIÓN DE USUARIOS</title>
  <link rel="stylesheet" type="text/css" href="../CSS/menu.css">
  <h2 class="tfor2"> EDITOR DE SOLICITANTE - <%=request.getParameter("Usuario")%></h2>
</head>
<body>

<form method="get" action="EditaUsu.jsp" class="fde">
  Nuevo Nombre    <input type="text" name="Nombre"/></br>
  Nuevos Apellidos <input type="text" name="Apellidos"/></br>
  Nuevo Teléfono  <input type="tel" name="Telefono"/></br>
  Nueva Ayuda <input type="text" name="Ayuda"/></br>
  <input type="hidden" name="Usuario" value="<%=request.getParameter("Usuario")%>"/></br>
  </br><input type="submit" value="Aceptar" class="boton">
</form>
<br/>
</body>
</html>
