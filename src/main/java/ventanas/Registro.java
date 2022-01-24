
package ventanas;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author gasler
 */

public class Registro extends javax.swing.JPanel {

    public Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbRegistro = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        campoBusqueda = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(119, 118, 124));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbRegistro.setFont(new java.awt.Font("URW Bookman", 2, 14)); // NOI18N
        tbRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, "", null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "N° Factura", "Cliente", "Total productos", "Total Canselado"
            }
        ));
        tbRegistro.setGridColor(new java.awt.Color(255, 255, 255));
        tbRegistro.setSelectionBackground(new java.awt.Color(22, 25, 52));
        tbRegistro.setSelectionForeground(new java.awt.Color(255, 206, 43));
        jScrollPane2.setViewportView(tbRegistro);
        if (tbRegistro.getColumnModel().getColumnCount() > 0) {
            tbRegistro.getColumnModel().getColumn(0).setMinWidth(100);
            tbRegistro.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbRegistro.getColumnModel().getColumn(0).setMaxWidth(100);
            tbRegistro.getColumnModel().getColumn(1).setMinWidth(120);
            tbRegistro.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbRegistro.getColumnModel().getColumn(1).setMaxWidth(120);
            tbRegistro.getColumnModel().getColumn(2).setMinWidth(150);
            tbRegistro.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbRegistro.getColumnModel().getColumn(2).setMaxWidth(150);
            tbRegistro.getColumnModel().getColumn(3).setMinWidth(120);
            tbRegistro.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbRegistro.getColumnModel().getColumn(3).setMaxWidth(120);
            tbRegistro.getColumnModel().getColumn(4).setMinWidth(150);
            tbRegistro.getColumnModel().getColumn(4).setPreferredWidth(150);
            tbRegistro.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 690, 440));

        btnBuscar.setBackground(new java.awt.Color(255, 206, 43));
        btnBuscar.setFont(new java.awt.Font("URW Bookman", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(22, 25, 52));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, 30));

        campoBusqueda.setFont(new java.awt.Font("URW Bookman", 2, 12)); // NOI18N
        campoBusqueda.setForeground(new java.awt.Color(22, 25, 52));
        campoBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 206, 43)));
        campoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBusquedaActionPerformed(evt);
            }
        });
        add(campoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 270, 30));

        jPanel1.setBackground(new java.awt.Color(22, 25, 52));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("TSCu_Times", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 206, 43));
        jLabel1.setText("REGISTRO FACTURAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 290, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 50));

        jPanel2.setBackground(new java.awt.Color(255, 206, 43));
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 810, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void campoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBusquedaActionPerformed


    public JPanel ver(){
    
        /*tbRegistro.setBackground(new Color(22,25,52));
        tbRegistro.setForeground(new Color(255,206,43));
        tbRegistro.setGridColor(Color.WHITE);
        */
    return this;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbRegistro;
    // End of variables declaration//GEN-END:variables
}
