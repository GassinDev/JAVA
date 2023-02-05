import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int opcion = 0, n = 100,o;
        String codigo,descripcion;
        double preciocompra,precioventa;
        int stock,cantidad;

        Articulo almacen [] = new Articulo[n];

        for(int i = 0; i < n;i++){
            almacen[i] = new Articulo();
        }


        almacen[0] = new Articulo("4221","Destornillador de punta estrelleda",0.7,1.7,10);
        almacen[1] = new Articulo("2342","Manta eléctrica portatil",2,7.4,5);
        almacen[2] = new Articulo("4253","Nintendo 64",12,78,2);


        while(opcion == 0){

            System.out.println(" MENU DE ALMACÉN");
            System.out.println("-----------------");
            System.out.println("1.Listado");
            System.out.println("2.Baja");
            System.out.println("3.Alta");
            System.out.println("4.Modificación");
            System.out.println("5.Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Que opcion quieres:");
            o = reader.nextInt();

            switch (o){
                case 1:{
                    for (Articulo x:almacen){
                        if(!x.getCodigo().equals("Vacio")){
                            System.out.println(x);
                        }
                    }
                }break;

                case 2:{
                    System.out.print("Dime el código del producto que quieres dar de baja:");
                    codigo = reader.next();

                    for(Articulo x:almacen){
                        if(x.getCodigo().equals(codigo)){
                            x.setCodigo("Vacio");
                            System.out.println("¡Artículo dado de Baja!" + "\n");
                        }
                    }
                }break;

                case 3:{
                    System.out.println("Añadiendo nuevo Artículo...");
                    System.out.print("Codigo:");
                    codigo = reader.next();
                    System.out.print("Descripcion:");
                    reader.nextLine();
                    descripcion = reader.nextLine();
                    System.out.print("Precio Compra:");
                    preciocompra = reader.nextDouble();
                    System.out.print("Precio Venta:");
                    precioventa = reader.nextDouble();
                    System.out.print("Stock:");
                    stock = reader.nextInt();

                    for(int i = 0; i < n;i++){
                        if(almacen[i].getCodigo().equals("Vacio")){
                            almacen[i] = new Articulo(codigo,descripcion,preciocompra,precioventa,stock);
                            System.out.println("Producto añadido con éxito" + "\n");
                            break;
                        }
                    }
                }break;

                case 4:{
                    System.out.print("Dime el codigo de el articulo que quieres modificar:");
                    codigo = reader.next();
                    for(Articulo x:almacen){
                        if(x.getCodigo().equals(codigo)){

                            System.out.print("Descripcion:");
                            reader.nextLine();
                            descripcion = reader.nextLine();
                            System.out.print("Precio Compra:");
                            preciocompra = reader.nextDouble();
                            System.out.print("Precio Venta:");
                            precioventa = reader.nextDouble();
                            System.out.print("Stock:");
                            stock = reader.nextInt();

                            x.setDescripcion(descripcion);
                            x.setPreciocompra(preciocompra);
                            x.setPrecioventa(precioventa);
                            x.setStock(stock);
                            System.out.println("Modificacion realizada con éxito" + "\n");
                        }
                    }

                }break;

                case 5:{
                    System.out.println("Recibiendo entrada de mercancia");
                    System.out.print("Que árticulo ha llegado al almacén(codigo):");
                    codigo = reader.next();
                    System.out.print("Dime la cantidad que ha llegado:");
                    cantidad = reader.nextInt();

                    for(Articulo x:almacen){
                        if(x.getCodigo().equals(codigo)){
                            x.setStock(x.getStock() + cantidad);
                        }
                    }
                    System.out.println("Repuesto de stock realizado." + "\n");
                }break;

                case 6:{
                    System.out.println("Salida de mercancia");
                    System.out.print("Que árticulo va a salir del almacén(codigo):");
                    codigo = reader.next();
                    System.out.print("Dime la cantidad que saldrá:");
                    cantidad = reader.nextInt();

                    for(Articulo x:almacen){
                        if(x.getCodigo().equals(codigo)){
                            while(cantidad > x.getStock()){
                                System.out.print("Porfavor introduzca una cantidad que no sea " +
                                        "mayor a la actual del almacen de dicho articulo:");
                                cantidad = reader.nextInt();
                            }
                            x.setStock(x.getStock() - cantidad);
                        }
                    }
                    System.out.println("Los articulos salieron del almacén." + "\n");

                }break;

                case 7:{
                    opcion++;
                }break;
            }
        }
    }
}