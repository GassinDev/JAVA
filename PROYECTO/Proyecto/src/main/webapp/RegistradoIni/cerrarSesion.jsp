<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  ServletContext sc = request.getServletContext();
  sc.removeAttribute("Usuario");
  response.sendRedirect("sesion.jsp");
%>
</body>
</html>
