package Consultar;

import Clases.*;
import Clases.jpColor;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import Principal.Alert;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConsultarPacientes extends javax.swing.JFrame {

    private DataBase conexion;
    private DefaultTableModel modal;
    private DefaultTableCellRenderer renderer;
    
    public ConsultarPacientes() {
        this.conexion = new DataBase();
        initComponents();
        this.renderer = new DefaultTableCellRenderer();
        this.modal = (DefaultTableModel) tabla.getModel();
        color();
        agregarDatos();
        initAltern();
    }
    
    public void initAltern(){
        campoDocumento.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    buscar();
                }
            }
        });
        
        campoTipoSangre.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    buscar();
                }
            }
        });
    }
    
    public JPanel getPanel(){
        return panel_pricipal;
    } 
    
    public void color(){
        Color c1 = new Color(0x44E5E2);
        Color c2 = new Color(0x0AC18F);
        jpColor jpmicolor = new jpColor(c1,c2);
        jpmicolor.setSize(this.getSize()); 
        this.panel_pricipal.add(jpmicolor);
    }
    
    public void agregarDatos(){
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        
        modal.setNumRows(0);
        Paciente listarPaciente[] = this.conexion.listaPacientes();
        int validarAlerta = 0;
        if (listarPaciente != null) {
            for (int i = 0; i < listarPaciente.length; i++) {
                if (listarPaciente[i] != null) {
                    Object [] datos = {listarPaciente[i].getNombre_paciente(),
                                               listarPaciente[i].getApellido_paciente(),
                                               listarPaciente[i].getTipo_documento(),
                                               listarPaciente[i].getNumero_documento(),
                                               listarPaciente[i].getTipo_sangre(),
                                               listarPaciente[i].getEdad_paciente(),
                                               listarPaciente[i].getNumeroContacto()};
                    modal.addRow(datos);
                    validarAlerta++;
                }else{
                    break;
                }
            }
        }
        
        if (validarAlerta == 0) {
            Alert alerta = new Alert("COSULTA", "No esxisten citas para ver", "error");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_pricipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoTipoSangre = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PACIENTES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar por:");

        btnBuscar.setBackground(new java.awt.Color(68, 229, 226));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Documento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo Sangre:");

        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "T Documento", "N° Documento", "T Sangre", "Edad", "N° Contacto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        btnModificar.setBackground(new java.awt.Color(68, 229, 226));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnModificar1.setBackground(new java.awt.Color(68, 229, 226));
        btnModificar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar1.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar1.setText("VOLVER");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("No se permite modificar el numero de cedula");

        javax.swing.GroupLayout panel_pricipalLayout = new javax.swing.GroupLayout(panel_pricipal);
        panel_pricipal.setLayout(panel_pricipalLayout);
        panel_pricipalLayout.setHorizontalGroup(
            panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pricipalLayout.createSequentialGroup()
                .addGroup(panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_pricipalLayout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addGroup(panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panel_pricipalLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_pricipalLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(campoTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnBuscar)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pricipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btnModificar1)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(22, 22, 22))
        );
        panel_pricipalLayout.setVerticalGroup(
            panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pricipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel3)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnModificar1)
                    .addComponent(jLabel5))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_pricipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_pricipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void buscar(){
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        
        modal.setNumRows(0);
        String documento = this.campoDocumento.getText().trim();
        String tipoSangre = this.campoTipoSangre.getText().trim();
        Paciente listaPaciente[] = this.conexion.listaPacientes();
        int validarAlerta = 0;
        
        if (!documento.equals("")) {
            for (int i = 0; i < listaPaciente.length; i++) {
                if (listaPaciente[i] != null ) {
                    if (listaPaciente[i].getNumero_documento().equalsIgnoreCase(documento)) {
                        Paciente buscarDocumento = this.conexion.buscarPaciente(listaPaciente[i].getNumero_documento());
                        Object [] datos = {buscarDocumento.getNombre_paciente(),
                                               buscarDocumento.getApellido_paciente(),
                                               buscarDocumento.getTipo_documento(),
                                               buscarDocumento.getNumero_documento(),
                                               buscarDocumento.getTipo_sangre(),
                                               buscarDocumento.getEdad_paciente(),
                                               buscarDocumento.getNumeroContacto()};
                        modal.addRow(datos);
                        validarAlerta++;
                    }
                }else{
                    break;
                }
                revalidate();
            }
            
            if (validarAlerta>0) {
                Alert alerta = new Alert("BUSQUEDA", "Busqueda exitoda", "success");
            }else{
                agregarDatos();
                Alert alerta = new Alert("BUSQUEDA", "Busqueda no encontrada", "error");
            }
        }else if(!tipoSangre.equalsIgnoreCase("")){
            for (int i = 0; i < listaPaciente.length; i++) {
                if (listaPaciente[i] != null) {
                    if (listaPaciente[i].getTipo_sangre().equalsIgnoreCase(tipoSangre)) {
                        Paciente buscarDocumento = this.conexion.buscarPaciente(listaPaciente[i].getNumero_documento());
                        Object [] datos = {buscarDocumento.getNombre_paciente(),
                                               buscarDocumento.getApellido_paciente(),
                                               buscarDocumento.getTipo_documento(),
                                               buscarDocumento.getNumero_documento(),
                                               buscarDocumento.getTipo_sangre(),
                                               buscarDocumento.getEdad_paciente(),
                                               buscarDocumento.getNumeroContacto()};
                        modal.addRow(datos);
                        validarAlerta++;
                    }
                }else{
                    break;
                }
                revalidate();
            }
            if (validarAlerta>0) {
                Alert alerta = new Alert("BUSQUEDA", "Busqueda exitoda", "success");
            }else{
                agregarDatos();
                Alert alerta = new Alert("BUSQUEDA", "Busqueda no encontrada", "error");
            }
        }else{
            Alert alerta = new Alert("BUSQUEDA", "Los espacion no estan llenos", "warning");
            agregarDatos();
        }
    }
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = this.modal.getRowCount();
        int columna = this.modal.getColumnCount();
        int validarAlerta = 0;
        int denegarAlerta = 0;
        String guardarInfo[][] = new String[fila][columna];
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                Object value = modal.getValueAt(i, j);
                guardarInfo [i][j] = value.toString();
                
            }
        }
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                Paciente buscarPaciente = this.conexion.buscarPaciente(guardarInfo[i][3]);
                if (!buscarPaciente.getNombre_paciente().equalsIgnoreCase(guardarInfo[i][0]) ||
                    !buscarPaciente.getApellido_paciente().equalsIgnoreCase(guardarInfo[i][1]) ||
                    !buscarPaciente.getTipo_documento().equalsIgnoreCase(guardarInfo[i][2]) ||
                    !buscarPaciente.getNumeroContacto().equalsIgnoreCase(guardarInfo[i][3]) ||
                    !buscarPaciente.getTipo_sangre().equalsIgnoreCase(guardarInfo[i][4]) ||
                    !buscarPaciente.getEdad_paciente().equalsIgnoreCase(guardarInfo[i][5]) ||
                    !buscarPaciente.getNumeroContacto().equalsIgnoreCase(guardarInfo[i][6])) {
                    
                    boolean permitirCambio = validarModificacion(guardarInfo[i][0], guardarInfo[i][1], guardarInfo[i][2], guardarInfo[i][3], guardarInfo[i][4], guardarInfo[i][5], guardarInfo[i][6]);
                    
                    if (permitirCambio == true) {
                        String nombre = guardarInfo[i][0].substring(0, 1).toUpperCase() + guardarInfo[i][0].substring(1);
                        String apellido = guardarInfo[i][1].substring(0, 1).toUpperCase() + guardarInfo[i][1].substring(1);
                        String tipoSangre = guardarInfo[i][4].toUpperCase();
                        String tipoDocumento = guardarInfo[i][2].toUpperCase();
                        Paciente temp = new Paciente(nombre, apellido, tipoDocumento, guardarInfo[i][3], tipoSangre, guardarInfo[i][5], guardarInfo[i][6]);
                        boolean proceso = this.conexion.modificarPaciente(temp);
                        validarAlerta++;
                    }else{
                        denegarAlerta++;
                    }
                    agregarDatos();
                    break;
                }
            }
        }
        
        if (denegarAlerta>0) {
            Alert alerta = new Alert("MODIFICAR", "Caracteres no validos", "warning");
        }else if(validarAlerta>0){
            campoDocumento.setText("");
            campoTipoSangre.setText("");
            Alert alerta = new Alert("MODIFICAR", "Modificacion exitosa", "success");
        }else{
            Alert alerta = new Alert("MODIFICAR", "Modificacion no exitosa", "error");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public boolean validarModificacion(String nombrePaciente, String apellido, String tipoDocumento, String numeroDocumento, String tipoSangre, String edad, String numeroContacto){
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
        
        // Tipo documneto
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
        
        if (cantidadLetras == contLetras && cantidadLetrasApellido == contLetrasApellido && cantidadLetrasTipo == contLetrasTipo && cantidadNumeroDoc == contNumeroDoc && cantidadNumeroContacto == contNumeroContacto && cantidadNumeroEdad == contNumeroEdad && cantidadNumeroSangre == contNumeroSangre) {
            return true;
        }else{
            return false;
        }
    }
    
    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        campoDocumento.setText("");
        campoTipoSangre.setText("");
        agregarDatos();
    }//GEN-LAST:event_btnModificar1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoTipoSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_pricipal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
