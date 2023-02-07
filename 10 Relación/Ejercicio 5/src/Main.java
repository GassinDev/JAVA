import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int o = 0,n = 100,cont = 0,cont2 = 0,d1 = 0,d2 = 0;

        String codigo,autor,titulo,genero;
        int duracion;

        ArrayList<Disco> colecciondisco = new ArrayList<>(n);

        for(int i = 0; i < n;i++){
            colecciondisco.add(new Disco());
        }


        colecciondisco.add(new Disco("1253","Jesús Monje","Vida loca","Rock",4));
        colecciondisco.add(new Disco("5378","Miguel Molina","La mar","Pop",3));
        colecciondisco.add(new Disco("3242","Miguel Molina","Manuela","Pop",6));
        colecciondisco.add(new Disco("5235","Joselito","Leire","Pop",2));
        colecciondisco.add(new Disco("4532","Miguel Molina","Lomes","Reggaeton",10));
        colecciondisco.add(new Disco("9643","Perez","Dura carrera","Pop",8));
        colecciondisco.add(new Disco("9384","Papito","Poco a poco","Reggaeton",2));

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
                    int op;

                    System.out.println(" Modos de lectura");
                    System.out.println("-------------------");
                    System.out.println("1.Completa");
                    System.out.println("2.Por Autor");
                    System.out.println("3.Por Duración");
                    System.out.println("4.Por Género");
                    System.out.print("Dime cual quieres:");
                    op = reader.nextInt();

                    switch (op){
                        case 1:{
                            for (Disco d:colecciondisco){
                                if(!d.getCodigo().equals("LIBRE")){
                                    System.out.println(d);
                                }
                            }
                        }break;

                        case 2:{

                            System.out.print("Dime el autor:");
                            reader.nextLine();
                            autor = reader.nextLine();

                            for(Disco d:colecciondisco){
                                if(autor.equals(d.getAutor())){
                                    System.out.println(d);
                                }
                            }
                        }break;

                        case 3:{
                            System.out.println("Dime el intervalo de tiempo de duración");
                            System.out.print("Primer tiempo:");
                            d1 = reader.nextInt();
                            System.out.print("Segundo tiempo:");
                            d2 = reader.nextInt();

                            for(Disco d:colecciondisco){
                                if(d.getDuracion() >= d1 && d.getDuracion() <= d2){
                                    System.out.println(d);
                                }
                            }

                        }break;

                        case 4:{
                            System.out.print("Dime el género:");
                            reader.nextLine();
                            genero = reader.nextLine();

                            for(Disco d:colecciondisco){
                                if(genero.equals(d.getGenero())){
                                    System.out.println(d);
                                }
                            }
                        }break;

                    }

                }break;

                case 2:{

                    for (Disco d:colecciondisco){
                        if(!d.getCodigo().equals("LIBRE")){
                            cont2++;
                        }
                    }

                    if(cont2 < 100){

                        System.out.println("Creando nuevo disco");
                        System.out.print("Titulo:");
                        titulo = reader.next();
                        System.out.print("Autor:");
                        autor = reader.next();
                        System.out.print("Género:");
                        genero = reader.next();
                        System.out.print("Código:");
                        codigo = reader.next();

                        for(Disco d:colecciondisco){
                            while (d.getCodigo().equals(codigo)){
                                System.out.println("Ese código esta ya asignado a otro disco elija un nuevo código:");
                                codigo = reader.next();
                            }
                        }
                        System.out.print("Duración:");
                        duracion = reader.nextInt();

                        colecciondisco.add(new Disco(codigo,titulo,autor,genero,duracion));
                        System.out.println("Disco añadido con éxito");

                    }else{
                        System.out.print("Lo siento pero esta llena la colección\n");
                    }

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
                            System.out.print("Nuevo Duración:");
                            duracion = reader.nextInt();

                            d.setAutor(autor);
                            d.setDuracion(duracion);
                            d.setGenero(genero);
                            d.setTitulo(titulo);

                            System.out.println("Disco Modificado con éxito");
                        }
                    }
                }break;

                case 4:{

                    int a = 0;

                    System.out.print("Dime el código del disco que quieres:");
                    codigo = reader.next();

                    while (a == 0){

                        for (Disco d:colecciondisco){
                            if(d.getCodigo().equals(codigo)){
                                a++;
                                System.out.println("Voy a borrar " + d.getCodigo() + a);
                                colecciondisco.remove(d);

                            }

                        }

                        if(a == 0){
                            System.out.print("Código no encontrado repita el código:");
                            codigo = reader.next();
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