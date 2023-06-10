import java.util.Scanner;

public class Taller8{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo ");
        int n = entrada.nextInt();

        int total [] = new int [n];

        int pares = 0;
        int impares = 0;
        for (int i=0; i<n;i++){
            total[i] = (int) (Math.random() * (n*n));
            if (total[i]%2==0){
                pares++;
            }else{
                impares++;
            }
        }
        int par [] = new int [pares];
        int impar [] = new int [impares];

        int par1 = 0;
        int impar1 = 0;
        for (int j = 0;j<n;j++){
            if (total[j]%2==0){
                par [par1] = total[j];
                par1++; 
            }else{
                impar [impar1] = total[j];
                impar1++;
            }
        }
        System.out.print("Todos los numeros");
        System.out.println(" ");
        for (int j = 0;j<n;j++){
            if (j==n-1){
                System.out.print(total[j]+"  => rango "+n);    
            }else{
                System.out.print(total[j]+",");
            }
        }
        System.out.println(" ");
        System.out.println("Pares");
        for (int j = 0;j<pares;j++){
            if (j==pares-1){
                System.out.print(par[j]+"  => rango "+pares);
     
            }else{
                System.out.print(impar[j]+",");
            }
        }
        System.out.println(" ");
        System.out.println("Impares");
        for (int j = 0;j<impares;j++){
            if (j==impares-1){
                System.out.print(impar[j]+"  => rango "+impares);    
            }else{
                System.out.print(impar[j]+",");
            }
        }    
    }
}