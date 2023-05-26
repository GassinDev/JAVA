import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int altura;

        System.out.println("Dime la altura de la U");
        altura = reader.nextInt();

        for(int i = 1; i <= altura;i++){
            System.out.print("*");
            for(int x = 1; x < altura+(altura -2);x++){
                System.out.print(" ");
            }
            System.out.println("*");
            if(altura == i){
                System.out.print(" ");
                for(int y = 0;y < altura - 1;y++){
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
        }
    }
}