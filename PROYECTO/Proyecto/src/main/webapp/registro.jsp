<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="CSS/menu.css">
</head>
<body>
<h1><%= "REGISTRO" %></h1>

<form method="get" action="registro.jsp">
    <select name="tipo">
        <option >Contribuyente</option>
        <option>Investigador</option>
        <input type="submit" value="Aceptar">
    </select>
</form>


<%
    if(Objects.equals(request.getParameter("tipo"), "Contribuyente")){
        response.sendRedirect("formularioContribuyente.jsp");
    }else if(Objects.equals(request.getParameter("tipo"), "Investigador")){
        response.sendRedirect("formularioSolicitante.jsp");
    }
%>



<br/>
<a href="index.jsp" >
    <img src="Recursos/vueltaInicioIcon.png" alt="Volver al menú de Inicio" width="5%" height="5%"></a>
</body>
</html>
