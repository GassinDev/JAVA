<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>

<form method="get" action="recibeInfo.jsp">
  Nombre <input type="text" name="Nombre"/></br>
  Id <input type="number" name="Id"/></br>
  Tamaño <input type="text" name="Tamaño"/></br>
  <input type="submit" value="Aceptar">
</form>

<%
  Class.forName("org.sqlite.JDBC");
  Connection conexion = DriverManager.getConnection("jdbc:sqlite:C:/Users/Gassin/Desktop/PROG/JAVA/PRUEBAS CON WEAPP/myDataBase");
  Statement s = conexion.createStatement();
  ResultSet listado = s.executeQuery ("SELECT * FROM Alumnos");
  while (listado.next()) {
    out.println(listado.getString("Nombre") + "," + listado.getString("Id"));
  }
  conexion.close();
%>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="pideNumeroAlumno.jsp">Hello Servlet</a>
</body>
</html>