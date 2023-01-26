public class Gato {
    enum Raza {
        Siames,Egipcio,Angola
    }

    //ATRIBUTOS
    String nombre;
    int edad;
    Raza raza;

    //CONTRUCTOR
    public Gato(String nombre, int edad, Raza raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    //METODO


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Raza getRaza() {
        return raza;
    }

    //TOSTRING

    @Override
    public String toString() {

        return "Gato { " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza=" + raza + " " +
                '}';
    }
}
