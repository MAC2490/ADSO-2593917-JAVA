import java.util.Scanner;
public class Taller2 {
    public static void main(String[] args) {
        //variable de entrada por variable 
        Scanner entrada = new Scanner(System.in);
        



        //Definiendo mapa del laberinto 
        int matriz [] [] = {
                                {1,1,1,1,1,1,1},
                                {1,0,0,0,1,0,3},
                                {1,0,1,0,1,0,1},
                                {1,0,1,0,1,0,1},
                                {2,0,1,0,0,0,1},
                                {1,1,1,1,1,1,1}
                            };

        //Ciclo del juego 
        boolean jugando = true;
        int pos_f = 0;
        int pos_c = 0;
        for (int a=0; a<matriz.length;a++){
            for (int b=0; b<matriz[a].length;b++){
                if (matriz[a][b]==2){
                    pos_f = a;
                    pos_c = b;
                }
            }
        }
        System.out.println(pos_c+" "+pos_f);
        while (jugando){
            //Imprimir el laberinto 
            for (int i=0;i<matriz.length;i++){
                for (int j=0;j<matriz[i].length;j++){
                    System.out.print(" "+matriz[i][j]+" ");
                }
                System.out.println(" ");
            }

            //Imprimir el menu
            System.out.println("1. Arriba. 2.Abajo. 3.Derecha. 4.Izquierda.");
            int opcion = entrada.nextInt();

            //Condiciones segun la seleccion del laberinto
            if (opcion==1){ //Codigo para mover Arriba
            //Preguntar si el movimiento es valido 
                if (matriz[pos_f-1][pos_c] == 0 ){
                    matriz[pos_f-1][pos_c] = 2;
                    matriz[pos_f][pos_c] = 0;

                    pos_f = pos_f-1;
                    pos_c = pos_c;
                }else if (matriz[pos_f-1][pos_c] == 3){
                    jugando=false;
                }
            } else if (opcion==2){ // Codigo para mover Abajo
                if (matriz[pos_f+1][pos_c] == 0 ){
                    matriz[pos_f+1][pos_c] = 2;
                    matriz[pos_f][pos_c] = 0;

                    pos_f = pos_f+1;
                    pos_c = pos_c;
                }else if (matriz[pos_f+1][pos_c] == 3){
                    jugando=false;
                }
                
            } else if (opcion==3){ // Codigo para mover Derecha
                if (matriz[pos_f][pos_c+1] == 0 ){
                    matriz[pos_f][pos_c+1] = 2;
                    matriz[pos_f][pos_c] = 0;

                    pos_f = pos_f;
                    pos_c = pos_c+1;
                }else if (matriz[pos_f][pos_c+1] == 3){
                    jugando=false;
                }
                
            } else if (opcion==4){ // Codigo para mover Izquierda
                if (matriz[pos_f][pos_c-1] == 0 ){
                    matriz[pos_f][pos_c-1] = 2;
                    matriz[pos_f][pos_c] = 0;

                    pos_f = pos_f;
                    pos_c = pos_c-1;
                }else if (matriz[pos_f][pos_c-1] == 3){
                    jugando=false;
                }
                
            } else if (opcion<1 || opcion>4){ // Codigo para validar el movimiento
                System.out.println("MOVIMIENTO INCORRECTO");
            }
        }
        System.out.println("GAME OVER");
    }
}