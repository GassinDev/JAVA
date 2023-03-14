import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria {

    //ATRIBUTOS
    List<Animal> listaAnimales = new ArrayList<>();

    //CONSTRUCTOR
    public ClinicaVeterinaria()
    {
        listaAnimales = new ArrayList<>();
    }

    //METODOS
    public void insertarAnimal(Animal a)
    {
        listaAnimales.add(a);
    }

    public Animal buscaAnimal(String nombre) throws Exception {
        Animal a = null;

        for (int i = 0; i < listaAnimales.size(); i++)
        {
            a = listaAnimales.get(i);

            if (a.nombre == nombre)
            {
                i = listaAnimales.size();
            }
        }

        if (a != null)
        {
            return a;
        }
        else
        {
            throw new Exception("Ningún animal tiene ese nombre");
        }
    }

    public void modificaComentarioAnimal (String nombre, String comentario) throws Exception {
        Animal a = buscaAnimal(nombre);

        a.comentarios = comentario;
    }

    //TOSTRING
    @Override
    public String toString() {
        return listaAnimales.toString();
    }
}
