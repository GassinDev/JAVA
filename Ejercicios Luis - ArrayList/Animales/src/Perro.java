import java.util.Date;

enum RazaPerro
{
    PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo
}

public class Perro extends Animal{

    //ATRIBUTOS
    private RazaPerro razaPerro;
    private String microchip;

    //CONSTRUCTOR
    public Perro(String nombre, Date fechaNacimiento, double peso, RazaPerro razaPerro, String microchip, String comentarios) {
        super(nombre, fechaNacimiento, peso);
        this.razaPerro = razaPerro;
        this.microchip = microchip;
    }

    //METODOS

    public RazaPerro getRazaPerro() {
        return razaPerro;
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
                "Raza: " + razaPerro + "\n" +
                "Microchip: " + microchip;
    }
}
