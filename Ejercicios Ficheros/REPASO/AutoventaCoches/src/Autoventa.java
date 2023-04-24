import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Autoventa {

    Scanner reader= new Scanner(System.in);

    //ATRIBUTO
    List<Coche> listaCoches;

    //CONSTRUCTORES

    public Autoventa() {
        listaCoches = new ArrayList<>();
        cargaCSV("coches.csv");
    }

    //METODOS
    public void cargaCSV(String fichero){

        try{
            BufferedReader br = new BufferedReader(new FileReader(fichero));

            String line = "";

            while(line != null){

                line = br.readLine();

                if(line != null) {
                    String[] p = line.split(",");

                    String matricula = p[0];
                    String marca = p[1];
                    String modelo = p[2];
                    LocalDate fecha = LocalDate.parse(p[3]);
                    double precio = Double.parseDouble(p[4]);

                    listaCoches.add(new Coche(matricula,fecha,marca,modelo,precio));
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("error!!" + e.getMessage());
        }
    }

    public void guardaCSV(String fichero){
        try {
            FileWriter fw = new FileWriter(fichero);

            for(Coche c: listaCoches){
                fw.write(c.getMatricula() + "," + c.getMarca() + "," + c.getModelo() + "," + c.getFechaMatriculacion() + "," + c.getPrecio() + "\n");
            }

            fw.close();

        } catch (IOException e) {
            System.out.println("error!!" + e.getMessage());
        }
    }

    public String imprimeListado(){

        String s = "";

        System.out.println("MATRÍCULA\tMARCA\tMODELO\tFECHA MATR.\tPRECIO");

        for(Coche c: listaCoches){
            s += c.toString() + "\n";
        }
        return s;
    }

    public void insertaCoche(){

        String matrícula,marca,modelo;
        LocalDate fecha;
        int precio;

        System.out.println("Dime los datos");
        System.out.print("MATRICULA: ");
        matrícula = reader.nextLine();
        System.out.print("MARCA: ");
        marca = reader.nextLine();
        System.out.print("MODELO: ");
        modelo =reader.nextLine();
        System.out.print("FECHA: ");
        fecha = LocalDate.parse(reader.next());
        System.out.print("PRECIO: ");
        precio = reader.nextInt();

        listaCoches.add(new Coche(matrícula,fecha,modelo,marca,precio));

        guardaCSV("coches.csv");
    }

    public Coche buscaCoches(){

        String matricula;

        Coche e = null;

        System.out.print("Dime la matrícula del coche:");
        matricula = reader.nextLine();

        for(Coche c: listaCoches){

            if(c.getMatricula().equals(matricula)){
                e = c;
            }
        }
        return e;
    }
}

