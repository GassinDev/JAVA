<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.util.Objects" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.proyecto.HelloServlet" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="../CSS/menu.css">
    <META HTTP-EQUIV="REFRESH" CONTENT="5;URL=../RegistradoIni/perfilSolicitante.jsp">
</head>
<body class="loading">
<%
    Statement s = HelloServlet.conectarBD();
    Connection conexion = HelloServlet.nombradorBD();


    String insercion = "INSERT INTO Ayudas VALUES ('"
            + request.getParameter("Usuario")
            + "','','"+ request.getParameter("Ayuda")
            + "','" +  request.getParameter("Comentario")
            + "','','')";

    s.execute(insercion);
    conexion.close();
%>

<h2 class="tfor">Ayuda generada con éxito, en 5 segundos serás redirigido a tu menú de usuario</h2>
<div class="loader"></div>
<br/>
</body>
</html>