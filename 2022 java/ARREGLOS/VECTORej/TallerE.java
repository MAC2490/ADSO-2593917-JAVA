import java.util.Scanner;
public class TallerE {
    public static void main(String[] args) {
        //crear variables para entradad de datos.
        Scanner entrada = new Scanner(System.in);

        //crear arreglo vacio 
        int [] arreglo_1 = new int [10];

        //crear arreglo lleno
        int [] arreglo_2 = {1, 2, 3, 30, 20, 79};

        //acceseder al cotenido del arreglo 
        arreglo_1[0]=25;
        arreglo_1[3]=55;
        arreglo_1[9]=99;
        for (int i=0; i<=4;i++){
            arreglo_2[i]=5;
        }

        //imprimir contenido de arreglo
        for (int i=0; i<=9;i++){
            System.out.print("["+arreglo_1[i]+"]");
        }        
        
    }
}