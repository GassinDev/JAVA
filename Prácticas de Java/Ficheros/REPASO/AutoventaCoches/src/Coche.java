import java.time.LocalDate;

public class Coche {

    //ATRIBUTOS
    private String matricula;
    private LocalDate fechaMatriculacion;
    private String marca;
    private String modelo;
    private double precio;

    //CONSTRUCTORES

    public Coche(String matricula, LocalDate fechaMatriculacion, String marca, String modelo, double precio){

        if(comprobarMatricula(matricula)){
            this.matricula = matricula;
        }else{
            System.out.println("El coche con matricula " + matricula + " es erroneo." );
        }

        if(LocalDate.now().getYear() > fechaMatriculacion.getYear()) {
            this.fechaMatriculacion = fechaMatriculacion;
        }else {
            System.out.println("La fecha tiene que ser al menos un año más vieja.");
        }

        if(marca != "" && modelo != ""){
            this.marca = marca;
            this.modelo = modelo;
        }else {
            System.out.println("Ni el modelo, ni la marca pueden estar vacíos.");
        }

        if(precio >= 500){
            this.precio = precio;
        }else {
            System.out.println("El precio es incorrecto, debe ser mayor o igual a 500€.");
        }

    }

    //PROPIEDADES

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean comprobarMatricula(String matricula) {

        boolean esCorrecto = true;

        char[] Arraymatricula = matricula.toCharArray();

        if(matricula.length() == 7){

            for (int i = 0; i < 4; i++) {

                if (!Character.isDigit(Arraymatricula[i])) {
                    esCorrecto = false;
                    break;
                }

            }

            for (int i = 4; i < Arraymatricula.length; i++) {

                if (!Character.isLetter(Arraymatricula[i])) {
                    esCorrecto = false;
                    break;
                }

            }
        }else {
            esCorrecto = false;
        }

        return esCorrecto;
    }

    @Override
    public String toString() {
        return matricula +"\t\t"+marca +"\t"+ modelo +"\t"+ fechaMatriculacion +"\t" + precio;
    }
}
