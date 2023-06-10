import java.util.Scanner;
public class Taller5{
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println ("ingrese el primer numero ");
        numero1 = entrada.nextInt();
        System.out.println ("ingrese el segundo numero ");
        numero2 = entrada.nextInt();
        System.out.println ("ingrese el tercer numero ");
        numero3 = entrada.nextInt();

        if (numero1<numero2 && numero1<numero3 && numero2<numero3){
            System.out. print ("los numero se ingresaron en orden descendente");
        }else if (numero1>numero2 && numero1>numero3 && numero2<numero3){
            System.out.print ("los numeros se ingresaron en orden ascendente");
        }else if (numero2>numero1 && numero2>numero3 && numero1>numero3 || numero1<numero3){
            System.out.print ("los numeros se ingresaron en desorden ");
        }

    }

}