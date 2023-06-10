import java.util.Scanner;

public class Taller11{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el limite de rango de numeros ");
        int limite = entrada.nextInt();

        int numero1 [] = new int [limite];
        int numero2 [] = new int [limite];

        for (int i = 0; i<limite;i++){
            System.out.println("Ingrese el numero del arreglo 1 ");
            int n1 = entrada.nextInt();

            numero1[i] = n1;
        } 
        for (int l = 0; l<limite;l++){
            System.out.println("Ingrese el numero del arrglo 2 ");
            int n2 = entrada.nextInt();
            numero2[l] = n2; 
        }

        int cont = 0;

        for (int i = 0; i<limite;i++){
            for (int j = 0; j<limite;j++){
                if (numero1[i]==numero2[j]){
                    cont++;
                }
            }
        }
        
        int cont2 = 0;

        for (int i = 0; i<limite;i++){
            for (int j = 0; j<limite;j++){
                if (numero2[i]==numero1[j]){
                    cont2++;
                }
            }
        }

        for (int i = 0; i<limite;i++){
            System.out.print(" "+numero1[i]+" ");
        }
        System.out.println(" ");
        for (int l = 0; l<limite;l++){
            System.out.print(" "+numero2[l]+" ");
        }
        System.out.println(" ");
        if (cont==limite && cont2==limite){
            System.out.println("Los arreglos son equivalentes ");
        }else{
            System.out.println("Los arreglos no son equivalentes ");
        }
    }
}