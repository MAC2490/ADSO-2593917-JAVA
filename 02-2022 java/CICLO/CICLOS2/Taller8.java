import java.util.Scanner;
public class Taller8{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" Ingrese un numero: ");
        int numero=entrada.nextInt();
        int  cont=1;
        for (int i=1;i<=numero;i++){
            for(int j=1;j<=numero;j++){ 
                if (cont%2==0){
                    int m=0;
                    while (m<1){
                        int aleatorio = (int)(Math.random()*999);
                        //algoritmo para determinar si el numero es primo 
                        int acumulador = 0;
                        int a=1;
                        while (a<=aleatorio){           
                            if (aleatorio%a==0){
                                acumulador++;
                            }
                            a++;
                        }
                        if (acumulador>2){
                            System.out.print(" "+((aleatorio<10)? "00" : ((aleatorio<100)? "0":"" ) )+aleatorio + " ");
                            m++;
                        }
                    }        
                }else{
                    int m=0;
                    while (m<1){
                        int aleatorio = (int)(Math.random()*999);
                        //algoritmo para determinar si el numero es primo 
                        int acumulador = 0;
                        int a=1;
                        while (a<=aleatorio){           
                            if (aleatorio%a==0){
                                acumulador++;
                            }
                            a++;
                        }
                        if (acumulador==2){
                            System.out.print(" "+((aleatorio<10)? "00" : ((aleatorio<100)? "0":"" ) )+aleatorio + " ");
                            m++;
                        }
                    }
                }
                cont++;
            }
            System.out.println(" ");
        }

    }
}