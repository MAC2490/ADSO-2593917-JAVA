import java.util.Scanner;

public class Ahorcado{
    // variables de entrada
    Scanner entrada = new Scanner(System.in);

    //Atributos 
    private String palabraSecreta;
    private int vidas;
    private boolean enJuego;
    private int validarLetra;
    private char tablero [];
    private char letras [];

    // Metodos 
    public Ahorcado(String palabraSecreta, int vidas){
        this.palabraSecreta = palabraSecreta;
        this.vidas = vidas;
        this.enJuego = true;
        this.validarLetra = 0;
        this.tablero = new char [palabraSecreta.length()];
        this.letras  = palabraSecreta.toCharArray();
        this.limpiarTablero();
    }

    // Limpiar tablero 
    public void limpiarTablero(){
       for (int i = 0; i<this.tablero.length;i++){
            this.tablero[i] = '_';
        } 
    }

    // Imprimir lineas
    public void imprimirLineas(){
        for (int i = 0; i<this.tablero.length;i++){
            System.out.print(tablero[i]);
        }
    }

    // Validar ganador
    public void validarGanador(){
        if (this.validarLetra == palabraSecreta.length()){
            System.out.println();
            this.imprimirLineas();
            System.out.println();
            System.out.println("Gano");
            this.enJuego = false;
        }
    }

    // Validar perdida
    public void validarPerdedor(){
        if (vidas==0){
            System.out.println("Perdio");
            enJuego = false;
        }else if (vidas<6){
            System.out.println("Vidas restantes "+vidas);
        }
    }

    // Star
    public void start(){
        do{
            this.imprimirLineas();
            System.out.println();

            // Pedir letra 
            System.out.print("Ingrese una letra ");
            char letra = entrada.next().charAt(0);
            int contvidas = 0;
            // SI es una letra valida que verifique si esta en la palabra secreta 
            for (int i = 0; i<this.letras.length;i++){
                if (this.letras[i] == letra){
                    // SI esta en la palabra secreta que verifique que en el tablero si este vacido
                    if (this.tablero[i] == '_'){
                        // SI tablero esta bacido que cambie por la letra
                        this.tablero[i] = this.letras[i]; 
                        this.validarLetra++;
                    }else{
                        //SINO muestre que ya fue ingresada la letra 
                        System.out.println("Ya se ingreso una letra");
                    }
                }else{
                    contvidas++;
                }
            }
            if (contvidas==palabraSecreta.length()){
                this.vidas--;
            }
            this.validarPerdedor();
            this.validarGanador();
        }while(enJuego);
    }  
}
