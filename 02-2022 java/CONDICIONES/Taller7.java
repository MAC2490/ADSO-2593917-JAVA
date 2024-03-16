import java.util.Scanner;
public class Taller7{
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        int formato_moneda;
        int formato_moneda1;

        System.out.println("numeros positivos: ingrese un numero maximo (10 digitos menores a 2 mil millones) si el numero es negativo escriba 0");
        formato_moneda = entrada.nextInt();
        System.out.println("numeros negativos: ingrese un numero maximo (10 digitos menores a 2 mil millones)si el numero es positivo escriba 0");
        formato_moneda1 = entrada.nextInt();
        
           int moneda=formato_moneda%10;
           int moneda1=(formato_moneda/10)%10;
           int moneda2=(formato_moneda/100)%10;
           int moneda3=(formato_moneda/1000)%10;
           int moneda4=(formato_moneda/10000)%10;
           int moneda5=(formato_moneda/100000)%10;
           int moneda6=(formato_moneda/1000000)%10;
           int moneda7=(formato_moneda/10000000)%10;
           int moneda8=(formato_moneda/100000000)%10;
           int moneda9=(formato_moneda/1000000000)%10;

           int moneda10=formato_moneda1%10;
           int moneda11=(formato_moneda1/10)%10;
           int moneda12=(formato_moneda1/100)%10;
           int moneda13=(formato_moneda1/1000)%10;
           int moneda14=(formato_moneda1/10000)%10;
           int moneda15=(formato_moneda1/100000)%10;
           int moneda16=(formato_moneda1/1000000)%10;
           int moneda17=(formato_moneda1/10000000)%10;
           int moneda18=(formato_moneda1/100000000)%10;
           int moneda19=(formato_moneda1/1000000000)%10;
           

        if (formato_moneda>=1000 && formato_moneda<10000){
            System.out.println("positivo: $" + moneda3 + "."  + moneda2 + moneda1 + moneda);
        }else if (formato_moneda>=10000 && formato_moneda<100000){
            System.out.println("positivo: $" + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
        }else if (formato_moneda>=100000 && formato_moneda<1000000){
            System.out.println ("positivo: $" + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
        }else if (formato_moneda>=1000000 && formato_moneda<10000000){
            System.out.println("positivo: $" + moneda6 + "." + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda); 
        }else if (formato_moneda>=10000000 && formato_moneda<100000000){
            System.out.println ("positivo: $" + moneda7 + moneda6 + "." + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
        }else if (formato_moneda>=100000000 &&  formato_moneda<1000000000){
            System.out.println ("positivo: $" + moneda8 + moneda7 + moneda6 + "." + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
        }else if (formato_moneda>=1000000000 && formato_moneda<2000000000){
            System.out.println ("positivo: $" + moneda9 + "." + moneda8 + moneda7 + moneda6 + "." + moneda5 + moneda4 + moneda3 + "." + moneda2 + moneda1 + moneda);
        }else if (formato_moneda>0 && formato_moneda<1000){
            System.out.println("positivo:  $" + formato_moneda);
        }
         if (formato_moneda1>=1000 && formato_moneda1<10000){
            System.out.println("negativo: $ -" + moneda13 + "."  + moneda12 + moneda11 + moneda10);
        }else if (formato_moneda1>=10000 && formato_moneda1<100000){
            System.out.println("negativo: $ -" +  moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
        }else if (formato_moneda1>=100000 && formato_moneda1<1000000){
            System.out.println ("negativo: $ -" + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
        }else if (formato_moneda1>=1000000 && formato_moneda1<10000000){
            System.out.println("negativo: $ -" + moneda16 + "." + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10); 
        }else if (formato_moneda1>=10000000 && formato_moneda1<100000000){
            System.out.println ("negativo: $-" + moneda17 + moneda16 + "." + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
        }else if (formato_moneda1>=100000000 &&  formato_moneda1<1000000000){
            System.out.println ("negativo: $ -" + moneda18 + moneda17 + moneda16 + "." + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
        }else if (formato_moneda1>=1000000000 && formato_moneda1<2000000000){
            System.out.println ("negativo: $ -" + moneda19 + "." + moneda18 + moneda17 + moneda16 + "." + moneda15 + moneda14 + moneda13 + "." + moneda12 + moneda11 + moneda10);
        }else if (formato_moneda1>0 && formato_moneda1<1000){
            System.out.println("negativo: $ -" + formato_moneda);
        }
    }

}