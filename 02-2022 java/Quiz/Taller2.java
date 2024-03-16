import java.util.Scanner;
public class Taller2 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la cantidad de numeros primos que desea ");
        int n = entrada.nextInt();
        
        int [] numero = new int[n];
        int aleatorio = 0;
        int i = 0;
        while (i<n){
            aleatorio = (int)(Math.random()*999);
            //algoritmo para determinar si el numero es primo 
            int acumulador = 0;
            int a=1;
            while (a<=aleatorio){           
                if (aleatorio%a==0){
                    acumulador++;
                }
                a++;
            }
            if (acumulador==2){
                boolean valido = true;
                for (int j=0;j<n;j++){
                    if (numero[j]==aleatorio){
                        valido=false;
                    }
                }
                if (valido){
                    numero[i]=aleatorio;
                    i++;
                }
            }  
        }
        for (i=0;i<n;i++){
            System.out.println("numero primo " + numero[i]);
        } 
    }
}