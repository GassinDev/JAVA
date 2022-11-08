import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] n = new int[12][12];
        int capa,i,j,a1,a2;
        String cyan = "\u001B[36m";
        String yellow = "\u001B[33m";

        System.out.println(yellow + "Array original");
        System.out.println("----------------------------------------------------------------");

        for(i = 0; i < 12; i++) {
            for(j = 0; j < 12; j++) {
                n[i][j] = (int)(Math.random()*101);
                System.out.print(cyan);
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }

        for(capa = 0; capa < 6; capa++) {

            //p-a
            a1 = n[capa][11 - capa];
            for (i = 11 - capa; i > capa; i--) {
                n[capa][i] = n[capa][i - 1];
            }

            // p-d
            a2 = n[11 - capa][11 - capa];
            for (i = 11 - capa; i > capa + 1; i--) {
                n[i][11 - capa] = n[i - 1][11 - capa];
            }
            n[capa + 1][11 - capa] = a1;

            //p-a
            a1 = n[11 - capa][capa];
            for (i = capa; i < 11 - capa - 1; i++) {
                n[11 - capa][i] = n[11 - capa][i + 1];
            }
            n[11 - capa][11 - capa - 1] = a2;

            // p-i
            for (i = capa; i < 11 - capa - 1; i++) {
                n[i][capa] = n[i + 1][capa];
            }
            n[11 - capa - 1][capa] = a1;

        }
        System.out.println();
        System.out.println();

        System.out.println(yellow + "Array rotado en el sentido de las agujas del reloj");
        System.out.println("----------------------------------------------------------------");

        for(i = 0; i < 12; i++) {
            for(j = 0; j < 12; j++) {
                System.out.print(cyan);
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }
    }
}