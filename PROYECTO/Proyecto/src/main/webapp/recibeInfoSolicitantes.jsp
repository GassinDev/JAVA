<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.example.proyecto.HelloServlet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="CSS/menu.css">
    <META HTTP-EQUIV="REFRESH" CONTENT="5;URL=index.jsp">
</head>
<body class="loading">
<%
    Statement s = HelloServlet.conectarBD();
    Connection conexion = HelloServlet.nombradorBD();

    request.setCharacterEncoding("UTF-8");

    String insercionUsu = "INSERT INTO Usuarios VALUES ('"
            + request.getParameter("Usuario")
            + "','" + request.getParameter("Contraseña") + "')";

    String insercion = "INSERT INTO Solicitantes VALUES ('"
            + request.getParameter("Usuario")
            + "','" + request.getParameter("Nombre")
            + "','" + request.getParameter("Apellidos")
            + "'," + (Integer.parseInt(request.getParameter("Telefono")))
            + ",'" + request.getParameter("Ayuda") + "')";

    s.execute(insercionUsu);
    s.execute(insercion);
    conexion.close();
%>

<h2 class="tfor"> Estás registrado en nuestra web como Solicitante, en 5 segundos serás redirigido al menú</h2>
<div class="loader"></div>
</body>
</html>
