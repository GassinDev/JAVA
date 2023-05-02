
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Company {

    //ATRIBUTOS
    ArrayList<Employee> listaEmpleados;

    //CONSTRUCTOR
    public Company(String fichero) {
        listaEmpleados = new ArrayList<>();
            leeCSV(fichero);
    }

    //METODOS
    public void leeCSV(String fichero) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));

            String line = "";

            while (line != null) {

                line = br.readLine();

                if (line != null) {
                    String[] p = line.split(",");

                    int id = Integer.parseInt(p[0]);
                    String name = p[1];
                    String phone = p[2];
                    double salary = Double.parseDouble(p[3]);


                    listaEmpleados.add(new Employee(id, name, phone, salary));
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("error!!" + e.getMessage());
        }
    }

    public void save(String fichero){
        try {
            FileWriter fw = new FileWriter(fichero);

            for(Employee e: listaEmpleados){
                fw.write(e.getId() + "," + e.getName() + "," + e.getPhone() + "," + e.getSalary() + "\n");
            }

            fw.close();

        } catch (IOException e) {
            System.out.println("error!!" + e.getMessage());
        }
    }

    public String mostrarEmpleados(){

        String s = "";

        for (Employee e: listaEmpleados){

            s += e.toStringSimple() + "\n";
        }

        return s;
    }

    public void create(String name,String phone, double salary){

        int id = 0,cont = 1;

        while(cont == 1){

            cont = 0;
            id = (int)(Math.random()*1000);

            for(Employee e: listaEmpleados){
                if(id == e.getId()){
                    cont = 1;
                    break;
                }
            }

        }

        listaEmpleados.add(new Employee(id,name,phone,salary));
    }

    public void delete(int id){
        listaEmpleados.removeIf(e -> Objects.equals(id, e.getId()));
    }

    public void delete(String name){

        for(Employee e: listaEmpleados){
            if(Objects.equals(name, e.getName())){
                listaEmpleados.remove(e);
                break;
            }
        }
    }

    public Employee read(int id){

        Employee a = null;

        for(Employee e: listaEmpleados){
            if(e.getId() == id){
                a = e;
            }
        }

        return a;
    }

    public Employee read(String name){

        Employee a = null;

        for(Employee e: listaEmpleados){
            if(Objects.equals(e.getName(), name)){
                a = e;
            }
        }

        return a;
    }

    public void updateName(int id, String newName){

        for(Employee e: listaEmpleados){
            if(id == e.getId()){
                e.setName(newName);
            }
        }
    }

    public void updateName(String name, String newName){

        for(Employee e: listaEmpleados){
            if(Objects.equals(name, e.getName())){
                e.setName(newName);
            }
        }
    }

    public void updatePhone(int id, String newPhone){

        for(Employee e: listaEmpleados){
            if(id == e.getId()){
                e.setPhone(newPhone);
            }
        }
    }

    public void updatePhone(String name, String newPhone){

        for(Employee e: listaEmpleados){
            if(Objects.equals(name, e.getName())){
                e.setPhone(newPhone);
            }
        }
    }

    public boolean esString(String dato,int dato2){

        char[] arrayDato = dato.toCharArray();

        if(Character.isDigit(arrayDato[0])){
            return false;
        }else {
            return true;
        }

    }

}

