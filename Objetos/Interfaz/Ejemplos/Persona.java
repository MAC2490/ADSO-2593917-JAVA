public class Persona{

    //Atributos
    int cedula; 
    String nombres;
    String apellido;
    String genero;          //Atributos
    int edad;
    int peso;
    int altura;

    //Metodos 
    public Persona(){//Constructor 
        this.cedula = 0;
        this.nombres = ""; 
        this.apellido = ""; 
        this.genero =  ""; 
        this.edad = 0;
        this.peso = 0;
        this.altura =  0;
    }
    public Persona(int cedula, String nombres, String apellido){
        this.cedula = cedula;
        this.nombres = nombres; 
        this.apellido = apellido; 
        this.genero =  ""; 
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(int cedula, String nombres, String apellido, String genero, int edad, int peso, int altura){//Parametros 
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    //Metodo get 
    public int getpeso(){
        return this.peso;
    }
    //Metodo set
    public void setpeso(int new_peso){
        this.peso = new_peso;
    }
    public void comer(int gramos){
        this.peso += (int) (gramos * 0.1);
    }
    public void ImprimirCartaPresentacion(){
        System.out.println ( "cedula "+this.cedula);
        System.out.println ("nombres "+this.nombres);
        System.out.println ("apellido "+this.apellido);
        System.out.println ("genero "+this.genero);          
        System.out.println ( "edad "+this.edad );        
        System.out.println ( "peso "+this.peso);
        System.out.println ( "altura "+this.altura);
    }
}