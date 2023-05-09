package com.example.proyecto;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public static Connection nombradorBD(){

        try {
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:C:/Users/Gassin/Desktop/PROG/JAVA/PROYECTO/dbProyect");
            return conexion;
        } catch (SQLException e) {

        }
        return null;
    }
    public static Statement conectarBD(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conexion = nombradorBD();
            Statement s = conexion.createStatement();

            return s;
        }catch (Exception e){

        }

        return null;
    }

    public void destroy() {
    }
}