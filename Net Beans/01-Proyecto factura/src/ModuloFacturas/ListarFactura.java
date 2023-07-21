
package ModuloFacturas;

import Clases.Factura;
import Clases.ItemFactura;
import Clases.Persona;
import Clases.Producto;
import Principal.Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;
public class ListarFactura extends javax.swing.JFrame {

    Menu ventanaMenu;
    Detalles ventana;
    ItemFactura items;
    private JLabel etqTemporal;
    private JButton btndetalles;
    int i;
    
    public ListarFactura(Menu ventanaMenu) {
        this.ventanaMenu=ventanaMenu;
        this.i=0;
        initComponents();
        initAlternComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTitle = new javax.swing.JPanel();
        etq_title = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        tx_lista = new javax.swing.JScrollPane();
        contentLista = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentTitle.setBackground(new java.awt.Color(51, 51, 255));

        etq_title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etq_title.setForeground(new java.awt.Color(255, 255, 255));
        etq_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_title.setText("Listar Facturas");

        javax.swing.GroupLayout contentTitleLayout = new javax.swing.GroupLayout(contentTitle);
        contentTitle.setLayout(contentTitleLayout);
        contentTitleLayout.setHorizontalGroup(
            contentTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentTitleLayout.setVerticalGroup(
            contentTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentTitleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(etq_title)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        contentPrincipal.setBackground(new java.awt.Color(51, 51, 255));

        tx_lista.setBackground(new java.awt.Color(255, 255, 255));
        tx_lista.setForeground(new java.awt.Color(255, 255, 255));

        contentLista.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentListaLayout = new javax.swing.GroupLayout(contentLista);
        contentLista.setLayout(contentListaLayout);
        contentListaLayout.setHorizontalGroup(
            contentListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        contentListaLayout.setVerticalGroup(
            contentListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        tx_lista.setViewportView(contentLista);

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tx_lista)
                .addContainerGap())
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tx_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
   
    public void imprimirFacturas(){
        Factura listaFacturas[] = this.ventanaMenu.database.listaFacturas();
        ItemFactura listaItems[] = this.ventanaMenu.database.listaItems();
        if (listaFacturas != null) {
            for (int i = 0; i < listaFacturas.length; i++) {
                if (listaFacturas[i] != null) {
                    etqTemporal = new JLabel(listaFacturas[i].getId()+" - "+listaFacturas[i].getCedula_cliente()+" -- "+listaFacturas[i].getCedula_vendedor()+" -- "+listaFacturas[i].getFecha()+" -- "+listaFacturas[i].getTotal());
                    etqTemporal.setFont(new Font("Arial", Font.PLAIN, 12));
                    etqTemporal.setBorder(new EmptyBorder(2,10,2,10));
                    contentLista.add(etqTemporal);
                    
                    final Factura temporal = listaFacturas[i];
                    final ItemFactura itemsTemp = listaItems[i];
                    btndetalles = new JButton ("Detalles");
                    btndetalles.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            abrirDetalle(temporal, itemsTemp);
                        }
                    });
                    contentLista.add(btndetalles);
                }else{
                    break;
                }
                
            }
            revalidate();
        }
    }
    
    
    public void abrirDetalle(Factura temporal, ItemFactura itemsTemp){
        this.ventana=new Detalles(this.ventanaMenu, temporal,itemsTemp);
        this.ventana.setVisible(true);
    }
    
    
    
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_almacenes.png") ) );
        contentLista.setLayout( new BoxLayout(contentLista, BoxLayout.Y_AXIS) );
        contentLista.setBackground(Color.WHITE);
        imprimirFacturas();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel contentLista;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JPanel contentTitle;
    private javax.swing.JLabel etq_title;
    private javax.swing.JScrollPane tx_lista;
    // End of variables declaration//GEN-END:variables
}
