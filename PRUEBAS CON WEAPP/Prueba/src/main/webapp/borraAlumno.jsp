<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%

    Class.forName("org.sqlite.JDBC");
    Connection conexion = DriverManager.getConnection("jdbc:sqlite:C:/Users/Gassin/Desktop/PROG/JAVA/PRUEBAS CON WEAPP/myDataBase");
    Statement s = conexion.createStatement();

    s.execute ("DELETE FROM Alumnos WHERE Id =" + request.getParameter("Id"));
%>
<script>document.location = "pideNumeroAlumno.jsp"</script>
</body>
</html>

