package modelo;

import java.util.Date;

public class Pedidos {
    private Integer numeroPedido;
    private Clientes cliente;
    private Articulos articulo;
    private Integer unidades;
    private Date fechaHora;

    public Pedidos(Integer numeroPedido, Clientes cliente, Articulos articulo, Integer unidades, Date fechaHora) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.articulo = articulo;
        this.unidades = unidades;
        this.fechaHora = fechaHora;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Articulos getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulos articulo) {
        this.articulo = articulo;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "numeroPedido=" + numeroPedido +
                ", cliente=" + cliente +
                ", articulo=" + articulo +
                ", unidades=" + unidades +
                ", fechaHora=" + fechaHora +
                '}';
    }
}

