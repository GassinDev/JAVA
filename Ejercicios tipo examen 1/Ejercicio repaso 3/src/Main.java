import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int c,tc;

        System.out.println("Dime el tamaño del camino");
        tc = reader.nextInt();

        for(int i = 0; i < tc;i++){

            c = (int)(Math.random()*5);

            switch (c){

                case 0:{
                    int n;
                    n = (int)(Math.random()*3);

                    switch (n){
                        case 0:{
                            System.out.println(" | $ |");
                        }break;
                        case 1:{
                            System.out.println("  | $ |");
                        }break;
                        case 2:{
                            System.out.println("| $ |");
                        }break;
                    }
                }break;

                case 1:{
                    int n;
                    n = (int)(Math.random()*3);

                    switch (n){
                        case 0:{
                            System.out.println(" |   |");
                        }break;
                        case 1:{
                            System.out.println("  |   |");
                        }break;
                        case 2:{
                            System.out.println("|   |");
                        }break;
                    }
                }break;

                case 2:{
                    int n;
                    n = (int)(Math.random()*3);

                    switch (n){
                        case 0:{
                            System.out.println(" |   |");
                        }break;
                        case 1:{
                            System.out.println("  |   |");
                        }break;
                        case 2:{
                            System.out.println("|   |");
                        }break;
                    }
                }break;

                case 3:{
                    int n;
                    n = (int)(Math.random()*3);

                    switch (n){
                        case 0:{
                            System.out.println(" |   |");
                        }break;
                        case 1:{
                            System.out.println("  |   |");
                        }break;
                        case 2:{
                            System.out.println("|   |");
                        }break;
                    }
                }break;

                case 4:{
                    int n;
                    n = (int)(Math.random()*3);

                    switch (n){
                        case 0:{
                            System.out.println(" |  *|");
                        }break;
                        case 1:{
                            System.out.println("  |  *|");
                        }break;
                        case 2:{
                            System.out.println("|  *|");
                        }break;
                    }
                }break;
                default:
            }
        }
    }
}