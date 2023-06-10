import java.util.Scanner;

public class Taller1{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Mínimo 8 caracteres.- Al menos una letra mayúscula.- Al menos una letra minúscula.- Al menos un digito numérico.- Al menos un carácter especial como: . - * { } [ ] # $ % & / ? ¡ !- No debe contener espacios.");
        
        int maximo = 0;
        int mayuscula = 0;
        int minuscula = 0;
        int numero = 0;
        int caracteres = 0;
        int espacios = 0;

        int i = 0;
        while (i<1){
            System.out.print("Ingrse una contraseña ");
            String contra = entrada.nextLine();

            for (int j = 0; j<contra.length();j++){
                if (contra.length()>8){
                    //Mayuscuals
                    if (contra.charAt(j)>65 && contra.charAt(j)<90){
                        mayuscula++;
                    }
                    //Minusculas
                    if (contra.charAt(j)>97 && contra.charAt(j)<122){
                        minuscula++;
                    }
                    //Numero
                    if (contra.charAt(j)>=48 && contra.charAt(j)<=57){
                        numero++;
                    }
                    //Carecter especial
                    if (contra.charAt(j)==250 || contra.charAt(j)==45 || contra.charAt(j)==123 || contra.charAt(j)== 125 || contra.charAt(j)== 91 || contra.charAt(j)== 93 || contra.charAt(j)== 42 || contra.charAt(j)== 36 || contra.charAt(j)== 37 || contra.charAt(j)== 38 || contra.charAt(j)== 92 || contra.charAt(j)== 63 || contra.charAt(j)== 33 || contra.charAt(j)== 33 || contra.charAt(j)== 161){
                        caracteres++;
                    }
                    //Espacios 
                    if (contra.charAt(j)==32){
                        espacios++;
                    }
                }else{
                    maximo++;
                }
            }
            if (mayuscula>=1 && minuscula>=1 && numero>=1 && caracteres>=1 && espacios==0 && maximo==0){
                System.out.println("La contraseña es valida");
                i++;
            }else {
                System.out.println("La contraseña no es valida");
            }
        }
    }
}