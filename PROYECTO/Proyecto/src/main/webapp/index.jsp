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
<%
  Class.forName("org.sqlite.JDBC");
  Connection conexion = DriverManager.getConnection("jdbc:sqlite:C:/Users/juang/Desktop/JAVA/PROYECTO/dbProyect");
  Statement s = conexion.createStatement();
  ResultSet listado = s.executeQuery ("SELECT * FROM Contribuyentes");
  while (listado.next()) {
    out.println(listado.getString("Nombre"));
  }
  conexion.close();
%>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>