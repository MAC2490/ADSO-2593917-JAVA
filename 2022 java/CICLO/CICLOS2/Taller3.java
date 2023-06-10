import java.util.Scanner;
public class Taller3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print ("Ingrese numero N: ");
        int numero = entrada.nextInt();
        
        int i=0;
        while (i<numero){
            int aleatorio = (int)(Math.random()*999);
            //algoritmo para determinar si el numero es primo 
            int acumulador = 0;
            int j=1;
            while (j<=aleatorio){           
                if (aleatorio%j==0){
                    acumulador++;
                }
                j++;
            }
            if (acumulador==2){
                System.out.println("-> El primo " + i + " Generado " + aleatorio);
                i++;
            }
        }
    }
}