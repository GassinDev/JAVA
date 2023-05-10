<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.example.proyecto.Usuarios" %>
<%@ page import="com.example.proyecto.HelloServlet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - MENU</title>
    <link rel="stylesheet" type="text/css" href="CSS/menu.css">
</head>
<body id="contenedor">

<%
    Statement s = HelloServlet.conectarBD();
    Connection conexion = HelloServlet.nombradorBD();

    ResultSet listado = s.executeQuery ("SELECT * FROM Contribuyentes");
    ResultSet listado2 = s.executeQuery ("SELECT * FROM Solicitantes");

%>

<h2>Lista de los Contribuyentes</h2>
<table border="1">
    <tr><th>Usuario</th><th>Nombre</th><th>Apellidos</th><th>Telefono</th><th>Especialidad</th><th></th></tr>
    <%
        while (listado.next()) {
            out.println("<td>" + listado.getString("Usuario") + "</td>");
            out.println("<td>" + listado.getString("Nombre") + "</td>");
            out.println("<td>" + listado.getString("Apellidos") + "</td>");
            out.println("<td>" + listado.getString("Telefono") + "</td>");

    %>
    <td>
        <form method="get" action="BorraUsu.jsp">
            <input type="hidden" name="Usuario" value="<%=listado.getString("Usuario") %>"/>
            <input type="submit" value="borrar">
        </form>
    </td></tr>
    <%
        }
        listado.close();
    %>

</table>

<h2>Lista de los Solicitantes</h2>
<table border="1">
    <tr><th>Usuario</th><th>Nombre</th><th>Apellidos</th><th>Telefono</th><th>Ayuda</th></tr>
    <%
        while (listado2.next()) {
            out.println("<td>" + listado2.getString("Usuario") + "</td>");
            out.println("<td>" + listado2.getString("Nombre") + "</td>");
            out.println("<td>" + listado2.getString("Apellidos") + "</td>");
            out.println("<td>" + listado2.getString("Telefono") + "</td>");
            out.println("<td>" + listado2.getString("Ayuda") + "</td>");
    %>
    <td>
        <form method="get" action="BorraUsu.jsp">
            <input type="hidden" name="Usuario" value="<%=listado2.getString("Usuario") %>"/>
            <input type="submit" value="borrar">
        </form>
    </td></tr>
    <%
        }
        listado2.close();
        conexion.close();
    %>
</table>

</body>
</html>
