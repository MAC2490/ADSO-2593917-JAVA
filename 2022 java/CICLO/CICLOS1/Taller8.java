import java.util.Scanner;
public class Taller8{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        int numero = entrada.nextInt();
        // Invertir el numero
        int invertido = 0;
        int j=1;    
        while (j<=6){
            int ultimo = numero%10;
            invertido = (invertido*10)+ultimo;
            numero = numero/10;
            if(numero==0){
                break;
            }
            j++;
        }
        numero=invertido;
        // Imprimir Digitos separador
        int i=1;
        while (i<=6){
            int num = (numero%10);
            System.out.println("-> el digito " + i +" es: " + num );
            numero = numero/10;
            if (numero==0){
                break;
            }
            i++;
        }
    }
}