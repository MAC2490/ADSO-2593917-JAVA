import java.util.Scanner;
public class Taller1{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        int i=1;
        float sumatoria = 0;
        System.out.println ("=> escriba la cantidad de notas");
        int canatidad_nota = entrada .nextInt();
        
        while (i<=canatidad_nota){
            System.out.println("-> esciba la nota: " + i);
            float nota = entrada.nextFloat();

            sumatoria = sumatoria + nota;
            i++;
        }
        float promedio = sumatoria/canatidad_nota;
        System.out.print("=> el promedio es: "+promedio);
    }
}  