import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int n = 2,nNumeros = 0;
        System.out.println("");
        while(n != 24){
            n = (int)(Math.random()*51)*2;
            System.out.print(n + " ");
            nNumeros++;
        }
        System.out.println("");
        System.out.println("Ha generado un total de " + nNumeros + " numeros");

    }
}