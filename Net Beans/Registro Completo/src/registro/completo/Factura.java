package registro.completo;

import java.time.LocalDate;

public class Factura {
    private String nombre_cliente;
    private String nombre_vendedor;
    private String nombre_producto;
    private LocalDate fecha;

    public Factura(String nombre_cliente, String nombre_vendedor, String nombre_producto, LocalDate fecha) {
        this.nombre_cliente = nombre_cliente;
        this.nombre_vendedor = nombre_vendedor;
        this.nombre_producto = nombre_producto;
        this.fecha = fecha;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
