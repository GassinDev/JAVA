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

    if(lucontri.cargarMisDartosUsuarioContri(usuario,contraseña) != null){
      out.println("<h2 class=tfor>Bienvenido " + usuario + "</h2>");
     out.println("<META HTTP-EQUIV=REFRESH CONTENT=3;URL=RegistradoIni/perfilContribuyente.jsp>");
    } else if (lucontri.cargarMisDartosUsuarioSoli(usuario,contraseña) != null) {
      out.println("<h2 class=tfor>Bienvenido " + usuario + "</h2>");
      out.println("<META HTTP-EQUIV=REFRESH CONTENT=3;URL=RegistradoIni/perfilSolicitante.jsp>");
    } else if(Objects.equals(usuario, "admin") && Objects.equals(contraseña, "Aa1234")){
      out.println("<h2 class=tfor>Bienvenido Administrador</h2>");
      out.println("<META HTTP-EQUIV=REFRESH CONTENT=3;URL=RegistradoIni/perfilAdmin.jsp>");
    }else{
      out.println("Este usuario no se encuentra registrado en nuestra web");
      out.println("<META HTTP-EQUIV=REFRESH CONTENT=3;URL=Formularios/sesion.jsp>");
    }
  %>
</p>

<form name="sesion" method=get action=RegistradoIni/perfilContribuyente.jsp>
  <input type=hidden name=Usuario value="<%=request.getParameter("Usuario")%>"/>
  <input type=hidden name=Contraseña value="<%=request.getParameter("Contraseña")%>"/>
</form>

<script>document.forms["sesion"].submit()</script>

<br/>
</body>
</html>
