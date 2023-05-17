<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.example.proyecto.HelloServlet" %>
<%@ page import="com.example.proyecto.Usuarios" %>
<%@ page import="com.example.proyecto.Contribuyente" %>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <title>JSP - MENU</title>
  <link rel="stylesheet" type="text/css" href="../CSS/menu.css">
</head>
<body>

<h1 class="titulo">Bienvenido Administrador</h1>

<div class="edicion">
  <ul>
    <li><a class=enla href=../FuncionesAdmin/BorraEditaAdmin.jsp >Editar / Borrar Usuarios</a></li>
  </ul>
</div>

</body>
</html>




