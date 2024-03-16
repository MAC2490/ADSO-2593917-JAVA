package Registrar;

import java.awt.*;
import Clases.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import Principal.Alert;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HospitalizarPaciente extends javax.swing.JFrame {
    private  boolean permitirForm;
    private DataBase conexion;
    private  Date fechaActual;
    private SimpleDateFormat formato;
    private String fechaString;
    
    public HospitalizarPaciente() {
        this.conexion = new DataBase();
        this.permitirForm = false;
        initComponents();
        color();
        colorValidacion();
        colorPrincipal();
        initComponets();
    }
    
    public void initComponets(){
        campo_buscar.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    buscar();
                }
            }
        });
        
        this.fechaActual = new Date();
        this.formato = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaString = formato.format(fechaActual);
        this.campoFecha.setText(this.fechaString);
    }
    
    public void cambiarImg(int cantidadLetras,int contLetras, int cantidadLetrasApellido,int contLetrasApellido, int cantidadLetrasTipo, int contLetrasTipo, int cantidadNumeroDoc, int contNumeroDoc, int cantidadNumeroSangre, int contNumeroSangre, int cantidadNumeroEdad, int contNumeroEdad, int cantidadNumeroFecha, int contNumeroFecha, int cantidadNumeroCamilla, int contNumeroCamilla){
        String nombrePaciente = campoNombrePaciente.getText();
        String apellido = campoApellido.getText();
        String tipoDocumento = campoTipoDocumento.getText();
        String numeroDocumento = campoDocumento.getText();
        String tipoSangre = campoSangre.getText();
        String edad = campoEdad.getText();
        String fecha = campoFecha.getText();
        String numeroCamilla = campoNumeroCamilla.getText();
        int validarForm = 0;
        
        // Nombre y Apellido
        if (cantidadLetras == contLetras && cantidadLetrasApellido == contLetrasApellido && !apellido.equals("") && !nombrePaciente.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarNombre.setIcon(new ImageIcon(icono));
            validar_nombre.setText("Nombre y apellido valido ");
            validarForm++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarNombre.setIcon(new ImageIcon(icono));
            validar_nombre.setText("Nombre y/o apellido no valido ");
            this.permitirForm = true;
        }
        
        // Documento
        if (cantidadLetrasTipo == contLetrasTipo && cantidadNumeroDoc == contNumeroDoc && !numeroDocumento.equals("") && !tipoDocumento.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarDocumento.setIcon(new ImageIcon(icono));
            validar_documento.setText("Tipo documento y documento valido");
            validarForm++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarDocumento.setIcon(new ImageIcon(icono));
            validar_documento.setText("Tipo documento y/o documento no valido");
            this.permitirForm = true;
        }
        
        // Sangre de contacto y edad
        if (cantidadNumeroSangre == contNumeroSangre && cantidadNumeroEdad == contNumeroEdad && !edad.equals("") && !tipoSangre.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarSangre.setIcon(new ImageIcon(icono));
            validar_sangre.setText("Tipo sangre y edad valido");
            validarForm++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarSangre.setIcon(new ImageIcon(icono));
            validar_sangre.setText("Tipo sangre y/o edad no valido");
            this.permitirForm = true;
        }
        
        // Fecha y numero camilla
        if (cantidadNumeroFecha == contNumeroFecha && cantidadNumeroCamilla == contNumeroCamilla && !fecha.equals("") && !numeroCamilla.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarFecha.setIcon(new ImageIcon(icono));
            validar_fecha.setText("Fecha cita y numero camilla valido");
            validarForm++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarFecha.setIcon(new ImageIcon(icono));
            validar_fecha.setText("Fecha cita y/o numero camilla no valido");
           this.permitirForm = true;
        }

        // Formulario completo
        if (validarForm == 4) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validarFormulario.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarFormulario.setIcon(new ImageIcon(icono));
            validar_formulario.setText("El registro es valido");
            this.permitirForm = false;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegarFormulario.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarFormulario.setIcon(new ImageIcon(icono));
            this.validar_formulario.setText("El registro no es valido");
        }
    }
    
    public void validarInput(){
        String nombrePaciente = campoNombrePaciente.getText();
        String apellido = campoApellido.getText();
        String tipoDocumento = campoTipoDocumento.getText();
        String numeroDocumento = campoDocumento.getText();
        String tipoSangre = campoSangre.getText();
        String edad = campoEdad.getText();
        String fecha = campoFecha.getText();
        String numeroCamilla = campoNumeroCamilla.getText();
         
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
            }else if(apellido.equals("")){
                
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

        // Tipo de sangre
        int cantidadNumeroSangre = 0;
        int contNumeroSangre = 0;
        if (tipoSangre.length() == 2 || tipoSangre.length() == 3) {
            System.out.println("01 "+tipoSangre.length());
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
        
        // Fecha
        int cantidadNumeroFecha = 0;
        int contNumeroFecha = 0;
        for (int i = 0; i < fecha.length(); i++) {
            char caracter = fecha.charAt(i);
            int caracterAscii = (int) caracter;
            if (caracterAscii>=46 && caracterAscii<=58){
                cantidadNumeroFecha++;
            }
            contNumeroFecha++;
        }
        
        // Numero camilla
        int cantidadNumeroCamilla = 0;
        int contNumeroCamilla = 0;
        for (int i = 0; i < numeroCamilla.length(); i++) {
            char caracter = numeroCamilla.charAt(i);
            int caracterAscii = (int) caracter;
            if (caracterAscii>=46 && caracterAscii<=58) {
                cantidadNumeroCamilla++;
            }
            
            contNumeroCamilla++;
        }

        cambiarImg(cantidadLetras, contLetras, cantidadLetrasApellido, contLetrasApellido, cantidadLetrasTipo, contLetrasTipo, cantidadNumeroDoc, contNumeroDoc, cantidadNumeroSangre, contNumeroSangre, cantidadNumeroEdad, contNumeroEdad, cantidadNumeroFecha, contNumeroFecha, cantidadNumeroCamilla, contNumeroCamilla);
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
        Color c2 = new Color(0x0E7F60);;
        jpColor jpmicolor = new jpColor(c1,c2);
        jpmicolor.setSize(this.getSize()); 
        panel_titulo.add(jpmicolor);
    }
    
    
    public JPanel getPanel() {
        return panel_principal;
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
        campoTipoDocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoSangre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoNumeroCamilla = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        campoFecha = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campo_buscar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        panel_validacion = new javax.swing.JPanel();
        validar_nombre = new javax.swing.JLabel();
        img_validarNombre = new javax.swing.JLabel();
        img_validarDocumento = new javax.swing.JLabel();
        validar_documento = new javax.swing.JLabel();
        img_validarSangre = new javax.swing.JLabel();
        validar_sangre = new javax.swing.JLabel();
        img_validarFecha = new javax.swing.JLabel();
        validar_fecha = new javax.swing.JLabel();
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

        campoNombrePaciente.setEditable(false);
        campoNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombrePacienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido Paciente");

        campoApellido.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo De Documento");

        campoTipoDocumento.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero De Documento");

        campoDocumento.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo De Sangre");

        campoSangre.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad Del Paciente");

        campoEdad.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero De Camilla");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha De Ingreso");

        campoNumeroCamilla.setEditable(false);

        jButton1.setBackground(new java.awt.Color(68, 229, 226));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Hospitaliza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(68, 229, 226));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        campoFecha.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buscar Paciente");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Documento:");

        jButton3.setBackground(new java.awt.Color(68, 229, 226));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_formularioLayout = new javax.swing.GroupLayout(panel_formulario);
        panel_formulario.setLayout(panel_formularioLayout);
        panel_formularioLayout.setHorizontalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formularioLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formularioLayout.createSequentialGroup()
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1))
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4))
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6))
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9))
                            .addComponent(campoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3))
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel7))
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8))
                            .addComponent(campoEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNumeroCamilla, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        panel_formularioLayout.setVerticalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formularioLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(31, 31, 31)
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
                    .addComponent(campoTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumeroCamilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(46, 46, 46))
        );

        panel_principal.add(panel_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 430, 480));

        validar_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_nombre.setForeground(new java.awt.Color(255, 255, 255));

        validar_documento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_documento.setForeground(new java.awt.Color(255, 255, 255));

        validar_sangre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_sangre.setForeground(new java.awt.Color(255, 255, 255));

        validar_fecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_fecha.setForeground(new java.awt.Color(255, 255, 255));

        validar_formulario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_formulario.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panel_validacionLayout = new javax.swing.GroupLayout(panel_validacion);
        panel_validacion.setLayout(panel_validacionLayout);
        panel_validacionLayout.setHorizontalGroup(
            panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_validacionLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_validacionLayout.createSequentialGroup()
                        .addComponent(img_validarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(validar_formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_validacionLayout.createSequentialGroup()
                        .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_validacionLayout.createSequentialGroup()
                                .addComponent(img_validarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(validar_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_validacionLayout.createSequentialGroup()
                                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(img_validarSangre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(img_validarNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(img_validarDocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(validar_documento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validar_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(validar_sangre, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_validacionLayout.setVerticalGroup(
            panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_validacionLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_validacionLayout.createSequentialGroup()
                        .addComponent(img_validarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_validacionLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(validar_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(validar_sangre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_validacionLayout.createSequentialGroup()
                                .addComponent(img_validarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(img_validarSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_validacionLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(img_validarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_validacionLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(validar_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_validacionLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(validar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_validacionLayout.createSequentialGroup()
                        .addComponent(img_validarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_validacionLayout.createSequentialGroup()
                        .addComponent(validar_formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_validacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addGap(45, 45, 45))
        );

        panel_principal.add(panel_validacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 460, 480));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INGRESAR PACIENTE");

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
                .addContainerGap(327, Short.MAX_VALUE))
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

        panel_principal.add(panel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 892, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validarInput();
        String numeroDocumento = campoDocumento.getText();
        String numeroCamilla = campoNumeroCamilla.getText();
        
        if (!this.permitirForm) {
            boolean repetido = false;
            Internos estado = this.conexion.buscarInternosEstado(numeroDocumento);
            
            if (this.conexion.buscarInternos(numeroDocumento) != null && estado != null) {
                Alert alerta = new Alert("REGISTRAR", "El paciente esta interno", "error");
                repetido = true;
            }
            
            if (this.conexion.buscarPaciente(numeroDocumento) == null) {
                Alert alerta = new Alert("REGISTRAR", "El paciente no esta registrado", "error");
                repetido = true; 
            }
            
            if (!repetido) {
                boolean registrar = conexion.registrarInternos(this.fechaString, numeroCamilla, numeroDocumento, "Interno");
                if (registrar == true) {
                    Alert alerta = new Alert("REGISTRAR", "Registro exitoso", "success");
                }else{
                    Alert alerta = new Alert("REGISTRAR", "El registro fallo", "warning");
                }
            }
        }else{
            Alert alerta = new Alert("REGISTRAR", "Algunos campos estan mal", "error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        campoApellido.setText("");
        campoNombrePaciente.setText("");
        campoTipoDocumento.setText("");
        campoDocumento.setText("");
        campoEdad.setText("");
        campoFecha.setText("");
        campoSangre.setText("");
        campoNumeroCamilla.setText("");
        campo_buscar.setText("");
        
        validar_documento.setText("");
        validar_formulario.setText("");
        validar_fecha.setText("");
        validar_nombre.setText("");
        validar_sangre.setText("");
        
        Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/limpiarImg.png"));
        icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        img_validarDocumento.setIcon(new ImageIcon(icono));
        img_validarFecha.setIcon(new ImageIcon(icono));
        img_validarFormulario.setIcon(new ImageIcon(icono));
        img_validarNombre.setIcon(new ImageIcon(icono));
        img_validarSangre.setIcon(new ImageIcon(icono));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombrePacienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buscar();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void buscar(){
        Paciente buscar[] = this.conexion.listaPacientes();
        String buscarDocumento = this.campo_buscar.getText();
        int validarAlerta = 0;
        if (buscar != null && !buscarDocumento.equals("")) {
            for (int i = 0; i < buscar.length; i++) {
                if (buscar[i] != null && buscar[i].getNumero_documento().equals(buscarDocumento)) {
                    this.campoNombrePaciente.setText(buscar[i].getNombre_paciente());
                    this.campoApellido.setText(buscar[i].getApellido_paciente());
                    this.campoTipoDocumento.setText(buscar[i].getTipo_documento());
                    this.campoDocumento.setText(buscar[i].getNumero_documento());
                    this.campoSangre.setText(buscar[i].getTipo_sangre());
                    this.campoEdad.setText(buscar[i].getEdad_paciente());
                    this.campoNumeroCamilla.requestFocus();
                    validarAlerta++;
                    break;
                }
            }
        }else{
            Alert alerta = new Alert("HOSPITALIZAR", "El campo buscar no esta lleno", "error");
        }
        
        if (validarAlerta > 0) {
            habilitarInput(this.campoNumeroCamilla);
            Alert alerta = new Alert("BUSCAR", "Busqueda exitosa", "success");
        }else if(!buscarDocumento.equals("")){
            Alert alerta = new Alert("BUSCAR", "Usuario no registrado", "error");
        }
    }
    
    public void habilitarInput(JTextField input){
        input.setText("");
        input.setEditable(true);
        input.setEnabled(true);
    }
    
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
            java.util.logging.Logger.getLogger(HospitalizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalizarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalizarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoNombrePaciente;
    private javax.swing.JTextField campoNumeroCamilla;
    private javax.swing.JTextField campoSangre;
    private javax.swing.JTextField campoTipoDocumento;
    private javax.swing.JTextField campo_buscar;
    private javax.swing.JLabel img_validarDocumento;
    private javax.swing.JLabel img_validarFecha;
    private javax.swing.JLabel img_validarFormulario;
    private javax.swing.JLabel img_validarNombre;
    private javax.swing.JLabel img_validarSangre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel validar_documento;
    private javax.swing.JLabel validar_fecha;
    private javax.swing.JLabel validar_formulario;
    private javax.swing.JLabel validar_nombre;
    private javax.swing.JLabel validar_sangre;
    // End of variables declaration//GEN-END:variables
}
