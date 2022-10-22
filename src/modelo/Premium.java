package modelo;

public class Premium extends Clientes {
    private Integer cuotaAnual;
    private Integer descuento;

    public Premium(String nombre, String domicilio, String nif, String email, Integer cuotaAnual, Integer descuento) {
        super(nombre,domicilio,nif,email);
        this.cuotaAnual=cuotaAnual;
        this.descuento=descuento;
    }

    public Integer getCuotaAnual() {
        return cuotaAnual;
    }

    public void setCuotaAnual(Integer cuotaAnual) {
        this.cuotaAnual = cuotaAnual;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Premium{" +
                "nombre=" + super.getNombre() +
                "domicilio=" + super.getDomicilio() +
                "nif=" + super.getNif() +
                "email=" + super.getEmail() +
                "cuotaAnual=" + cuotaAnual +
                ", descuento=" + descuento +
                '}';
    }
}
