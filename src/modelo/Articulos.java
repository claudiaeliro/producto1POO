package modelo;

import java.util.Date;

public class Articulos {
    private String codigoArticulo;
    private String descripcion;
    private float precioVenta;
    private float gastosEnvio;
    private Date tiempoPreparacion;
    private Integer numeroArticulos;

    public Articulos(String codigoArticulo, String descripcion, float precioVenta, float gastosEnvio, Date tiempoPreparacion, Integer numeroArticulos) {
        this.codigoArticulo = codigoArticulo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.gastosEnvio = gastosEnvio;
        this.tiempoPreparacion = tiempoPreparacion;
        this.numeroArticulos = numeroArticulos;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(float gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public Date getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(Date tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public Integer getNumeroArticulos() {
        return numeroArticulos;
    }

    public void setNumeroArticulos(Integer numeroArticulos) {
        this.numeroArticulos = numeroArticulos;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "codigoArticulo='" + codigoArticulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioVenta=" + precioVenta +
                ", gastosEnvio=" + gastosEnvio +
                ", tiempoPreparacion=" + tiempoPreparacion +
                ", numeroArticulos=" + numeroArticulos +
                '}';
    }
}
