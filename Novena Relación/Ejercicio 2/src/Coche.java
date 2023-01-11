public class Coche extends Vehiculo{

    private String color;

    public Coche(String color) {
        super();
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void quemaGoma() {
        System.out.println("Metele candela Joseluuuu toma que toma pastilla de goma");
    }
}
