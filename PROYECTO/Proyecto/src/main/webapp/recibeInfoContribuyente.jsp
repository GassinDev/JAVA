<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.util.Objects" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.proyecto.HelloServlet" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" type="text/css" href="CSS/menu.css">
  <META HTTP-EQUIV="REFRESH" CONTENT="5;URL=index.jsp">
</head>
<body>
<%
  Statement s = HelloServlet.conectarBD();
  Connection conexion = HelloServlet.nombradorBD();

  String insercionUsu = "INSERT INTO Usuarios VALUES ('"
          + request.getParameter("Usuario")
          + "','" + request.getParameter("Contraseña") + "')";

  String insercion = "INSERT INTO Contribuyentes VALUES ('"
          + request.getParameter("Usuario")
          + "','" + request.getParameter("Nombre")
          + "','" + request.getParameter("Apellidos")
          + "'," + (Integer.parseInt(request.getParameter("Telefono")))
          + ",'" + request.getParameter("Especialidad") + "')";

  s.execute(insercionUsu);
  s.execute(insercion);
  conexion.close();
%>

<p class="notificacion"> Estás registrado en nuestra web como Contribuyente, en 5 segundos serás redirigido al menú</p>
<br/>
</body>
</html>
