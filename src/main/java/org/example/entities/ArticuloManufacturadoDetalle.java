package org.example.entities;

public class ArticuloManufacturadoDetalle {
    private int cantidad;

    private ArticuloInsumo articuloInsumo;

    public ArticuloManufacturadoDetalle() {}

    public ArticuloManufacturadoDetalle(int cantidad, ArticuloInsumo articuloInsumo) {
        this.cantidad = cantidad;
        this.articuloInsumo = articuloInsumo;
    }

    @Override
    public String toString() {
        return "\n" + "Detalle [" + "cantidad=" + cantidad + ", articuloInsumo= " + articuloInsumo;
    }
}