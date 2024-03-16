import java.util.Scanner;

public class Taller3{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la primera palabra ");
        String p1 = entrada.nextLine();
        System.out.print("Ingrse la segunda palabra ");
        String p2 = entrada.nextLine();

        int cantp1 = p1.length();
        int cantp2 = p2.length();
        int total = cantp1+cantp2;

        String doble = p1;
        String doblep2 = p2;
        if (cantp1>cantp2){
            doble = p1+p1; 
        }else{
            doble = p1;
        } 
        
        if (cantp2>cantp1){
            doblep2 = p2+p2;
        }else{
            doblep2 = p2;
        }
        System.out.print(doble);
        System.out.print(doblep2);
        // for (int i = 0; i<total;i++){
        //     if (i%2==0){
        //         System.out.print(doblep2.charAt(i));
        //     }else{
        //         System.out.print(doble.charAt(i));
        //     }
        // }
    }
}