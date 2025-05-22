import java.time.LocalDate;

public class Factura {
    private LocalDate fechaFacturacion;
    private int mpPaymetid;
    private int mpMechantOrderId;
    private String mpPreferenceId;
    private String mpPaymenType;
    private FormaPago formaPago;
    private double totalVenta;

// Constructores

    public Factura() {
    }

    public Factura(LocalDate fechaFacturacion, int mpPaymetid, FormaPago formaPago, int mpMechantOrderId) {
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymetid = mpPaymetid;
        this.formaPago = formaPago;
        this.mpMechantOrderId = mpMechantOrderId;
    }

    public Factura(double totalVenta, FormaPago formaPago, String mpPaymenType, String mpPreferenceId, int mpMechantOrderId, int mpPaymetid, LocalDate fechaFacturacion) {
        this.totalVenta = totalVenta;
        this.formaPago = formaPago;
        this.mpPaymenType = mpPaymenType;
        this.mpPreferenceId = mpPreferenceId;
        this.mpMechantOrderId = mpMechantOrderId;
        this.mpPaymetid = mpPaymetid;
        this.fechaFacturacion = fechaFacturacion;
    }


// Getters y Setters

    public LocalDate getFechaFacturacion() {return fechaFacturacion;}

    public void setFechaFacturacion(LocalDate fechaFacturacion) {this.fechaFacturacion = fechaFacturacion;}

    public int getMpPaymetid() {return mpPaymetid;}

    public void setMpPaymetid(int mpPaymetid) {this.mpPaymetid = mpPaymetid;}

    public int getMpMechantOrderId() {return mpMechantOrderId;}

    public void setMpMechantOrderId(int mpMechantOrderId) {this.mpMechantOrderId = mpMechantOrderId;}

    public String getMpPreferenceId() {return mpPreferenceId;}

    public void setMpPreferenceId(String mpPreferenceId) {this.mpPreferenceId = mpPreferenceId;}

    public String getMpPaymenType() {return mpPaymenType;}

    public void setMpPaymenType(String mpPaymenType) {this.mpPaymenType = mpPaymenType;}

    public FormaPago getFormaPago() {return formaPago;}

    public void setFormaPago(FormaPago formaPago) {this.formaPago = formaPago;}

    public double getTotalVenta() {return totalVenta;}

    public void setTotalVenta(double totalVenta) {this.totalVenta = totalVenta;}
}
