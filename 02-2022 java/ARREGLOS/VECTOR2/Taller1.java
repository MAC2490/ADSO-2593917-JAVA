import java.util.Scanner;
public class Taller1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Ingrece el de la fila " );
        int fila=entrada.nextInt();
        System.out.print("Ingrece el de la columna " );
        int columna=entrada.nextInt();

        int numero [][] = new int [fila][columna];

        for (int i=0; i<fila;i++){
            for (int j=0; j<columna;j++){
                System.out.print("Ingrece el numero de la fila " +i+" ");
                numero[i][j]=entrada.nextInt();
            }
        }

        for (int i=0; i<fila;i++){
            for (int j=0; j<columna;j++){
                System.out.println("Numero "+numero[i][j]);
            }
        }

    }
}