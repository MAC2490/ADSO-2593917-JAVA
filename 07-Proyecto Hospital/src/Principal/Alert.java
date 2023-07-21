package Principal;

import Modificar.ExtencioVentanaCitasTablero;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Alert extends javax.swing.JFrame {

    public Alert(String titulo, String mensaje, String tipo) {
        initComponents();
        
        String textoIcono = "";
        if (tipo.equals("success")) {
            textoIcono = "icono_success.png";
        }else if (tipo.equals("error")) {
            textoIcono = "icono_error.png";
        }else if (tipo.equals("warning")) {
            textoIcono = "icono_warning.png";
        }
        Image icono = getToolkit().getImage(ClassLoader.getSystemResource("img/"+textoIcono));
        icono = icono.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        etqImagen.setIcon(new ImageIcon(icono));
        
        etqTitulo.setText(titulo);
        etqMensaje.setText(mensaje);
        setLocationRelativeTo(null);
        setTitle("Alerta");
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqImagen = new javax.swing.JLabel();
        etqMensaje = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(204, 255, 255));

        etqTitulo.setBackground(new java.awt.Color(204, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("XXXXXx");
        etqTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        etqTitulo.setOpaque(true);

        etqImagen.setBackground(new java.awt.Color(204, 255, 255));
        etqImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqImagen.setOpaque(true);

        etqMensaje.setBackground(new java.awt.Color(204, 255, 255));
        etqMensaje.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etqMensaje.setForeground(new java.awt.Color(0, 0, 0));
        etqMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMensaje.setText("XXXXXXXXXXXXxxx");
        etqMensaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        etqMensaje.setOpaque(true);

        btnAceptar.setBackground(new java.awt.Color(68, 229, 226));
        btnAceptar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.setFocusable(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etqMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etqImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqMensaje;
    private javax.swing.JLabel etqTitulo;
    // End of variables declaration//GEN-END:variables
}
