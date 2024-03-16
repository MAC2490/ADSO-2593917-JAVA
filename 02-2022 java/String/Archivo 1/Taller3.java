import java.util.Scanner;

public class Taller3{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        // System.out.print("Ingrese una oracion ");
        // String oracion = entrada.nextLine();

        // int cantidad = oracion.length();

        // char [] arreglo = new char [cantidad];

        // for (int i = 0; i<oracion.length();i++){
        //    arreglo [i] = oracion.charAt(i);
        // }

        // for (int i = cantidad-1; i>=0;i--){
        //     int posicion = (int) (arreglo[i]);

        //     if (posicion>=97 && posicion<=122){
        //         char nuevo = (char) (posicion-32);
        //         System.out.print(nuevo);
        //     }else if (posicion>=65 && posicion<=90){
        //         char nuevo1 = (char) (posicion+32);
        //         System.out.print(nuevo1);
        //     }else if (posicion==32){
        //         System.out.print(' ');
        //     }
        // }

        System.out.print("Ingrese una oracion ");
        String oracion = entrada.nextLine();
        int cantidad = oracion.length();

        for (int i = cantidad-1; i>=0;i--){
            System.out.print(oracion.charAt(i));
        }
    }
}