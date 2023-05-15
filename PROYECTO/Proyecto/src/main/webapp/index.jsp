<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.example.proyecto.Usuarios" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Inicio</title>
  <link rel="stylesheet" type="text/css" href="CSS/menu.css">
</head>
<body id="contenedor">
<h1 class="titulo"><img class="logo" src="Recursos/Imagenes/logo.png">SOLICITENOS</h1>

<div id="barraNavegacion">
  <ul>
    <li><a class="inicio" href="Formularios/sesion.jsp">Inicio de sesión</a></li>
    <li><a class="registro" href="Formularios/registro.jsp">Registrarme en la WEB</a></li>
  </ul>
</div>
<div class="divglo">
  <div class="div1">
    <section>
      <img src="Recursos/Imagenes/personas1.png">
      <img src="Recursos/Imagenes/persona2.png">
      <img src="Recursos/Imagenes/persona3.png">
      <img src="Recursos/Imagenes/persona4.png">
    </section>
  </div>
  <div class="div2">
    <article class="info">
      <h2 class="titulosPa"> Solicita tus ayudas en Solicitenos</h2>
      <p>
      Obtendrás todo tipos de ayudas en nuestra página web,
      de mano de gente solidaria y de gente profesional,
      esperemos que podamos solucionarle cualquier problema o
      obstáculo que se interponga entre usted y sus metas u objetivos.
      </p>
      <br>
      <p>
        Gracias por confiar en nosotros, estamos encantados de poder
        darle nuestro soporte ideal.
      </p>
    </article>
  </div>
</div>
</body>
</html>