<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.example.proyecto.HelloServlet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%

    Statement s = HelloServlet.conectarBD();
    Connection conexion = HelloServlet.nombradorBD();

    ServletContext sc = request.getServletContext();
    String usuario = (String) sc.getAttribute("Usuario");

    s.executeUpdate("UPDATE Ayudas SET Contribuyente='" + usuario + "',FechaFin=' "+ request.getParameter("FechaFin") +" ',Disponibilidad='Ocupada' WHERE Id =" + Integer.parseInt(request.getParameter("Id")));

    response.sendRedirect("../VerAyudasDisponibles.jsp");
%>
</body>
</html>
