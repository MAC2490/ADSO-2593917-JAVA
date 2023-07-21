package ModuloUsuarios;

import Clases.Persona;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class EliminarUsuarios extends javax.swing.JFrame {
    Menu ventanaMenu;
    public EliminarUsuarios(Menu ventanaMenu) {
        this.ventanaMenu=ventanaMenu;
        initComponents();
        initAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        contentSearch = new javax.swing.JPanel();
        etq_cedulaBuscar = new javax.swing.JLabel();
        campo_cedulaBuscar = new javax.swing.JTextField();
        btn_buscarCedula = new javax.swing.JButton();
        contentPrincipal = new javax.swing.JPanel();
        etq_usuarioEncontrado = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_apellido = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_apellido = new javax.swing.JTextField();
        etq_telefono = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        campo_direccion = new javax.swing.JTextField();
        etq_email = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        contentTitle.setBackground(new java.awt.Color(204, 204, 204));

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Eliminar Usuario");

        javax.swing.GroupLayout contentTitleLayout = new javax.swing.GroupLayout(contentTitle);
        contentTitle.setLayout(contentTitleLayout);
        contentTitleLayout.setHorizontalGroup(
            contentTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentTitleLayout.setVerticalGroup(
            contentTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentTitleLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(title)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        contentSearch.setBackground(new java.awt.Color(204, 204, 204));

        etq_cedulaBuscar.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedulaBuscar.setText("CEDULA:");

        campo_cedulaBuscar.setBackground(new java.awt.Color(255, 255, 255));
        campo_cedulaBuscar.setBorder(null);

        btn_buscarCedula.setText("Buscar");
        btn_buscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarCedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentSearchLayout = new javax.swing.GroupLayout(contentSearch);
        contentSearch.setLayout(contentSearchLayout);
        contentSearchLayout.setHorizontalGroup(
            contentSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_cedulaBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscarCedula)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        contentSearchLayout.setVerticalGroup(
            contentSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentSearchLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contentSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_cedulaBuscar)
                    .addComponent(campo_cedulaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarCedula))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        contentPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        etq_usuarioEncontrado.setForeground(new java.awt.Color(0, 0, 0));
        etq_usuarioEncontrado.setText("USUARIO ENCONTRADO:");

        etq_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombre.setText("Nombres:");

        etq_apellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_apellido.setForeground(new java.awt.Color(0, 0, 0));
        etq_apellido.setText("Apellidos:");

        campo_nombre.setBackground(new java.awt.Color(255, 255, 255));
        campo_nombre.setBorder(null);

        campo_apellido.setBackground(new java.awt.Color(255, 255, 255));
        campo_apellido.setBorder(null);

        etq_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(0, 0, 0));
        etq_telefono.setText("Telefono:");

        campo_telefono.setBackground(new java.awt.Color(255, 255, 255));
        campo_telefono.setBorder(null);

        etq_direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(0, 0, 0));
        etq_direccion.setText("Direccion:");

        campo_direccion.setBackground(new java.awt.Color(255, 255, 255));
        campo_direccion.setBorder(null);

        etq_email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_email.setForeground(new java.awt.Color(0, 0, 0));
        etq_email.setText("Email:");

        campo_email.setBackground(new java.awt.Color(255, 255, 255));
        campo_email.setBorder(null);

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(etq_usuarioEncontrado))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etq_telefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etq_nombre)
                                            .addComponent(etq_apellido))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campo_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                            .addComponent(campo_nombre)))))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etq_email)
                                    .addComponent(etq_direccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_direccion)
                                    .addComponent(campo_email))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_usuarioEncontrado)
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_nombre)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(campo_nombre)
                        .addGap(2, 2, 2)))
                .addGap(31, 31, 31)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellido)
                    .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_email)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_buscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarCedulaActionPerformed
        String cedula = campo_cedulaBuscar.getText();
        Persona temporal = (this.ventanaMenu.tipoLista.equalsIgnoreCase("CLIENTE")? this.ventanaMenu.database.buscarCliente(cedula): this.ventanaMenu.database.buscarVendedor(cedula));
        if(temporal!=null){
            campo_nombre.setText(temporal.getNombres());
            campo_apellido.setText(temporal.getApellidos());
            campo_telefono.setText(temporal.getTelefono());
            campo_direccion.setText(temporal.getDireccion());
            campo_email.setText(temporal.getEmail());
            btn_eliminar.setEnabled(true);
            
        }else{
            Alert alerta = new Alert("NO EXISTE", "LA CEDULA NO ESTA REGISTRADA", "ERROR");
            campo_nombre.setText("");
            campo_apellido.setText("");
            campo_telefono.setText("");
            campo_direccion.setText("");
            campo_email.setText("");
            deshabilitarCampo(campo_nombre);
            deshabilitarCampo(campo_apellido);
            deshabilitarCampo(campo_telefono);
            deshabilitarCampo(campo_direccion);
            deshabilitarCampo(campo_email);
            campo_cedulaBuscar.requestFocus();
            btn_eliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btn_buscarCedulaActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        String cedula = campo_cedulaBuscar.getText();
        if(this.ventanaMenu.tipoLista.equalsIgnoreCase("CLIENTE")){
           this.ventanaMenu.database.eliminarCliente(cedula);
           
        }else{
            this.ventanaMenu.database.eliminarVendedor(cedula);
        }
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_eliminarActionPerformed
    private void eventoKeyCampos(java.awt.event.KeyEvent evt) {                                 
        JTextField campo = (JTextField) evt.getSource();
        validarInput(campo);
    }                                

    private void eventoKeyCedula(java.awt.event.KeyEvent evt) {                                 
        String cedula = campo_cedulaBuscar.getText();
        campo_nombre.setText("");
        campo_apellido.setText("");
        campo_telefono.setText("");
        campo_direccion.setText("");
        campo_email.setText("");
        deshabilitarCampo(campo_nombre);
        deshabilitarCampo(campo_apellido);
        deshabilitarCampo(campo_telefono);
        deshabilitarCampo(campo_direccion);
        deshabilitarCampo(campo_email);
        campo_cedulaBuscar.requestFocus();
        btn_eliminar.setEnabled(false);
    }                                

    public void deshabilitarCampo(JTextField campo){
        JTextField referencia = new JTextField();
        campo.setBorder( referencia.getBorder() );
        campo.setEnabled(false);
        campo.setBackground(Color.GRAY );
    }
    
    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE );
    }
    public void validarTodosInputs(){
        validarInput(campo_email);
        validarInput(campo_direccion);
        validarInput(campo_telefono);
        validarInput(campo_apellido);
        validarInput(campo_nombre);
    }
    
    public void validarInput(JTextField campo){
        if (campo.getText().equals("")) {
            Border borderColor = new LineBorder(Color.RED, 1, true);
            Border borderPadding = new EmptyBorder(2,5,2,5);
            Border borderRojo = new CompoundBorder(borderColor, borderPadding);
            campo.setBorder(borderRojo);
            campo.requestFocus();
        }else{
            JTextField referencia = new JTextField();
            campo.setBorder( referencia.getBorder() );
        }
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")));
        btn_eliminar.setEnabled(false);
        campo_nombre.setEnabled(false);
        campo_apellido.setEnabled(false);
        campo_telefono.setEnabled(false);
        campo_direccion.setEnabled(false);
        campo_email.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarCedula;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cedulaBuscar;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JPanel contentSearch;
    private javax.swing.JPanel contentTitle;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_cedulaBuscar;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_email;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JLabel etq_usuarioEncontrado;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
