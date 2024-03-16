import java.util.Scanner;
public class Taller3 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        boolean inicio = true;
        while (inicio){
            System.out.println("1. Iniciar      2. Salir");
            int opcion = entrada.nextInt();

            if (opcion==1){
                inicio=true;
                for (int i=1; i<=3;i++){
                    for (int j=1;j<=3;j++){  
                        System.out.print("[ ]");
                    } 
                    System.out.println(" ");  
                }
                
            }else if (opcion==2){
                inicio=false;
            }
        }
    }
}