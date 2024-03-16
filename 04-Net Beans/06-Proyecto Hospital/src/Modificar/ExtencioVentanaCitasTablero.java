package Modificar;

import Clases.*;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import Principal.Alert;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExtencioVentanaCitasTablero extends javax.swing.JFrame {

    private DataBase conexion;
    private DefaultTableModel modal;
    private DefaultTableCellRenderer renderer;
    
    public ExtencioVentanaCitasTablero() {
        this.conexion = new DataBase();
        initComponents();
        this.renderer = new DefaultTableCellRenderer();
        this.modal = (DefaultTableModel) tabla.getModel();
        agregarDatos();
        initAlternet();
    }
    
    public void initAlternet(){
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tabla.rowAtPoint(e.getPoint());
                int columna = tabla.columnAtPoint(e.getPoint());
                
                buscarCita(fila, columna);
            }
        });
    }
    
    public void buscarCita(int fila, int columna){
        int contFila = this.modal.getRowCount();
        int contColumna = this.modal.getColumnCount();
        String nombre = "";
        String apellido = "";
        String numeroDocumento = "";
        String fecha = "";
        String nommbreMedico = "";
        String estado = "";
        String guardarInfo[][] = new String[contFila][contColumna];
        for (int i = 0; i < contFila; i++) {
            for (int j = 0; j < contColumna; j++) {
                Object value = modal.getValueAt(i, j);
                guardarInfo [i][j] = value.toString(); 
                if (i == fila) {
                    nombre = guardarInfo[i][0];
                    apellido = guardarInfo[i][1];
                    numeroDocumento = guardarInfo[i][2];
                    fecha = guardarInfo[i][3];
                    nommbreMedico = guardarInfo[i][4];
                    estado = guardarInfo[i][5];
                    if (j==5) {
                        if (estado.equalsIgnoreCase("PENDIENTE")) {
                            Alert alerta = new Alert("BUSQUEDA", "Busqueda exitosa", "success");
                            ExtencionVentanaCitas ventana = new ExtencionVentanaCitas(numeroDocumento);
                            cambiarVentana(ventana.getPanel());
                        }else{
                            Alert alerta = new Alert("BUSQUEDA", "Cita cancelada o cumplida", "error");
                        }
                        break;
                    }
                }
            }
        }   
    }
    
    public void cambiarVentana(JPanel ventana){
        ventana.setSize(536, 436);
        ventana.setLocation(0, 0);
        panel_principal.removeAll();
        panel_principal.add(ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        panel_principal.revalidate();
        panel_principal.repaint();
    }
    
    public void agregarDatos(){
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        
        modal.setNumRows(0);
        Citas listarCitas[] = this.conexion.listaCitas();
        Paciente listaPacientes[] = this.conexion.listaPacientes();
        int validarAlerta = 0;
        
        if (listarCitas != null && listaPacientes != null) {
            for (int i = 0; i < listaPacientes.length; i++) {
                if (listaPacientes[i] != null) {
                    for (int j = 0; j < listarCitas.length; j++) {
                        if (listarCitas[j] != null && listaPacientes[i] != null) {
                            if (listaPacientes[i].getNumero_documento().equals(listarCitas[j].getNumero_documento())) {
                                Object [] datos = {listaPacientes[i].getNombre_paciente(),
                                               listaPacientes[i].getApellido_paciente(),
                                               listaPacientes[i].getNumero_documento(),
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
    
    public JPanel getPanel(){
        return panel_principal;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "N° Documento", "Fecha Cita", "Nombre Doc", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ExtencioVentanaCitasTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtencioVentanaCitasTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtencioVentanaCitasTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtencioVentanaCitasTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExtencioVentanaCitasTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
