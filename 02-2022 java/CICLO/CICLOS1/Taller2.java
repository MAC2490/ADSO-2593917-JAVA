import java.util.Scanner;
public class Taller2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        
        float sumatoria_cred = 0;
        float sumatoria_suma =0;
        float divicion=0;

        System.out.println("=> inngrese la cantidad de materias ");
        int canatidad_nota = entrada.nextInt();

        for (int i=1;i<=canatidad_nota;i++){
            System.out.println("-> NOTA MATERIA: "+i);
            float nota = entrada.nextFloat();
            System.out.println ("-> CREDITO MATERIA: "+i);
            float credito = entrada.nextFloat();
            float multi = nota * credito ;
            sumatoria_cred=sumatoria_cred + credito;
            sumatoria_suma=sumatoria_suma + nota;
            divicion=sumatoria_suma/sumatoria_cred;

        }
        System.out.println("-> Total de creditos = " + sumatoria_cred);
        System.out.println("-> Promedio del sistema = " + divicion);

    }
}