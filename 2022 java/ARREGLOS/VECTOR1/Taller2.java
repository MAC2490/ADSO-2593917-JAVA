import java.util.Scanner;
public class Taller2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero " );
        int n = entrada.nextInt();

        int [] numero = new int [n];
        int m=0;
        int i=0;
        while (i<n){
            numero[i] = (int)(Math.random()*999);
            int cont=0;
            int j=1;
            while (j<=numero[i]){
                if (numero[i]%j==0){
                    cont++;
                }
                j++;
            }
            if (cont==2){
                numero[i]=numero[i];
                i++;
            }
        }
        int a=0;
        while (a<n){
            System.out.println("["+numero[a]+"]");
            a++;
        }
    }
}
