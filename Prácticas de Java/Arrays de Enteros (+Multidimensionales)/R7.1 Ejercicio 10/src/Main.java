import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int ji,jj,raya = 9;
        boolean  ganar = false;

        System.out.println("Tres en raya");
        System.out.println();
        String[][] array = new String[3][3];


        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array.length;j++){
                array[i][j] = "*";
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        while(!ganar){

            System.out.println("Dime la posicion que quieres colocar jugador 1 (Primero vertical y despues horizontal");
            ji = reader.nextInt();
            jj = reader.nextInt();

            if(array[ji][jj].equals("*")){
                array[ji][jj] = "X";
            }else {
                while(!array[ji][jj].equals("*")){
                    System.out.println("Esa posicion esta ya ocupada");
                    System.out.println("Dime la posicion que quieres colocar jugador 1 (Primero vertical y despues horizontal");
                    ji = reader.nextInt();
                    jj = reader.nextInt();

                    if(array[ji][jj].equals("*")){
                        array[ji][jj] = "X";
                        break;
                    }
                }
            }

            if(rayaTres(array,ganar)){
                for(int i = 0; i < array.length;i++){
                    for(int j = 0; j < array.length;j++){
                        System.out.print(array[i][j] + "  ");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("El ganador es el jugador 1");
                break;
            }

            for(int i = 0; i < array.length;i++){
                for(int j = 0; j < array.length;j++){
                    System.out.print(array[i][j] + "  ");
                }
                System.out.println();
            }

            System.out.println("Dime la posicion que quieres colocar jugador 2 (Primero vertical y despues horizontal)");
            ji = reader.nextInt();
            jj = reader.nextInt();

            if(array[ji][jj].equals("*")){
                array[ji][jj] = "O";
            }else {
                while(!array[ji][jj].equals("*")){
                    System.out.println("Esa posicion esta ya ocupada");
                    System.out.println("Dime la posicion que quieres colocar jugador 2 (Primero vertical y despues horizontal");
                    ji = reader.nextInt();
                    jj = reader.nextInt();

                    if(array[ji][jj].equals("*")){
                        array[ji][jj] = "O";
                        break;
                    }
                }
            }

            for(int i = 0; i < array.length;i++){
                for(int j = 0; j < array.length;j++){
                    System.out.print(array[i][j] + "  ");
                }
                System.out.println();
            }

            raya--;
            if(raya == 0){

                for(int i = 0; i < array.length;i++){
                    for(int j = 0; j < array.length;j++){
                        System.out.print(array[i][j] + "  ");
                    }
                    System.out.println();
                }
                System.out.println("EMPATE");
                break;
            }

            if(rayaTres(array,ganar)){
                for(int i = 0; i < array.length;i++){
                    for(int j = 0; j < array.length;j++){
                        System.out.print(array[i][j] + "  ");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("El ganador es el jugador 2");
                break;
            }
            raya--;
        }
    }

    public static boolean rayaTres(String[][] array,boolean ganar){


        if(array[0][0].equals("X") && array[0][0].equals(array[0][1]) && array[0][0].equals(array[0][2])){
            ganar = true;
        } else if (array[1][0].equals("X") && array[1][0].equals(array[1][1]) && array[1][0].equals(array[1][2])) {
            ganar = true;
        }else if(array[2][0].equals("X") && array[2][0].equals(array[2][1]) && array[2][0].equals(array[2][2])){
            ganar = true;
        } else if (array[0][0].equals("X") && array[0][0].equals(array[1][0]) && array[2][0].equals(array[0][2])) {
            ganar = true;
        } else if (array[0][0].equals("X") && array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])) {
            ganar = true;
        }else if (array[0][2].equals("X") && array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])){
            ganar = true;
        }else if (array[0][1].equals("X") && array[0][1].equals(array[1][1]) && array[0][1].equals(array[2][1])){
            ganar = true;
        } else if (array[0][2].equals("X") && array[0][2].equals(array[1][2]) && array[0][2].equals(array[2][2])){
            ganar = true;
        }

        if(array[0][0].equals("O") && array[0][0].equals(array[0][1]) && array[0][0].equals(array[0][2])){
            ganar = true;
        } else if (array[1][0].equals("O") && array[1][0].equals(array[1][1]) && array[1][0].equals(array[1][2])) {
            ganar = true;
        }else if(array[2][0].equals("O") && array[2][0].equals(array[2][1]) && array[2][0].equals(array[2][2])){
            ganar = true;
        } else if (array[0][0].equals("O") && array[0][0].equals(array[1][0]) && array[2][0].equals(array[0][2])) {
            ganar = true;
        } else if (array[0][0].equals("O") && array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])) {
            ganar = true;
        }else if (array[0][2].equals("O") && array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0])){
            ganar = true;
        }else if (array[0][1].equals("O") && array[0][1].equals(array[1][1]) && array[0][1].equals(array[2][1])){
            ganar = true;
        } else if (array[0][2].equals("O") && array[0][2].equals(array[1][2]) && array[0][2].equals(array[2][2])){
            ganar = true;
        }

        return ganar;
    }


}