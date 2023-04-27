import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Company c = new Company("datos.csv");
        int opcion = -1;

        while(opcion != 0){

            System.out.println("Menú de la Compañía");
            System.out.println("----------------------------------------------------------");
            System.out.println("1) Mostrar el nombre de los empleados de la empresa.");
            System.out.println("2) Consultar información de un empleado.");
            System.out.println("3) Crear empleado con id autogenerada.");
            System.out.println("4) Eliminar empleado.");
            System.out.println("5) Actualizar el nombre de un empleado.");
            System.out.println("6) Actualizar el teléfono de un empleado.");
            System.out.println("7) Salvar los cambios en un fichero especificado dado.");
            System.out.println("----------------------------------------------------------");
            System.out.print("Elije tu opción:");
            opcion = reader.nextInt();

            switch (opcion){
                case 1:{
                    System.out.println(c.mostrarEmpleados());
                }break;

                case 2:{
                    String dato;
                    int dato2;

                    System.out.print("Dime el nombre o el id del empleado:");
                    dato = reader.next();

                    char[] arrayDato = dato.toCharArray();

                    if(Character.isDigit(arrayDato[0])){
                        dato2 = Integer.parseInt(String.valueOf(dato));
                        System.out.println(c.read(dato2) + "\n");
                    }else {
                        System.out.println(c.read(dato)+ "\n");
                    }

                }break;

                case 3:{
                    String name;
                    String phone;
                    double salary;

                    System.out.println("\n");
                    System.out.println("Añadiendo nuevo empleado...");
                    System.out.print("Nombre:");
                    name = reader.next();
                    System.out.print("Teléfono:");
                    phone = reader.next();
                    System.out.print("Salario:");
                    salary = reader.nextDouble();

                    c.create(name,phone,salary);
                    System.out.println("Empleado añadido correctamente.\n");
                }break;

                case 4:{
                    String dato;
                    int dato2 = 0;

                    System.out.print("Dime el nombre o el id del empleado:");
                    dato = reader.next();


                    if(c.esString(dato,dato2)){
                        c.delete(dato);
                    }else {
                        dato2 = Integer.parseInt(String.valueOf(dato));
                        c.delete(dato2);
                    }
                }break;

                case 5:{
                    String dato;
                    int dato2 = 0;
                    String newName;

                    System.out.print("Dime el nombre o id del empleado que quieres cambiar su nombre:");
                    dato = reader.next();
                    System.out.print("Nuevo nombre:");
                    newName = reader.next();

                    if(c.esString(dato,dato2)){
                        c.updateName(dato,newName);
                    }else {
                        dato2 = Integer.parseInt(String.valueOf(dato));
                        c.updateName(dato2,newName);
                    }

                }break;

                case 6:{
                    String dato;
                    int dato2 = 0;
                    String newPhone;

                    System.out.print("Dime el nombre o id del empleado que quieres cambiar su teléfono:");
                    dato = reader.next();
                    System.out.print("Nuevo telefono:");
                    newPhone = reader.next();

                    if(c.esString(dato,dato2)){
                        c.updatePhone(dato,newPhone);
                    }else {
                        dato2 = Integer.parseInt(String.valueOf(dato));
                        c.updatePhone(dato2,newPhone);
                    }


                }break;

                case 7:{
                    String nombreFichero;

                    System.out.print("Dime el nombre del fichero con su extensión donde quieres guardar los datos: ");
                    nombreFichero = reader.next();

                    c.save(nombreFichero);
                }
            }
        }
    }



}