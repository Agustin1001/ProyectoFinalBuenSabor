public class DetallePedido {
    private int cantidad;
    private double subTotal;

    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(int cantidad, double subTotal, Articulo articulo) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}