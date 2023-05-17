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

<%
    Usuarios usu = new Usuarios();

    String usuario = request.getParameter("Usuario");
    String contraseña = request.getParameter("Contraseña");
    String datos = ((usu.cargarMisDartosUsuarioContri(usuario,contraseña)).toString());
%>

<p class=perfil><%=datos%></p>

</body>
</html>
