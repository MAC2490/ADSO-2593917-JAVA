import java.util.Scanner;
public class Taller7{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("=> ingrese un numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("=> ingrese un numero: ");
        int numero2 = entrada.nextInt();
        System.out.println("=> ingrese un numero: ");
        int numero3 = entrada.nextInt();

        int cont=1;
        boolean buscando = true;

        while(buscando){
            if(cont%numero1==0 && cont%numero2==0 && cont%numero3==0){

                buscando = false;
            }else{
                cont++;
            }
        }
        System.out.println("MCM es : " + cont);
    }
}