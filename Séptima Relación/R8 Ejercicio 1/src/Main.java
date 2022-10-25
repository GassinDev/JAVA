public class Main {
    public static void main(String[] args) {

        int num[][] = new int[3][6];

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] =75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[0][3] = 9;
        num[2][5] = 11;

        System.out.println("Array num   Columna 0  Columna 1  Columna 2  Columna 3  Columna 4  Columna 5");
        for(int i = 0; i < 3;i++){
            System.out.print("Fila: " + i + "         ");
            for(int j = 0; j < 6;j++){
                System.out.print(num[i][j] + "          ");
            }
            System.out.println();
        }
    }
}