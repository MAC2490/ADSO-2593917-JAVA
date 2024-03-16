import java.util.Scanner;
public class Taller6{
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        int numeros_seis;
        int opcion;
        int opcion_menu1;
        

        System.out.println ("escriba el codigo de seis digitos");
        numeros_seis = entrada.nextInt();
        System.out.println ("Menu:");
        System.out.println ("1. Sexto Sigito.  2. Quinto Digito. 3. Cuarto Digito.");
        System.out.println ("4. Tercer Digito.  5. Segundo Digito.  6. Primer Digito.");
        System.out.println ("ingrese una  opcion del menu");
        opcion = entrada.nextInt();
        
        if (opcion==1){
            opcion_menu1= numeros_seis%10;
            System.out.print("el primer digito es: " + opcion_menu1);
        }else if (opcion==2){
            opcion_menu1=(numeros_seis/10)%10;
            System.out.print("el segundo digito es: " + opcion_menu1);
        }else if (opcion==3){
            opcion_menu1=(numeros_seis/100)%10;
            System.out.print("el tercer digito es: " + opcion_menu1);
        }else if (opcion==4){
            opcion_menu1=(numeros_seis/1000)%10;
            System.out.print("el cuarto digito es: " + opcion_menu1);
        }else if (opcion==5){
            opcion_menu1=(numeros_seis/10000)%10;
            System.out.print("el quinto digito es: " + opcion_menu1);
        }else if (opcion==6){
            opcion_menu1=(numeros_seis/100000)%10;
            System.out.print("el sexto digito es: " + opcion_menu1);
        }
        
    }

}