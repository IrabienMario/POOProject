
package com.mycompany.tablabasepoo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import  javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Update extends javax.swing.JFrame {
    
    public Update() {
        initComponents();
         this.setLocationRelativeTo(null);
         this.setResizable(false);
         cargarTabla();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSerigraphy = new javax.swing.JTable();
        jButtonExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtOrder = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDone = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SerigraphyLaboratory");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSerigraphy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "NumOrder", "NumProduct", "NumDone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSerigraphy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSerigraphyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSerigraphy);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 250, 290));

        jButtonExit.setBackground(new java.awt.Color(0, 0, 51));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Order :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtOrder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderActionPerformed(evt);
            }
        });
        jPanel1.add(txtOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Product :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductActionPerformed(evt);
            }
        });
        jPanel1.add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Done :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtDone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 51));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        btnModificar.setBackground(new java.awt.Color(0, 0, 51));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 51));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 290));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Serigraphy Laboratory");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Desea cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION);
    
    if (confirmacion == JOptionPane.YES_OPTION) {
        Login Login = new Login();
        Login.setVisible(true);
        this.dispose(); // Cierra la interfaz actual
    }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void txtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderActionPerformed

    private void txtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductActionPerformed

    private void txtDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoneActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int Order = Integer.parseInt(txtOrder.getText());
        String Product = txtProduct.getText();
        int Done = Integer.parseInt(txtDone.getText());
        
        try{
            
            Connection cn = Conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement("INSERT INTO SerigraphyLaboratory ([Order], Product, Done) VALUES (?,?,?)");
            ps.setInt(1, Order);
            ps.setString(2, Product);
            ps.setInt(3, Done);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
            cargarTabla();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblSerigraphyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSerigraphyMouseClicked
        try{
            int fila = tblSerigraphy.getSelectedRow();
            if (fila >= 0){
                int Order = Integer.parseInt(tblSerigraphy.getValueAt(fila, 0).toString());
                Connection cn = Conexion.getConexion();
                PreparedStatement ps;
                ps = cn.prepareStatement("SELECT [Order], Product, Done FROM SerigraphyLaboratory WHERE [Order]=?");
                ps.setInt(1, Order);
                ResultSet rs;
                rs = ps.executeQuery();
            
            while(rs.next()){
                txtOrder.setText(String.valueOf(Order));
                txtProduct.setText(rs.getString("Product"));
                txtDone.setText(rs.getString("Done"));
            }
          }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
            
        }
    }//GEN-LAST:event_tblSerigraphyMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        int Order = Integer.parseInt(txtOrder.getText());
        String Product = txtProduct.getText();
        int Done = Integer.parseInt(txtDone.getText());
        
        try{
            
            Connection cn = Conexion.getConexion();
            PreparedStatement ps = cn.prepareStatement("UPDATE SerigraphyLaboratory SET [Order]=?, Product=?, Done=? WHERE [Order]=?");
            ps.setInt(1, Order);
            ps.setString(2, Product);
            ps.setInt(3, Done);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar();
            cargarTabla();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_btnModificarActionPerformed
    private void limpiar(){
        txtOrder.setText("");
        txtProduct.setText("");
        txtDone.setText("");
    }
    
    private void cargarTabla(){
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tblSerigraphy.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            
            Connection cn = Conexion.getConexion();
            ps = cn.prepareStatement("SELECT [Order], Product, Done FROM SerigraphyLaboratory");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int indice=0; indice<columnas; indice++){
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        
    }
    public static void main(String args[]) {
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSerigraphy;
    private javax.swing.JTextField txtDone;
    private javax.swing.JTextField txtOrder;
    private javax.swing.JTextField txtProduct;
    // End of variables declaration//GEN-END:variables
}
