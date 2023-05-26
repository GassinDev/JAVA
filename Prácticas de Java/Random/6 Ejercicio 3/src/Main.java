public class Main {
    public static void main(String[] args) {

        int p,n;

        String palo = "",numero = "";

        p = (int)(Math.random()*4);
        n = (int)(Math.random()*10);

        switch (p){

            case 0:{
                palo = "Bastos";
            }break;

            case 1:{
                palo = "Espadas";
            }break;

            case 2:{
                palo = "Oros";
            }break;

            case 3:{
                palo = "Copas";
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
                numero = "sota";
            }break;

            case 8:{
                numero = "caballo";
            }break;

            case 9:{
                numero = "rey";
            }break;
        }
        System.out.println(numero + " de " + palo);
    }
}