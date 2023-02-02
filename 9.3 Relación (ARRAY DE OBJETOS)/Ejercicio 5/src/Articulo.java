public class Articulo {

    //ATRIBUTOS
    String codigo;
    String descripcion;
    double preciocompra,precioventa;
    int stock;

    //CONSTRUCTOR

    public Articulo(String codigo, String descripcion, double preciocompra, double precioventa, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
    }

    //METODOS

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
