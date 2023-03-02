public class Carta {

    enum TipoPalo
    {
        Bastos, Copas, Oro, Espadas
    }

    //ATRIBUTOS

    int numero;
    TipoPalo palo;

    //CONSTRUCTOR


    public Carta(int numero, TipoPalo palo) throws Exception {

        if (numero >= 1 && numero <= 10 && numero != 8 && numero != 9)
        {
            this.numero = numero;
        }
        else
        {
            throw new Exception("La carta no puede ser menor de 1 ni mayor de 12, ni tampoco 8 y 9");
        }

        this.palo = palo;
    }

    public Carta(int id) throws Exception {

        if(id >= 1 && id <= 40)
        {
            if(id >= 1 && id <= 10)
            {
                if(id <= 7)
                {
                    numero = id;
                }
                else
                {
                    numero = (id) + 2;
                }

                palo = TipoPalo.Oro;
            }
            else
            {
                if (id > 10 && id <= 20)
                {
                    if (id <= 7)
                    {
                        numero = id - 10;
                    }
                    else
                    {
                        numero = (id - 10) + 2;
                    }
                    palo = TipoPalo.Copas;
                }
                else
                {
                    if (id > 20 && id <= 30)
                    {
                        if (id <= 7)
                        {
                            numero = id - 10;
                        }
                        else
                        {
                            numero = (id - 10) + 2;
                        }
                        palo = TipoPalo.Espadas;
                    }
                    else
                    {
                        if (id > 30 && id <= 40)
                        {
                            if (id <= 7)
                            {
                                numero = id - 10;
                            }
                            else
                            {
                                numero = (id - 10) + 2;
                            }

                            palo = TipoPalo.Bastos;
                        }
                    }
                }
            }


        }
        else
        {
            throw new Exception("Tiene que ser mayor e igual que 1 o menor o igual de 40");
        }
    }

    //METODOS
    public int getNumero() {
        return numero;
    }

    public TipoPalo getPalo() {
        return palo;
    }

    public String NombreNumero(int numero)
    {
        switch (numero)
        {
            case 1: return "As";
            case 2: return "Dos";
            case 3: return "Tres";
            case 4: return "Cuatro";
            case 5: return "Cinco";
            case 6: return "Seis";
            case 7: return "Siete";
            case 10: return "Sota";
            case 11: return "Caballo";
            case 12: return "Rey";

            default: return "";
        }
    }

    public String NombrePalo(TipoPalo palo)
    {
        switch (this.palo)
        {
            case Bastos: return "Bastos";
            case Copas: return "Copas";
            case Oro: return "Oros";
            case Espadas: return "Espadas";

            default: return "";
        }
    }

    public String NombreCarta(int numero, TipoPalo palo)
    {
        return NombreNumero(numero) + " de " + NombrePalo(palo);
    }

    public int ValorTute(int numero)
    {
        switch (numero)
        {
            case 1: return 11;
            case 3: return 10;
            case 10: return 2;
            case 11: return 3;
            case 12: return 4;

            default: return numero;
        }
    }

    public int ValorMus(int numero)
    {
        switch (numero)
        {
            case 2: return 1;
            case 3:
            case 10:
            case 11:
            case 12:
                return 10;

            default: return numero;
        }
    }

    public double Valor7ymedia(int numero)
    {
        switch (numero)
        {
            case 10:
            case 11:
            case 12:
                return 0.5;

            default: return numero;
        }
    }

    //TOSTRING


    @Override
    public String toString() {
        return this.NombreCarta(numero,palo);
    }
}




