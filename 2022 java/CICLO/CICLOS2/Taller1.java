import java.util.Scanner;
public class Taller1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print ("Ingrese un numero entre 1 y 6: ");
        int numero = entrada.nextInt();
        int acumn = 0;
        int aleatorio=0;
        int operacion = 0;
        int i=1;
        while (i<=numero){
            aleatorio = (int)(Math.random()*10);
            acumn = (acumn*10)+aleatorio;
            i++;
        }
        System.out.print("El numero construido es: " + acumn);
        operacion = acumn*2;
        System.out.println("");
        System.out.print ("Resultado producto: " + operacion);
    }
}