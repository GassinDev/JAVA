import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int o = 0,n = 100;

        Disco colecciondisco[]= new Disco[n];

        for(int i = 0; i < n;i++){
            colecciondisco[i] = new Disco();
        }

        colecciondisco[0] = new Disco("1253","Jesús Monje","Vida loca","Rock",4);
        colecciondisco[1] = new Disco("5378","Miguel Molina","La mar","Pop",3);
        colecciondisco[2] = new Disco("9384","Papito","Poco a poco","Reggaeton",2);

        while (o == 0){
            System.out.println("\uD83D\uDCBFMENÚ COLECCIÓN-DISCOS\uD83D\uDCBF");
            System.out.println("-------------------------------");
            System.out.println("1.Listado");
            System.out.println("2.Modificar");
            System.out.println("3.Borrar");
            System.out.println("4.Salir");
            int opcion;
            opcion = reader.nextInt();

            switch (opcion){
                case 1:{
                    for (int i = 0; i < colecciondisco.length;i++){
                        if(dis)
                        System.out.println(colecciondisco[i]);
                    }
                }break;

                case 2:{

                }break;
            }
        }

    }
}