import java.util.Scanner;

public class Taller6{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del jugador 1 ");
        String p1 = entrada.nextLine();
        System.out.print("Ingrese el nombre del jugador 2 ");
        String p2 = entrada.nextLine();
        System.out.println("Usuario "+p1+" le corresponde la O");
        System.out.println("Usuario "+p2+" le corresponde la X");
        int Q = 0;
        while (Q<1){
            System.out.print("Presione 1 para iniciar el juego o 2 para salir ");
            int opcion = entrada.nextInt();
            if (opcion==1){
                char tablero [] []={
                                    {' ','|',' ','|',' '},
                                    {'_','|','_','|','_'},
                                    {' ','|',' ','|',' '},
                                    {'_','|','_','|','_'},
                                    {' ','|',' ','|',' '}
                                };
                int jugador1 = 0;
                int jugador2 = 0;
                int L = 0;
                while (L<=8){
                    if (L%2==0){
                        System.out.println("jugador "+p1+" es su turno");
                        //opsicion de seleccion de posicion
                        System.out.print("Ingrese un numero ");
                        int posicion = entrada.nextInt();
                        for (int i=0;i<5;i++){
                            for (int j=0;j<5;j++){
                                //condicion para seleccionar posicion 1 
                                if (posicion==1){
                                    if (tablero[0][0]==' '){
                                        tablero [0][0]='O';
                                    }else{
                                        //System.out.println("sitio ocupado");
                                    }
                                }
                                if (posicion==2){
                                    if (tablero[0][2]==' '){
                                        tablero [0][2]='O';
                                    }else{
                                        //System.out.println("sitio ocupado");
                                    }
                                }
                                if (posicion==3){
                                    if (tablero[0][4]==' '){
                                        tablero [0][4] ='O';
                                    }
                                }
                                if (posicion==4){
                                    if (tablero[2][0]==' '){
                                        tablero [2][0] ='O';
                                    }
                                }
                                if (posicion==5){
                                    if (tablero[2][2]==' '){
                                        tablero [2][2] ='O';
                                    }
                                }
                                if (posicion==6){
                                    if (tablero[2][4]==' '){
                                        tablero [2][4] ='O';
                                    }
                                }
                                if (posicion==7){
                                    if (tablero[4][0]==' '){
                                        tablero [4][0] ='O';
                                    }
                                }
                                if (posicion==8){
                                    if (tablero[4][2]==' '){
                                        tablero [4][2] ='O';
                                    }
                                }
                                if (posicion==9){
                                    if (tablero[4][4]==' '){
                                        tablero [4][4] ='O';
                                    }
                                }
                                //VICTORIAS HORIZONTALES
                                if (tablero[0][0]=='O'&&tablero[0][2]=='O'&&tablero[0][4]=='O'||tablero[2][0]=='O'&&tablero[2][2]=='O'&&tablero[2][4]=='O'||tablero[4][0]=='O'&&tablero[4][2]=='O'&&tablero[4][4]=='O'){
                                    L=8;
                                    jugador1++;
                                }
                                //VICTORIAS VERTICALES
                                if (tablero[0][0]=='O'&&tablero[2][0]=='O'&&tablero[4][0]=='O'||tablero[0][2]=='O'&&tablero[2][2]=='O'&&tablero[4][2]=='O'||tablero[0][4]=='O'&&tablero[2][4]=='O'&&tablero[4][4]=='O'){
                                    L=8;
                                    jugador1++;
                                }
                                //VICTORIAS EN DIAGONAL
                                if (tablero[0][0]=='O'&&tablero[2][2]=='O'&&tablero[4][4]=='O'||tablero[0][4]=='O'&&tablero[2][2]=='O'&&tablero[4][0]=='O'){
                                    L=8;
                                    jugador1++;
                                }
                            }
                        }
                        //IMPRIMIR EL TABLERO
                        for (int i=0;i<5;i++){
                            for (int j=0;j<5;j++){
                                System.out.print(tablero[i][j]);
                            }
                            System.out.println(" ");
                        }
                    }else{
                        System.out.println("jugador "+p2+" es su turno");
                        //opsicion de seleccion de posicion
                        System.out.print("Ingrese un numero ");
                        int posicion = entrada.nextInt();
                        for (int i=0;i<5;i++){
                            for (int j=0;j<5;j++){
                                //condicion para seleccionar posicion 1 
                                if (posicion==1){
                                    if (tablero[0][0]==' '){
                                        tablero [0][0]='X';
                                    }else{
                                        //System.out.println("sitio ocupado");
                                    }
                                }
                                if (posicion==2){
                                    if (tablero[0][2]==' '){
                                        tablero [0][2]='X';
                                    }else{
                                        //System.out.println("sitio ocupado");
                                    }
                                }
                                if (posicion==3){
                                    if (tablero[0][4]==' '){
                                        tablero [0][4] ='X';
                                    }
                                }
                                if (posicion==4){
                                    if (tablero[2][0]==' '){
                                        tablero [2][0] ='X';
                                    }
                                }
                                if (posicion==5){
                                    if (tablero[2][2]==' '){
                                        tablero [2][2] ='X';
                                    }
                                }
                                if (posicion==6){
                                    if (tablero[2][4]==' '){
                                        tablero [2][4] ='X';
                                    }
                                }
                                if (posicion==7){
                                    if (tablero[4][0]==' '){
                                        tablero [4][0] ='X';
                                    }
                                }
                                if (posicion==8){
                                    if (tablero[4][2]==' '){
                                        tablero [4][2] ='X';
                                    }
                                }
                                if (posicion==9){
                                    if (tablero[4][4]==' '){
                                        tablero [4][4] ='X';
                                    }
                                }
                                //VICTORIAS HORIZONTALES
                                if (tablero[0][0]=='X'&&tablero[0][2]=='X'&&tablero[0][4]=='X'||tablero[2][0]=='X'&&tablero[2][2]=='X'&&tablero[2][4]=='X'||tablero[4][0]=='X'&&tablero[4][2]=='X'&&tablero[4][4]=='X'){
                                    L=8;
                                    jugador2++;
                                }
                                //VICTORIAS VERTICALES
                                if (tablero[0][0]=='O'&&tablero[2][0]=='X'&&tablero[4][0]=='X'||tablero[0][2]=='X'&&tablero[2][2]=='X'&&tablero[4][2]=='X'||tablero[0][4]=='X'&&tablero[2][4]=='X'&&tablero[4][4]=='X'){
                                    L=8;
                                    jugador2++;
                                }
                                //VICTORIAS EN DIAGONAL
                                if (tablero[0][0]=='X'&&tablero[2][2]=='X'&&tablero[4][4]=='X'||tablero[0][4]=='X'&&tablero[2][2]=='X'&&tablero[4][0]=='X'){
                                    L=8;
                                    jugador2++;
                                }
                                
                            }
                        }
                        //IMPRIMIR EL TABLERO
                        for (int i=0;i<5;i++){
                            for (int j=0;j<5;j++){
                                System.out.print(tablero[i][j]);
                            }
                            System.out.println(" ");
                        }
                    } 
                    int empate = 0; 
                    if (jugador1>0){
                        System.out.println("GAME OVER");
                        System.out.println("EL JUGADOR "+p1+" GANO ");
                        empate++;
                    }else if (jugador2>0){
                        System.out.println("GAME OVER");
                        System.out.println("EL JUGADOR "+p2+" GANO ");
                        empate++;
                    }
                    
                    if (L==8 && empate==0){
                        System.out.println("GAME OVER");
                        System.out.println("EMPATE ");
                    }   
                    L++;
                }
            }else{
                Q++;
            }
        }
    }
}