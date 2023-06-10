import java.util.Scanner;

public class Taller5{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre de ususario ");
        String nombre = entrada.nextLine();
        String palabra = "hola";
        String guiones = "____";
        int i = 0;
        char letra;
        while(i<1){
            char guardar [] = new char [4]; 
            System.out.println(" ");
            System.out.print("Ingrese 1 para iniciar el juego o 2 para salir ");
            int opcion = entrada.nextInt();
            if (opcion==1){
                int j = 0;
                while (j<4){
                    System.out.println(" ");
                    System.out.println("Ingrese una letra");
                    letra = entrada.next().charAt(0);
                    guardar [j] = letra;

                    for (int Q=0;Q<4;Q++){
                        char separar = palabra.charAt(Q);
                        char separar2 = guiones.charAt(Q);
                        if (letra==separar){
                            System.out.println(" ");
                            System.out.println("letra encontrada");
                            for (int A=0;A<4;A++){
                                System.out.print(guardar[A]);
                            }
                            j++;
                        }else{
                            System.out.print(separar2);
                        }
                    }
                }
                System.out.println(" ");
                System.out.println("Palabra encontrada "+palabra);   
            }else{
                i++;
            }
        }

    }
}