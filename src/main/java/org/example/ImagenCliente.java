public class ImagenCliente {
    private String denominacion;

//Constructores

    public ImagenCliente(String denominacion) {
        this.denominacion = denominacion;
    }

    public ImagenCliente() {
    }

// Getters y Setters

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "ImagenCliente{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}
