import java.util.Scanner;

public class Taller14{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo ");
        int n = entrada.nextInt();
        entrada.nextLine();
        String arreglo [] = new String [n];
        
        int i = 0;
        while (i<n){
            System.out.print("Ingrese una palabra ");
            arreglo [i] = entrada.nextLine();
            i++;
        }

        System.out.println("Ingrese la palabra que quiere buscar ");
        String buscar = entrada.nextLine();

        for (int j = 0; j<n;j++){
            if (arreglo[j].equals(buscar)){
                System.out.println("-> Posicion "+j+": "+arreglo[j]);
            }
        }
    }
}