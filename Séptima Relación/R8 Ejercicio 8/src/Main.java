import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int array[] = new int[12];
        int contmes = 0,temp,naste = 0;
        String mes = "";

        for(int i = 0; i < array.length;i++){

            switch (contmes){
                case 0:{
                    mes = "Enero";
                }break;
                case 1:{
                    mes = "Febrero";
                }break;
                case 2:{
                    mes = "Marzo";
                }break;
                case 3:{
                    mes = "Abril";
                }break;
                case 4:{
                    mes = "Mayo";
                }break;
                case 5:{
                    mes = "Junio";
                }break;
                case 6:{
                    mes = "Julio";
                }break;
                case 7:{
                    mes = "Agosto";
                }break;
                case 8:{
                    mes = "Septiembre";
                }break;
                case 9:{
                    mes = "Octubre";
                }break;
                case 10:{
                    mes = "Noviembre";
                }break;
                case 11:{
                    mes = "Diciembre";
                }break;
                default:
            }
            System.out.println("Dime la temperatura en " + mes);
            temp = reader.nextInt();
            contmes++;

            array[i] = temp;
        }

        contmes = 0;

        for(int i = 0; i < array.length;i++){

            switch (contmes){
                case 0:{
                    mes = "Enero";
                    naste = array[0];
                }break;
                case 1:{
                    mes = "Febrero";
                    naste = array[1];
                }break;
                case 2:{
                    mes = "Marzo";
                    naste = array[2];
                }break;
                case 3:{
                    mes = "Abril";
                    naste = array[3];
                }break;
                case 4:{
                    mes = "Mayo";
                    naste = array[4];
                }break;
                case 5:{
                    mes = "Junio";
                    naste = array[5];
                }break;
                case 6:{
                    mes = "Julio";
                    naste = array[6];
                }break;
                case 7:{
                    mes = "Agosto";
                    naste = array[7];
                }break;
                case 8:{
                    mes = "Septiembre";
                    naste = array[8];
                }break;
                case 9:{
                    mes = "Octubre";
                    naste = array[9];
                }break;
                case 10:{
                    mes = "Noviembre";
                    naste = array[10];
                }break;
                case 11:{
                    mes = "Diciembre";
                    naste = array[11];
                }break;
                default:
            }
            System.out.print(mes + ": ");
            contmes++;
            for(int y = 0; y < naste;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}