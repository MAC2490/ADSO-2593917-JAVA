import java.util.Scanner;

public class Taller12{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el rango del arreglo ");
        int limite = entrada.nextInt();
        

        int numero1 [] = new int [limite];
        int numero2 [] = new int [limite];

        int suma = limite+limite;

        int total [] = new int [suma];

        for (int i = 0; i<limite;i++){
            System.out.println("Ingrese el primer numero ");
            numero1 [i] = entrada.nextInt();
        }

        for (int j = 0; j<limite;j++){
            System.out.println("Ingrese el segundo numero ");
            numero2 [j] = entrada.nextInt();
        }
        
        int pos1 = 0;
        int pos2 = 0;
        for (int l = 0; l<suma ;l++){
            if (l%2==0){
                total [l] = numero1[pos1];
                pos1++;
            }else{
                total [l] = numero2[pos2];
                pos2++;
            }
        }

        for (int l = 0; l<suma ;l++){
            System.out.print (" "+total[l]+" ");
        } 
    }
}