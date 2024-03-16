import java.util.Scanner;

public class Taller6{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrse su nombre");

        int i = 0;
        while (i<1){
            System.out.println("1: Registrar pago mensual -> 2019 ");
            System.out.println("2: Ver pago de todos los meses -> 2019 ");
            System.out.println("3: ver pago mes especifico -> 2019 ");
            System.out.println("4: Sair -> 2019 ");
            int opcion = entrada.nextInt();
            if (opcion==1){
                System.out.print("ingrse el valor del pago del mes ");
                int valorp = entrada.nextInt();
            }else if (opcion==2){
                for (int A = 0; A<12;A++){
                    System.out.println("Pagos del mes "+ A);
                }
            }else if (opcion==3){
                System.out.print("Ingrese el pago que desea ver ");
                int especifico = entrada.nextInt();
                for (int j = 0; j<11;j++){
                    if (especifico==j){
                        System.out.println("El pago del mes "+j);
                    }
                }
            }else if (opcion==4){
                System.out.println("SALIENDO...");
                i++;
            }
        }
    }
}