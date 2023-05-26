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

  ResultSet listado = s.executeQuery ("SELECT * FROM Alumnos");
%>
<table border="1">
  <tr><th>Nombre</th><th>Id</th><th>Tamaño</th></tr>
  <%
    while (listado.next()) {
      out.println("<td>" + listado.getString("Nombre") + "</td>");
      out.println("<td>" + listado.getString("Id") + "</td>");
      out.println("<td>" + listado.getString("Tamaño") + "</td>");
  %>
  <td>
    <form method="get" action="borraAlumno.jsp">
      <input type="hidden" name="Id" value="<%=listado.getString("Id") %>"/>
      <input type="submit" value="borrar">
    </form>
  </td></tr>
  <%
    }
    conexion.close();
  %>
</table>
</body>
</html>

