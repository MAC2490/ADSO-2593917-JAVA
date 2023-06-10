import java.util.Scanner;
public class TallerE1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] arreglo_1 = new int [5];

        for (int i=0; i<arreglo_1.length;i++){
            arreglo_1[i] = (i+1)*2;
        }
        //imprimir Arreglo
        for (int i=0; i<arreglo_1.length;i++){
            System.out.print("["+arreglo_1[i]+"]");     
        }
    }
}
