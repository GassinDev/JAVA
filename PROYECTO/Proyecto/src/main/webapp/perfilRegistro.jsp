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
  <link rel="stylesheet" type="text/css" href="CSS/menu.css">
</head>
<body>

<p>
  <%
    Usuarios lucontri = new Usuarios();

    String usuario = request.getParameter("Usuario");
    String contraseña = request.getParameter("Contraseña");
    String jsp = "sesion.jsp";

    if(lucontri.cargarMisDartosUsuarioContri(usuario,contraseña) != null){
      jsp = "perfilContribuyente.jsp";
    } else if (lucontri.cargarMisDartosUsuarioSoli(usuario,contraseña) != null) {
      jsp = "perfilSolicitante.jsp";
    } else if(Objects.equals(usuario, "admin") && Objects.equals(contraseña, "Aa1234")){
      jsp = "perfilAdmin.jsp";
    }
  %>

</p>

<form name="sesion" method=get action=RegistradoIni/<%=jsp%>>
  <input type=hidden name=Usuario value="<%=request.getParameter("Usuario")%>"/>
  <input type=hidden name=Contraseña value="<%=request.getParameter("Contraseña")%>"/>
</form>

<script>document.forms["sesion"].submit()</script>

<br/>
</body>
</html>
