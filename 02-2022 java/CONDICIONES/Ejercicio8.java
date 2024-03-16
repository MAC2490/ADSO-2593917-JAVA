import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("INGRESE UN NUERO DE 6 DIGITOS (OBLIGATORIAMENTE NO SEA TERCO)");
        numero = entrada.nextInt();

        int miles = numero / 1000;
        int cientos = numero % 1000;
        

        if(miles!=0){
            int centena = miles/100;
            int decena = (miles/10)%10;
            int unidad = miles%10;

            // Imprimir cientos
            if(centena==1 && decena==0 && unidad==0){
                System.out.print(" CIEN ");
            }else if(centena==1 && decena>0 && unidad>=0) {
                System.out.print(" CIENTO ");
                
            }else if(centena==2){
                System.out.print(" DOCIENTOS ");
            }else if(centena==3){
                System.out.print(" TRECIENTOS ");
            }else if(centena==4){
                System.out.print(" CUATROCIENTOS ");
            }else if(centena==5){
                System.out.print(" QUINIENTOS ");
            }else if(centena==6){
                System.out.print(" SEISCIENTOS ");
            }else if(centena==7){
                System.out.print(" SETECIENTOS ");
            }else if(centena==8){
                System.out.print(" OCHOCIENTOS ");
            }else if(centena==9){
                System.out.print(" NOVECIENTOS ");
            }

            // Imprimir decenas
            if(decena==1){
                if (unidad==0){
                    System.out.print(" DIEZ ");
                }else if(unidad==1){
                    System.out.print(" ONCE ");
                }else if (unidad==2){
                    System.out.print(" DOCE ");
                }else if (unidad==3){
                    System.out.print(" TRECE ");
                }else if (unidad==4){
                    System.out.print(" CATORCE ");
                }else if (unidad==5){
                    System.out.print(" QUINCE ");
                }else{
                    System.out.print(" DIESI ");
                }
            }else if(decena==2){
                if(unidad==0){
                    System.out.print(" VEINTE ");
                }else{
                    System.out.print(" VENTI");
                }
            }else if(decena==3){
                if(unidad==0){
                    System.out.print(" TREINTA ");
                }else{
                    System.out.print(" TREINTA Y ");
                }
            }else if(decena==4){
                if(unidad==0){
                    System.out.print(" CUARENTA ");
                }else{
                    System.out.print(" CUARENTA Y ");
                }
            }else if(decena==5){
                if(unidad==0){
                    System.out.print(" CINCUENTA ");
                }else{
                    System.out.print(" CINCUENTA Y ");
                }
            }else if(decena==6){
                if(unidad==0){
                    System.out.print(" SECENTA ");
                }else{
                    System.out.print(" SECENTA Y ");
                }
            }else if(decena==7){
                if(unidad==0){
                    System.out.print(" SETENTA ");
                }else{
                    System.out.print(" SETENTA Y ");
                }
            }else if(decena==8){
                if(unidad==0){
                    System.out.print(" OCHENTA ");
                }else{
                    System.out.print(" OCHENTA Y ");
                }
            }else if(decena==9){
                if(unidad==0){
                    System.out.print(" NOVENTA ");
                }else{
                    System.out.print(" NOVENTA Y ");
                }
            }

            // Imprimir unidades
                if(unidad==1){
                    if(centena==0 && unidad==1 && decena==1){
                        System.out.print("");
                    }else{
                    System.out.print("UN");
                    }
                }else if(unidad==2){
                    if(centena==0 && unidad==2 && decena==1){
                        System.out.print("");
                    }else{
                    System.out.print("DOS");
                    }
                }else if(unidad==3){
                    if(centena==0 && unidad==3 && decena==3){
                        System.out.print("");
                    }else{
                    System.out.print("TRES ");
                    }
                }else if(unidad==4){
                    if(centena==0 && unidad==4 && decena==4){
                        System.out.print("");
                    }else{
                    System.out.print("CUATRO ");
                    }
                }else if(unidad==5){
                    if(centena==0){
                        System.out.print("");
                    }else{
                    System.out.print("CINCO ");
                    }
                }else if(unidad==6){
                    if(centena==0){
                        System.out.print("");
                    }else{
                    System.out.print("SEIS ");
                    }
                }else if(unidad==7){
                    if(centena==0){
                        System.out.print("");
                    }else{
                    System.out.print("SIETE ");
                    }
                }else if(unidad==8){
                    if(centena==0){
                        System.out.print("");
                    }else{
                    System.out.print("OCHO ");
                    }
                }else if(unidad==9){
                    if(centena==0){
                        System.out.print("");
                    }else{
                    System.out.print("NUEVE ");
                    }
                }

            // Imprimir MIL
            System.out.print(" MIL ");
        } 
        if(cientos!=0){
            int cente = cientos/100;
            int dece = (cientos/10)%10;
            int uni = cientos%10;
            //imprimir cientos
            if(cente==1 && dece==0 && uni==0){
                System.out.print(" CIEN ");
            }else if(cente==1 && dece>0 && uni>=0){
                System.out.print(" CIENTO ");
            }else if(cente==2){
                System.out.print(" DOCIENTOS ");
            }else if(cente==3){
                System.out.print(" TRECIENTOS ");
            }else if(cente==4){
                System.out.print(" CUATROCIENTOS ");
            }else if(cente==5){
                System.out.print(" QUINIENTOS ");
            }else if(cente==6){
                System.out.print(" SEISCIENTOS ");
            }else if(cente==7){
                System.out.print(" SETECIENTOS ");
            }else if(cente==8){
                System.out.print(" OCHOCIENTOS ");
            }else if(cente==9){
                System.out.print(" NOVECIENTOS ");
            } 
            //IMPRIMIR EL DECENA DE LOS ULTIMOS TRES NUMEROS
            if(dece==1){
                if(uni==0){
                    System.out.print(" DIEZ ");
                }else if(uni==1){
                    System.out.print(" ONCE ");
                }else if(uni==2){
                    System.out.print(" DOCE ");
                }else if(uni==3){
                    System.out.print(" TRECE ");
                }else if(uni==4){
                    System.out.print(" CATORCE ");
                }else if(uni==5){
                    System.out.print(" QUINCE ");
                }else{
                    System.out.print(" DIECI ");
                } 
            }else if(dece==2){
                if(uni==0){
                    System.out.print(" VEINTE ");
                }else{
                    System.out.print(" VEINTI");
                }
            }else if(dece==3){
                if(uni==0){
                    System.out.print(" TREINTA ");
                }else{
                    System.out.print(" TREINTA Y ");
                }
            }else if(dece==4){
                if(uni==0){
                    System.out.print(" CUARENTA ");
                }else{
                    System.out.print(" CUARENTA Y ");
                }   
            }else if(dece==5){
                if(uni==0){
                    System.out.print(" CINCUENTA ");
                }else{
                    System.out.print(" CINCUENTA Y ");
                }   
            }else if(dece==6){
                if(uni==0){
                    System.out.print(" SECENTA ");
                }else{
                    System.out.print(" SECENTA Y ");
                }   
            }else if(dece==7){
                if(uni==0){
                    System.out.print(" OCHENTA ");
                }else{
                    System.out.print(" OCHENTA Y ");
                }   
            }else if(dece==8){
                if(uni==0){
                    System.out.print(" NOVENTA ");
                }else{
                    System.out.print(" NOVENTA Y ");
                }   
            }else if(dece==9){
                if(uni==0){
                    System.out.print(" NOVENTA ");
                }else{
                    System.out.print(" NOVENTA Y ");
                }   
            } 
            //IMPRIMIR LA UNIDAD EL ULTIMI DIGITO
                if(uni==1){
                    System.out.print(" UN ");
                }else if(uni==2){
                    System.out.print(" DOS ");
                }else if(uni==3){
                    System.out.print(" TRES ");
                }else if(uni==4){
                    System.out.print(" CUATRO ");
                }else if(uni==5){
                    System.out.print(" CINCO ");
                }else if(uni==6){
                    System.out.print(" SEIS ");
                }else if(uni==7){
                    System.out.print(" SIETE ");
                }else if(uni==8){
                    System.out.print(" OCHO ");
                }else if(uni==9){
                    System.out.print(" NUEVE ");
                }
            System.out.print(" PESOS ");

        }

    }
}