import java.util.Scanner;

public class Taller4{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una palabra ");
        String palabra = entrada.nextLine();

        int cantidad = palabra.length();

        int j = 0;
        
        int si = 0;
        for (int i = cantidad-1; i>=0;i--){
            
            if (palabra.charAt(j)==palabra.charAt(i)){
                si++;
            }
            j++;
        } 
        if (si==cantidad){
            System.out.print("El palabra es palindormo");
        }else{
            System.out.print("El palabra no es palindormo");
        }
    }
}