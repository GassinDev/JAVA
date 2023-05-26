import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bicicleta bicicleta1 = new Bicicleta("pastilla");
        Coche coche1 = new Coche("Azul");

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            mostrarMenu();
            System.out.print("Elige una opción (1-8): ");
            opcion = sc.nextInt();
            int cantidad;
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuántos km avanza?");
                    cantidad = sc.nextInt();
                    bicicleta1.recorre(cantidad);
                    break;
                case 2:
                    bicicleta1.hacerCaballito();
                    break;
                case 3:
                    System.out.println("¿Cuántos km avanza?");
                    cantidad = sc.nextInt();
                    coche1.recorre(cantidad);
                    break;
                case 4:
                    coche1.quemaGoma();
                    break;
                case 5:
                    bicicleta1.verKilometraje();
                    break;
                case 6:
                    coche1.verKilometraje();
                    break;
                case 7:
                    Vehiculo.verKm();
                    break;
                case 8:
                    System.out.println("¡Nos vemos!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR.");
                    break;
            }
        } while (opcion != 8);
    }

    private static void mostrarMenu() {
        System.out.println("VEHÍCULOS" + "\n=========" + "\n1. Anda con la bicicleta"
                + "\n2. Haz el caballito con la bicicleta" + "\n3. Anda con el coche" + "\n4. Quema rueda con el coche"
                + "\n5. Ver kilometraje de la bicicleta" + "\n6. Ver kilometraje del coche" + "\n7. Ver kilometraje total"
                + "\n8. Salir" + "\n");
    }

}