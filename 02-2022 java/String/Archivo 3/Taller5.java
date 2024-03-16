import java.util.Scanner;

public class Taller5{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de personas que va a ingresar ");
        int n = entrada.nextInt();

        String nombres [] = new String [n];
        String genero [] = new String [n];

        int cont = 0;

        int i = 0;
        while  (i<n){
            System.out.println("Dejar en blanco");
            String a = entrada.nextLine();
            System.out.print("Ingrese el nombre del usuario ");
            String nombre_u = entrada.nextLine();
            System.out.print("Ingrse el genero del usuario ");
            String genero_u = entrada.nextLine();

            genero [i] = genero_u;
            nombres [i] = nombre_u;
            i++;
        }
        i = 0;
        while (i<n){
            System.out.println(nombres [i]+" -> "+genero[i]);
            i++;
        }
    }
}