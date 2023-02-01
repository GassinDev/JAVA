import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int o = 0,n = 100,cont = 0,cont2 = 0;

        String codigo,autor,titulo,genero;
        int duracion;

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
            System.out.println("2.Nuevo");
            System.out.println("3.Modificar");
            System.out.println("4.Borrar");
            System.out.println("5.Salir");

            int opcion;
            System.out.print("Dime que opcion quieres:");
            opcion = reader.nextInt();

            switch (opcion){
                case 1:{
                    for(Disco d : colecciondisco) {
                        if (!d.getCodigo().equals("LIBRE")) {
                            System.out.println(d);
                        }
                    }
                }break;

                case 2:{

                    for (Disco d:colecciondisco){
                        if(!d.getCodigo().equals("LIBRE")){
                            cont2++;
                        }
                    }
                    System.out.println(o);
                    if(cont2 >= 99){
                        System.out.println(o);
                    }
                    System.out.println("Creando nuevo disco");
                    System.out.print("Titulo:");
                    titulo = reader.next();
                    System.out.print("Autor:");
                    autor = reader.next();
                    System.out.print("Género:");
                    genero = reader.next();
                    System.out.print("Código:");
                    codigo = reader.next();
                    System.out.print("Duración:");
                    duracion = reader.nextInt();

                    for(Disco d : colecciondisco) {
                        if (!d.getCodigo().equals("LIBRE")) {
                            cont++;
                        }
                    }
                    colecciondisco[cont] = new Disco(codigo,autor,titulo,genero,duracion);
                    System.out.println("!Nuevo disco añadido¡");
                }break;

                case 3:{

                    System.out.print("Dime el código del disco que quieres:");
                    codigo = reader.next();

                    for (Disco d:colecciondisco){
                        if(d.getCodigo().equals(codigo)){

                            System.out.println("Modificando disco seleccionado");
                            System.out.print("Nuevo Titulo:");
                            titulo = reader.next();
                            System.out.print("Nuevo Autor:");
                            autor = reader.next();
                            System.out.print("Nuevo Género:");
                            genero = reader.next();
                            System.out.print("Nuevo Código:");
                            codigo = reader.next();
                            System.out.print("Nuevo Duración:");
                            duracion = reader.nextInt();

                            d.setCodigo(codigo);
                            d.setAutor(autor);
                            d.setDuracion(duracion);
                            d.setGenero(genero);
                            d.setTitulo(titulo);

                            System.out.println("Disco Modificado con éxito");
                        }
                    }
                }break;

                case 4:{
                    System.out.print("Dime el código del disco que quieres:");
                    codigo = reader.next();

                    for (Disco d:colecciondisco){
                        if(d.getCodigo().equals(codigo)){
                            d.setCodigo("LIBRE");
                        }
                    }
                }break;

                case 5:{
                    o++;
                }break;
            }
        }

    }
}