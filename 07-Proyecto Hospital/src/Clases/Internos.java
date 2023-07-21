package Clases;

public class Internos {
    private String fecha;
    private String numero_camilla;
    private String documento;
    private String estado;

    public Internos(String fecha, String numero_camilla, String documento, String estado) {
        this.fecha = fecha;
        this.numero_camilla = numero_camilla;
        this.documento = documento;
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero_camilla() {
        return numero_camilla;
    }

    public void setNumero_camilla(String numero_camilla) {
        this.numero_camilla = numero_camilla;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
