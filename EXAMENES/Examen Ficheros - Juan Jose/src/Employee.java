import java.util.Random;

public class Employee {

    //ATRIBUTOS
    int id;
    String name;
    String phone;
    double salary;

    //CONSTRUCTOR
    public Employee(int id, String name, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.phone = "011223344";
        this.salary = 999.0;
    }

    public Employee(String name, String phone, double salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.id = id;
    }

    //METODOS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nombre:" + name + " | Id:" + id + " | Teléfono:" + phone + " | Salario:" + salary;
    }

    public String toStringSimple(){
        return "Nombre:" + name + " | Id:" + id;
    }
}
