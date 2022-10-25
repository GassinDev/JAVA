public class Main {
    public static void main(String[] args) {

        int n;
        int array[] = new int[20];

        for(int i = 0; i < array.length;i++){

            n = (int) (Math.random()* 101);

            array[i] = n;
        }

        for(int i = 0; i < array.length;i++){

            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }

        for(int i = 0; i < array.length;i++){

            if(array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }

    }
}