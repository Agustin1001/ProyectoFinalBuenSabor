package org.example.Entities;

public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;

    public ArticuloInsumo() {}

    public ArticuloInsumo(String denominacion, double precioVenta, double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar, UnidadMedida unidadMedida) {
        super(denominacion, precioVenta, unidadMedida);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    @Override
    public String toString() {
        return denominacion + "," + unidadMedida + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", stockActual=" + stockActual + ", stockMaximo=" + stockMaximo + ", esParaElaborar=" + esParaElaborar +"]";
    }
}