public class Main {
    public static void main(String[] args) {
        int p,n;

        String palo = "",numero = "";

        p = (int)(Math.random()*4);
        n = (int)(Math.random()*13);

        switch (p){

            case 0:{
                palo = "Picas";
            }break;

            case 1:{
                palo = "Corazones";
            }break;

            case 2:{
                palo = "Diamantes";
            }break;

            case 3:{
                palo = "Tréboles";
            }break;
        }

        switch (n){

            case 0:{
                numero = "as";
            }break;

            case 1:{
                numero = "2";
            }break;

            case 2:{
                numero = "3";
            }break;

            case 3:{
                numero = "4";
            }break;

            case 4:{
                numero = "5";
            }break;

            case 5:{
                numero = "6";
            }break;

            case 6:{
                numero = "7";
            }break;

            case 7:{
                numero = "8";
            }break;

            case 8:{
                numero = "9";
            }break;

            case 9:{
                numero = "10";
            }break;

            case 10:{
                numero = "J";
            }break;

            case 11:{
                numero = "Q";
            }break;

            case 12:{
                numero = "K";
            }break;
        }
        System.out.println(numero + " de " + palo);
    }
}