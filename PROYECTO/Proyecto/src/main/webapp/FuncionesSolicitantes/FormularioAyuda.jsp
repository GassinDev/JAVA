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
  <h2 class="tfor2"> CREADOR DE AYUDAS </h2>
</head>
<body>
<%out.println(request.getParameter("Usuario"));%>
<form method="get" action="CreadorAyuda.jsp" class="fde">
  <input type="hidden" name="Usuario" value="<%=request.getParameter("Usuario")%>"/></br>
  Ayuda <input type="text" name="Ayuda"/></br>
  Comentario  <input type="text" name="Comentario"/></br>
  Fecha Inicial <input type="date" name="FechaIni"/></br>
  </br><input type="submit" value="Aceptar" class="boton">
</form>

<br/>
</body>
</html>
