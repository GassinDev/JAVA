enum TipoMoneda
{
    Dollar, Yen, Euro
}
public class Moneda {

    //PROPIEDADES

    private TipoMoneda tmoneda;
    private int decimales;
    private String simbolo;
    private double cambioEuro;

    //CONSTRUCTOR
    public Moneda (TipoMoneda tmoneda, int decimales, String simbolo, double cambioEuro) throws Exception {

        this.tmoneda = tmoneda;
        this.cambioEuro = cambioEuro;

        if(simbolo != "")
        {
            this.simbolo = simbolo;
        }
        else
        {
            throw new Exception("Eso no es un símbolo de moneda");
        }

        if(decimales >= 0 && decimales <= 4)
        {
            this.decimales = decimales;
        }
        else
        {
            throw new Exception("Ese decimal es inválido");
        }
    }

    //METODOS


    public TipoMoneda getTmoneda() {
        return tmoneda;
    }

    public int getDecimales() {
        return decimales;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getCambioEuro() {
        return cambioEuro;
    }

    public void setCambioEuro(double cambioEuro) throws Exception {

        if(cambioEuro >= 0)
        {
            this.cambioEuro = cambioEuro;
        }
        else
        {
            throw new Exception("No puede ser negativo");
        }
    }
}
