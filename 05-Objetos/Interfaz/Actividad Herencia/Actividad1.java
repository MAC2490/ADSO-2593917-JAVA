import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;


public class Actividad1 extends JFrame{
	// Atributos 
	private String datos;

	// Metodos  
	public Actividad1(){
		this.initComponent();
	}

	public void initComponent(){
		Toolkit dimencion = Toolkit.getDefaultToolkit();
		Dimension tamanio = dimencion.getScreenSize();

		setTitle("Formato Moneda");
		setSize(tamanio.width/2, tamanio.height/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		JPanel Primer_ventana = new JPanel();
		GridBagLayout capa = new GridBagLayout();
		Primer_ventana.setLayout(capa);


		GridBagConstraints restricciones = new GridBagConstraints();

		JLabel Cantida = new JLabel("Cantidad: ");
		restricciones.gridy = 0;
		restricciones.gridx = 0;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 2;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		Primer_ventana.add(Cantida,restricciones);


		JTextField ingresar_cantida = new JTextField();
		restricciones.gridy = 0;
		restricciones.gridx = 1;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 8;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		Primer_ventana.add(ingresar_cantida,restricciones);

		JButton btn_ejecutar = new JButton("EJECUTAR");
		restricciones.gridy = 0;
		restricciones.gridx = 2;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		restricciones.weightx = 2;
		restricciones.weighty = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		Primer_ventana.add(btn_ejecutar,restricciones);				

		JLabel etq_resultado = new JLabel();
		etq_resultado.setHorizontalAlignment(JLabel.CENTER);
		etq_resultado.setFont( new Font ("Arial", Font.BOLD,65) );
		restricciones.gridy = 1;
		restricciones.gridx = 0;
		restricciones.gridwidth = 3;
		restricciones.gridheight = 1;
		restricciones.weightx = 12;
		restricciones.weighty = 11;
		restricciones.fill = GridBagConstraints.BOTH;
		Primer_ventana.add(etq_resultado,restricciones);

		ActionListener evento_ejecutar = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				datos = ingresar_cantida.getText();
				if (datos != ""){

					double numero = Double.parseDouble(datos);
					NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
					String resultado = currencyFormatter.format(numero);

					etq_resultado.setText(resultado);
				}
			}
		};


		btn_ejecutar.addActionListener(evento_ejecutar);


		add(Primer_ventana);
		revalidate();
		repaint();
	}


}