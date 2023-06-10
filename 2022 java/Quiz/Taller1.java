import java.util.Scanner;
public class Taller1{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba el valor de X y Y punto A");
        System.out.print("=>valor de X ");
        int x = entrada.nextInt();
        System.out.print("=>valor de Y ");
        int y = entrada.nextInt();
        System.out.println("Escriba el valor de X y Y punto B");
        System.out.print("=>valor de X ");
        int valorx = entrada.nextInt();
        System.out.print("=>valor de Y ");
        int valory = entrada.nextInt();

        int m=y-valory;
        int m1=x-valorx;
        int m2=m/m1;
        System.out.println("el valor de la pendiente es: "+m2 );

        if (m2<0){
            System.out.print("La recta tine valor NEGATIVO");
        }else if(m2>0){
            System.out.print("La recta tien valor POSITIVO");
        }
    }
}