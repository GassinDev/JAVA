import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n, cifras = 1;
        System.out.println("Dime el número que quieres que te cuente las cifras");
        n = reader.nextInt();

        if(n < 10 & n > - 10){
            System.out.println("Tiene "+ cifras + " cifras");
        }else{
            do{
                n = n/10;
                cifras++;
            }while(n/10 != 0);

            System.out.println("Tiene "+ cifras + " cifras");
        }



    }
}