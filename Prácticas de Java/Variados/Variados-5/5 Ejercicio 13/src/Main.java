import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n,i,nNega = 0,nPosi= 0;

        for(i = 0;i < 10;i++){
            System.out.println("Dime 10 números");
            n = reader.nextInt();

            if(n < 0){
                nNega++;
            }else{
                nPosi++;
            }
        }

        System.out.println("Me has dicho " + nPosi + " números positivos y " + nNega + " números negativos");
    }
}