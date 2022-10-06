import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n,n2;

        System.out.println("Dime un número");
        n = reader.nextInt();
        System.out.println("Dime otro número menor que el anterior");
        n2 = reader.nextInt();

        for(int i = n;i >= 0;i--){
            if(i % n2 != 0){
                System.out.print(i + ", ");
            }
        }
    }
}