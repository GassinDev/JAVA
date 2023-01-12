public class Coche extends Vehiculo{

    //ATRIBUTOS
    private String color;

    //CONSTRUCTOR
    public Coche(String color) {
        super();
        this.color = color;
    }

    //METODOS
    public String getColor() {

        return this.color;
    }

    public void quemaGoma() {

        System.out.println("Metele candela Joseluuuu toma que toma pastilla de goma");
    }
}
