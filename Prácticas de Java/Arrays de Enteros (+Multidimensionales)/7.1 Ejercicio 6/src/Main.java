public class Main {
    public static void main(String[] args) {
        int[][] arraybi = new int[6][10];
        int n,max = 1000,min = 0,maximoi=0,maximoj=0,minimoi=0,minimoj=0;
        boolean r;


        for(int i = 0; i < 6;i++){
            for(int j = 0; j < 10;j++){


                do {


                    arraybi[i][j] = n;

                    r = false;
                    for (i = 0; i < 10 * i + j; i++) {
                        if (arraybi[i][j] == arraybi[i / 10][i % 10]) {
                            r = true;
                        }
                    }
                } while (r);

                if(j % 10 == 0){
                    System.out.println();
                }
                System.out.print(arraybi[i][j] + " ");
                if(arraybi[i][j] < max){
                    max = arraybi[i][j];
                    minimoi = i;
                    minimoj = j;
                }

                if(arraybi[i][j] > min){
                    min = arraybi[i][j];
                    maximoi = i;
                    maximoj = j;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("La posicion del mínimo es [" + minimoi + "][" + minimoj + "]");
        System.out.println("La posicion del máximo es [" + maximoi + "][" + maximoj + "]");
    }
}