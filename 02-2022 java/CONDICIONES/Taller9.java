import java.util.Scanner;
public class Taller9{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int dia;
        int mes;
        int ano;
        System.out.println("ingrese el dia");
        dia = entrada.nextInt();
        System.out.println("ingrese el mes");
        mes = entrada.nextInt();
        System.out.println("ingrese el ano");
        ano = entrada.nextInt();
         /*dias */
        int numero_1 = (dia/100)%10;
        int numero_2= (dia/10)%10;
        int numero_3 = dia%10;
        System.out.println("DIA " + dia + " MES " + mes + " ANO " + ano );
            
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
                System.out.print(" diesi ");
            }
        }
         if (numero_3==0){
            if (numero_2==2){
                System.out.print(" veinte ");
            }else if (numero_2==3){
                System.out.print(" treinta ");
            }
        }
        if (numero_3>0){
            if (numero_2==2){
                System.out.print(" veinti ");
            }
        }    

        if (numero_2>=0){
            if (numero_3==1){
                System.out.print(" uno ");
            }else if (numero_3==2){
                System.out.print(" dos ");
            }else if (numero_3==3){
                System.out.print(" tres ");
            }else if (numero_3==4){
                System.out.print(" cuatro ");
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
        System.out.print(" de ");
        /* meses*/
        if (mes==1){
            System.out.print(" Enero ");
        }else if (mes==2){
            System.out.print(" Febrero ");
        }else if (mes==3){
            System.out.print(" Marzo ");
        }else if (mes==4){
            System.out.print(" Abril ");
        }else if (mes==5){
            System.out.print(" Mayo ");
        }else if (mes==6){
            System.out.print(" Junio ");
        }else if (mes==7){
            System.out.print(" Julio ");
        }else if (mes==8){
            System.out.print(" Agosto ");
        }else if (mes==9){
            System.out.print(" Septiembre ");
        }else if (mes==10){
            System.out.print(" Octubre ");
        }else if (mes==11){
            System.out.print(" Noviembre ");
        }else if (mes==12){
            System.out.print(" Diciembre ");
        }
        System.out.print(" del dos mil ");
        /*año */
        int numero_4 = (ano/1000)%10;
        int numero_5 = (ano/100)%10;
        int numero_6 = (ano/10)%10;
        int numero_7 = ano%10;
        
        if (numero_6>0 && numero_7==0){
            if (numero_6==2){
                System.out.print(" veinte ");
            }else if (numero_6==3){
                System.out.print(" treinta ");
            }else if (numero_6==4){
                System.out.print(" cuarenta ");
            }else if (numero_6==5){
                System.out.print(" cincuenta ");
            }else if (numero_6==6){
                System.out.print(" sesenta ");
            }else if (numero_6==7){
                System.out.print(" setenta ");
            }else if (numero_6==8){
                System.out.print(" ochenta ");
            }else if (numero_6==9){
                System.out.print(" noventa ");
            }
        }
        if (numero_6>0 && numero_7>0){
            if (numero_6==2){
                System.out.print(" veinti ");
            }else if (numero_6==3){
                System.out.print(" treinta y ");
            }else if (numero_6==4){
                System.out.print(" cuarenta y ");
            }else if (numero_6==5){
                System.out.print(" cincuenta y ");
            }else if (numero_6==6){
                System.out.print(" sesenta y ");
            }else if (numero_6==7){
                System.out.print(" setenta y ");
            }else if (numero_6==8){
                System.out.print(" ochenta y ");
            }else if (numero_6==9){
                System.out.print(" noventa y ");
            }
        }
        if (numero_7==1){
            System.out.print(" uno ");
        }else if (numero_7==2){
            System.out.print(" dos ");
        }else if (numero_7==3){
            System.out.print(" tres ");
        }else if (numero_7==4){
            System.out.print(" cuatro ");
        }else if (numero_7==5){
            System.out.print(" cinco ");
        }else if (numero_7==6){
            System.out.print(" seis ");
        }else if (numero_7==7){
            System.out.print(" siete ");
        }else if (numero_7==8){
            System.out.print(" ocho ");
        }else if (numero_7==9){
            System.out.print(" nueve ");
        }

    }
}