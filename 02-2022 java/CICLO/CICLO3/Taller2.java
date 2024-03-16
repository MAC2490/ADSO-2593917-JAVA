import java.util.Scanner;
public class Taller2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cantidad total financiada: ");
        long capital = entrada.nextLong();

        System.out.print("Cantidad de cuotas pagadas: ");
        long cantidadc = entrada.nextLong();

        long total = 0;

        for (int i=1; i<=cantidadc;i++){
            System.out.print("valor de la cuota "+i+ " pagada: ");
            long cuotap = entrada.nextLong();
            total=total+cuotap;
        }
        long valor = total-capital;        
        float interes = (float)valor/(float)capital;
        float porcentaje = interes*100;
        System.out.println("%"+porcentaje);
    }
}