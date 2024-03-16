import java.util.Scanner;
public class Taller4{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        int j=0;
        while (j !=3){
            System.out.println("|--------- BIENVENIDO ---------|");
            System.out.println("|1. Docente                    |");
            System.out.println("|2. Estudiante                 |");
            System.out.println("|3. Salir                      |");
            System.out.println("|------------------------------|");

            System.out.println("--> Ingrese una opcion");
            int opcion = entrada.nextInt();

            if (opcion==1){
                System.out.println("----- Ejersicio 1 -----");
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
                System.out.println("=> el promedio es: "+promedio);

                
            }else if (opcion==2){
                System.out.println("----- Ejersicio 2 -----");
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
            }else if (opcion==3){
                System.out.println("----- saliendo -----");
            }
  
        j++;   
        }
    }
}