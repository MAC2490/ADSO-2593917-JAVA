package Registrar;

import java.awt.*;
import Clases.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import Principal.Alert;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegistrarCitas extends javax.swing.JFrame {
    
    private boolean permitirForm;
    private DataBase conexion;
    private int validarCambio;
    private Menu ventanaMenu;
    private Date fechaActual;
    
    public RegistrarCitas() {
        this.conexion = new DataBase();
        this.permitirForm = false;
        this.validarCambio = 0;
        this.fechaActual = new Date();
        initComponents();
        color();
        colorValidacion();
        colorPrincipal();
        initAlternet();
    }
    
    public void initAlternet(){
        // Fecha 
        campoFecha.setDate(fechaActual);
        
        campo_buscar.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    buscar();
                }
            }
        });
    }
    
    public void cambiarImg(int cantidadLetras,int contLetras, int cantidadLetrasApellido,int contLetrasApellido, int cantidadLetrasTipo, int contLetrasTipo, int cantidadNumeroDoc, int contNumeroDoc, int cantidadNumeroContacto, int contNumeroContacto, int cantidadNumeroEdad, int contNumeroEdad, int cantidadNumeroFecha, int contNumeroFecha, int cantidadLetrasMed, int contLetrasMed){
        String nombrePaciente = campoNombrePaciente.getText();
        String apellido = campoApellido.getText();
        String tipoDocumento = campoTipoDocumento.getText();
        String numeroDocumento = campoDocumento.getText();
        String numeroContacto = campoContacto.getText();
        String edad = campoEdad.getText();
        String fecha = campoFecha.getDateFormatString();
        String nombreMedico = campoNombreMedico.getText();
        int validarForm = 0;
                
        // Nombre y Apellido
        if (cantidadLetras == contLetras && cantidadLetrasApellido == contLetrasApellido && !nombrePaciente.equals("") && !apellido.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarNombre.setIcon(new ImageIcon(icono));
            validar_nombre.setText("Nombre y apellido valido ");
            validarForm++;
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
            validarForm++;
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
            validarForm++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarContacto.setIcon(new ImageIcon(icono));
            validar_contacto.setText("Numero de contacto o edad no valido");
            this.permitirForm = true;
        }
        
        // Fecha y nombre medico
        if (cantidadNumeroFecha == contNumeroFecha && cantidadLetrasMed == contLetrasMed && !fecha.equals("") && !nombreMedico.equals("")) {
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/validar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarFecha.setIcon(new ImageIcon(icono));
            validar_fecha.setText("Fecha de la cita y nombre valido");
            validarForm++;
        }else{
            Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/denegar.png"));
            icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            img_validarFecha.setIcon(new ImageIcon(icono));
            validar_fecha.setText("Fecha de la cita y nombre no valido");
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
            validar_formulario.setText("El registro no es valido");
        }
    }
    
    public void validarInput(){
        String nombrePaciente = campoNombrePaciente.getText();
        String apellido = campoApellido.getText();
        String tipoDocumento = campoTipoDocumento.getText();
        String numeroDocumento = campoDocumento.getText();
        String numeroContacto = campoContacto.getText();
        String edad = campoEdad.getText();
        String fecha = campoFecha.getDateFormatString();
        String nombreMedico = campoNombreMedico.getText();
        
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
        
        // Fecha
        int cantidadNumeroFecha = 0;
        int contNumeroFecha = 0;
        for (int i = 0; i < fecha.length(); i++) {
            char caracter = fecha.charAt(i);
            int caracterAscii = (int) caracter;
            if (caracterAscii>=46 && caracterAscii<=58 || caracterAscii == 32 || caracterAscii>=65 && caracterAscii<=90 || caracterAscii>=97 && caracterAscii<=122){
                cantidadNumeroFecha++;
            }
            contNumeroFecha++;
            System.out.println(caracter+" -- "+caracterAscii);
        }
        
        // Nombre medico 
        int cantidadLetrasMed = 0;
        int contLetrasMed = 0;
        for (int i = 0; i < nombreMedico.length(); i++) {
            char caracter = nombreMedico.charAt(i);
            int caracterAscii = (int) caracter;
            if (caracterAscii>=65 && caracterAscii<=90 || caracterAscii>=97 && caracterAscii<=122) {
                cantidadLetrasMed++;
            }
            
            contLetrasMed++;
        }
        cambiarImg(cantidadLetras, contLetras, cantidadLetrasApellido, contLetrasApellido, cantidadLetrasTipo, contLetrasTipo, cantidadNumeroDoc, contNumeroDoc, cantidadNumeroContacto, contNumeroContacto, cantidadNumeroEdad, contNumeroEdad, cantidadNumeroFecha, contNumeroFecha, cantidadLetrasMed, contLetrasMed);
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
        campoContacto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoNombreMedico = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campo_buscar = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        campoFecha = new com.toedter.calendar.JDateChooser();
        panel_validacion = new javax.swing.JPanel();
        validar_nombre = new javax.swing.JLabel();
        img_validarNombre = new javax.swing.JLabel();
        img_validarDocumento = new javax.swing.JLabel();
        validar_documento = new javax.swing.JLabel();
        img_validarContacto = new javax.swing.JLabel();
        validar_contacto = new javax.swing.JLabel();
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
        jLabel6.setText("Numero De Contacto");

        campoContacto.setEditable(false);
        campoContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContactoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad Del Paciente");

        campoEdad.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre Del Medico");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha De La Cita");

        campoNombreMedico.setEditable(false);

        registrar.setBackground(new java.awt.Color(68, 229, 226));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 0, 0));
        registrar.setText("Agendar Cita");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(68, 229, 226));
        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 0, 0));
        cancelar.setText("Cancelar Cita");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Buscar Paciente");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Documento:");

        buscar.setBackground(new java.awt.Color(68, 229, 226));
        buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 0, 0));
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_formularioLayout = new javax.swing.GroupLayout(panel_formulario);
        panel_formulario.setLayout(panel_formularioLayout);
        panel_formularioLayout.setHorizontalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(141, 141, 141))
            .addGroup(panel_formularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_formularioLayout.createSequentialGroup()
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
                                    .addGroup(panel_formularioLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel9))
                                    .addComponent(campoContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(campoTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(campoNombrePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(campoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_formularioLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel3))
                                    .addGroup(panel_formularioLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(panel_formularioLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel7))
                                    .addGroup(panel_formularioLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel8))
                                    .addComponent(campoEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_formularioLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscar)))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(panel_formularioLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar)
                        .addGap(30, 30, 30))))
        );
        panel_formularioLayout.setVerticalGroup(
            panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(10, 10, 10)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_formularioLayout.createSequentialGroup()
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
                            .addComponent(campoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panel_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(cancelar))
                .addGap(56, 56, 56))
        );

        panel_principal.add(panel_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 420, 480));

        validar_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_nombre.setForeground(new java.awt.Color(255, 255, 255));

        validar_documento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_documento.setForeground(new java.awt.Color(255, 255, 255));

        validar_contacto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        validar_contacto.setForeground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap()
                .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_validacionLayout.createSequentialGroup()
                        .addComponent(img_validarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(validar_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_validacionLayout.createSequentialGroup()
                        .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(img_validarContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(img_validarNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(img_validarDocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_validacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(validar_documento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(validar_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validar_contacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_validacionLayout.createSequentialGroup()
                        .addGap(0, 134, Short.MAX_VALUE)
                        .addComponent(img_validarFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(validar_formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
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
                                .addComponent(img_validarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_validacionLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(validar_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_principal.add(panel_validacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 460, 480));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGENDAR CITAS");

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
                .addContainerGap(356, Short.MAX_VALUE))
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
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        validarInput();
        String numeroDocumento = campoDocumento.getText();
        String nombreMedicoM = campoNombreMedico.getText();
        String nombreMedico = nombreMedicoM.substring(0, 1).toUpperCase() + nombreMedicoM.substring(1);
        
        // Fecha 
        Date fechaTemp = campoFecha.getDate();
        Calendar guardarFecha = Calendar.getInstance();
        guardarFecha.setTime(fechaTemp);
        int dia = guardarFecha.get(Calendar.DAY_OF_MONTH);
        int mes = guardarFecha.get(Calendar.MONTH)+1;
        int ano = guardarFecha.get(Calendar.YEAR);
        String fecha = String.format("%02d/%02d/%d",dia,mes,ano);
        
        if (!this.permitirForm) {
            boolean repetido = false;
            Citas estado = this.conexion.buscarCitasEstado(numeroDocumento);
            
            if (this.conexion.buscarCitas(numeroDocumento) != null && estado != null) {
                Alert alerta = new Alert("REGISTRAR", "La cita esta pendiente", "error");
                repetido = true;
            }
            
            if (this.conexion.buscarPaciente(numeroDocumento) == null) {
                Alert alerta = new Alert("REGISTRAR", "El paciente no esta registrado", "error");
                repetido = true; 
            }
            
            if (!repetido) {
                boolean registrar = conexion.registrarCitas(numeroDocumento, "PENDIENTE", fecha, nombreMedico);
                if (registrar == true) {
                    Alert alerta = new Alert("REGISTRAR", "Registro exitoso", "success");
                }else{
                    Alert alerta = new Alert("REGISTRAR", "El registro fallo", "warning");
                }
            }
        }else{
            Alert alerta = new Alert("REGISTRAR", "Algunos campos estan mal", "error");
        }
        
    }//GEN-LAST:event_registrarActionPerformed
    
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        campoApellido.setText("");
        campoContacto.setText("");
        campoDocumento.setText("");
        campoEdad.setText("");
        campoFecha.setDate(fechaActual);
        campoNombreMedico.setText("");
        campoNombrePaciente.setText("");
        campoTipoDocumento.setText("");
        campo_buscar.setText("");
        
        validar_contacto.setText("");
        validar_documento.setText("");
        validar_formulario.setText("");
        validar_fecha.setText("");
        validar_nombre.setText("");
        
        Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/limpiarImg.png"));
        icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        img_validarContacto.setIcon(new ImageIcon(icono));
        img_validarDocumento.setIcon(new ImageIcon(icono));
        img_validarFecha.setIcon(new ImageIcon(icono));
        img_validarFormulario.setIcon(new ImageIcon(icono));
        img_validarNombre.setIcon(new ImageIcon(icono));
    }//GEN-LAST:event_cancelarActionPerformed
    
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        buscar();
    }//GEN-LAST:event_buscarActionPerformed

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
                    this.campoEdad.setText(buscar[i].getEdad_paciente());
                    this.campoContacto.setText(buscar[i].getNumeroContacto());
                    this.campoNombreMedico.requestFocus();;
                    validarAlerta++;
                    break;
                }
            }
        }else{
            Alert alerta = new Alert("HOSPITALIZAR", "El campo buscar no esta lleno", "error");
        }
        
        if (validarAlerta > 0) {
            habilitarInput(this.campoNombreMedico);
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
    
    private void campoContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContactoActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoContacto;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoEdad;
    private com.toedter.calendar.JDateChooser campoFecha;
    private javax.swing.JTextField campoNombreMedico;
    private javax.swing.JTextField campoNombrePaciente;
    private javax.swing.JTextField campoTipoDocumento;
    private javax.swing.JTextField campo_buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel img_validarContacto;
    private javax.swing.JLabel img_validarDocumento;
    private javax.swing.JLabel img_validarFecha;
    private javax.swing.JLabel img_validarFormulario;
    private javax.swing.JLabel img_validarNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel validar_contacto;
    private javax.swing.JLabel validar_documento;
    private javax.swing.JLabel validar_fecha;
    private javax.swing.JLabel validar_formulario;
    private javax.swing.JLabel validar_nombre;
    // End of variables declaration//GEN-END:variables
}
