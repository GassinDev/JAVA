<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.example.proyecto.Usuarios" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - MENU</title>
  <link rel="stylesheet" type="text/css" href="CSS/menu.css">
</head>
<body id="contenedor">
<p><img src="Recursos/MENU.jpg" width="60%" height="60%"></p>
<br/>
<p><a class="enla" href="sesion.jsp">Inicio de sesión</a><br></p>
<p><a class="enla" href="registro.jsp">Registrarme en la WEB</a><br></p>
</body>
</html>