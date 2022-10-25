import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n,elegir,minimo = 0,maximo = 500;
        int array[] = new int[100];

        for(int i = 0; i < array.length;i++){
            n = (int)(Math.random()* 501);

            array[i] = n;

            System.out.print(array[i] + " ");
            if(i == 20){
                System.out.println();
                System.out.print(array[i] + " ");
            } else if (i== 40) {
                System.out.println();
                System.out.print(array[i] + " ");
            } else if (i == 60) {
                System.out.println();
                System.out.print(array[i] + " ");
            } else if (i == 80) {
                System.out.println();
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
        System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        elegir = reader.nextInt();

        minimo = array[0];
        maximo = array[0];

        switch (elegir){
            case 1:{
                for(int i = 0; i < array.length;i++){
                    if(array[i] < minimo){
                        minimo = array[i];
                    }
                }

                for(int i = 0; i < array.length;i++){

                    if(array[i] == minimo){
                        System.out.print(" *" + array[i] + "* ");
                    }else{
                        System.out.print(array[i] + " ");
                        if(i == 20){
                            System.out.println();
                            System.out.print(array[i] + " ");
                        } else if (i== 40) {
                            System.out.println();
                            System.out.print(array[i] + " ");
                        } else if (i == 60) {
                            System.out.println();
                            System.out.print(array[i] + " ");
                        } else if (i == 80) {
                            System.out.println();
                            System.out.print(array[i] + " ");
                        }
                    }

                }
            }break;

            case 2:{
                for(int i = 0; i < array.length;i++){
                    if(array[i] > maximo){
                        maximo = array[i];
                    }
                }

                for(int i = 0; i < array.length;i++){

                    if(array[i] == maximo){
                        System.out.print(" *" + array[i] + "* ");
                    }else{
                        System.out.print(array[i] + " ");
                        if(i == 20){
                            System.out.println();
                            System.out.print(array[i] + " ");
                        } else if (i== 40) {
                            System.out.println();
                            System.out.print(array[i] + " ");
                        } else if (i == 60) {
                            System.out.println();
                            System.out.print(array[i] + " ");
                        } else if (i == 80) {
                            System.out.println();
                            System.out.print(array[i] + " ");
                        }
                    }

                }
            }break;

        }



    }
}