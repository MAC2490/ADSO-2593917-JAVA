public class Persona{
    int documento;
    String nombres;
    String apellido;
    String direccion;
    int telefono;
    String email;

    public Persona(int documento, String nombres, String apellido, String direccion, int telefono, String email){
        this.documento = documento;
        this.nombres = nombres;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona(int documento){
        this.documento = documento;
    }
    
    //Metodos get set de documento 
    public int getdocumento(){
        return this.documento;
    }

    public void setdocumento(int new_documento){
        this.documento = new_documento;
    }

    //Metodo get set nombre
    public String getnombre(){
        return this.nombres;
    }

    public void setnombre(String new_nombre){
        this.nombres = new_nombre;
    }

    //Metodos get set apellidos
    public String getapellido(){
        return this.apellido;
    }

    public void setapellido(String new_apellido){
        this.apellido = new_apellido;
    }

    //Metodo get set direccion
    public String getdireccion(){
        return this.direccion;
    }

    public void setdireccion(String new_direccion){
        this.direccion = new_direccion;
    }

    //Metodo get set telefono
    public int gettelefono(){
        return this.telefono;
    }

    public void settelefono(int new_telefono){
        this.telefono = new_telefono;
    }

    //Metodo get set email
    public String getemail(){
        return this.email;
    }

    public void setemail(String new_email){
        this.email = new_email;
    }

    public void mostrarClientesRegistrados(){
        System.out.println ("---------------------DATOS PERSONALES---------------------");
        System.out.print("Documento "+this.documento+" -> ");
        System.out.print(this.nombres+" ");
        System.out.print(this.apellido+" ");
        System.out.println (" ");
    }

    public void mostrarListaDeClientes(){
        System.out.println (" ");
        System.out.println ("-------DATOS PERSONALES-------");
        System.out.println("Documento "+this.documento);
        System.out.println("Nombre "+this.nombres);
        System.out.println("Apellido "+this.apellido);
        System.out.println("Direccion "+this.direccion);
        System.out.println("Telefono "+this.telefono);
        System.out.println("Email "+this.email);
    }
}