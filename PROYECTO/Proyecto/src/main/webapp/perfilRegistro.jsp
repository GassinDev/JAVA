<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.example.proyecto.HelloServlet" %>
<%@ page import="com.example.proyecto.Usuarios" %>
<%@ page import="com.example.proyecto.Contribuyente" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <title>JSP - MENU</title>
  <link rel="stylesheet" type="text/css" href="CSS/menu.css">
</head>
<body>

<p>
  <%
    Usuarios lucontri = new Usuarios();

    String usuario = request.getParameter("Usuario");
    String contraseña = request.getParameter("Contraseña");

    if(lucontri.cargarMisDartosUsuarioContri(usuario,contraseña) != null){
      out.println("<img src=Recursos/perfillogo.jpg width=20% height=20% >");
      out.println(((lucontri.cargarMisDartosUsuarioContri(usuario,contraseña)).toString()));
    } else if (lucontri.cargarMisDartosUsuarioSoli(usuario,contraseña) != null) {
      out.println(((lucontri.cargarMisDartosUsuarioSoli(usuario,contraseña)).toString()));
    } else{
      out.println("Este usuario no se encuentra registrado en nuestra web");
    }
  %>
</p>


<br/>
</body>
</html>
