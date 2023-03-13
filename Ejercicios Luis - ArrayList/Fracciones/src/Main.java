import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int opcion = 1;

        while (opcion != 0){

            System.out.println("MENU - FRACCIONES");
            System.out.println("--------------------------");
            System.out.println("1.Negate");
            System.out.println("2.Sumar");
            System.out.println("3.Restar");
            System.out.println("4.Multiplicar");
            System.out.println("5.Dividir");
            System.out.println("6.Equals");
            System.out.println("7.compareTo");
            System.out.println("0.Salir");
            System.out.println("--------------------------");
            System.out.print("Dime tu opcion: ");
            opcion = reader.nextInt();

            switch (opcion){
                case 1:{
                    int num,dem;

                    System.out.print("Dime numerador: ");
                    num = reader.nextInt();
                    System.out.print("Dime denominador: ");
                    dem = reader.nextInt();

                    Fraccion f = new Fraccion(num,dem);
                    System.out.println(f.negate());
                }break;

                case 2:{
                    int num,dem;

                    System.out.print("Dime numerador: ");
                    num = reader.nextInt();
                    System.out.print("Dime denominador: ");
                    dem = reader.nextInt();

                    Fraccion f = new Fraccion(num,dem);
                    System.out.println(f.add(f));
                }break;

                case 3:{
                    int num,dem;

                    System.out.print("Dime numerador: ");
                    num = reader.nextInt();
                    System.out.print("Dime denominador: ");
                    dem = reader.nextInt();

                    Fraccion f = new Fraccion(num,dem);
                    System.out.println(f.substract(f));
                }break;

                case 4:{
                    int num,dem;

                    System.out.print("Dime numerador: ");
                    num = reader.nextInt();
                    System.out.print("Dime denominador: ");
                    dem = reader.nextInt();

                    Fraccion f = new Fraccion(num,dem);
                    System.out.println(f.multiply(f));
                }break;

                case 5:{
                    int num,dem;

                    System.out.print("Dime numerador: ");
                    num = reader.nextInt();
                    System.out.print("Dime denominador: ");
                    dem = reader.nextInt();

                    Fraccion f = new Fraccion(num,dem);
                    System.out.println(f.divide(f));
                }break;

                case 6:{
                    int num,dem;

                    System.out.print("Dime numerador: ");
                    num = reader.nextInt();
                    System.out.print("Dime denominador: ");
                    dem = reader.nextInt();

                    Fraccion f = new Fraccion(num,dem);
                    System.out.println(f.equals(f));
                }break;

                case 7:{
                    int num,dem;

                    System.out.print("Dime numerador: ");
                    num = reader.nextInt();
                    System.out.print("Dime denominador: ");
                    dem = reader.nextInt();

                    Fraccion f = new Fraccion(num,dem);
                    System.out.println(f.compareTo(f));
                }break;
            }
        }
    }
}