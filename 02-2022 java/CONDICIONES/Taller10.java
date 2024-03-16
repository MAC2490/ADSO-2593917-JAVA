import java.util.Scanner;
public class Taller10{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        
        
        System.out.println("escribir los decimales con (,) ");
        System.out.println("ingrese la nota de Matematica");
        float nota1 = entrada.nextFloat();
        System.out.println("ingrese la nota de sociales");
        float nota2 = entrada.nextFloat();
        System.out.println("ingrese la nota de ciencias");
        float nota3 = entrada.nextFloat();
        System.out.println("ingrese la nota de artes");
        float nota4 = entrada.nextFloat();
        System.out.println("ingrese la nota de ingles");
        float nota5 = entrada.nextFloat();

        if (nota1>nota2 && nota1>nota3 &&  nota1>nota4 && nota1> nota5){
            System.out.println("Asignatura con mejor nota: Matematica "+ nota1);
        }else if (nota2>nota1 && nota2>nota3 && nota2>nota4 && nota2>nota5){
            System.out.println("Asignatura con mejor nota: Sociales "+ nota2);
        }else if (nota3>nota1 && nota3>nota2 && nota3>nota4 && nota3>nota5){
            System.out.println("Asignatura con mejor nota: Ciencias "+ nota3);
        }else if (nota4>nota1 && nota4>nota2 && nota4>nota3 && nota4>nota5){
            System.out.println("Asignatura con mejor nota: Artes "+ nota4);
        }else if (nota5>nota1 && nota5>nota2 && nota5>nota3 && nota5>nota4){
            System.out.println("Asignatura con mejor nota: Ingles "+ nota5);
        }

        if (nota1<nota2 && nota1<nota3 &&  nota1<nota4 && nota1<nota5){
            System.out.println("Asignatura con menor nota: Matematica "+nota1);
        }else if (nota2<nota1 && nota2<nota3 && nota2<nota4 && nota2<nota5){
            System.out.println("Asignatura con menor nota: Sociales "+nota2);
        }else if (nota3<nota1 && nota3<nota2 && nota3<nota4 && nota3<nota5){
            System.out.println("Asignatura con menor nota: Ciencias "+nota3);
        }else if (nota4<nota1 && nota4<nota2 && nota4<nota3 && nota4<nota5){
            System.out.println("Asignatura con menor nota: Artes "+nota4);
        }else if (nota5<nota1 && nota5<nota2 && nota5<nota3 && nota5<nota4){
            System.out.println("Asignatura con menor nota: Ingles "+nota5);
        }
        
        float promedio = (nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("Promedio de notas " + promedio);

        if (promedio<3){
            
        }
    }
}