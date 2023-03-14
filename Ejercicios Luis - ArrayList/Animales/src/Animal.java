import java.util.Date;

public abstract class Animal {

    //ATRIBUTOS
    protected String nombre;
    protected Date fechaNacimiento;
    protected double peso;
    protected String comentarios;

    //CONSTRUCTOR
    public Animal(String nombre, Date fechaNacimiento, double peso)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.comentarios = "";
    }

    //METODOS
    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    //METODO ABSTRACTO
    @Override
    public String toString() {

        return null;
    }
}
