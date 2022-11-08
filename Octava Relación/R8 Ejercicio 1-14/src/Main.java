import java.util.EnumSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Menú de ejercicios");
        System.out.println("───────────────────────────────────────");
        System.out.println("1. esCapicua        8. posicionDeDigito");
        System.out.println("2. esPrimo          9. quitaPorDetras");
        System.out.println("3. siguientePrimo   10. quitaPorDelante");
        System.out.println("4. potencia         11. quitaPorDelante");
        System.out.println("5. digitos          12. pegaPorDelante");
        System.out.println("6. voltea           13. trozoDeNumero");
        System.out.println("7. digitoN          14. juntaNumeros");
        System.out.println();

        Scanner reader = new Scanner(System.in);

        int o;

        System.out.print("Elije el ejercicio que quieres: ");
        o = reader.nextInt();

        while (o <= 0 | o > 14) {

            System.out.println();
            System.out.println("Ese ejercicio no se encuentra en el menú");
            System.out.print("Elije el ejercicio que quieres: ");
            o = reader.nextInt();

            System.out.println();
            System.out.println("Menú de ejercicios");
            System.out.println("───────────────────────────────────────");
            System.out.println("1. esCapicua        8. posicionDeDigito");
            System.out.println("2. esPrimo          9. quitaPorDetras");
            System.out.println("3. siguientePrimo   10. quitaPorDelante");
            System.out.println("4. potencia         11. quitaPorDelante");
            System.out.println("5. digitos          12. pegaPorDelante");
            System.out.println("6. voltea           13. trozoDeNumero");
            System.out.println("7. digitoN          14. juntaNumeros");
            System.out.println();
        }

        System.out.println();

        switch (o) {

            case 1: {
                int n;

                System.out.println("Dime el número que quieras que te diga si es Capicua");
                n = reader.nextInt();

                System.out.println(esCapicua(n));
            }break;

            case 2: {
                int n;

                System.out.println("Dime el número que quieras que te diga si es Primo");
                n = reader.nextInt();

                System.out.println(esPrimo(n));
            }break;

            case 3:{
                int n;

                System.out.println("Dime el número que quieras que te diga el siguiente primo de ese");
                n = reader.nextInt();

                System.out.println(siguientePrimo(n));

            }break;

            case 4:{
                int base,expo;

                System.out.println("Dime el número de base");
                base = reader.nextInt();
                System.out.println("Dime el exponente");
                expo = reader.nextInt();

                System.out.println(potencia(base,expo));
            }break;

            case 5:{
                int n;

                System.out.println("Dime el número que quieres que te cuente sus dígitos");
                n = reader.nextInt();

                System.out.println(digitos(n));
            }break;

            case 6:{
                int n;

                System.out.println("Dime el número que quieres que te invierta");
                n = reader.nextInt();

                System.out.println(voltea(n));
            }break;

            case 7:{
                int n;
            }
        }

    }

    static  boolean esCapicua(int n){

        int inver = 0,r, n2 = n;
        boolean Capicua = false;

        while( n2 > 0 ) {

            r = n2 % 10;
            inver = inver * 10 + r;
            n2/= 10;

        }

        if(n == inver){
            Capicua = true;
        }

        return Capicua;
    }

    static boolean esPrimo(int n) {

        int cont = 0;
        boolean Primo = true;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                cont ++;
            }
        }

        if(cont != 0){
            Primo = false;
        }

        return Primo;
    }

    static int siguientePrimo(int n){

        int cont = 1;
        for(int i = n + 1; n < n + cont;i++){
            if (esPrimo(i)){
                n = i;
                break;
            }
            cont++;
        }
        return n;
    }

    static int potencia(int base, int expo){

        int resultado;

        resultado = (int)(Math.pow(expo,base));

        return resultado;
    }

    static int digitos(int n){

         int cifras = 0;

        while(n != 0){
            n = n / 10;
            cifras++;
        }

        if(cifras == n){
            cifras = 1;
        }
        return cifras;
    }

    static int voltea(int n){

        int r, inver = 0;

        while( n > 0 ) {

            r = n % 10;
            inver = inver * 10 + r;
            n/= 10;
        }

        return inver;
    }

    static  int digitoN(int n){

        
    }
}


