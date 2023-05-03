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
    <META HTTP-EQUIV="REFRESH" CONTENT="5;URL=index.jsp">
</head>
<body>
<%
    Class.forName("org.sqlite.JDBC");
    Connection conexion = DriverManager.getConnection("jdbc:sqlite:C:/Users/Gassin/Desktop/PROG/JAVA/PROYECTO/dbProyect");
    Statement s = conexion.createStatement();
    request.setCharacterEncoding("UTF-8");
    ResultSet res;

    //AQUI CONSEGUIMOS LA CANTIDAD DE ELEMENTOS QUE HAY EN LA TABLA PARA QUE PODAMOS ASIGNAR SIEMPRE UN ID EN ORDEN SIN REPETIR

    int totalIDES;
    res = s.executeQuery("select count(*) AS Id from Investigadores");
    res.next();
    totalIDES = res.getInt("Id");


    String insercion = "INSERT INTO Investigadores VALUES ("
            +  (totalIDES + 1)
            + ",'" + request.getParameter("Nombre")
            + "','" + request.getParameter("Apellidos")
            + "'," + (Integer.parseInt(request.getParameter("Telefono"))
            + ",'" + request.getParameter("Ayuda") + "')");

    s.execute(insercion);
    conexion.close();
%>

<p class="Notificacion"> Estás registrado en nuestra web como Investigador, en 5 segundos serás redirigido al menú</p>
<br/>
</body>
</html>
