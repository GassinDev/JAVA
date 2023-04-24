import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Coleccion c = new Coleccion();

        int opcion = -1;

        while(opcion != 0){

            System.out.println("Menú de colección");
            System.out.println("---------------------------");
            System.out.println("1) Lista coleccion.");


            System.out.print("Elije tu ópcion:");
            opcion = reader.nextInt();

            switch (opcion){
                case 1:{
                    System.out.println();
                    System.out.println(c.toString());
                }break;
                case 2:{
                    Videojuegos v;

                    String nombre;
                    int anno,valoracion = 0,o;
                    Plataforma plataforma = null;
                    TipoJuego tipojuego = null;

                    System.out.print("Nombre: ");
                    nombre = reader.next();
                    System.out.print("Año: ");
                    anno = reader.nextInt();
                    System.out.print("Plataforma (1)PS4 (2)XBOXONE (3)PC (4)SWITCH: ");
                    o = reader.nextInt();

                    switch (o){
                        case 1:{
                            plataforma = Plataforma.PlayStation4;
                        }break;
                        case 2:{
                            plataforma = Plataforma.XboxOne;
                        }break;
                        case 3:{
                            plataforma = Plataforma.PC;
                        }break;
                        case 4:{
                            plataforma = Plataforma.Switch;
                        }break;
                    }

                    System.out.print("Videojuegos (1)Aventura (2)Accion (3)Rol: ");
                    o = reader.nextInt();

                    switch (o){
                        case 1:{
                            tipojuego = TipoJuego.Aventura;
                        }break;
                        case 2:{
                            tipojuego = TipoJuego.Accion;
                        }break;
                        case 3:{
                            tipojuego = TipoJuego.Rol;
                        }break;
                    }

                    System.out.print("Valoracion: ");
                    valoracion = reader.nextInt();

                    v = new Videojuegos(nombre,anno,plataforma,tipojuego,valoracion);

                    c.insertaVideojuegos(v);
                }break;
            }
        }
    }
}