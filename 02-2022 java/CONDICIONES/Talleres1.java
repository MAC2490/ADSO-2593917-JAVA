import java.util.Scanner;
public class Talleres1 {
    public static void main (String [] args) {
        //ejercicio #1
        Scanner entrada = new Scanner (System.in);
        int edad = 0;
        System.out.println ("HOLA USUARIO");

        System.out.println("escirba su edad " );
        edad = entrada.nextInt();

        if (edad >= 1 && edad<=18){
            if (edad>18){
                System.out.print ("resibe un auxili de $800.000");
            }else{
                System.out.print ("paga impuesto de $200.000");
            }
        }else{
            System.out.print ("datos incorrectos"); 
        }
        
    }

}