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
<h1 class="titulo">Bienvenido <%= request.getParameter("Usuario")%></h1>

<%
    Usuarios usu = new Usuarios();

    String usuario = request.getParameter("Usuario");
    String contraseña = request.getParameter("Contraseña");
    String datos = ((usu.cargarMisDartosUsuarioSoli(usuario,contraseña)).toString());
%>

<p class=perfil><%=datos%></p>

<div id="barraNavegacion">
    <ul>
        <li><a class=enla href=../FuncionesSolicitantes/VerMisAyudas.jsp>Ver/Editar mis ayudas</a></li>
        <li><a class=enla href=../FuncionesSolicitantes/FormularioAyuda.jsp>Crear nueva ayuda</a></li>
    </ul>
</div>

</body>
</html>
