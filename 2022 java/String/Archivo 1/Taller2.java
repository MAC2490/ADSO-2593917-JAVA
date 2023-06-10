import java.util.Scanner;

public class Taller2{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una oracion ");
        String oracion = entrada.nextLine();

        for (int i = 0; i<oracion.length();i++){
            int posicion = (int) oracion.charAt(i);

            if (oracion.charAt(i)>=97){
                char nuevo =(char) (posicion-32);
                System.out.print(nuevo);
            }else if (oracion.charAt(i)>=65){
                char nuevo1 =(char) (posicion+32);
                System.out.print(nuevo1);
            }

            if (oracion.charAt(i)==32){
                System.out.print(' ');
            }
        }
    }
}