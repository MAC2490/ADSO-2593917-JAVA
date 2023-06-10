import java.util.Scanner;

public class Taller7{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrse un numero ");
        int n = entrada.nextInt();

        int total [] = new int [n];

        for (int i = 0; i<n;i++){
            System.out.print("Ingrese el numero de la posicion "+i+" ");
            int num = entrada.nextInt();

            total[i] = num;
        }

        System.out.print("Ingrese la posicion de susecon ");
        int pos = entrada.nextInt();

        for (int i = pos; i<n; i++){
            System.out.print(total[i]+" ");
        }
        for (int i = 0; i<pos; i++){
            System.out.print(total[i]+" ");
        }
    }
}
