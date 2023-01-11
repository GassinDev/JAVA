public class Vehiculo {

    //CARACTERISTICAS
    private static int contVehiculos;
    private static int kmTotales;
    private int km;

    public Vehiculo() {
        this.km = 0;
    }

    //METODOS
    public static int getKmTotales() {
        return kmTotales;
    }

    public int getVehiculo() {
        return contVehiculos;
    }

    public int getKM() {
        return this.km;
    }

    public void recorre(int km) {
        if (km < 0) {
            km = km * -1;
        }

        this.km += km;
        kmTotales += km;


        System.out.println("Km correctos");
    }

    public void verKilometraje() {
        System.out.println("El vehículo ha recorrido " + getKM() + "km.");
    }

    public static void verKm() {
        System.out.println(
                "Entre todos los vehiculos han recorrido " + getKmTotales() + "km.");

    }
}
