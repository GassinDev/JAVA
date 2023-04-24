public class Profesor {

    //ATRIBUTOS
    String nombre;
    String dni;
    TipoGenero genero;

    //CONSTRUCTOR
    public Profesor(String nombre, String dni, TipoGenero genero) {

        if(!nombre.equals("")){
            this.nombre = nombre;
        }else {
            System.out.println("No puede estar vacío el nombre");
        }

        if(dni.length() == 9){
            this.dni = dni;
        }else {
            System.out.println("El dni debe estar formado por 9 carácteres");
        }

        this.genero = genero;
    }

    //METODOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", genero=" + genero +
                '}';
    }
}
