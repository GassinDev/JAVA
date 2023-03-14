import java.util.ArrayList;
import java.util.List;

public class Dinero{

    //ATRIBUTOS ESTATICOS
    public static List <Moneda> listaMonedas = new ArrayList<>();
    private double cantidad;
    private TipoMoneda tMoneda;

    //BLOQUE ESTATICO
    Dinero() throws Exception {
        listaMonedas.add(new Moneda(TipoMoneda.Euro, 2, "€", 1));
        listaMonedas.add(new Moneda(TipoMoneda.Yen, 0, "¥", 0.0079));
        listaMonedas.add(new Moneda(TipoMoneda.Dollar, 2, "$", 0.92));
    }

    //CONSTRUCTORES
    public Dinero(double cantidad, TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    public Dinero(int cantidad, TipoMoneda tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    //METODOS ESTATICOS

    //NO ENTIENDO EL PQ COJONES FALLA AQUI

    public static void ActualizaCambio (TipoMoneda t, double cambio) throws Exception {
        Moneda moneda = BuscaMoneda(t);
        moneda.getCambioEuro() = cambio;
    }

    private static Moneda BuscaMoneda (TipoMoneda t) throws Exception {
        if (listaMonedas.size() > 0) {
            Moneda moneda = listaMonedas.get(0);

            for (int i = 0; i < listaMonedas.size(); i++) {
                if (listaMonedas.get(i).getTmoneda() == t) {
                    moneda = listaMonedas.get(i);
                }
            }
            return moneda;
        } else
        {
            throw new Exception("La lista esta vacía");
        }

    }

    public double getCantidad() {
        return cantidad;
    }

    public TipoMoneda gettMoneda() {
        return tMoneda;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void settMoneda(TipoMoneda tMoneda) {
        this.tMoneda = tMoneda;
    }

    //TOSTRING


    @Override
    public String toString() {
        Moneda m = null;
        try {
            m = BuscaMoneda(tMoneda);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        String s = Math.round(cantidad) + m.getSimbolo();
        return s;
    }

    public double ValorEn(TipoMoneda t) throws Exception {
        Moneda m2 = BuscaMoneda(tMoneda);
        Moneda m = BuscaMoneda(t);
        double resu, i;

        i = cantidad / m2.getCambioEuro();

        resu = i * m.getCambioEuro();

        return resu;
    }

    public Dinero ConvierteEn(TipoMoneda t) throws Exception {
        Dinero d;
        double valor;
        valor = ValorEn(t);
        d = new Dinero(valor, t);
        return d;
    }

    //METODOS OPERADORES

    public static Dinero add (Dinero d1, Dinero d2) throws Exception {
        if (d1.tMoneda == d2.tMoneda)
        {
            return new Dinero(d1.cantidad + d2.cantidad, d1.tMoneda);
        }
        else
        {
            d2.ConvierteEn(d1.tMoneda);

            return new Dinero(d1.cantidad + d2.cantidad, d1.tMoneda);
        }
    }

    public static Dinero  substract(Dinero d1, Dinero d2) throws Exception {
        double result;

        if (d1.tMoneda == d2.tMoneda)
        {
            result = d1.cantidad - d2.cantidad;
        }
        else
        {
            d2.ConvierteEn(d1.tMoneda);
            result = d1.cantidad - d2.cantidad;
        }

        Dinero d3 = new Dinero(result, d1.tMoneda);
        return d3;

    }

    public static double multiply (Dinero d1, double d2)
    {
        double result;

        result = d1.cantidad * d2;

        return result;
    }

    public static double divide (Dinero d1, double d2)
    {
        double result;

        result = d1.cantidad / d2;

        return result;
    }

    public static double negate(Dinero d){
        double resu;
        resu = d.cantidad * -1;
        return resu;
    }

    public static boolean equals(Dinero d1,Dinero d2) throws Exception {
        boolean result = false;

        if (d1.tMoneda == d2.tMoneda)
        {
            if (d1.cantidad == d2.cantidad)
            {
                result = true;
            }
        }
        else
        {
            d2.ConvierteEn(d1.tMoneda);
            if (d1.cantidad == d2.cantidad)
            {
                result = true;
            }
        }

        return result;
    }

    public static boolean compareTo(Dinero d1,Dinero d2) throws Exception {
        boolean result;

        if (d1.tMoneda == d2.tMoneda)
        {
            if (d1.cantidad > d2.cantidad)
            {
                result = true;
            }
            else
            {
                result = false;
            }
        }
        else
        {
            d2.ConvierteEn(d1.tMoneda);
            if (d1.cantidad > d2.cantidad)
            {
                result = true;
            }
            else
            {
                result = false;
            }
        }

        return result;
    }
}
