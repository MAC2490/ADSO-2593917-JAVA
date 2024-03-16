import java.util.Scanner;
public class Taller3 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero maximo de 11 digitos ");
        int n = entrada.nextInt();
        
        int numero=n*n;
        int [] arreglo=new int [numero];
        int i=0;
        int primo=1;
        for  (int Q=0; Q<numero;Q++){
            while (i<numero){
            int j=1;
            int acum=0;
                while (j<=primo){
                    if (primo%j==0){
                        acum++; 
                    }
                    j++;
                }
                if (acum==2){
                    i++;
                    arreglo[Q]=primo; 
                    System.out.println(arreglo[Q]);
                } 
                primo++;
            }
        }
    }
}