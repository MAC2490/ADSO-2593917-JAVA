import java.util.Scanner;
public class Taller8{
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        int numero;
        System.out.println ("ingrese un numero maximo de 6 digitos");
        numero = entrada.nextInt();
    
        /*de 0 a 100 */
        int primer_numero=(numero/10)%10;
        int segundo_numero=numero%10;
        
        /* de 999.999 a 100*/
        int numero_1 = (numero/100)%10;
        int numero_2 = (numero/10)%10;
        int numero_3 = numero%10;
        int numero_4 = (numero/100000)%10;
        int numero_5 = (numero/10000)%10;
        int numero_6 = (numero/1000)%10;
        
       /* segunda parte numeros 6 digitos*/
        if (numero_4==1 && numero_5==0 && numero_6==0){
            System.out.print(" cien ");
        }else if (numero_4==2 && numero_5>=0 && numero_6>=0){
            System.out.print(" docientos ");
        }else if (numero_4==3 && numero_5>=0 && numero_6>=0){
            System.out.print(" tresientos ");
        }else if (numero_4==4 && numero_5>=0 && numero_6>=0){
            System.out.print(" cuatrocientos ");
        }else if (numero_4==5 && numero_5>=0 && numero_6>=0){
            System.out.print(" quinientos ");
        }else if (numero_4==6 && numero_5>=0 && numero_6>=0){
            System.out.print(" seisientos ");
        }else if (numero_4==7 && numero_5>=0 && numero_6>=0){
            System.out.print(" setecientos ");
        }else if (numero_4==8 && numero_5>=0 && numero_6>=0){
            System.out.print(" ochocientos ");
        }else if (numero_4==9 && numero_5>=0 && numero_6>=0){
            System.out.print(" novecientos ");
        }
        if (numero_4==1 && numero_5>=1 && numero_6>=1){
            System.out.print(" ciento ");
        }

        if (numero_5==1 && numero_6>0){
            if (numero_6==0){
                System.out.print(" diez ");
            }else if (numero_6==1){
                System.out.print(" once ");
            }else if (numero_6==2){
                System.out.print(" doce ");
            }else if (numero_6==3){
                System.out.print(" trece ");
            }else if (numero_6==4){
                System.out.print(" catorce ");
            }else if (numero_6==5){
                System.out.print(" quince ");
            }else if (numero_6==6 || numero_6==7 || numero_6==8 || numero_6==9){
                System.out.print(" diesi "); /*pendiente*/
            }
        }
        if (numero_6==0){
            if (numero_5==2){
                System.out.print(" veinte ");
            }else if (numero_5==3){
                System.out.print(" treinta ");
            }else if (numero_5==4){
                System.out.print(" cuarenta ");
            }else if (numero_5==5){
                System.out.print(" cincuenta ");
            }else if (numero_5==6){
                System.out.print(" sesenta ");
            }else if (numero_5==7){
                System.out.print(" setenta ");
            }else if (numero_5==8){
                System.out.print(" ochenta ");
            }else if (numero_5==9){
                System.out.print(" noventa ");
            }  
        }
        if (numero_6>0){
            if (numero_5==2){
                System.out.print(" veinti");
            }else if (numero_5==3){
                System.out.print(" treinta y ");
            }else if (numero_5==4){
                System.out.print(" cuarenta y ");
            }else if (numero_5==5){
                System.out.print(" cincuenta y ");
            }else if (numero_5==6){
                System.out.print(" sesenta y ");
            }else if (numero_5==7){
                System.out.print(" setenta y ");
            }else if (numero_5==8){
                System.out.print(" ochenta y ");
            }else if (numero_5==9){
                System.out.print(" noventa y ");
            }  
        }
        
        if (numero_6==1){
            System.out.print("uno");
        }else if (numero_6==2){
            System.out.print("dos ");
        }else if (numero_6==3){
            System.out.print("tres ");
        }else if (numero_6==4){
            System.out.print(" cuatro ");
        }else if (numero_6==5){
            System.out.print(" cinco ");
        }else if (numero_6==6){
            System.out.print(" seis ");
        }else if (numero_6==7){
            System.out.print(" siete ");
        }else if (numero_6==8){
            System.out.print(" ocho ");
        }else if  (numero_6==9){
            System.out.print(" nueve ");
        }
        /* */
        System.out.print(" mil ");
       if (numero_1==1 && numero_2==0 && numero_3==0){
            System.out.print(" cien ");
        }else if (numero_1==2 && numero_2>=0 && numero_3>=0){
            System.out.print(" docientos ");
        }else if (numero_1==3 && numero_2>=0 && numero_3>=0){
            System.out.print(" tresientos ");
        }else if (numero_1==4 && numero_2>=0 && numero_3>=0){
            System.out.print(" cuatrocientos ");
        }else if (numero_1==5 && numero_2>=0 && numero_3>=0){
            System.out.print(" quinientos ");
        }else if (numero_1==6 && numero_2>=0 && numero_3>=0){
            System.out.print(" seisientos ");
        }else if (numero_1==7 && numero_2>=0 && numero_3>=0){
            System.out.print(" setecientos ");
        }else if (numero_1==8 && numero_2>=0 && numero_3>=0){
            System.out.print(" ochocientos ");
        }else if (numero_1==9 && numero_2>=0 && numero_3>=0){
            System.out.print(" novecientos ");
        }else if (numero_1>=0 && numero_2>=0 && numero_3>=0 && numero_4>=0 && numero_5>=0 && numero_6>=0){
            System.out.print(" mil. ");
        }        
        if (numero_1==1 && numero_2>=1 && numero_3>=1){
            System.out.print(" ciento ");
        }

        if (numero_2==1 && numero_3>0){
            if (numero_3==0){
                System.out.print(" diez ");
            }else if (numero_3==1){
                System.out.print(" once ");
            }else if (numero_3==2){
                System.out.print(" doce ");
            }else if (numero_3==3){
                System.out.print(" trece ");
            }else if (numero_3==4){
                System.out.print(" catorce ");
            }else if (numero_3==5){
                System.out.print(" quince ");
            }else if (numero_3==6 || numero_3==7 || numero_3==8 || numero_3==9){
                System.out.print(" diesi "); /*pendiente*/
            }
        }
        if (numero_3==0){
            if (numero_2==2){
                System.out.print(" veinte ");
            }else if (numero_2==3){
                System.out.print(" treinta ");
            }else if (numero_2==4){
                System.out.print(" cuarenta ");
            }else if (numero_2==5){
                System.out.print(" cincuenta ");
            }else if (numero_2==6){
                System.out.print(" sesenta ");
            }else if (numero_2==7){
                System.out.print(" setenta ");
            }else if (numero_2==8){
                System.out.print(" ochenta ");
            }else if (numero_2==9){
                System.out.print(" noventa ");
            }  
        }
        if (numero_3>0){
            if (numero_2==2){
                System.out.print(" veinti");
            }else if (numero_2==3){
                System.out.print(" treinta y ");
            }else if (numero_2==4){
                System.out.print(" cuarenta y ");
            }else if (numero_2==5){
                System.out.print(" cincuenta y ");
            }else if (numero_2==6){
                System.out.print(" sesenta y ");
            }else if (numero_2==7){
                System.out.print(" setenta y ");
            }else if (numero_2==8){
                System.out.print(" ochenta y ");
            }else if (numero_2==9){
                System.out.print(" noventa y ");
            }  
        }
        if (numero_2==0){
            if (numero_3==1){
                System.out.print("uno ");
            }else if (numero_3==2){
                System.out.print("dos ");
            }else if (numero_3==3){
                System.out.print("tres ");
            }else if (numero_3==4){
                System.out.print("cuatro ");
            }else if (numero_3==5){
                System.out.print(" cinco ");
            }else if (numero_3==6){
                System.out.print(" seis ");
            }else if (numero_3==7){
                System.out.print(" siete ");
            }else if (numero_3==8){
                System.out.print(" ocho ");
            }else if  (numero_3==9){
                System.out.print(" nueve ");
            }
        }
    }
}