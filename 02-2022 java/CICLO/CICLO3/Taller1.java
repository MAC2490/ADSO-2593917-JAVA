import java.util.Scanner;
public class Taller1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("=> Ingrece un sueldo TOTAL: ");
        long sueldo = entrada.nextLong();

        System.out.print("=> Cantidad de pagos: ");
        long cantidad = entrada.nextInt();

        System.out.println("|---------------FORMAS DE PAGO----------------|");
        System.out.println("| 1. Pagos de igula valor                     |");
        System.out.println("| 2. Primer pago diferente                    |");
        System.out.println("| 3. Ultimo pago diferente                    |");
        System.out.println("| 4. Primer y Ultimo pago diferente           |");
        System.out.println("----------------------------------------------|");
        System.out.print("=> Ingrese la forma de pago: ");
        long forma = entrada.nextInt();
        long vprimero = 0;
        long valor = 0;
        for (int i=1; i<=cantidad;i++){
            if (forma==1){
                valor=sueldo/cantidad;
                if (i==1){
                    System.out.println("----------SUS PAGO SERAN DE-----------");
                }
                System.out.println("              MES " + ((i<=9)? "0":"") + i + ": $" + valor);
                if (i==cantidad){
                    System.out.println("--------------------------------------");
                }
            }else if (forma==2){
                vprimero = sueldo/2;
                valor = vprimero/(cantidad-1); 
                if (i==1){
                    System.out.println("----------SUS PAGO SERAN DE-----------");
                    System.out.println("          MES " + ((i<=9)? "0":"") + i + ": $" + vprimero); 
                }else{
                    System.out.println("          MES " + ((i<=9)? "0":"") + i + ": $" + valor);
                } 
                if (i==cantidad){
                    System.out.println("--------------------------------------");
                }
            }else if (forma==3){
                vprimero = sueldo/2;
                valor = vprimero/(cantidad-1); 
                if (i==1){
                    System.out.println("----------SUS PAGO SERAN DE-----------"); 
                }
                if (i!=cantidad){
                    System.out.println("          MES " + ((i<=9)? "0":"") + i + ": $" + valor); 
                }else if (i==cantidad){
                    System.out.println("          MES " + ((i<=9)? "0":"") + i + ": $" + vprimero);
                }
                if (i==cantidad){
                    System.out.println("--------------------------------------");
                }
            }else if (forma==4){
                vprimero = sueldo/2;
                long vultimo = vprimero/2;
                valor = vprimero/(cantidad-2);
                if (i==1){
                    System.out.println("----------SUS PAGO SERAN DE-----------"); 
                }
                if (i!= 1 &&i!=cantidad){
                    System.out.println("          MES " + ((i<=9)? "0":"") + i + ": $" + valor); 
                }else{
                    System.out.println("          MES " + ((i<=9)? "0":"") + i + ": $" + vultimo);
                }
                if (i==cantidad){
                    System.out.println("--------------------------------------");
                }
            }
        }
    }
}