import java.util.Scanner;
public class Taller6{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero N ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese el numero M ");
        int numero2 = entrada.nextInt();
        int i = numero1;
        int suma = 1;
        while (i<=numero2){
            int j=1;
            while(j<=i){
                suma *=j;
                if (j==i){
                    System.out.print(j + " = "); 
                }else{
                    System.out.print(j + " * "); 
                }
                if (i==j){
                    System.out.println(suma);
                    suma=1;
                } 
                j++;
            }
            i++;
        }
    }
}