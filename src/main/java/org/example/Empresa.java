import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursales;

    public Empresa() {}
    public Empresa(String nombre, String razonSocial, Integer cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.sucursales = new HashSet<>();
    }
    public Empresa(String nombre, String razonSocial, Integer cuil,Sucursal sucursales) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.agregarSucursal(sucursales);
    }

    public void agregarSucursal(Sucursal sucursal) {
        if(sucursales == null) {
            sucursales = new HashSet<>();
        }
        sucursales.add(sucursal);
    }
    public void eliminarSucursal(Sucursal sucursal) {
        if(sucursales != null) {
            sucursales.remove(sucursal);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public Integer getCuil() {
        return cuil;
    }

    @Override
    public String toString() {
        return "Empresa [" + "nombre=" + nombre + ", razonSocial=" + razonSocial + ", cuil=" + cuil +"]"+"\n"+
                "Sucursales = " +"\n"+ sucursales ;
    }
}