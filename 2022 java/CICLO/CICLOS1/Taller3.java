import java.util.Scanner;
public class Taller3{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

       

        System.out.println("digite la altura que desea");
        int altura = entrada.nextInt();

        for (int i=1;i<=altura;i++){
            int multi=(2*i)-1;
            int n=altura - i;
            for (int m=0; m<=n ; m++){ 
              System.out.print(" ");
            }
            for (int j=0;j<multi;j++){
                System.out.print("x");
            }
            System.out.println();
        }

    }
}