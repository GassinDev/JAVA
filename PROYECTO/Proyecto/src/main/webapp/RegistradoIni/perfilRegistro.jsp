<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.example.proyecto.HelloServlet" %>
<%@ page import="com.example.proyecto.Usuarios" %>
<%@ page import="com.example.proyecto.Contribuyente" %>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <title>JSP - MENU</title>
  <link rel="stylesheet" type="text/css" href="../CSS/menu.css">
</head>
<body>

<%
  Usuarios lucontri = new Usuarios();

  String usuario = request.getParameter("Usuario");
  String contraseña = request.getParameter("Contraseña");

  ServletContext s = request.getServletContext();

  if(lucontri.cargarMisDartosUsuarioContri(usuario,contraseña) != null){
    s.setAttribute("Usuario",usuario);
    response.sendRedirect("perfilContribuyente.jsp");
  } else if (lucontri.cargarMisDartosUsuarioSoli(usuario,contraseña) != null) {
    s.setAttribute("Usuario", usuario);
    response.sendRedirect("perfilSolicitante.jsp");
  } else if(Objects.equals(usuario, "admin") && Objects.equals(contraseña, "Aa1234")){
    s.setAttribute("Usuario", usuario);
    response.sendRedirect("perfilAdmin.jsp");
  }else{
    response.sendRedirect("RegistradoIni/sesion.jsp");
  }
%>



<br/>
</body>
</html>
