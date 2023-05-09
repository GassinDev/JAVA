package com.example.proyecto;

public class Solicitante {

    //ATRIBUTOS
    String usuario;
    String nombre;
    String apellidos;
    int telefono;
    String ayuda;

    //CONSTRUCTOR
    public Solicitante(String usuario, String nombre, String apellidos, int telefono, String especialidad) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.ayuda = especialidad;
    }

    public Solicitante() {
    }

    //METODOS


    public String getUsuario() {
        return usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getAyuda() {
        return ayuda;
    }

    @Override
    public String toString() {
        return "<br>" + "Nombre: " + nombre + "<br>" +
                "Apellidos: " + apellidos + "<br>" +
                "Teléfono: " + telefono + "<br>" +
                "Especialidades: " + ayuda;
    }
}
