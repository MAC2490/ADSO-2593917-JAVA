import java.util.Scanner;
import java.util.Arrays;

public class Taller4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero ");
        int n = entrada.nextInt();
        entrada.nextLine();

        String arreglo [] = new String[n];

        for (int i = 0; i<n; i++){
            System.out.print("Ingrese el nombre ");
            arreglo [i] = entrada.nextLine(); 
        }
        System.out.println(" ");

        for (int i = 0; i<n; i++){
            System.out.println(arreglo[i]);
        }

        System.out.println(" ");

        Arrays.sort(arreglo);
        System.out.println("Nombres ordenados alfabeticamente ");
        System.out.println(" ");

        for (int i = 0; i<n; i++){
            System.out.println(arreglo[i]);
        }
    }
}