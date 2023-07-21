package Clases;

public class Citas {
   
    private String numero_documento;
    private String estado;
    private String fecha_cita;
    private String nombre_medico;

    public Citas(String numero_documento,String estado, String fecha_cita, String nombre_medico) {
        this.numero_documento = numero_documento;
        this.estado = estado;
        this.fecha_cita = fecha_cita;
        this.nombre_medico = nombre_medico;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getNombre_medico() {
        return nombre_medico;
    }

    public void setNombre_medico(String nombre_medico) {
        this.nombre_medico = nombre_medico;
    }
}
