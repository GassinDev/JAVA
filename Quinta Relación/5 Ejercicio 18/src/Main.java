import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n,n2;

        System.out.println("Dime el primer número");
        n = reader.nextInt();
        System.out.println("Dime el segundo número");
        n2 = reader.nextInt();

        while(n == n2){
            System.out.println("Porfavor, necesito que sean distintos");
            System.out.println("Dime el primer número");
            n = reader.nextInt();
            System.out.println("Dime el segundo número");
            n2 = reader.nextInt();
        }
        if(n < n2){
            for (int i = n; n < n2;i++){

                n = n + 7;
                if(n >= n2){
                    break;
                }
                System.out.print(" " + n + " ");
            }
        }else{

        }
    }
}