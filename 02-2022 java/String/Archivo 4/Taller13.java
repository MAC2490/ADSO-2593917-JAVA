import java.util.Scanner;

public class Taller13{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero del rango ");
        int n = entrada.nextInt();

        int numero [] = new int [n];

        for (int i = 0; i<n; i++){
            System.out.print("Ingrese el numero ");
            int nuevo_n = entrada.nextInt();
            numero [i] = nuevo_n;
        }

        System.out.print("Ingrese la posicion que desea ");
        int pos = entrada.nextInt();
        
        int mas = 0; 
        int guardar = 0;

        int menos = n;
        int guardar1 = 0;

        if (pos>=0){
            int j = 0;
            while (j<pos){
                if (guardar+1==pos){
                    System.out.print(numero[mas-1]);
                    break;
                }
                if (mas+1==n){
                    guardar = mas;
                    mas = 0;
                }
                guardar++;
                mas++;
                j++;
            }
        }else if (pos<0){
            int l = pos;
            while (l<0){
            if (guardar1-1==pos){
                System.out.println(numero[menos-1]);
                break;
            }
            if (menos-1==n){
                guardar1 = menos;
                menos = 0;
            }    
            guardar1--;
            menos--;
            l++;
            }
        }

    }
}