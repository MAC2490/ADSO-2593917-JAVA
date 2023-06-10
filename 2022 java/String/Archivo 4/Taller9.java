import java.util.Scanner;

public class Taller9{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo ");
        int n = entrada.nextInt();

        int total [] = new int [n];
        
        int primos = 0;
        int noprimos = 0;

        for (int i = 0; i<n;i++){
            int numero = 0;
            numero = (int) (Math.random()*(100))+1; 
            total [i] = numero;
            int cont = 0;
            int j = 1;
            while (j<=total[i]){
                if (numero%j==0){
                    cont++;
                }
                j++;
            }
            if (cont==2){
                primos++;
            }else{
                noprimos++;
            }
        }

        int nprimos [] = new int [primos];
        int n_noprimos [] = new int [noprimos];
        int pri = 0;
        int no_pri = 0;

        for (int i = 0; i<n;i++){
            int numero = 0;
            numero = total[i];
            int cont = 0;
            int j = 1;
            while (j<=total[i]){
                if (numero%j==0){
                    cont++;
                }
                j++;
            }
            if (cont==2){
                nprimos [pri] = total[i];
                pri++;
            }else{
                n_noprimos [no_pri] = total[i];
                no_pri++; 
            }
        }

        for (int i = 0; i<n;i++){
            System.out.print(" "+total[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i<primos;i++){
            System.out.print(" "+nprimos[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i<noprimos;i++){
            System.out.print(" "+n_noprimos[i]+" ");
        }
    }
}