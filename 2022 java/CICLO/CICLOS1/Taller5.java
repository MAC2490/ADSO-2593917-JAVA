import java.util.Scanner;
public class Taller5{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la cantidad de Fibonacci");
        int numero = entrada.nextInt();

        int num1=0;
        int num2=1;
        int res=0;
       
        for (int i=1; i<=numero;i++){
            if (i==1){
                System.out.print("0");
            }else if (i==2){
                System.out.print(", ");    
                System.out.print("1");
                System.out.print(", ");
            }else{
                res=num1+num2;
                num1=num2;
                num2=res;
                System.out.print(res);
                System.out.print(", ");
            }
            
        }
    }
}