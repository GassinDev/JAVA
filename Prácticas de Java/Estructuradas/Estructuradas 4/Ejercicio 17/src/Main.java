import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n;
        System.out.println("Dime un número pero no puede tener más de 5 cifras");
        n = reader.nextInt();

        if(n/10 == 0){
            System.out.println();
        }
    }
}