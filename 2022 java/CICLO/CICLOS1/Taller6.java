import java.util.Scanner;
public class Taller6{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("--> ingrese el n-esimo Fibonacci");
        int numero = entrada.nextInt();

        int num1=0;
        int num2=1;
        int res=0;
       
        for (int i=1; i<=numero;i++){

            res=num1+num2;
            num1=num2;
            num2=res;
            if (i==numero){
                int suma=res-num1;
                System.out.print("-> El n-esimo numero Fibonacci es: " + suma);
            }
        }
    }
}