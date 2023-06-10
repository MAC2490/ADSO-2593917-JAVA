import java.util.Scanner;
public class Taller2 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("1.Guatica   2.La celia  3.La virginia   4.Marsella   5.Mistrato");
        System.out.print("=>Ingrese origen: ");
        int origen = entrada.nextInt();
        System.out.print("=>Ingrese cantidad de paradas: ");
        int paradas = entrada.nextInt(); 
        System.out.print("=>cuantos km recorre por galon: ");
        int km_galon = entrada.nextInt();
        System.out.print("=>Cual es el precio del galon hoy: ");
        int precio_galon = entrada.nextInt(); 

        //guatica
        double guatica_a_celia = 91.1;
        double guatica_a_virginia = 60.0;
        double guatica_a_marsella  = 98.5;
        double guatica_a_mistrato = 25.1;
        //la celia 
        double celia_a_guatica = 91.1;
        double celia_a_virginia = 33.9;
        double celia_a_marsella = 87.2;
        double celia_a_mistrato  = 88.1;
        //la virginia 
        double virginia_a_guatica = 60.0;
        double virginia_a_celia = 34.0;
        double virginia_a_marsella = 53.3;
        double virginia_a_mistrato = 56.9
        //maresella 
        double marsella_a_guatica = 98.4;
        double marsella_a_celia = 87.0;
        double marsella_a_virginia = 53.0;
        double marsella_a_mistrato = 110.0;
        //mistrato
        double mistrato_a_guatica = 25.1;
        double mistrato_a_celia = 88.1;
        double mistrato_a_virginia = 57.0;
        
    }
}