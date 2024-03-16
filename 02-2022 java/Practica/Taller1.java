import java.util.Scanner;
public class Taller1{
    public static void main(String []  args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero ");
        int n = entrada.nextInt();

        int [] arreglo = new int [n];

        int i = 0;
        while (i<n){
            System.out.print("Ingrese el numero del documento ");
            int documento = entrada.nextInt();
           
            boolean validar  = true;
            for (int j=0;j<n;j++){
                if (arreglo[j]==documento){
                    validar = false;
                }
            }

            if (validar){
                arreglo[i] = documento;
                i++;
            }else{
                System.out.print("Error ");
            }
        }

        for (i=0; i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
}