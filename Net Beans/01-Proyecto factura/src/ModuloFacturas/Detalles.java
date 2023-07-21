
package ModuloFacturas;

import Clases.Factura;
import Clases.ItemFactura;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import java.util.HashSet;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class Detalles extends javax.swing.JFrame {

    Menu ventanaMenu;
    Factura factura;
    ListarFactura ventana;
    ItemFactura items;
    private JLabel etq_temporal;
    
    public Detalles(Menu ventanaMenu, Factura factura, ItemFactura items) {
        this.ventanaMenu=ventanaMenu;
        this.factura=factura;
        this.items=items;
        
        
        
        initComponents();
        initAlternComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_datosCliente = new javax.swing.JLabel();
        etq_cedulaCliente = new javax.swing.JLabel();
        input_cedulaCliente = new javax.swing.JTextField();
        etq_datosVendedor = new javax.swing.JLabel();
        etq_cedulaVendedor = new javax.swing.JLabel();
        input_cedulaVendedor = new javax.swing.JTextField();
        etq_listaProductos = new javax.swing.JLabel();
        tx_lista = new javax.swing.JScrollPane();
        contentLista = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        etq_total = new javax.swing.JLabel();
        input_total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        etq_datosCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_datosCliente.setForeground(new java.awt.Color(0, 0, 0));
        etq_datosCliente.setText("DATOS CLIENTE:");

        etq_cedulaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_cedulaCliente.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedulaCliente.setText("Cedula:");

        input_cedulaCliente.setEditable(false);
        input_cedulaCliente.setBackground(new java.awt.Color(204, 204, 204));
        input_cedulaCliente.setBorder(null);

        etq_datosVendedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_datosVendedor.setForeground(new java.awt.Color(0, 0, 0));
        etq_datosVendedor.setText("DATOS VENDEDOR:");

        etq_cedulaVendedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_cedulaVendedor.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedulaVendedor.setText("Cedula:");

        input_cedulaVendedor.setEditable(false);
        input_cedulaVendedor.setBackground(new java.awt.Color(204, 204, 204));
        input_cedulaVendedor.setBorder(null);

        etq_listaProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_listaProductos.setForeground(new java.awt.Color(0, 0, 0));
        etq_listaProductos.setText("LISTA PRODUCTOS FACTURADOS:");

        contentLista.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentListaLayout = new javax.swing.GroupLayout(contentLista);
        contentLista.setLayout(contentListaLayout);
        contentListaLayout.setHorizontalGroup(
            contentListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );
        contentListaLayout.setVerticalGroup(
            contentListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        tx_lista.setViewportView(contentLista);

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        etq_total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etq_total.setForeground(new java.awt.Color(0, 0, 0));
        etq_total.setText("TOTAL:");

        input_total.setEditable(false);
        input_total.setBackground(new java.awt.Color(204, 204, 204));
        input_total.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etq_total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_total, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_datosVendedor)
                                    .addComponent(etq_datosCliente)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(etq_cedulaCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(input_cedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(etq_listaProductos))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(etq_cedulaVendedor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(input_cedulaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tx_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_datosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_cedulaCliente)
                    .addComponent(input_cedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(etq_datosVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etq_cedulaVendedor)
                    .addComponent(input_cedulaVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addComponent(etq_listaProductos)
                .addGap(18, 18, 18)
                .addComponent(tx_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etq_total)
                        .addComponent(input_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        
        contentLista.setLayout( new BoxLayout(contentLista, BoxLayout.Y_AXIS) );
        contentLista.setBackground(Color.WHITE);
        cedulaCliente();
        itemsFactura();
    }
    
    public void cedulaCliente(){
        Factura temporal = this.factura;
        String cedulaCliente = String.valueOf(temporal.getCedula_cliente());
        input_cedulaCliente.setText(cedulaCliente);
        
        String cedulaVendedor = String.valueOf(temporal.getCedula_vendedor());
        input_cedulaVendedor.setText(cedulaVendedor);
        
        String total = String.valueOf(temporal.getTotal());
        input_total.setText(total);
    }
    public void itemsFactura(){
        Factura temporal = this.factura;
        ItemFactura listaFactura[] = this.ventanaMenu.database.listaItems();
        if (listaFactura != null) {
            for (int i = 0; i < listaFactura.length; i++) {
                if (listaFactura[i] != null) {
                    if(listaFactura[i].getId_factura()==temporal.getId()){
                        etq_temporal = new JLabel(" - "+listaFactura[i].getId_producto()+" - "+listaFactura[i].getNombre()+" - "+listaFactura[i].getCantidad()+" - "+listaFactura[i].getSubtotal());
                        etq_temporal.setFont(new Font("Arial", Font.PLAIN, 12));
                        etq_temporal.setBorder(new EmptyBorder(2,10,2,10));
                        contentLista.add(etq_temporal);
                        System.out.println(" - "+listaFactura[i].getId_producto()+" - "+listaFactura[i].getNombre()+" - "+listaFactura[i].getCantidad()+" - "+listaFactura[i].getSubtotal());
                    }
                    
                }else{
                    break;
                }
            }
            revalidate();
        }
        /*ItemFactura temporal1 = this.items;
        etq_temporal = new JLabel(" - "+temporal1.getId_producto()+" - "+temporal1.getNombre()+" - "+temporal1.getCantidad()+" - "+temporal1.getSubtotal());
        contentLista.add(etq_temporal);¨*/
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JPanel contentLista;
    private javax.swing.JLabel etq_cedulaCliente;
    private javax.swing.JLabel etq_cedulaVendedor;
    private javax.swing.JLabel etq_datosCliente;
    private javax.swing.JLabel etq_datosVendedor;
    private javax.swing.JLabel etq_listaProductos;
    private javax.swing.JLabel etq_total;
    private javax.swing.JTextField input_cedulaCliente;
    private javax.swing.JTextField input_cedulaVendedor;
    private javax.swing.JTextField input_total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane tx_lista;
    // End of variables declaration//GEN-END:variables
}
