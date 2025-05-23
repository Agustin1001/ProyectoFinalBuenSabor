import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;

    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;

    public ArticuloManufacturado() {
    }

    public ArticuloManufacturado(String denominacion, double precioVenta, String descripcion, int tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public ArticuloManufacturado(String denominacion, double precioVenta, String descripcion, int tiempoEstimadoMinutos, String preparacion, ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        this.agregarArticuloManufacturadoDetalle(articuloManufacturadoDetalle);
    }

    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle a) {
        if(this.articuloManufacturadoDetalles == null) {
            this.articuloManufacturadoDetalles = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.articuloManufacturadoDetalles.add(a);
    }

    public void eliminarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle a) {
        if(this.articuloManufacturadoDetalles != null) {
            this.articuloManufacturadoDetalles.remove(a);
        }
    }

    @Override
    public String toString() {
        return "\n" + "ArticuloManufacturado [" + "denominacion=" + denominacion + ", precioVenta=" + precioVenta + ",  descripcion=" + descripcion + ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos + ", preparacion=" + preparacion + "]" +
                "\n" + ",detalles=" + articuloManufacturadoDetalles + "\n";
    }
}