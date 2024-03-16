import java.util.Scanner;
public class Taller2 {
    public static void main (String [] args) {
        
       //ejercisio #2
        Scanner entrada = new Scanner (System.in);
        int escribir_codigo;
        System.out.println ("escriba el codigo");
        escribir_codigo = entrada.nextInt();

        int codigo = escribir_codigo % 2;

        if (codigo == 0 ){
            System.out.println ("par");
        }else{
            System.out.println ("impar");
        }  
    }

}