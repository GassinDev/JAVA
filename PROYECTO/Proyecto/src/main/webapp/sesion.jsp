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
</head>
<body>

<%
  Class.forName("org.sqlite.JDBC");
  Connection conexion = DriverManager.getConnection("jdbc:sqlite:C:/Users/juang/Desktop/JAVA/PROYECTO/dbProyect");
  Statement s = conexion.createStatement();

  conexion.close();
%>
<br/>
<a  href="index.jsp" >
  <img src="Recursos/vueltaInicioIcon.png" alt="Volver al menú de Inicio" width="5%" height="5%"></a>
</body>
</html>
