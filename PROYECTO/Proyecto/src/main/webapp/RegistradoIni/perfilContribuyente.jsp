<%@ page import="com.example.proyecto.Usuarios" %><%--
  Created by IntelliJ IDEA.
  User: juang
  Date: 17/05/2023
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../CSS/menu.css">
</head>
<body>

-
<%
    ServletContext s = request.getServletContext();

    String usuario = (String) s.getAttribute("Usuario");
%>
<h1 class="titulo">Bienvenido <%= usuario%> </h1>


<div id="barraNavegacion">
    <ul>
        <li><a class=enla href=../FuncionesContribuyentes/VerAyudasAceptadas.jsp>Ver ayudas aceptadas</a></li>
        <li><a class=enla href=../FuncionesContribuyentes/VerAyudasDisponibles.jsp >Ver ayudas disponibles</a></li>
    </ul>
</div>

</body>
</html>