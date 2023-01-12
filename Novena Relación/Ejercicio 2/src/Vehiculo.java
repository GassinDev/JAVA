public class Vehiculo {

    //ATRIBUTOS
    private static int vehiculosCreados;
    private static int kilometrosRecorridos;
    private int km;

    //CONSTRUCTOR
    public Vehiculo() {

        this.km = 0;
    }

    //METODOS
    public static int getKmTotales() {

        return kilometrosRecorridos;
    }

    public int getVehiculo() {

        return vehiculosCreados;
    }

    public int getKM() {

        return this.km;
    }

    public void recorre(int km) {

        if (km < 0) {
            km = km * -1;
        }

        this.km += km;
        kilometrosRecorridos += km;

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
