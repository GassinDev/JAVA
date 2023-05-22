<%@ page import="com.example.proyecto.Usuarios" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../CSS/menu.css">
</head>
<body>
<%

    Usuarios usu = new Usuarios();

    ServletContext sc = request.getServletContext();
    String usuario = (String) sc.getAttribute("Usuario");

    String datos = String.valueOf(usu.datosContribuyente(usuario));

%>
<h1 class="titulo">Bienvenido <%= usuario%> </h1>

<p class="perfil"><%=datos%></p>

<div id="barraNavegacion">
    <ul>
        <li><a class=enla href=../FuncionesContribuyentes/VerAyudasAceptadas.jsp>Ver ayudas aceptadas</a></li>
        <li><a class=enla href=../FuncionesContribuyentes/VerAyudasDisponibles.jsp >Ver ayudas disponibles</a></li>
        <li><a class=enla href=../RegistradoIni/cerrarSesion.jsp >Cerrar sesión</a></li>
    </ul>
</div>

</body>
</html>
