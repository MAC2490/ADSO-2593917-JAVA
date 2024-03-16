import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;


public class Actividad1 extends JFrame{
	// Atributos 
	private Producto lista_productos [];
	private Personas lista_clientes [];
	private Vendedor lista_vendedor [];
	private JLabel etq_Datos_Cliente;
	private JLabel etq_cedula;
	private JLabel etq_nombres;
	private JLabel etq_direccion;
	private JLabel etq_cedula_vendedor;
	private JLabel etq_nombre_vendedor;
	private JLabel etq_id;
	private JLabel etq_nombre;
	private JLabel etq_cantidad;
	private JLabel etq_resultado;
	private JLabel etq_total;
	private JLabel datos_vendedor;
	private JLabel productos;
	private JTextField ingresar_cedula;
	private JTextField ingresar_nombres;
	private JTextField ingresar_direccion;
	private JTextField ingresa_cedula_vendedor;
	private JTextField ingresa_nombre_vendedor;
	private JTextField id;
	private JTextField nombre_pro;
	private JTextField cant;
 	private JButton btn_buscar_cliente;
 	private JButton btn_buscar_vendedor;
 	private JButton btn_agregar_pro;
 	private JButton btn_agregar_cliente;
 	private JButton btn_agregar_vendedor;
	// Metodos
	public Actividad1(Personas [] lista_clientes ,Vendedor [] lista_vendedor, Producto lista_productos [] ){
		this.lista_clientes = lista_clientes;
		this.lista_vendedor = lista_vendedor; 
		this.lista_productos = lista_productos;
		this.initComponent();
	}

	public void initComponent(){
		Toolkit dimension = Toolkit.getDefaultToolkit();
		Dimension tamanio = dimension.getScreenSize();

		setTitle("Factura");
		setSize( ((int) (tamanio.width*0.3)) , ((int) (tamanio.height*0.9)) );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		JPanel contenedor = new JPanel();

		contenedor.setLayout(new GridBagLayout());
		contenedor.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 20) );
		GridBagConstraints restricciones = new GridBagConstraints();

		etq_Datos_Cliente = new JLabel("DATOS CLIENTE: ");
		etq_Datos_Cliente.setFont( new Font("Arial", Font.BOLD, 25) );
		restricciones.gridy = 0;
		restricciones.gridx = 0;
		restricciones.gridwidth = 4;
		restricciones.gridheight = 1;
		restricciones.weightx = 100;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		contenedor.add(etq_Datos_Cliente, restricciones);

		etq_cedula = new JLabel("Cedula: ");
		restricciones.gridy = 1;
		restricciones.gridx = 0;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 10;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(etq_cedula, restricciones);

		ingresar_cedula = new JTextField();
		restricciones.gridy = 1;
		restricciones.gridx = 1;
		restricciones.gridwidth = 3;
		restricciones.gridheight = 1;
		restricciones.weightx =90;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(ingresar_cedula, restricciones);

		
		etq_nombres = new JLabel("Nombres: ");
		restricciones.gridy = 2;
		restricciones.gridx = 0;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 10;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(etq_nombres, restricciones);

		ingresar_nombres = new JTextField();
		restricciones.gridy = 2;
		restricciones.gridx = 1;
		restricciones.gridwidth = 3;
		restricciones.gridheight = 1;
		restricciones.weightx =90;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(ingresar_nombres, restricciones);		

		etq_direccion = new JLabel("Direccion:");
		restricciones.gridy = 3;
		restricciones.gridx = 0;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx =10;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(etq_direccion, restricciones);


		ingresar_direccion = new JTextField();
		restricciones.gridy = 3;
		restricciones.gridx = 1;
		restricciones.gridwidth = 3;
		restricciones.gridheight = 1;
		restricciones.weightx =90;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(ingresar_direccion, restricciones);

		btn_buscar_cliente = new JButton("BUSCAR");
		restricciones.gridy = 4;
		restricciones.gridx = 1;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx =1;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(btn_buscar_cliente, restricciones);

		btn_agregar_cliente = new JButton("AGREGAR");
		restricciones.gridy = 4;
		restricciones.gridx = 2;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx =1;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 10, 10, 0);
		contenedor.add(btn_agregar_cliente, restricciones);

		datos_vendedor = new JLabel("Datos vendedor:");
		datos_vendedor.setFont( new Font("Arial", Font.BOLD, 25) );
		restricciones.gridy = 5;
		restricciones.gridx = 0;
		restricciones.gridwidth = 4;
		restricciones.gridheight = 1;
		restricciones.weightx = 100;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(datos_vendedor, restricciones);

		etq_cedula_vendedor = new JLabel("Cedula: ");
		restricciones.gridy = 6;
		restricciones.gridx = 0;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 10;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(etq_cedula_vendedor, restricciones);

		ingresa_cedula_vendedor = new JTextField();
		restricciones.gridy = 6;
		restricciones.gridx = 1;
		restricciones.gridwidth = 3;
		restricciones.gridheight = 1;
		restricciones.weightx = 90;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(ingresa_cedula_vendedor, restricciones);


		etq_nombre_vendedor = new JLabel("Nombre: ");
		restricciones.gridy = 7;
		restricciones.gridx = 0;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 10;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(etq_nombre_vendedor, restricciones);

		ingresa_nombre_vendedor = new JTextField();
		restricciones.gridy = 7;
		restricciones.gridx = 1;
		restricciones.gridwidth = 3;
		restricciones.gridheight = 1;
		restricciones.weightx = 90;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(ingresa_nombre_vendedor, restricciones);

		btn_buscar_vendedor = new JButton("BUSCAR");
		restricciones.gridy = 8;
		restricciones.gridx = 1;
		restricciones.gridwidth = 2;
		restricciones.gridheight = 1;
		restricciones.weightx =1;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(btn_buscar_vendedor, restricciones);


		productos = new JLabel("Productos:");
		productos.setFont( new Font("Arial", Font.BOLD, 25) );
		restricciones.gridy = 9;
		restricciones.gridx = 0;
		restricciones.gridwidth = 4;
		restricciones.gridheight = 1;
		restricciones.weightx = 100;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(productos, restricciones);

		etq_id = new JLabel("ID");
		restricciones.gridy = 10;
		restricciones.gridx = 0;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 20;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.CENTER;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(etq_id, restricciones);

		etq_nombre = new JLabel("Nombre");
		restricciones.gridy = 10;
		restricciones.gridx = 1;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 40;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.CENTER;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(etq_nombre, restricciones);

		etq_cantidad = new JLabel("Cant");
		restricciones.gridy = 10;
		restricciones.gridx = 2;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 20;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.CENTER;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(etq_cantidad, restricciones);


		id = new JTextField();
		restricciones.gridy = 11;
		restricciones.gridx = 0;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 20;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(id, restricciones);


		nombre_pro = new JTextField();
		nombre_pro.setEditable(false);
		restricciones.gridy = 11;
		restricciones.gridx = 1;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 40;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(nombre_pro, restricciones);

		cant = new JTextField();
		restricciones.gridy = 11;
		restricciones.gridx = 2;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 20;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(cant, restricciones);

		btn_agregar_pro = new JButton("ADD");
		restricciones.gridy = 11;
		restricciones.gridx = 3;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx =20;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 10, 0);
		contenedor.add(btn_agregar_pro, restricciones);

		etq_resultado = new JLabel(" ---- ");
		etq_resultado.setHorizontalAlignment( JLabel.RIGHT );
		etq_resultado.setVerticalAlignment( JLabel.TOP );
		etq_resultado.setFont( new Font("Arial", Font.BOLD, 10) );
		etq_resultado.setOpaque(true);
		etq_resultado.setBackground( Color.white );
		etq_resultado.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
		restricciones.gridy = 12;
		restricciones.gridx = 0;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 4;
		restricciones.weighty = 89;
		restricciones.weightx = 100;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(10, 0, 0, 10);
		contenedor.add( etq_resultado, restricciones );

		etq_total = new JLabel("Total: $ 0");
		etq_total.setHorizontalAlignment( JLabel.RIGHT );
		etq_total.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_total.setOpaque(true);
		etq_total.setBackground( Color.white );
		etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restricciones.gridy = 13;
		restricciones.gridx = 0;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 4;
		restricciones.weightx = 100;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.insets = new Insets(0, 0, 0, 10);
		contenedor.add( etq_total, restricciones );	

		this.ingresar_nombres.setEnabled(false);
		this.ingresar_direccion.setEnabled(false);
		deshabilitarInput(this.ingresar_nombres);
		deshabilitarInput(this.ingresar_direccion);

		add(contenedor);
		revalidate();

		ActionListener evento_cliente = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("0");
				buscarCliente();
			}
		};
		btn_buscar_cliente.addActionListener(evento_cliente);

		ActionListener agregar_cliente = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("2");
				agregarCliente();
			}
		};
		btn_agregar_cliente.addActionListener(agregar_cliente);	

		// Botones vendedor
		ActionListener evento_vendedor = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarVendedor();
			}	
		};
		btn_buscar_vendedor.addActionListener(evento_vendedor);

		ActionListener agregar_pro = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// agregarProducto();
				// buscarProducto();
			}
		};
		btn_agregar_pro.addActionListener(agregar_pro);

		KeyListener evento_teclado = new KeyListener(){
			public void keyPressed(KeyEvent e) {
            }

			public void keyReleased(KeyEvent e) {
            	buscarProducto();
            }

            public void keyTyped(KeyEvent e) {
            }
        };
		id.addKeyListener(evento_teclado);

	}


	public void buscarCliente(){
		String numero_cedula = ingresar_cedula.getText();
		boolean encontrado = false;
		for (int i=0; i<this.lista_clientes.length ; i++) {
			if (this.lista_clientes [i] !=null && this.lista_clientes[i].getCedula().equalsIgnoreCase(numero_cedula)){
				this.ingresar_nombres.setText(this.lista_clientes[i].getNombre());
				this.ingresar_direccion.setText(this.lista_clientes[i].getDireccion());
				encontrado = true;
				System.out.println("1");
				break;
			}
		}

		if(encontrado){
			deshabilitarInput(this.ingresar_nombres);
			deshabilitarInput(this.ingresar_direccion);
			this.ingresa_cedula_vendedor.requestFocus();
		}else{
			habilitarInput(this.ingresar_nombres);
			habilitarInput(this.ingresar_direccion);
			this.ingresar_nombres.requestFocus();
		}
	}

	public void agregarCliente(){
		String cedula = ingresar_cedula.getText();
		String nombre = ingresar_nombres.getText();
		String direccion = ingresar_direccion.getText();

		Personas nueva_persona = new Personas(cedula, nombre, direccion);

		for (int i=0;i<this.lista_clientes.length ; i++ ) {
			if (this.lista_clientes [i]==null) {
				lista_clientes [i] = nueva_persona;
				System.out.println(lista_clientes[i].getNombre());
				break;
			}
		}
	}

	public void deshabilitarInput(JTextField input){
		input.setEditable(false);
		input.setEnabled(false);
		input.setDisabledTextColor(Color.black);
	}

	public void habilitarInput(JTextField input){
		input.setText("");
		input.setEditable(true);
		input.setEnabled(true);
	}

	// Metodos vendedor
	public void buscarVendedor(){
		String buscar_cedula = ingresa_cedula_vendedor.getText();
		boolean encontrar = false;
		for (int i=0;i<this.lista_vendedor.length ;i++ ) {
			if (this.lista_vendedor [i] != null && this.lista_vendedor [i].getCedulaVendedor().equalsIgnoreCase(buscar_cedula)) {
				this.ingresa_nombre_vendedor.setText(this.lista_vendedor [i].getNombreVendedor());
				System.out.println("8");
				encontrar = true;
				break;
			}else{
				System.out.println("10");
			}
		}
	}

	public void buscarProducto(){
		String id_pro = id.getText();
		boolean encontrado = false;
		for (int i=0; i<this.lista_productos.length ;i++ ) {
			if (this.lista_productos[i] != null && this.lista_productos[i].getId().equalsIgnoreCase(id_pro)) {
				this.nombre_pro.setText(this.lista_productos[i].getNombrePro());
				this.cant.requestFocus();
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			this.nombre_pro.setText("");
			this.id.requestFocus();
		}
	}
}