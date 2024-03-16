import java.util.Scanner;

public class Practica{
    public static void main(String[]args){

        //Variable para leer datos 
        Scanner entrada = new Scanner(System.in);

        //pedir textos al usuario 
        System.out.print("Ingrese su nombre: ");
        String cadena  = entrada.nextLine();

        //Pruebas 
        System.out.println("Valor almacenado => "+cadena);
        System.out.println("Cantidad letras => "+cadena.length());
        System.out.println("Letra en pos 0 => "+cadena.charAt(0));
        System.out.println("Letra en pos 0 => "+cadena.charAt(1));
        System.out.println("Letra en pos 0 => "+cadena.charAt(2));

        String palabra_1 = "Hola";
        String palabra_2 = "Hola";

        System.out.println("CompareTo 1 a 2: "+palabra_1.compareTo(palabra_2));
        System.out.println("CompareTo 1 a 2: "+palabra_2.compareTo(palabra_1));

        System.out.println("Equal 1 a 2: "+palabra_1.equals(palabra_2));
        System.out.println("Equal 1 a 2: "+palabra_2.equals(palabra_1));

        System.out.println("equalIgnoreCase 1 a 2: "+palabra_1.equalsIgnoreCase(palabra_2));
        System.out.println("equalIgnoreCase 1 a 2: "+palabra_2.equalsIgnoreCase(palabra_1));
    }
}