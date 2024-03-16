import java.util.Scanner;

public class Taller2{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese una palabra ");
        String pal = entrada.nextLine();
        System.out.print("ingrese la posicion ");
        int pos = entrada.nextInt();

        for (int i = pos; i<pal.length();i++){
            System.out.print(pal.charAt(i));
        }
        for (int j = 0; j<pos; j++){
            System.out.print(pal.charAt(j));
        }
    }
}