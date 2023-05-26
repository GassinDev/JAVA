import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int opcion = 1;

        while(opcion != 0){

            System.out.println("MENU - Ejercicios Listas");
            System.out.println("---------------------------------");
            System.out.println("1.leeLista");
            System.out.println("2.leeListaN");
            System.out.println("3.escribeLista");
            System.out.println("4.eliminaNegativos");
            System.out.println("5.clasificaNumeros");
            System.out.println("6.eliminaRepetidos");
            System.out.println("7.ordenaListaSeleccion");

            System.out.println("---------------------------------");
            System.out.print("Dime que opción quieres: ");
            opcion = reader.nextInt();

            switch (opcion){
                case 1:{
                    List<Integer> l = new ArrayList<>();
                    leeLista(l);
                }break;

                case 2:{
                    List<Integer> l = new ArrayList<>();
                    leeListaN(l, 10);
                }break;

                case 3:{
                    List<Integer> l = new ArrayList<>();
                    leeListaN(l,5);
                    escribeLista(l);
                }break;

                case 4:{
                    List<Integer> l = new ArrayList<>();
                    leeListaN(l,7);
                    escribeLista(l);
                    eliminaNegativos(l);
                    escribeLista(l);
                }break;

                case 5:{
                    List<Integer> l = new ArrayList<>();
                    List<Integer> l2 = new ArrayList<>();
                    List<Integer> l3 = new ArrayList<>();

                    leeListaN(l,7);
                    escribeLista(l);
                    clasificaNumeros(l,l2,l3);
                    escribeLista(l2);
                    escribeLista(l3);
                }break;

                case 6:{
                    List<Integer> l = new ArrayList<>();
                    leeListaN(l,7);
                    escribeLista(l);
                    eliminaRepetidos(l);
                    escribeLista(l);
                }break;

                case 7:{
                    List<Integer> l = new ArrayList<>();
                    leeListaN(l,7);
                    escribeLista(l);
                    ordenaListaSeleccion(l);
                    escribeLista(l);
                }break;

            }
        }
    }

    public static void leeLista(List<Integer> l){
        Scanner reader = new Scanner(System.in);

        int numero = 0;

        while (numero != -1){

            System.out.println("Dime numeros (si quieres parar introduzca -1): ");
            numero = reader.nextInt();

            if(numero != -1){
                l.add(numero);
            }
        }
    }

    public static void leeListaN(List<Integer> l,int t){
        Scanner reader = new Scanner(System.in);

        int numero;

        for(int i = 0; i < t;i++){

            System.out.println("Dime numeros: ");
            numero = reader.nextInt();
            l.add(numero);
        }
    }

    public static void escribeLista(List<Integer> l){
        System.out.print("<");
        for(int i = 0; i < l.size();i++){
            if(i == l.size() - 1){
                System.out.print(l.get(i));
            }else{
                System.out.print(l.get(i) + ",");
            }

        }
        System.out.println(">\n");
    }

    public static void eliminaNegativos(List<Integer> l){
        for(int i = 0; i < l.size();i++){
            if(l.get(i) < 0){
                l.remove(i);
                i =- 1;
            }
        }
    }

    public static void clasificaNumeros(List<Integer> l,List<Integer> lposi,List<Integer> lnega){
        for(int i = 0; i < l.size();i++){
            if(l.get(i) < 0){
                lnega.add(l.get(i));
                l.remove(i);
                i =- 1;
            }else {
                lposi.add(l.get(i));
                l.remove(i);
                i =- 1;
            }
        }
    }

    public static void eliminaRepetidos(List<Integer> l){

        List<Integer> l2 = new ArrayList<>();

        for(int i = 0; i < l.size();i++){
            if(!l2.contains(l.get(i))){
                l2.add(l.get(i));
            }
        }
        l.clear();
        l.addAll(l2);
    }

    public static void ordenaListaSeleccion(List<Integer> l){

        int min,pos = 0;

        List<Integer> resultado = new ArrayList<>();

        for(int i = 0; i < l.size();i++){
            min = l.get(i);
            for(int x = 0; x < l.size();x++) {
                if (l.get(x) < min) {
                    min = l.get(x);
                    pos = x;
                }
            }
            resultado.add(l.get(pos));
            l.remove(pos);
        }
        l.addAll(resultado);
    }




}