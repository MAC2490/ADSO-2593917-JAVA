import java.util.Scanner;
public class Taller9{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        long numero=entrada.nextLong();
        boolean procesando=true;
        int sumatoria=0;
        while (procesando){
            // para invertir 
            long ult=0;
            long invertido=0;
            while (numero !=0){
                ult = numero%10;
                invertido = (invertido*10)+ult;
                numero = numero/10;    
            }
            numero=invertido;
            // numero latino
            sumatoria=0;
            while(numero!=0){
                long ultimo=numero%10;
                numero=numero/10;
                sumatoria+=ultimo;
                System.out.print(ultimo+((numero==0)?" = " :" + "));
            }
            System.out.println(sumatoria);
            if (sumatoria<10){
                procesando=false;
            }else{
                numero=sumatoria;
            }
        }
    }
}