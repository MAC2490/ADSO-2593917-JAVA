package Consultar;

import javax.swing.JPanel;
import Clases.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import Principal.Alert;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConsultarInternos extends javax.swing.JFrame {

    private DataBase conexion;
    private DefaultTableModel modal;
    private DefaultTableCellRenderer renderer;
    
    public ConsultarInternos() {
        this.conexion = new DataBase();
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
    
    public JPanel getPanel(){
        return panel_principal;
    }
    
    public void color(){
        Color c1 = new Color(0x44E5E2);
        Color c2 = new Color(0x0AC18F);
        jpColor jpmicolor = new jpColor(c1,c2);
        jpmicolor.setSize(this.getSize()); 
        panel_principal.add(jpmicolor);
    }
    
    public void agregarDatos(){
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        
        Paciente listaPacientes[] = this.conexion.listaPacientes();
        Internos listaInterno[] = this.conexion.listaInternos();
        int validarAlerta = 0;
        modal.setNumRows(0);
        
        if (listaPacientes != null && listaInterno != null) {
            for (int i = 0; i < listaPacientes.length; i++) {
                if (listaPacientes[i] != null) {
                    for (int j = 0; j < listaInterno.length; j++) {
                        if (listaInterno[j] != null && listaPacientes[i] != null) {
                            if (listaPacientes[i].getNumero_documento().equals(listaInterno[j].getDocumento())) {
                                Object [] datos = {listaPacientes[i].getNombre_paciente(),
                                               listaPacientes[i].getApellido_paciente(),
                                               listaPacientes[i].getTipo_documento(),
                                               listaPacientes[i].getNumero_documento(),
                                               listaPacientes[i].getTipo_sangre(),
                                               listaPacientes[i].getEdad_paciente(),
                                               listaInterno[j].getFecha(),
                                               listaInterno[j].getNumero_camilla(),
                                               listaInterno[j].getEstado()};
                                modal.addRow(datos);
                                validarAlerta++;
                            }
                        }else if(listaInterno[j] != null){
                            break;
                        }
                    }
                }else {
                    break;
                }
            }
            
            if (validarAlerta == 0) {
                Alert alerta = new Alert("COSULTA", "No esxisten citas para ver", "error");
            }
            revalidate();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoBuscarFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoBuscarEstado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoBuscarDocumento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PACIENTES HOSPITALIZADOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar por:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Documento:");

        jButton1.setBackground(new java.awt.Color(68, 229, 226));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "T Documento", "N° Documento", "T Sangre", "Edad", "Fecha", "N° Camilla", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        jButton2.setBackground(new java.awt.Color(68, 229, 226));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(68, 229, 226));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("VOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Solo se permite modifcar el numero de la camilla");

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(campoBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(campoBuscarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(campoBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(14, 14, 14))))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoBuscarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel6))
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void buscar(){
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        
        Paciente listarPaciente[] = this.conexion.listaPacientes();
        Internos listarInternos[] = this.conexion.listaInternos();
        modal.setNumRows(0);
        
        String fecha = this.campoBuscarFecha.getText().trim();
        String estado = this.campoBuscarEstado.getText().trim();
        String documento = this.campoBuscarDocumento.getText().trim();
        int validarAlerta = 0;
        
        if (!fecha.equals("")) {
            if (listarPaciente != null && listarInternos != null) {
                for (int i = 0; i < listarPaciente.length; i++) {
                    if (listarPaciente[i] != null) {
                        for (int j = 0; j < listarInternos.length; j++) {
                            if (listarInternos[j] != null && listarPaciente[i] != null) {
                                if (listarPaciente[i].getNumero_documento().equals(listarInternos[j].getDocumento()) && fecha.equals(listarInternos[j].getFecha())) {
                                    Object [] datos = {listarPaciente[i].getNombre_paciente(),
                                                        listarPaciente[i].getApellido_paciente(),
                                                        listarPaciente[i].getTipo_documento(),
                                                        listarPaciente[i].getNumero_documento(),
                                                        listarPaciente[i].getTipo_sangre(),
                                                        listarPaciente[i].getEdad_paciente(),
                                                        listarInternos[j].getFecha(),
                                                        listarInternos[j].getNumero_camilla(),
                                                        listarInternos[j].getEstado()};
                                    modal.addRow(datos);
                                    validarAlerta++;
                                }
                            }else if(listarInternos[j] != null){
                                break;
                            }
                        }
                    }else {
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
            if (listarInternos != null && listarPaciente != null) {
                for (int i = 0; i < listarPaciente.length; i++) {
                    if (listarPaciente[i] != null) {
                        for (int j = 0; j < listarInternos.length; j++) {
                            if (listarInternos[j] != null && listarPaciente[i] != null) {
                                if (listarPaciente[i].getNumero_documento().equals(listarInternos[j].getDocumento()) && estado.equalsIgnoreCase(listarInternos[j].getEstado())) {
                                    Object [] datos = {listarPaciente[i].getNombre_paciente(),
                                                    listarPaciente[i].getApellido_paciente(),
                                                    listarPaciente[i].getTipo_documento(),
                                                    listarPaciente[i].getNumero_documento(),
                                                    listarPaciente[i].getTipo_sangre(),
                                                    listarPaciente[i].getEdad_paciente(),
                                                    listarInternos[j].getFecha(),
                                                    listarInternos[j].getNumero_camilla(),
                                                    listarInternos[j].getEstado()};
                                    modal.addRow(datos);
                                    validarAlerta++;
                                }
                            }else if(listarInternos[j] == null){
                                break;
                            }
                        }
                    }else{
                        break;
                    }
                }
            }
            
            if (validarAlerta>0) {
                Alert alerta = new Alert("BUSQUEDA", "Busqueda exitoda", "success");
            }else{
                agregarDatos();
                Alert alerta = new Alert("BUSQUEDA", "Busqueda no encontrada", "error");
            }
        }else if(!documento.equals("")){
            Paciente buscarDocumento = this.conexion.buscarPaciente(documento);
            for (int i = 0; i < listarInternos.length; i++) {
                if (listarInternos[i] != null && documento.equals(listarInternos[i].getDocumento())) {
                    Object [] datos = {buscarDocumento.getNombre_paciente(),
                                                    buscarDocumento.getApellido_paciente(),
                                                    buscarDocumento.getTipo_documento(),
                                                    buscarDocumento.getNumero_documento(),
                                                    buscarDocumento.getTipo_sangre(),
                                                    buscarDocumento.getEdad_paciente(),
                                                    listarInternos[i].getFecha(),
                                                    listarInternos[i].getNumero_camilla(),
                                                    listarInternos[i].getEstado()};
                    modal.addRow(datos);
                    validarAlerta++;
                }else if(listarInternos[i] == null){
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
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
                Internos buscarInterno = this.conexion.buscarInternosEstado(guardarInfo[i][3]);
                if (buscarInterno != null && !buscarInterno.getNumero_camilla().equalsIgnoreCase(guardarInfo[i][7])) {
                    int cantidadLetras = 0;
                    int contLetras = 0; 
                    int palabra = guardarInfo[i][7].length();
                    for (int k = 0; k < palabra; k++) {
                        char caracterAscii = guardarInfo[i][7].charAt(k);
                        if (caracterAscii>=48 && caracterAscii<=57) {
                            cantidadLetras++;
                        }
                        contLetras++;
                    }
                    if (cantidadLetras == contLetras) {
                        if (!guardarInfo[i][8].equalsIgnoreCase("DeAlta")) {
                            Internos tempCitas = new Internos(guardarInfo[i][6], guardarInfo[i][7], guardarInfo[i][3], guardarInfo[i][8]);
                            boolean proceso = this.conexion.modificarInterno(tempCitas);
                            validarAlerta++;
                        }
                    }else{
                        denegarAlerta++;
                    }
                    agregarDatos();
                    break;
                }
            }
        }
        
        if (validarAlerta >0) {
            campoBuscarDocumento.setText("");
            campoBuscarEstado.setText("");
            campoBuscarFecha.setText("");
            Alert alerta = new Alert("MODIFICAR", "Modificacion exitosa", "success");
        }else if(denegarAlerta>0){
            Alert alerta = new Alert("MODIFICAR", "Caracteres no validos", "warning");
        }else{
            Alert alerta = new Alert("MODIFICAR", "Modificacion no exitosa", "error");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        campoBuscarDocumento.setText("");
        campoBuscarEstado.setText("");
        campoBuscarFecha.setText("");
        agregarDatos();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarInternos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarInternos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarInternos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarInternos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarInternos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoBuscarDocumento;
    private javax.swing.JTextField campoBuscarEstado;
    private javax.swing.JTextField campoBuscarFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
