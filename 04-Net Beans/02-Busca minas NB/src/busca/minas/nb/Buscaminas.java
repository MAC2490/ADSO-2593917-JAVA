package busca.minas.nb;



import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Buscaminas extends JFrame{
    
    JLabel etiqueta_minas;
    JLabel etiqueta_tiempo;
    JButton btn_happy;
    JButton tablero [][];
    int tablero_interno[][];
    int minas;
    boolean tablero_destapado;
        
    public Buscaminas(){
        this.minas = 20;
        this.tablero_interno = new int [9][9];
        this.tablero_destapado = true;
        
        crearTablero();
        initComponents();
    }
    
    public void initComponents(){
        setTitle("BuscaMinas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,400);
        setLocationRelativeTo(null);
        setResizable(false);
        
        Image icono = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") );
        setIconImage(icono);
        
        JPanel contenedor = new JPanel();
        GridBagLayout capa = new GridBagLayout();
        contenedor.setLayout(capa);
        contenedor.setBorder(new EmptyBorder(10,10,10,10));
        
        GridBagConstraints restriccion = new GridBagConstraints();
        
        // Creando Etiqueta Minas  
        this.etiqueta_minas = new JLabel("0"+this.minas, SwingConstants.CENTER);
        this.etiqueta_minas.setOpaque(true);
        this.etiqueta_minas.setBackground( Color.BLACK );
        this.etiqueta_minas.setForeground( Color.red );
        this.etiqueta_minas.setFont( new Font("Arial", Font.BOLD, 30) );
        this.etiqueta_minas.setBorder( new EmptyBorder(5,10,5,10) );
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        contenedor.add(this.etiqueta_minas, restriccion);
        
        // Creando Boton de Iniciar
        this.btn_happy = new JButton();
        Image img_iniciar = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_happy.png") ) ;
        img_iniciar = img_iniciar.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        this.btn_happy.setIcon( new ImageIcon(img_iniciar) );
        this.btn_happy.setFocusable(false);
        this.btn_happy.setBorder(new EmptyBorder(10,10,10,10));
        restriccion.gridx = 3;
        restriccion.gridy = 0;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        contenedor.add( this.btn_happy, restriccion);
        
        // Creando etiqueta Tiempo
        this.etiqueta_tiempo = new JLabel("000", SwingConstants.CENTER);
        this.etiqueta_tiempo.setOpaque(true);
        this.etiqueta_tiempo.setBackground( Color.BLACK );
        this.etiqueta_tiempo.setForeground( Color.red );
        this.etiqueta_tiempo.setFont( new Font("Arial", Font.BOLD, 30) );
        this.etiqueta_tiempo.setBorder( new EmptyBorder(5,10,5,10) );
        restriccion.gridx = 6;
        restriccion.gridy = 0;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        contenedor.add(this.etiqueta_tiempo, restriccion);
        
        // Creando Botones - Mapa
        this.tablero = new JButton[9][9];
        for (int i = 0; i<this.tablero_interno.length; i++) {
            for (int j = 0; j<this.tablero_interno[0].length; j++) {
                Image img_blanco = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_espacio.png"));
                img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                
                this.tablero[i][j] = new JButton();
                this.tablero[i][j].setIcon( new ImageIcon(img_blanco) );
                this.tablero[i][j].setFocusable(false);
                restriccion.gridx = j;
                restriccion.gridy = i+1;
                restriccion.gridwidth = 1;
                restriccion.gridheight = 1;
                restriccion.weightx = 1;
                restriccion.weighty = 1;
                restriccion.fill = GridBagConstraints.BOTH;
                contenedor.add( this.tablero[i][j], restriccion);
                
                final int fila = i;
                final int columna = j;
                ActionListener evento = new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        destaparCasilla( fila, columna);
                    }                    
                };
                this.tablero[i][j].addActionListener(evento);

                this.tablero[i][j].addMouseListener(new MouseListener(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                    }   

                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (e.getButton() == MouseEvent.BUTTON3) {
                            marcarBandera(fila,columna);
                        }
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {}

                    @Override
                    public void mouseEntered(MouseEvent e) {}

                    @Override
                    public void mouseExited(MouseEvent e) {}
                });
            }
        }
        
        add(contenedor);
        revalidate();
        setVisible(true);
    }
 
    public void destaparCasilla(int fila, int columna){
        // Es una casilla en blanco
        if (this.tablero_interno[fila][columna]==0) {
            Image img_blanco = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_espacio.png") );
            img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            this.tablero[fila][columna].setDisabledIcon( new ImageIcon(img_blanco) );
            this.tablero[fila][columna].setEnabled(false);
            destaparCasillasAlrededor(fila, columna);
        }
        
        // Es un numero 
        if (this.tablero_interno[fila][columna]>=1 && this.tablero_interno[fila][columna]<=8) {
            Image img_numero = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_num_"+this.tablero_interno[fila][columna]+".png") );
            img_numero = img_numero.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            this.tablero[fila][columna].setDisabledIcon( new ImageIcon(img_numero) );
            this.tablero[fila][columna].setEnabled(false);
        }
        
        // Es una mina
        if (this.tablero_interno[fila][columna]==9) {
            Image img_bomba = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") );
            img_bomba = img_bomba.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            this.tablero[fila][columna].setDisabledIcon( new ImageIcon(img_bomba) );
            this.tablero[fila][columna].setEnabled(false);
            destaparTablero();
        }
    }

    public void destaparTablero(){
        for (int i=0; i<this.tablero_interno.length; i++) {
            for (int j=0; j<tablero_interno.length; j++) {
                if (this.tablero_interno[i][j]==0) {
                    // Blanco
                    Image img_blanco = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_espacio.png") );
                    img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                    this.tablero[i][j].setDisabledIcon( new ImageIcon(img_blanco) );
                    this.tablero[i][j].setEnabled(false);
                }else if (this.tablero_interno[i][j]>=1 && this.tablero_interno[i][j]<=8) {
                    // Numero
                    Image img_numero = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_num_"+this.tablero_interno[i][j]+".png") );
                    img_numero = img_numero.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                    this.tablero[i][j].setDisabledIcon( new ImageIcon(img_numero) );
                    this.tablero[i][j].setEnabled(false);
                }else if (this.tablero_interno[i][j]==9) {
                    // Bomba
                    Image img_bomba = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") );
                    img_bomba = img_bomba.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                    this.tablero[i][j].setDisabledIcon( new ImageIcon(img_bomba) );
                    this.tablero[i][j].setEnabled(false);
                }
            }
        }
        imprimirVentanaPerdedora();
        this.tablero_destapado = false;
    }
   
    public void destaparCasillasAlrededor(int fila, int columna){
        if(fila-1>=0 && columna-1>=0 && this.tablero[fila-1][columna-1].isEnabled()){
            destaparCasilla(fila-1, columna-1);
        }
        if(fila-1>=0 && this.tablero[fila-1][columna].isEnabled()){
            destaparCasilla(fila-1, columna);
        }
        if(fila-1>=0 && columna+1<9 && this.tablero[fila-1][columna+1].isEnabled()){
            destaparCasilla(fila-1, columna+1);
        }
        if(fila+1<9 && columna+1<9 && this.tablero[fila+1][columna+1].isEnabled()){
            destaparCasilla(fila+1, columna+1);
        }
        if(fila+1<9 && columna+1<9 && this.tablero[fila+1][columna+1].isEnabled()){
            destaparCasilla(fila+1, columna+1);
        }
        if(fila+1<9 && this.tablero[fila+1][columna].isEnabled()){
            destaparCasilla(fila+1, columna);
        }
        if(fila+1<9 && columna-1>=0 && this.tablero[fila+1][columna-1].isEnabled()){
            destaparCasilla(fila+1, columna-1);
        }
        if(columna-1>=0 && this.tablero[fila][columna-1].isEnabled()){
            destaparCasilla(fila, columna-1);
        }
        if(columna+1<9 && this.tablero[fila][columna+1].isEnabled()){
            destaparCasilla(fila, columna+1);
        }
    }
    
    public void crearTablero(){
        int contador = 0;
        while (contador<this.minas) {
            int fila = (int) (Math.random()*(this.tablero_interno.length-1) );
            int columna = (int) (Math.random()*(this.tablero_interno[0].length-1));
            
            if(this.tablero_interno[fila][columna]==0){
                this.tablero_interno[fila][columna] = 9;
                contador++;
            }
        }
        
        completarTableroConNumeros();
        for (int i = 0; i<this.tablero_interno.length; i++) {
            for (int j = 0; j<this.tablero_interno[0].length; j++) {
                System.out.print("["+this.tablero_interno[i][j]+"]");
            }
            System.out.println();
        }
    }
    
    public void completarTableroConNumeros(){
        int limite_filas = this.tablero_interno.length;
        int limite_columnas = this.tablero_interno[0].length;
        
        for (int i = 0; i<limite_filas; i++) {
            for (int j = 0; j<limite_columnas; j++) {
                if(this.tablero_interno[i][j]==0){
                    int contador = 0;
                    
                    if( i-1>=0 && j-1>=0 && this.tablero_interno[i-1][j-1]==9 ){
                        contador++;
                    }
                    
                    if ( i-1>=0 && this.tablero_interno[i-1][j]==9) {
                        contador++;
                    }
                    
                    if ( i-1>=0 && j+1<limite_columnas && this.tablero_interno[i-1][j+1]==9 ) {
                        contador++;
                    }
                    
                    if ( j-1>=0 && this.tablero_interno[i][j-1]==9 ) {
                        contador++;
                    }
                    
                    if ( j+1<limite_columnas && this.tablero_interno[i][j+1]==9 ) {
                        contador++;
                    }
                    
                    if ( i+1<limite_filas && j-1>=0 && this.tablero_interno[i+1][j-1]==9 ) {
                        contador++;
                    }
                    
                    if ( i+1<limite_filas && this.tablero_interno[i+1][j]==9 ) {
                        contador++;
                    }
                    
                    if ( i+1<limite_filas && j+1<limite_columnas && this.tablero_interno[i+1][j+1]==9 ) {
                        contador++;
                    }
                    
                    this.tablero_interno[i][j]=contador;
                }
            }
        }
        
    }

    public void marcarBandera(int fila, int columna){
        if (this.tablero_destapado) {
            Image img_bomba = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bandera.png") );
            img_bomba = img_bomba.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            this.tablero[fila][columna].setDisabledIcon( new ImageIcon(img_bomba) );
            this.tablero[fila][columna].setEnabled(false);
            this.minas--;
            this.etiqueta_minas.setText(String.valueOf(this.minas));
            validarGanada();
        } 
    }

    public void validarGanada(){
        if (this.minas==0) {
            int esbomba = 0;
            for (int i=0; i<this.tablero_interno.length; i++) {
                for (int j=0; j<tablero_interno.length; j++) {
                    if (this.tablero_interno[i][j]==9 && this.tablero[i][j].isEnabled()==false) {
                        esbomba++;
                    }
                }
            }

            System.out.println(esbomba);
            if (esbomba==20) {
                for (int i=0; i<this.tablero_interno.length; i++) {
                    for (int j=0; j<tablero_interno.length; j++) {
                        if (this.tablero_interno[i][j]==0) {
                            // Blanco
                            Image img_blanco = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_espacio.png") );
                            img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                            this.tablero[i][j].setDisabledIcon( new ImageIcon(img_blanco) );
                            }else if (this.tablero_interno[i][j]>=1 && this.tablero_interno[i][j]<=8) {
                            // Numero
                            Image img_numero = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_num_"+this.tablero_interno[i][j]+".png") );
                            img_numero = img_numero.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                            this.tablero[i][j].setDisabledIcon( new ImageIcon(img_numero) );
                            }else if (this.tablero_interno[i][j]==9 && this.tablero[i][j].isEnabled()==false) {
                            // Bomba
                            Image img_bomba = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bandera.png") );
                            img_bomba = img_bomba.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                            this.tablero[i][j].setDisabledIcon( new ImageIcon(img_bomba) );
                            }
                        this.tablero[i][j].setEnabled(false);
                    }
                }
                imprimirVentanaGanador();
            }else{
                for (int i=0; i<this.tablero_interno.length; i++) {
                    for (int j=0; j<tablero_interno.length; j++) {
                        if (this.tablero_interno[i][j]==0) {
                            // Blanco
                            Image img_blanco = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_espacio.png") );
                            img_blanco = img_blanco.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                            this.tablero[i][j].setDisabledIcon( new ImageIcon(img_blanco) );
                        }else if (this.tablero_interno[i][j]>=1 && this.tablero_interno[i][j]<=8) {
                            // Numero
                            Image img_numero = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_num_"+this.tablero_interno[i][j]+".png") );
                            img_numero = img_numero.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                            this.tablero[i][j].setDisabledIcon( new ImageIcon(img_numero) );
                        }else if (this.tablero_interno[i][j]==9 && this.tablero[i][j].isEnabled()==false) {
                            // Bomba
                            Image img_bomba = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bandera.png") );
                            img_bomba = img_bomba.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                            this.tablero[i][j].setDisabledIcon( new ImageIcon(img_bomba) );
                        }else if (this.tablero_interno[i][j]==9 && this.tablero[i][j].isEnabled()) {
                            Image img_bomba = getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") );
                            img_bomba = img_bomba.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                            this.tablero[i][j].setDisabledIcon( new ImageIcon(img_bomba) );
                        }
                        this.tablero[i][j].setEnabled(false);
                    }
                }
                
                imprimirVentanaPerdedora();
            }
        }
    } 

    public void imprimirVentanaPerdedora(){
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
        ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
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

        JLabel ganador = new JLabel("!GANO¡");
        ganador.setForeground(Color.YELLOW);
        contenedor.add(ganador);

        ventana.setTitle("Ganador");
        ventana.setSize((int) (tamanio.width * 0.4), (int) (tamanio.height * 0.5));
        ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.add(contenedor);
        ventana.setVisible(true);

        ventana.pack();
    }
}