import java.util.Date;

enum RazaGato
{
    Comun, Siames, Persa, Angora, ScottishFold
}

public class Gato extends Animal{

    //ATRIBUTOS
    protected RazaGato razaGato;
    protected String microchip;

    //CONSTRUCTOR
    public Gato(String nombre, Date fechaNacimiento, String peso, RazaGato razaGato, String microchip, double v) {
        super(nombre, fechaNacimiento, Double.parseDouble(peso));
        this.razaGato = razaGato;
        this.microchip = microchip;
    }

    //METODOS

    public RazaGato getRazaGato() {
        return razaGato;
    }

    public String getMicrochip() {
        return microchip;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Ficha Perro" + "\n" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + "\n" +
                "Comentario: " + comentarios + "\n" +
                "Raza: " + razaGato + "\n" +
                "Microchip: " + microchip;
    }
}
