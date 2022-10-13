import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int c;

        System.out.println("Dime la opción que quieres");
        System.out.println("----------------------------");
        System.out.println("1. 11 números multiplos de 11");
        System.out.println("2. 17 números multiplos de 11");
        System.out.println("3. 23 números multiplos de 11");
        c = reader.nextInt();




        switch (c){

            case 1:{
                for(int i = 1; i < 100;i++){
                       if(i % 11 == 0){
                           System.out.println(i + " ");
                       }
                }
            }break;

            case 2:{
                for(int i = 1; i < 100;i++){
                    if(i % 17 == 0){
                        System.out.println(i + " ");
                    }
                }
            }break;

            case 3:{
                for(int i = 1; i < 100;i++){
                    if(i % 23 == 0){
                        System.out.println(i + " ");
                    }
                }
            }break;
        }
    }
}