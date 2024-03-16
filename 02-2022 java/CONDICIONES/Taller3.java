import java.util.Scanner;
public class Taller3{
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        int x;
        int y;
        
        System.out.print ("ingrese el valor de X");
        x = entrada.nextInt();
        System.out.print("ingrese el valor de Y");
        y = entrada.nextInt();
        if (x>0 && y>0){
            System.out.println("la cordenada ingresada se encuentra en el cuadrante 1");
        }else if(x<0 && y>0){
            System.out.println("la cordenada ingresada se encuentra en el cuadrante 2");
        }else if (x<0 && y<0){
            System.out.println ("la cordenada ingresada se encuentra en el cuadrante 3");
        }else if (x>0 && y<0){
            System.out.println ("la cordenada ingresada se encuentra en el cuadrante 4");
        }
        if (x==0 && y==0){
            System.out.println ("la cordenada ingresada no se encuentra en un cuadrante (0,0)");
        }
    }
}