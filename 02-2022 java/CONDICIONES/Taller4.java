import java.util.Scanner;
public class Taller4{
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println ("ingrese el primer numero");
        numero1 = entrada.nextInt();
        System.out.println ("ingrese el segundo numero");
        numero2 = entrada.nextInt();
        System.out.println ("ingrese el tercer numero");
        numero3 = entrada.nextInt();
        if (numero1>numero2 && numero1>numero3){
            System.out.println ("el mayor numero es " + numero1);
        }else if (numero2>numero1 && numero2>numero3){
            System.out.println ("el mayor numero es " + numero2);
        }else if (numero3>numero1  && numero3>numero2){
            System.out.println ("el mayor numero es " + numero3);
        }
        if (numero1<numero2 && numero1<numero3){
            System.out.println ("el menor numero es " + numero1);
        }
        if (numero2<numero1 && numero2<numero3){
            System.out.println ("el menor numero es " + numero2);
        }
        if (numero3<numero2 && numero3<numero1){
             System.out.println ("el menor numero es " + numero3);
        }
    }

}