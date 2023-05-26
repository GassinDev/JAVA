import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contant = 0,n = 0;

        while (contant < 10){

            if(n % 2 != 0 & n % 3 != 0){
                System.out.println(n + " ");
                n++;
                contant++;
            }else{
                n++;
            }
        }
    }
}