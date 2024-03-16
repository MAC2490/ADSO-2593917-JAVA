import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tricki extends JFrame{

	private char tablero_interno [] [];
	private JLabel tablero_externo [] [];
	private int fila;
	private int col;
	private int turno;

	public Tricki(){
		this.fila = 0;
		this.col = 0;
		this.turno = 1;
		initComponent();
	}

	public void initComponent(){
		Toolkit dimension = Toolkit.getDefaultToolkit();
		Dimension tamanio = dimension.getScreenSize();

		JPanel contenedor = new JPanel();

		contenedor.setLayout(new GridBagLayout());
		contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridBagConstraints restricciones = new GridBagConstraints();


		tablero_interno = new char [3][3];
		tablero_externo = new JLabel [3][3];
		for (int i = 0;i<this.tablero_interno.length ; i++) {
			for (int j = 0; j<this.tablero_interno.length; j++) {
				tablero_externo [i] [j] = new JLabel();
				tablero_externo [i] [j].setBorder(BorderFactory.createLineBorder(Color.white));
				tablero_externo [i] [j].setHorizontalAlignment(SwingConstants.CENTER);
				tablero_interno [i] [j] = ' ';
				restricciones.gridy = i;
				restricciones.gridx = j;
				restricciones.gridwidth = 1;
				restricciones.gridheight = 1;
				restricciones.weightx = 1;
				restricciones.weighty = 1;
				restricciones.fill = GridBagConstraints.BOTH;
				contenedor.add(tablero_externo [i][j],restricciones);
			}	
		} 

		for (int a = 0;a<this.tablero_externo.length ; a++) {
    		for (int b = 0; b<this.tablero_externo.length; b++) {
        		
    			final int fila_temp = a;
    			final int columna_temp = b;

        		tablero_externo[a][b].addMouseListener(new MouseListener(){
		            @Override
		            public void mouseClicked(MouseEvent e){
		                agregarAccionJugador(fila_temp, columna_temp);
		            }	

		            @Override
		            public void mousePressed(MouseEvent e) {}

		            @Override
		            public void mouseReleased(MouseEvent e) {}

		            @Override
		            public void mouseEntered(MouseEvent e) {}

		            @Override
		            public void mouseExited(MouseEvent e) {}
		        });
		    }
		}


		setTitle ("Tricki");
		setSize ( (int) (tamanio.width*0.4), (int) (tamanio.height*0.5));
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setLocationRelativeTo (null);
		setVisible (true); 

		add(contenedor);
		imprimirTablero();
		revalidate();
	}

	public void imprimirTablero(){
		for (int i=0;i<this.tablero_interno.length; i++) {
			for (int j=0;j<this.tablero_interno.length; j++) {
				this.tablero_externo[i][j].setText(String.valueOf(tablero_interno[i][j]));
			}	
		}
	}

	public void agregarAccionJugador(int fila_user, int columna_user){
		if (tablero_interno [fila_user][columna_user] == ' ' && this.turno==1) {
			System.out.println("Jugador");
			tablero_interno[fila_user][columna_user] = 'X';
			imprimirTablero();
			
			if(validarGanador()){
				imprimirVentanaGanador();
				// validarTableroLleno();
			}else{
				this.turno = 2;
				turnoMaquina();
			}

		}	
	}

	public void turnoMaquina(){
		if(!validarTableroLleno()){
			boolean realizado = jugadasAtaque();
			if(!realizado){
				jugadasDefensa();
			}
			imprimirTablero();

			if(validarGanador()){
				imprimirVentanaGanador();
			}else if(validarTableroLleno()){
				imprimirVentanaEmpate();
			}else{
				this.turno = 1;
			}
		}else{
			imprimirVentanaEmpate();
		}
	}

	public boolean validarGanador(){
		if ( (tablero_interno [0][0] == tablero_interno [0][1]  && tablero_interno [0][0] == tablero_interno [0][2]  && tablero_interno [0][0] != ' ') || 
			 (tablero_interno [1][0] == tablero_interno [1][1]  && tablero_interno [1][0] == tablero_interno [1][2]  && tablero_interno [1][0] != ' ') || 
			 (tablero_interno [2][0] == tablero_interno [2][1]  && tablero_interno [2][0] == tablero_interno [2][2]  && tablero_interno [2][0] != ' ') ||
			 
			 (tablero_interno [0][0] == tablero_interno [1][0]  && tablero_interno [0][0] == tablero_interno [2][0]  && tablero_interno [0][0] != ' ') || 
			 (tablero_interno [0][1] == tablero_interno [1][1]  && tablero_interno [0][1] == tablero_interno [2][1]  && tablero_interno [0][1] != ' ') || 
			 (tablero_interno [0][2] == tablero_interno [1][2]  && tablero_interno [0][2] == tablero_interno [2][2]  && tablero_interno [0][2] != ' ') || 

			 (tablero_interno [0][0] == tablero_interno [1][1]  && tablero_interno [0][0] == tablero_interno [2][2]  && tablero_interno [0][0] != ' ') || 
			 (tablero_interno [2][0] == tablero_interno [1][1]  && tablero_interno [2][0] == tablero_interno [0][2]  && tablero_interno [2][0] != ' ' )
			) {
			return true;
		}
		return false;
	}

	public boolean validarTableroLleno(){
		boolean empate = true;
		for (int i=0;i<this.tablero_interno.length; i++) {
			for (int j=0;j<this.tablero_interno.length; j++) {
				if (tablero_interno [i][j] != ' ') {
					empate = false;
				}
			}	
		}
		return empate;
	}

	public void imprimirVentanaEmpate(){
		Toolkit dimension = Toolkit.getDefaultToolkit();
      	Dimension tamanio = dimension.getScreenSize();

	    JFrame ventana = new JFrame();

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.BLACK);

	    JLabel ganador = new JLabel("EMPATE");
	    ganador.setForeground(Color.YELLOW);
	    contenedor.add(ganador);

	    ventana.setTitle("Empate");
	    ventana.setSize((int) (tamanio.width * 0.4), (int) (tamanio.height * 0.5));
	    ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    ventana.setLocationRelativeTo(null);
	    ventana.add(contenedor);
	    ventana.setVisible(true);

	    ventana.pack();
	}

	public void imprimirVentanaGanador(){

		Toolkit dimension = Toolkit.getDefaultToolkit();
      	Dimension tamanio = dimension.getScreenSize();

	    JFrame ventana = new JFrame();

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.BLACK);

	    JLabel ganador = new JLabel("GAME OVER");
	    ganador.setForeground(Color.YELLOW);
	    contenedor.add(ganador);

	    ventana.setTitle("Ganador");
	    ventana.setSize((int) (tamanio.width * 0.4), (int) (tamanio.height * 0.5));
	    ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    ventana.setLocationRelativeTo(null);
	    ventana.add(contenedor);
	    ventana.setVisible(true);

	    ventana.pack();
	}

	public void limpiarTablero(){
		for (int i=0;i<this.tablero_interno.length; i++) {
			for (int j=0;j<this.tablero_interno.length; j++) {
				tablero_interno [i][j] = ' ';
			}	
		}
		this.turno = 1;
	}

	public boolean jugadasDefensa(){
		
		if (tablero_interno[0][0]=='X' && tablero_interno[0][1]=='X' && tablero_interno[0][2]==' '){
			tablero_interno[0][2] = 'O';
			return true;
		}else if (tablero_interno[1][0]=='X' && tablero_interno[1][1]=='X' && tablero_interno[1][2]==' '){
			tablero_interno[1][2] = 'O';
			return true;
		}else if (tablero_interno[2][0]=='X' && tablero_interno[2][1]=='X' && tablero_interno[2][2]==' '){
			tablero_interno[2][2] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='X' && tablero_interno[0][1]==' ' && tablero_interno[0][2]=='X'){
			tablero_interno[0][1] = 'O';
			return true;
		}else if (tablero_interno[1][0]=='X' && tablero_interno[1][1]==' ' && tablero_interno[1][2]=='X'){
			tablero_interno[1][1] = 'O';
			return true;
		}else if (tablero_interno[2][0]=='X' && tablero_interno[2][1]==' ' && tablero_interno[2][2]=='X'){
			tablero_interno[2][1] = 'O';
			return true;
		}else if (tablero_interno[0][0]==' ' && tablero_interno[0][1]=='X' && tablero_interno[0][2]=='X'){
			tablero_interno[0][0] = 'O';
			return true;
		}else if (tablero_interno[1][0]==' ' && tablero_interno[1][1]=='X' && tablero_interno[1][2]=='X'){
			tablero_interno[1][0] = 'O';
			return true;
		}else if (tablero_interno[2][0]==' ' && tablero_interno[2][1]=='X' && tablero_interno[2][2]=='X'){
			tablero_interno[2][0] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='X' && tablero_interno[1][0]=='X' && tablero_interno[2][0]==' '){
			tablero_interno[2][0] = 'O';
			return true;
		}else if (tablero_interno[0][1]=='X' && tablero_interno[1][1]=='X' && tablero_interno[2][1]==' '){
			tablero_interno[2][1] = 'O';
			return true;
		}else if (tablero_interno[0][2]=='X' && tablero_interno[1][2]=='X' && tablero_interno[2][2]==' '){
			tablero_interno[2][2] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='X' && tablero_interno[1][0]==' ' && tablero_interno[2][0]=='X'){
			tablero_interno[1][0] = 'O';
			return true;
		}else if (tablero_interno[0][1]=='X' && tablero_interno[1][1]==' ' && tablero_interno[2][1]=='X'){
			tablero_interno[1][1] = 'O';
			return true;
		}else if (tablero_interno[0][2]=='X' && tablero_interno[1][2]==' ' && tablero_interno[2][2]=='X'){
			tablero_interno[1][2] = 'O';
			return true;
		}else if (tablero_interno[0][0]==' ' && tablero_interno[1][0]=='X' && tablero_interno[2][0]=='X'){
			tablero_interno[0][0] = 'O';
			return true;
		}else if (tablero_interno[0][1]==' ' && tablero_interno[1][1]=='X' && tablero_interno[2][1]=='X'){
			tablero_interno[0][1] = 'O';
			return true;
		}else if (tablero_interno[0][2]==' ' && tablero_interno[1][2]=='X' && tablero_interno[2][2]=='X'){
			tablero_interno[0][2] = 'O';
			return true;
		}else if (tablero_interno[0][0]==' ' && tablero_interno[1][1]=='X' && tablero_interno[2][2]=='X'){
			tablero_interno[0][0] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='X' && tablero_interno[1][1]==' ' && tablero_interno[2][2]=='X'){
			tablero_interno[1][1] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='X' && tablero_interno[1][1]=='X' && tablero_interno[2][2]==' '){
			tablero_interno[2][2] = 'O';
			return true;
		}else if (tablero_interno[0][2]==' ' && tablero_interno[1][1]=='X' && tablero_interno[2][0]=='X'){
			tablero_interno[0][2] = 'O';
			return true;
		}else if (tablero_interno[0][2]=='X' && tablero_interno[1][1]==' ' && tablero_interno[2][0]=='X'){
			tablero_interno[1][1] = 'O';
			return true;
		}else if (tablero_interno[0][2]=='X' && tablero_interno[1][1]=='X' && tablero_interno[2][0]==' '){
			tablero_interno[2][0] = 'O';
			return true;
		// }else if (tablero_interno[0][0]=='X' || tablero_interno[0][2]=='X' || tablero_interno[2][0]=='X' || tablero_interno[2][2]=='X' && tablero_interno[1][1]==' '){
		// 	tablero_interno[1][1] = 'O';
		// 	System.out.println("02");
		// 	return true;
		}else if(tablero_interno[1][1]=='X' && tablero_interno[0][0]==' '){
			tablero_interno[0][0] = 'O';
			System.out.println("03");
			return true;
		}else{
			int fila_rand = (int) (Math.random()*2);
			int columna_rand = (int) (Math.random()*2);;  
			while(tablero_interno[fila_rand][columna_rand]!=' '){
				fila_rand = (int) (Math.random()*2);
				columna_rand = (int) (Math.random()*2);
				if (!validarTableroLleno()) {
					break;
				}
			}
			tablero_interno[fila_rand][columna_rand]='O';
			return true;	
		}
	}

	public boolean jugadasAtaque(){
		if (tablero_interno[0][0]=='O' && tablero_interno[0][1]=='O' && tablero_interno[0][2]==' '){
			tablero_interno[0][2] = 'O';
			return true;
		}else if (tablero_interno[1][0]=='O' && tablero_interno[1][1]=='O' && tablero_interno[1][2]==' '){
			tablero_interno[1][2] = 'O';
			return true;
		}else if (tablero_interno[2][0]=='O' && tablero_interno[2][1]=='O' && tablero_interno[2][2]==' '){
			tablero_interno[2][2] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='O' && tablero_interno[0][1]==' ' && tablero_interno[0][2]=='O'){
			tablero_interno[0][1] = 'O';
			return true;
		}else if (tablero_interno[1][0]=='O' && tablero_interno[1][1]==' ' && tablero_interno[1][2]=='O'){
			tablero_interno[1][1] = 'O';
			return true;
		}else if (tablero_interno[2][0]=='O' && tablero_interno[2][1]==' ' && tablero_interno[2][2]=='O'){
			tablero_interno[2][1] = 'O';
			return true;
		}else if (tablero_interno[0][0]==' ' && tablero_interno[0][1]=='O' && tablero_interno[0][2]=='O'){
			tablero_interno[0][0] = 'O';
			return true;
		}else if (tablero_interno[1][0]==' ' && tablero_interno[1][1]=='O' && tablero_interno[1][2]=='O'){
			tablero_interno[1][0] = 'O';
			return true;
		}else if (tablero_interno[2][0]==' ' && tablero_interno[2][1]=='O' && tablero_interno[2][2]=='O'){
			tablero_interno[2][0] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='O' && tablero_interno[1][0]=='O' && tablero_interno[2][0]==' '){
			tablero_interno[2][0] = 'O';
			return true;
		}else if (tablero_interno[0][1]=='O' && tablero_interno[1][1]=='O' && tablero_interno[2][1]==' '){
			tablero_interno[2][1] = 'O';
			return true;
		}else if (tablero_interno[0][2]=='O' && tablero_interno[1][2]=='O' && tablero_interno[2][2]==' '){
			tablero_interno[2][2] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='O' && tablero_interno[1][0]==' ' && tablero_interno[2][0]=='O'){
			tablero_interno[1][0] = 'O';
			return true;
		}else if (tablero_interno[0][1]=='O' && tablero_interno[1][1]==' ' && tablero_interno[2][1]=='O'){
			tablero_interno[1][1] = 'O';
			return true;
		}else if (tablero_interno[0][2]=='O' && tablero_interno[1][2]==' ' && tablero_interno[2][2]=='O'){
			tablero_interno[1][2] = 'O';
			return true;
		}else if (tablero_interno[0][0]==' ' && tablero_interno[1][0]=='O' && tablero_interno[2][0]=='O'){
			tablero_interno[0][0] = 'O';
			return true;
		}else if (tablero_interno[0][1]==' ' && tablero_interno[1][1]=='O' && tablero_interno[2][1]=='O'){
			tablero_interno[0][1] = 'O';
			return true;
		}else if (tablero_interno[0][2]==' ' && tablero_interno[1][2]=='O' && tablero_interno[2][2]=='O'){
			tablero_interno[0][2] = 'O';
			return true;
		}else if (tablero_interno[0][0]==' ' && tablero_interno[1][1]=='O' && tablero_interno[2][2]=='O'){
			tablero_interno[0][0] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='O' && tablero_interno[1][1]==' ' && tablero_interno[2][2]=='O'){
			tablero_interno[1][1] = 'O';
			return true;
		}else if (tablero_interno[0][0]=='O' && tablero_interno[1][1]=='O' && tablero_interno[2][2]==' '){
			tablero_interno[2][2] = 'O';
			return true;
		}else if (tablero_interno[0][2]==' ' && tablero_interno[1][1]=='O' && tablero_interno[2][0]=='O'){
			tablero_interno[0][2] = 'O';
			return true;
		}else if (tablero_interno[0][2]=='O' && tablero_interno[1][1]==' ' && tablero_interno[2][0]=='O'){
			tablero_interno[1][1] = 'O';
			return true;
		}else if (tablero_interno[0][2]=='O' && tablero_interno[1][1]=='O' && tablero_interno[2][0]==' '){
			tablero_interno[2][0] = 'O';
			return true;
		}
		return false;
	}

}