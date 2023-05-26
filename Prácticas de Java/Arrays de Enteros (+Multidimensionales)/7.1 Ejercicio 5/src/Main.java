public class Main {
    public static void main(String[] args) {

        int[][] arraybi = new int[6][10];
        int n,max = 1000,min = 0,maximoi=0,maximoj=0,minimoi=0,minimoj=0;

        for(int i = 0; i < 6;i++){
            for(int j = 0; j < 10;j++){

                n = (int)(Math.random()*1001);

                arraybi[i][j] = n;

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