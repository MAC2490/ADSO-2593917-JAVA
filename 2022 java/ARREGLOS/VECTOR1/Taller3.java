import java.util.Scanner;
public class Taller3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese la cantidad de numeros que desea " );
        int n = entrada.nextInt();

        int [] numero =new int [n];
        for (int i=0;i<numero.length;i++){
            numero[i] = i+1;
        }

        for (int i=0;i<numero.length;i++){
           System.out.print(((i==0)?"[":",")+numero[i]+((i==(n-1))?"]":""));
        }
        System.out.println(" ");
        System.out.print("Posicion " );
        int p = entrada.nextInt();

        for (int i=0;i<numero.length;i++){
            if (p==numero[i]){
                for (int j=i-1;j<n;j++){
                    System.out.print(((j==i-1)?"[":"")+numero[j]+"-");
                }
                for (int j=0;j<i-1;j++){
                    if (j==i-2){
                        System.out.print(numero[j]+"]");
                    }else if (j<i){
                        System.out.print(numero[j]+"-");
                    }
                }
            }
        }
    }
}
