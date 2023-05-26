<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%
  Class.forName("org.sqlite.JDBC");
  Connection conexion = DriverManager.getConnection("jdbc:sqlite:C:/Users/Gassin/Desktop/PROG/JAVA/PRUEBAS CON WEAPP/myDataBase");
  Statement s = conexion.createStatement();
  request.setCharacterEncoding("UTF-8");

  String insercion = "INSERT INTO Alumnos VALUES ('"
          +  request.getParameter("Nombre") //ESTO PARA VARIABLES TEXT
          + "', "+ (Integer.parseInt(request.getParameter("Id"))   //ESTO PARA VARIABLES INTERGER
          + ", "+ (Double.parseDouble(request.getParameter("Tamaño"))  //ESTO PARA VARIABLES DOUBLE
          + " )"));

  s.execute(insercion);
  conexion.close();
%>
Socio dado de alta.
<a href="index.jsp">Volver al inicio</a>
</body>
</html>
