import java.util.Scanner;
public class Taller10{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print ( "=> ingrese un numero ");
        int numero = entrada.nextInt();
        int repeticiones = numero*numero;
        int primo = 1;
        int n_primo = 1;
        int conprimo = 0;
        int i=1;
        while (i<=repeticiones){
            if (n_primo%primo==0){
                conprimo++;  
            } 
            if (n_primo==primo){
                n_primo++;
            }
            primo++;
            i++;
        }
    }
}