package Consultar;

import Clases.*;
import java.awt.Color;
import Principal.Alert;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ConsultarCitas extends javax.swing.JFrame {
    
    private DataBase conexion;
    private DefaultTableModel modal;
    private DefaultTableCellRenderer renderer;
    private int validarCambioEstado;
    
    public ConsultarCitas() {
        this.conexion = new DataBase();
        this.validarCambioEstado = 0;
        initComponents();
        this.renderer = new DefaultTableCellRenderer();
        this.modal = (DefaultTableModel) tabla.getModel();
        color();
        agregarDatos();
        initAltern();
    }
    
    public void initAltern(){
        campoBuscarFecha.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    buscar();
                }
            }
        });
        
        campoBuscarEstado.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    buscar();
                }
            }
        });
        
        campoBuscarDocumento.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    buscar();
                }
            }
        });
    }
    
    public void color(){
        Color c1 = new Color(0x44E5E2);
        Color c2 = new Color(0x0AC18F);
        jpColor jpmicolor = new jpColor(c1,c2);
        jpmicolor.setSize(this.getSize()); 
        this.panel_pricipal.add(jpmicolor);
    }
    
    public JPanel getPanel(){
        return this.panel_pricipal;
    }
    
    public void agregarDatos(){
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        
        modal.setNumRows(0);
        Paciente listaPacientes[] = this.conexion.listaPacientes();
        Citas listarCitas[] = this.conexion.listaCitas();
        int validarAlerta = 0;
        
        if (listarCitas != null && listaPacientes != null) {
            for (int i = 0; i < listaPacientes.length; i++) {
                if (listaPacientes[i] != null) {
                    for (int j = 0; j < listarCitas.length; j++) {
                        if (listarCitas[j] != null && listaPacientes[i] != null) {
                            if (listaPacientes[i].getNumero_documento().equals(listarCitas[j].getNumero_documento())) {
                                Object [] datos = {listaPacientes[i].getNombre_paciente(),
                                               listaPacientes[i].getApellido_paciente(),
                                               listaPacientes[i].getTipo_documento(),
                                               listaPacientes[i].getNumero_documento(),
                                               listaPacientes[i].getEdad_paciente(),
                                               listarCitas[j].getFecha_cita(),
                                               listarCitas[j].getNombre_medico(),
                                               listarCitas[j].getEstado()};
                                modal.addRow(datos);
                                validarAlerta++;
                            }
                        }else if(listarCitas[j] != null){
                            break;
                        }
                    }
                }else {
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
        botonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoBuscarFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoBuscarEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoBuscarDocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CITAS");

        botonBuscar.setBackground(new java.awt.Color(68, 229, 226));
        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        campoBuscarFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoBuscarFecha.setForeground(new java.awt.Color(30, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado:");

        campoBuscarEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoBuscarEstado.setForeground(new java.awt.Color(30, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Documento:");

        campoBuscarDocumento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoBuscarDocumento.setForeground(new java.awt.Color(30, 30, 30));
        campoBuscarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarDocumentoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar por:");

        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "T Documento ", "N° Documento ", "Edad", "Fecha", "Nombre Doc", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
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
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(68, 229, 226));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("MODIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Solo se permite modificar el nombre del medico y la fecha de la cita si todavia no se cumple la fecha de la cita");

        jButton2.setBackground(new java.awt.Color(68, 229, 226));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_pricipalLayout = new javax.swing.GroupLayout(panel_pricipal);
        panel_pricipal.setLayout(panel_pricipalLayout);
        panel_pricipalLayout.setHorizontalGroup(
            panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pricipalLayout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addGroup(panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pricipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pricipalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(campoBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(campoBuscarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(botonBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pricipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        panel_pricipalLayout.setVerticalGroup(
            panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pricipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(25, 25, 25)
                .addGroup(panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(jLabel2)
                    .addComponent(campoBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(campoBuscarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_pricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_pricipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_pricipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_botonBuscarActionPerformed

    public void buscar(){
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        modal.setNumRows(0);
        Paciente listarPaciente[] = this.conexion.listaPacientes();
        Citas listarCitas[] = this.conexion.listaCitas();

        String fecha = this.campoBuscarFecha.getText().trim();
        String estado = this.campoBuscarEstado.getText().trim();
        String documento = this.campoBuscarDocumento.getText().trim();
        int validarAlerta = 0;
        
        if (!fecha.equals("")) {
            if (listarPaciente != null && listarCitas != null) {
                for (int i = 0; i < listarPaciente.length; i++) {
                    if (listarPaciente[i] != null) {
                        for (int j = 0; j < listarCitas.length; j++) {
                            if (listarCitas[j] != null && listarPaciente[i] != null) {
                                if (listarCitas[j].getNumero_documento().equals(listarPaciente[i].getNumero_documento()) && fecha.equals(listarCitas[j].getFecha_cita())) {
                                    Object [] datos = {listarPaciente[i].getNombre_paciente(),
                                                        listarPaciente[i].getApellido_paciente(),
                                                        listarPaciente[i].getTipo_documento(),
                                                        listarPaciente[i].getNumero_documento(),
                                                        listarPaciente[i].getEdad_paciente(),
                                                        listarCitas[j].getFecha_cita(),
                                                        listarCitas[j].getNombre_medico(),
                                                        listarCitas[j].getEstado()};
                                modal.addRow(datos);
                                validarAlerta++;
                                }
                            }else if(listarCitas[j] == null){
                                break;
                            }
                        }
                    }else{
                        break;
                    }
                    revalidate();
                }
            }
            
            if (validarAlerta>0) {
                Alert alerta = new Alert("BUSQUEDA", "Busqueda exitoda", "success");
            }else{
                agregarDatos();
                Alert alerta = new Alert("BUSQUEDA", "Busqueda no encontrada", "error");
            }
        }else if(!estado.equals("")){
            if (listarCitas != null && listarPaciente != null) {
                for (int i = 0; i < listarPaciente.length; i++) {
                    if (listarPaciente[i] != null) {
                        for (int j = 0; j < listarCitas.length; j++) {
                            if (listarCitas[j] != null && listarPaciente[i] != null) {
                                if (listarCitas[j].getNumero_documento().equals(listarPaciente[i].getNumero_documento()) && estado.equalsIgnoreCase(listarCitas[j].getEstado())) {
                                    Object [] datos = {listarPaciente[i].getNombre_paciente(),
                                                        listarPaciente[i].getApellido_paciente(),
                                                        listarPaciente[i].getTipo_documento(),
                                                        listarPaciente[i].getNumero_documento(),
                                                        listarPaciente[i].getEdad_paciente(),
                                                        listarCitas[j].getFecha_cita(),
                                                        listarCitas[j].getNombre_medico(),
                                                        listarCitas[j].getEstado()};
                                    modal.addRow(datos);
                                    validarAlerta++;
                                }
                            }
                        }
                    }
                }
                if (validarAlerta>0) {
                Alert alerta = new Alert("BUSQUEDA", "Busqueda exitoda", "success");
                }else{
                    agregarDatos();
                    Alert alerta = new Alert("BUSQUEDA", "Busqueda no encontrada", "error");
                }
            }
        }else if(!documento.equals("")){
            Paciente buscarDocumento = this.conexion.buscarPaciente(documento);
            for (int i = 0; i < listarCitas.length; i++) {
                if (listarCitas[i] != null && documento.equals(listarCitas[i].getNumero_documento())) {
                    Object [] datos = {buscarDocumento.getNombre_paciente(),
                                        buscarDocumento.getApellido_paciente(),
                                        buscarDocumento.getTipo_documento(),
                                        buscarDocumento.getNumero_documento(),
                                        buscarDocumento.getEdad_paciente(),
                                        listarCitas[i].getFecha_cita(),
                                        listarCitas[i].getNombre_medico(),
                                        listarCitas[i].getEstado()};
                    modal.addRow(datos);
                    validarAlerta++;
                }else if(listarCitas[i] == null){
                    break;
                }
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
    
    private void campoBuscarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscarDocumentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = this.modal.getRowCount();
        int columna = this.modal.getColumnCount();
        int validarAlerta = 0;
        int confirmarAlerta = 0;
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
                Citas buscarCitas = this.conexion.buscarCitas(guardarInfo[i][3]);
                if (buscarCitas != null && !buscarCitas.getFecha_cita().equalsIgnoreCase(guardarInfo[i][5]) || !buscarCitas.getNombre_medico().equalsIgnoreCase(guardarInfo[i][6])) {
                    int cantidadLetras = 0;
                    int contLetras = 0; 
                    int palabra = guardarInfo[i][6].length();
                    for (int k = 0; k < palabra; k++) {
                        char caracterAscii = guardarInfo[i][6].charAt(k);
                        if (caracterAscii>=97 && caracterAscii<=122 || caracterAscii>=65 && caracterAscii<=90) {
                            cantidadLetras++;
                        }
                        contLetras++;
                    }
                    
                    int cantidadNumeroFecha = 0;
                    int contNumeroFecha = 0;
                    int fecha = guardarInfo[i][5].length();
                    if (fecha == 10) {
                        for (int k = 0; k < fecha; k++) {
                            char caracterAscii = guardarInfo[i][5].charAt(k);
                            if (caracterAscii>=46 && caracterAscii<=58){
                                cantidadNumeroFecha++;
                            }
                            contNumeroFecha++;
                        }
                    }else{
                        contNumeroFecha++;
                    }
                    
                    if (cantidadLetras == contLetras && cantidadNumeroFecha == contNumeroFecha) {
                        String nombreDoc = guardarInfo[i][6].substring(0, 1).toUpperCase() + guardarInfo[i][6].substring(1);
                        Citas tempCitas = new Citas(guardarInfo[i][3], guardarInfo[i][7], guardarInfo[i][5], nombreDoc);
                        if (!guardarInfo[i][7].equalsIgnoreCase("CUMPLIDA")) {
                            boolean proceso = this.conexion.modificarCitas(tempCitas);
                            validarAlerta++;
                        }
                    }else{
                        denegarAlerta++;
                    }
                    confirmarAlerta++;
                    agregarDatos();
                    break;
                }
            }
        }
        
        if (validarAlerta == confirmarAlerta) {
            campoBuscarDocumento.setText("");
            campoBuscarEstado.setText("");
            campoBuscarFecha.setText("");
            Alert alerta = new Alert("MODIFICAR", "Modificacion exitosa", "success");
        }else if(denegarAlerta>0){
            Alert alerta = new Alert("MODIFICAR", "Caracteres no validos", "warning");
        }else{
            Alert alerta = new Alert("MODIFICAR", "Modificacion no exitosa", "error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        campoBuscarDocumento.setText("");
        campoBuscarEstado.setText("");
        campoBuscarFecha.setText("");
        agregarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

     
    
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
            java.util.logging.Logger.getLogger(ConsultarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoBuscarDocumento;
    private javax.swing.JTextField campoBuscarEstado;
    private javax.swing.JTextField campoBuscarFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_pricipal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
