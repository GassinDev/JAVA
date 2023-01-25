import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);

        int opcion = 0;

        while (opcion != 3){

            System.out.println("");
            System.out.println("");
            System.out.println("  COMPRA DE ENTRADAS PARA EL CONCIERTO");
            System.out.println("----------------------------------------");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");

            opcion = reader.nextInt();

            switch (opcion){

                case 1:{
                    System.out.println("Zona principal: " + principal.getEntradasPorVender());
                    System.out.println("Zona compraventa: " + compraventa.getEntradasPorVender());
                    System.out.println("Zona vip: " + vip.getEntradasPorVender());
                }break;

                case 2:{
                    System.out.println("¿Qué entrada te gustaría comprar?");
                    System.out.println("1. Zona principal");
                    System.out.println("2. Zona compra-venta");
                    System.out.println("3. Zona vip");

                    int opcion2 = 0;
                    int nentradas;

                    opcion2 = reader.nextInt();

                    System.out.println("¿Cuántas entradas quieres?");
                    nentradas = reader.nextInt();

                    switch (opcion2){

                        case 1:{
                            principal.vender(nentradas);
                        }break;

                        case 2:{
                            compraventa.vender(nentradas);
                        }break;

                        case 3:{
                            vip.vender(nentradas);
                        }break;
                    }
                }break;

                case 3:{
                    break;
                }
            }
        }

    }
}