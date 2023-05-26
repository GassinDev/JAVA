import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int altura;

        System.out.println("Dime la altura para la L");
        altura = reader.nextInt();

        for(int i = 1; i < altura;i++){
            System.out.println("*");

            if(i == altura - 1){
                for(int x = 0;x <= altura / 2;x++){
                    System.out.print("* ");
                }
            }
        }
    }
}