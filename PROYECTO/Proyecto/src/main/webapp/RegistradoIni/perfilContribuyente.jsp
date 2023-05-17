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
</head>
<body>

<%
    Usuarios usu = new Usuarios();
%>
<img src=Recursos/perfillogo.jpg width=20% height=20% >
<p class=perfil>" + <%((usu.cargarMisDartosUsuarioContri(usuario,contraseña)).toString())%></p>
</body>
</html>
