import java.security.Principal;
import java.util.Scanner;
public class Taller3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor a financiar: ");
        int capital = entrada.nextInt();

        System.out.print("Taza de interes: ");
        int interes = entrada.nextInt();

        System.out.print("Cantidad de cuotas ");
        int cuotas = entrada.nextInt();
        
        

        for (int i=1; i<=cuotas;i++){
            System.out.println("Valor cuota " +i+ " que desea pagar ");
            int valorc=entrada.nextInt();
            int total = capital*interes;
            int porcentaje = total/100; 
            System.out.println("interes "+porcentaje);
            int cap = valorc-porcentaje;
            System.out.println("capital "+cap);
            int total_d= capital-valorc;
            System.out.println("total deuoda "+total_d);
            capital=total_d;

        }
    }
}