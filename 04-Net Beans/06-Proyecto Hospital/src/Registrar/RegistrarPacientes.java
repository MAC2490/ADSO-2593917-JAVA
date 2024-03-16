package Registrar;

import Clases.*;
import Principal.Alert;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class RegistrarPacientes extends javax.swing.JFrame {

    private boolean permitirForm;
    private DataBase conexion;
    
    public RegistrarPacientes() {
        initComponents();
        this.conexion = new DataBase();
        this.permitirForm = false;
        color();
        colorValidacion();
        colorPrincipal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_formulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNombrePaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoContacto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoEdad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        terminos = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoTipoSangre = new javax.swing.JComboBox<>();
        campoTipoDocumento = new javax.swing.JComboBox<>();
        panel_validacion = new javax.swing.JPanel();
        validar_nombre = new javax.swing.JLabel();
        img_validarNombre = new javax.swing.JLabel();
        img_validarDocumento = new javax.swing.JLabel();
        validar_documento = new javax.swing.JLabel();
        img_validarContacto = new javax.swing.JLabel();
        validar_contacto = new javax.swing.JLabel();
        img_validarSangre = new javax.swing.JLabel();
        validar_sangre = new javax.swing.JLabel();
        img_validarFormulario = new javax.swing.JLabel();
        validar_formulario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panel_titulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_principal.setPreferredSize(new java.awt.Dimension(870, 590));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Paciente");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido Paciente");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo De Documento");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero De Documento");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero De Contacto");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad Del Paciente");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo De Sangre");

        registrar.setBackground(new java.awt.Color(68, 229, 226));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 0, 0));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(68, 229, 226));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 0, 0));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        terminos.setSelected(true);
        terminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Aceptar terminos");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("y Condiciones");

        campoTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        campoTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "DD" }));

        javax.swing.GroupLayout panel_formularioLayout = new javax.swing.GroupLayout(panel_formulario);
        panel_formulario.setLayout(panel_formularioLayout);
        panel_formularioLayout.setHorizontalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formularioLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(registrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_formularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4))
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6))
                    .addComponent(campoContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(campoNombrePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9))
                    .addComponent(campoTipoSangre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoTipoDocumento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3))
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5))
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7))
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(cancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formularioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addComponent(terminos)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel11))))))
        );
        panel_formularioLayout.setVerticalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formularioLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_formularioLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel11))
                        .addComponent(jLabel8)
                        .addComponent(terminos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(cancelar))
                .addGap(95, 95, 95))
        );

        panel_principal.add(panel_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 420, 480));

        validar_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_nombre.setForeground(new java.awt.Color(255, 255, 255));

        validar_documento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_documento.setForeground(new java.awt.Color(255, 255, 255));

        validar_contacto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_contacto.setForeground(new java.awt.Color(255, 255, 255));

        validar_sangre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_sangre.setForeground(new java.awt.Color(255, 255, 255));

        validar_formulario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_formulario.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panel_validacionLayout = new javax.swing.GroupLayout(panel_validacion);
        panel_validacion.setLayout(panel_validacionLayout);
        panel_validacionLayout.setHorizontalGroup(
            panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_validacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_validacionLayout.createSequentialGroup()
                        .addGap(0, 134, Short.MAX_VALUE)
                        .addComponent(img_validarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(validar_formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(panel_validacionLayout.createSequentialGroup()
                        .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_validacionLayout.createSequentialGroup()
                                .addComponent(img_validarSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(validar_sangre, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_validacionLayout.createSequentialGroup()
                                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(img_validarContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(img_validarNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(img_validarDocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(validar_documento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addComponent(validar_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validar_contacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_validacionLayout.setVerticalGroup(
            panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_validacionLayout.createSequentialGroup()
                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_validacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(img_validarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_validacionLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(validar_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(validar_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_validacionLayout.createSequentialGroup()
                                .addComponent(img_validarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(img_validarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_validacionLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(img_validarSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_validacionLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(validar_sangre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_validacionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(validar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_validacionLayout.createSequentialGroup()
                        .addComponent(validar_formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_validacionLayout.createSequentialGroup()
                        .addComponent(img_validarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))))
            .addGroup(panel_validacionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_principal.add(panel_validacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 460, 480));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRAR PACIENTES");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/formulario.png"))); // NOI18N

        javax.swing.GroupLayout panel_tituloLayout = new javax.swing.GroupLayout(panel_titulo);
        panel_titulo.setLayout(panel_tituloLayout);
        panel_tituloLayout.setHorizontalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        panel_tituloLayout.setVerticalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel2))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panel_principal.add(panel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getPanel() {
        return panel_principal;
    }
    
     public void color(){
        Color c1 = new Color(0x44E5E2);
        Color c2 = new Color(0x0E7F60);
        jpColor jpmicolor = new jpColor(c1,c2);
        jpmicolor.setSize(this.getSize()); 
        panel_formulario.add(jpmicolor);
    }
    
    public void colorValidacion(){
        Color c1 = new Color(0x44E5E2);
        Color c2 = new Color(0x0E7F60);
        jpColor jpmicolor = new jpColor(c1,c2);
        jpmicolor.setSize(this.getSize()); 
        panel_validacion.add(jpmicolor);
    }
    
    public void colorPrincipal(){
        Color c1 = new Color(0x44E5E2);
        Color c2 = new Color(0x0E7F60);
        jpColor jpmicolor = new jpColor(c1,c2);
        jpmicolor.setSize(this.getSize()); 
        panel_titulo.add(jpmicolor);
    }
    
    public void cambiarImg(int cantidadLetras,int contLetras, int cantidadLetrasApellido,int contLetrasApellido, int cantidadLetrasTipo, int contLetrasTipo, int cantidadNumeroDoc, int contNumeroDoc, int cantidadNumeroContacto, int contNumeroContacto, int cantidadNumeroEdad, int contNumeroEdad, int cantidadNumeroSangre, int contNumeroSangre){
        String nombrePaciente = campoNombrePaciente.getText();
        String apellido = campoApellido.getText();
        String tipoDocumento = (String) campoTipoDocumento.getSelectedItem();
        String numeroDocumento = campoDocumento.getText();
        String numeroContacto = campoContacto.getText();
        String edad = campoEdad.getText();
        String tipoSangre = (String) campoTipoSangre.getSelectedItem();
        
        int validar = 0;
                
        // Nombre y Apellido
        if (cantidadLetras == contLetras && cantidadLetrasApellido == contLetrasApellido && !nombrePaciente.equals("") && !apellido.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarNombre.setIcon(new ImageIcon(icono));
            validar_nombre.setText("Nombre y apellido valido ");
            validar++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarNombre.setIcon(new ImageIcon(icono));
            validar_nombre.setText("Nombre o apellido no valido ");
            this.permitirForm = true;
        }
        
        // Documento
        if (cantidadLetrasTipo == contLetrasTipo && cantidadNumeroDoc == contNumeroDoc && !tipoDocumento.equals("") && !numeroDocumento.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarDocumento.setIcon(new ImageIcon(icono));
            validar_documento.setText("Tipo documento y documento valido");
            validar++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarDocumento.setIcon(new ImageIcon(icono));
            validar_documento.setText("Tipo documento o documento no valido");
            this.permitirForm = true;
        }
        
        // Numero de contacto y edad
        if (cantidadNumeroContacto == contNumeroContacto && cantidadNumeroEdad == contNumeroEdad && !numeroContacto.equals("") && !edad.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarContacto.setIcon(new ImageIcon(icono));
            validar_contacto.setText("Numero de contacto y edad valido");
            validar++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarContacto.setIcon(new ImageIcon(icono));
            validar_contacto.setText("Numero de contacto o edad no valido");
            this.permitirForm = true;
        }
        
        // Sangre
        if (cantidadNumeroSangre == contNumeroSangre && !tipoSangre.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarSangre.setIcon(new ImageIcon(icono));
            validar_sangre.setText("Tipo Sangre valida");
            validar++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarSangre.setIcon(new ImageIcon(icono));
            validar_sangre.setText("Tipo Sangre no valido");
            this.permitirForm = true;
        }
        
        // Formulario completo
        if (validar == 4) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validarFormulario.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarFormulario.setIcon(new ImageIcon(icono));
            validar_formulario.setText("El registro es valido");
            this.permitirForm = false;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegarFormulario.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarFormulario.setIcon(new ImageIcon(icono));
            validar_formulario.setText("El registro no es valido");
        }
    }
    
    
    public void validarInput(){
        String nombrePaciente = campoNombrePaciente.getText();
        String apellido = campoApellido.getText();
        String tipoDocumento = (String) campoTipoDocumento.getSelectedItem();
        String numeroDocumento = campoDocumento.getText();
        String numeroContacto = campoContacto.getText();
        String edad = campoEdad.getText();
        String tipoSangre = (String) campoTipoSangre.getSelectedItem();
        
        // Nombre paciente
        int cantidadLetras = 0;
        int contLetras = 0;
        for (int i = 0; i < nombrePaciente.length(); i++) {
            char caracter = nombrePaciente.charAt(i);
            int caracterAscii = (int) caracter;
            if (caracterAscii>=65 && caracterAscii<=90 || caracterAscii>=97 && caracterAscii<=122 || caracterAscii == 32) {
                cantidadLetras++;
            }
            contLetras++;
        }
        
        // Apellido 
        int cantidadLetrasApellido = 0;
        int contLetrasApellido = 0;
        for (int i = 0; i < apellido.length(); i++) {
            char caracter = apellido.charAt(i);
            int caracterAscii = (int) caracter;
            if (caracterAscii>=65 && caracterAscii<=90 || caracterAscii>=97 && caracterAscii<=122 || caracterAscii == 32) {
                cantidadLetrasApellido++;
            }
            contLetrasApellido++;
        }
        
        // Tipo documento
        int cantidadLetrasTipo = 0;
        int contLetrasTipo = 0;
        if (tipoDocumento.length() == 2 || tipoDocumento.length() == 3) {
            for (int i = 0; i < tipoDocumento.length(); i++) {
                char caracter = tipoDocumento.charAt(i);
                int caracterAscii = (int) caracter;
                if (caracterAscii==67|| caracterAscii==99 || caracterAscii==68|| caracterAscii==100 || caracterAscii==46){
                    cantidadLetrasTipo++;
                }
                contLetrasTipo++;
            }
        }else{
            contLetrasTipo++;
        }
        
        // Numero documento
        int cantidadNumeroDoc = 0;
        int contNumeroDoc = 0;
        for (int i = 0; i < numeroDocumento.length(); i++) {
            char caracter = numeroDocumento.charAt(i);
            int caracterAscii = (int) caracter;
            if (caracterAscii>=48 && caracterAscii<=57 || caracterAscii == 46 || caracterAscii == 32){
                cantidadNumeroDoc++;
            }
            contNumeroDoc++;
        }
        
        // Numero de contacto
        int cantidadNumeroContacto = 0;
        int contNumeroContacto = 0;
        for (int i = 0; i < numeroContacto.length(); i++) {
            char caracter = numeroContacto.charAt(i);
            int caracterAscii = (int) caracter;
            if (caracterAscii>=48 && caracterAscii<=57 || caracterAscii == 32){
                cantidadNumeroContacto++;
            }
            contNumeroContacto++;
        }
        
        // Edad
        int cantidadNumeroEdad = 0;
        int contNumeroEdad = 0;
        for (int i = 0; i < edad.length(); i++) {
            char caracter = edad.charAt(i);
            int caracterAscii = (int) caracter;
            if (caracterAscii>=48 && caracterAscii<=57 || caracterAscii<=43 || caracterAscii<=40 || caracterAscii<=41){
                cantidadNumeroEdad++;
            }
            contNumeroEdad++;
        }
        
        // Tipo de sangre
        int cantidadNumeroSangre = 0;
        int contNumeroSangre = 0;
        if (tipoSangre.length() == 2 || tipoSangre.length() == 3) {
            for (int i = 0; i < tipoSangre.length(); i++) {
                char caracter = tipoSangre.charAt(i);
                int caracterAscii = (int) caracter;
                if (caracterAscii == 65 || caracterAscii == 97 || caracterAscii == 66 || caracterAscii == 98 || caracterAscii == 111 || caracterAscii == 79 || caracterAscii == 43 || caracterAscii == 45){
                    cantidadNumeroSangre++;
                }
                contNumeroSangre++;
            }
        }else{
            contNumeroSangre++;
        }
        
        cambiarImg(cantidadLetras, contLetras, cantidadLetrasApellido, contLetrasApellido, cantidadLetrasTipo, contLetrasTipo, cantidadNumeroDoc, contNumeroDoc, cantidadNumeroContacto, contNumeroContacto, cantidadNumeroEdad, contNumeroEdad,cantidadNumeroSangre, contNumeroSangre);
    }
    
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        validarInput();
        String nombreM = campoNombrePaciente.getText();
        String nombre = nombreM.substring(0, 1).toUpperCase() + nombreM.substring(1);
        String apellidoM = campoApellido.getText();
        String apellido = apellidoM.substring(0, 1).toUpperCase() + apellidoM.substring(1);
        String tipoDocumento = (String) campoTipoDocumento.getSelectedItem();
        String numeroDocumento = campoDocumento.getText();
        String numeroContacto = campoContacto.getText();
        String edad = campoEdad.getText();
        String tipoSangre = (String) campoTipoSangre.getSelectedItem();
        System.out.println("01 "+numeroContacto);
        if (!this.permitirForm) {
            boolean repetido = false;
            if (this.conexion.buscarPaciente(numeroDocumento)!= null) {
                Alert alerta = new Alert("REGISTRAR", "El paciente ya fue registrado", "error");
                repetido = true;
            }

            if (!repetido) {
                boolean registrar = conexion.registrarPaciente(nombre, apellido, tipoDocumento, numeroDocumento, tipoSangre, edad, numeroContacto);
                if (registrar == true) {
                    Alert alerta = new Alert("REGISTRAR", "El registro fue exitoso", "success");
                }else{
                    Alert alerta = new Alert("REGISTRAR", "El registro no fue exitoso", "error");
                }
            }
        }else{
            Alert alerta = new Alert("REGISTRAR", "Formulario incorrecto", "error");
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        campoApellido.setText("");
        campoContacto.setText("");
        campoDocumento.setText("");
        campoEdad.setText("");
        campoNombrePaciente.setText("");

        validar_contacto.setText("");
        validar_documento.setText("");
        validar_formulario.setText("");
        validar_nombre.setText("");
        validar_sangre.setText("");

        Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/limpiarImg.png"));
        icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        img_validarContacto.setIcon(new ImageIcon(icono));
        img_validarDocumento.setIcon(new ImageIcon(icono));
        img_validarFormulario.setIcon(new ImageIcon(icono));
        img_validarNombre.setIcon(new ImageIcon(icono));
        img_validarSangre.setIcon(new ImageIcon(icono));
    }//GEN-LAST:event_cancelarActionPerformed

    private void terminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminosActionPerformed
        if (!this.terminos.isSelected()) {
            Alert alerta = new Alert("CONDICIONES", "Condiciones rechasadas", "warning");
            this.permitirForm = true;
        }
    }//GEN-LAST:event_terminosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoContacto;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoNombrePaciente;
    private javax.swing.JComboBox<String> campoTipoDocumento;
    private javax.swing.JComboBox<String> campoTipoSangre;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel img_validarContacto;
    private javax.swing.JLabel img_validarDocumento;
    private javax.swing.JLabel img_validarFormulario;
    private javax.swing.JLabel img_validarNombre;
    private javax.swing.JLabel img_validarSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panel_formulario;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_titulo;
    private javax.swing.JPanel panel_validacion;
    private javax.swing.JButton registrar;
    private javax.swing.JCheckBox terminos;
    private javax.swing.JLabel validar_contacto;
    private javax.swing.JLabel validar_documento;
    private javax.swing.JLabel validar_formulario;
    private javax.swing.JLabel validar_nombre;
    private javax.swing.JLabel validar_sangre;
    // End of variables declaration//GEN-END:variables
}
