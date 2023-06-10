import java.util.Scanner;
public class Taller4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numero que desea ");
        int n = entrada.nextInt();
        int [] arreglo = new int [n];
        for (int i=0;i<arreglo.length;i++){
            System.out.println("Ingrese el numero " );
            arreglo[i]=entrada.nextInt();
        }

        for (int i=0;i<arreglo.length;i++){
            for (int j=0;j<arreglo.length-1;j++){
                if (arreglo[j]<arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        
        for (int i=0;i<arreglo.length;i++){
            System.out.println("posicion "+(i+1)+" = " + arreglo[i]);
        }
    }
}