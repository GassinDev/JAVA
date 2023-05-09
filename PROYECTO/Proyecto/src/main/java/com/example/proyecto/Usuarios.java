package com.example.proyecto;

import javax.management.ObjectName;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;

import static java.lang.System.out;

public class Usuarios {

    //ATRIBUTOS
    ArrayList<Contribuyente> listaContribuidores;
    ArrayList<Solicitante> listaSolicitantes;

    //CONSTRUCTOR
    public Usuarios() {
        Statement s = HelloServlet.conectarBD();
        Connection conexion = HelloServlet.nombradorBD();

        listaContribuidores = new ArrayList<>();
        listaSolicitantes = new ArrayList<>();
        leeUsuarios(s,conexion);
    }

    //METODO
    public void leeUsuarios(Statement s, Connection conexion){

        try {

            String query = "SELECT * FROM Contribuyentes";
            ResultSet resul = s.executeQuery(query);


            if(resul != null){
                while(resul.next()){

                   String usuario = resul.getString("Usuario");
                   String nombre = resul.getString("Nombre");
                   String apellidos = resul.getString("Apellidos");
                   int telefono = resul.getInt("Telefono");
                   String especialidad = resul.getString("Especialidad");

                   listaContribuidores.add(new Contribuyente(usuario,nombre,apellidos,telefono,especialidad));

                }
            }

            String query2 = "SELECT * FROM Solicitantes";
            ResultSet resul2 = s.executeQuery(query2);

            if(resul2 != null){
                while(resul2.next()){

                    String usuario = resul2.getString("Usuario");
                    String nombre = resul2.getString("Nombre");
                    String apellidos = resul2.getString("Apellidos");
                    int telefono = resul2.getInt("Telefono");
                    String ayuda = resul2.getString("Ayuda");

                    listaSolicitantes.add(new Solicitante(usuario,nombre,apellidos,telefono,ayuda));

                }
            }

            resul.close();
            resul2.close();
            conexion.close();

        } catch (SQLException e) {

            out.println("erro!" + e.getMessage());

        }
    }



    public String listarDatosContributentes(){

        String s = "";

        for(Contribuyente c: listaContribuidores){
            s += c.toString() + "\n";
        }

        return s;
    }

    public String listarDatosSolicitantes(){

        String s = "";

        for(Solicitante soli: listaSolicitantes){
            s += soli.toString() + "\n";
        }

        return s;
    }

    public Contribuyente cargarMisDartosUsuarioContri(String usuario, String contraseña){

        try {
            String query = "SELECT * FROM Usuarios";
            Statement s = HelloServlet.conectarBD();
            Connection conexion = HelloServlet.nombradorBD();
            ResultSet resul =  s.executeQuery(query);

            if(resul != null){
                while(resul.next()){
                    if(Objects.equals(resul.getString("Usuario"), usuario) && Objects.equals(resul.getString("Contraseña"), contraseña)){

                        for (Contribuyente c: listaContribuidores){
                            if(Objects.equals(c.getUsuario(), usuario)){
                                return c;
                            }
                        }
                    }
                }
            }

            resul.close();
            conexion.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    public Solicitante cargarMisDartosUsuarioSoli(String usuario, String contraseña){

        try {
            String query = "SELECT * FROM Usuarios";
            Statement s = HelloServlet.conectarBD();
            Connection conexion = HelloServlet.nombradorBD();
            ResultSet resul =  s.executeQuery(query);

            if(resul != null){
                while(resul.next()){
                    if(Objects.equals(resul.getString("Usuario"), usuario) && Objects.equals(resul.getString("Contraseña"), contraseña)){

                        for (Solicitante soli: listaSolicitantes){
                            if(Objects.equals(soli.getUsuario(), usuario)){
                                return soli;
                            }
                        }
                    }
                }
            }

            resul.close();
            conexion.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }


}
