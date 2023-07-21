package Clases;

public class Paciente {
    private String nombre_paciente;
    private String apellido_paciente;
    private String tipo_documento;
    private String numero_documento;
    private String tipo_sangre;
    private String edad_paciente;
    private String numeroContacto;

    public Paciente(String nombre_paciente, String apellido_paciente, String tipo_documento, String numero_documento, String tipo_sangre, String edad_paciente,String numeroContacto) {
        this.nombre_paciente = nombre_paciente;
        this.apellido_paciente = apellido_paciente;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.tipo_sangre = tipo_sangre;
        this.edad_paciente = edad_paciente;
        this.numeroContacto = numeroContacto;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public String getApellido_paciente() {
        return apellido_paciente;
    }

    public void setApellido_paciente(String apellido_paciente) {
        this.apellido_paciente = apellido_paciente;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getEdad_paciente() {
        return edad_paciente;
    }

    public void setEdad_paciente(String edad_paciente) {
        this.edad_paciente = edad_paciente;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
}
