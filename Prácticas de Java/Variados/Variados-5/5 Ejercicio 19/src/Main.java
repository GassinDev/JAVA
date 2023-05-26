import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int x, y,altura;

        String caracter;

        System.out.println("Dime la altura de la pirámide");
        altura = reader.nextInt();
        System.out.println("Dime el caracter con el que quieres que te dibuje la pirámide");
        caracter = reader.next();
        System.out.println(" ");

        for (x = 1; x <= altura; x++)
        {
            // Coloca espacios
            for (y = altura - x; y > 0; y--)
            {
                System.out.print(" ");
            }
            //Pinta la pirámide con los caracteres
            for (y = 1; y < x; y++)
            {
                System.out.print(caracter + caracter);
            }
            System.out.println(caracter);
        }
    }
}