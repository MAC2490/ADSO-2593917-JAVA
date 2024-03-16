import java.util.Scanner;
public class Taller1 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un numero " );
        int n = entrada.nextInt();
        int cantidad = n*n;
        int numero []  = new int [cantidad];

        for (int i=0; i<cantidad;i++){
            numero[i]=i+1;
        }

        for (int i=0; i<cantidad;i++){
            System.out.print(numero[i]);
        }
        for (int j=0; j<n;j++){
            
            //System.out.println(" ");
        }

    }
}