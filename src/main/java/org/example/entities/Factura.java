
import org.example.entities.enums.FormaPago;
import java.time.LocalDate;

public class Factura {
    private LocalDate fechaFacturacion;
    private int mpPaymetid;
    private int mpMechantOrderId;
    private String mpPreferenceId;
    private String mpPaymenType;
    private FormaPago formaPago;
    private double totalVenta;
}
