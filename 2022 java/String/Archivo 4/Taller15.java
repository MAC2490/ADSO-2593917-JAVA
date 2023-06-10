import java.util.Scanner;

public class Taller15{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo ");
        int n = entrada.nextInt();
        entrada.nextLine();
        String arreglo [] = new String [n];

        for (int i = 0; i<n; i++){
            System.out.print("Ingrese la palabra del arreglo ");
            arreglo [i] = entrada.nextLine();
        }

        System.out.print("Ingrese la posicion a eliminar ");
        int posicion = entrada.nextInt();

        for (int i = 0; i<n; i++){
            if (i==0){
                System.out.print("Arreglo: "+arreglo[i]+" ");
            }else{
                System.out.print(" "+arreglo[i]+" ");
            }
        }

        for (int i = 0; i<n; i++){
            if (i == posicion){
                arreglo [i] = " ";
            }
        }

        System.out.println();
        System.out.println("Eliminar: "+posicion);

        System.out.print("Arreglo modificado: ");

        for (int i = 0; i<n; i++){
            if (i != posicion){
                System.out.print(" "+arreglo[i]+" ");
            }
        }
    }
}