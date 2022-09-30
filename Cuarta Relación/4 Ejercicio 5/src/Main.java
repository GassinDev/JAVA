import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double a,b;

        System.out.println("Dime las variables de tu ecuación de primer grado ( ax + b = 0 )");
        System.out.println("Primero la variable a:");
        a = reader.nextDouble();
        System.out.println("Segunda la variable x:");
        b = reader.nextDouble();

        if(a == 0){
            System.out.println("No tiene solución real");
        }else {

            System.out.println("El resultado de tu ecuacion es x = " + (-b/a));
        }



    }
}