import java.util.Scanner;

public class Taller1{
    public static void main (String[]args){
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una oracion ");
        String oracion = entrada.nextLine();


        int contador = 0;
        for (int i = 0; i<oracion.length();i++){
            
            if (oracion.charAt(i)=='a'||oracion.charAt(i)=='e'||oracion.charAt(i)=='i'||oracion.charAt(i)=='o'||oracion.charAt(i)=='u'){
                contador++;
            }

            if (oracion.charAt(i)=='A'||oracion.charAt(i)=='E'||oracion.charAt(i)=='I'||oracion.charAt(i)=='O'||oracion.charAt(i)=='U'){
                contador++;
            }
        }
        
        System.out.print("La cantidad de vocales es: "+contador);
    }
}