import java.util.Scanner;
public class Taller4{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("=> Ingrese un numero N maximo de seis digitos");
        int numero = entrada.nextInt();
        int original = numero;
        int ultimo=0;
        int invertido=0;
        while (numero !=0){
            ultimo = numero%10;
            invertido = (invertido*10)+ultimo;
            numero = numero/10;    
        }
        if (invertido==original){
            System.out.println("-> El numero N es palindromo: "+ invertido);
        }else{
            System.out.println("-> El numero N no es palindromo: "+ invertido);
        }
    }
}