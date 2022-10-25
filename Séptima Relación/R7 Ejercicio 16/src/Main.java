import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int array[] = new int[20];
        int n,s = 0;

        for(int i = 0; i < array.length;i++){

            n = (int)(Math.random()* 401);

            array[i] = n;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7):");
        s = reader.nextInt();

        switch (s){

            case 1:{
                for(int i = 0; i < array.length;i++){

                    if(array[i] % 5 == 0){
                        System.out.print(" [" + array[i] + "] ");
                    }else{
                        System.out.print(array[i] + " ");
                    }
                }
            }break;

            case 2:{
                for(int i = 0; i < array.length;i++){

                    if(array[i] % 7 == 0){
                        System.out.print(" [" + array[i] + "] ");
                    }else{
                        System.out.print(array[i] + " ");
                    }
                }
            }break;
            default:
        }

    }
}