import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int codeblock,intentos = 4,n;

        codeblock = 1234;


        System.out.println("Dime el codigo para abrir la caja fuerte (tienes 4 oportunidades)");
        n = reader.nextInt();

        if(n == codeblock){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        }else{
            while(n != codeblock){
                intentos--;
                if(intentos > 0){
                    System.out.println("Lo siento, esa no es la combinación, te quedan " + intentos + " intentos.");
                    System.out.println("Dime el codigo para abrir la caja fuerte");
                    n = reader.nextInt();

                    if(n == codeblock){
                        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                        break;
                    }
                }else{
                    System.out.println("No te quedan más intentos.");
                    break;
                }
            }

        }




    }
}