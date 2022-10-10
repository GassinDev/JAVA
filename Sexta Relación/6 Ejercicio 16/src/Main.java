import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int figura;
        String tirada;
        String resul = "", resul1 = "",resul2 = "",resul3 = "";

        System.out.println("Aqui tienes una máquina tragaperra");
        System.out.println("Introduzca 1 para jugar y otro carácter para no jugar");
        tirada = reader.next();

        if(tirada.equals("1")){

            System.out.print("| ");
            for(int i = 0; i < 3;i++){

                figura = (int)(Math.random()*4);
                switch (figura){

                    case 0:{
                        resul = "limón";
                        System.out.print("\uD83C\uDF4B | ");
                    }break;

                    case 1:{
                        resul = "corazón";
                        System.out.print("♥ | ");
                    }break;

                    case 2:{
                        resul = "diamante";
                        System.out.print("\uD83D\uDC8E | ");
                    }break;

                    case 3:{
                        resul = "trebol";
                        System.out.print("\uD83C\uDF40 | ");
                    }break;

                    case 4:{
                        resul = "campana";
                        System.out.print("\uD83D\uDD14 | ");
                    }break;
                }

                if(i == 1){
                    resul1 = resul;
                }else{
                    if(i == 2){
                        resul2 = resul;
                    }else{
                        resul3 = resul;
                    }
                }
            }
            System.out.println("");
            if(resul1 != resul2 & resul2 != resul3 & resul1 != resul3){
                System.out.println("Lo siento, ha perdido");
            }else{
                if(resul1 == resul2 & resul2 == resul3){
                    System.out.println("Enhorabuena, ha ganado 10 monedas");
                }else{
                    System.out.println("Bien, ha recuperado su moneda");
                }
            }

        }else {
            System.out.println("Veo que no le apetece jugar.");
        }

    }
}