
package UI;

import DB.conexion;
import Controler.SerigraphyLaboratoryDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import Model.orders;

public class TablaSerigraphy extends javax.swing.JFrame {

    private DefaultTableModel tablaModel;

    public TablaSerigraphy() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        tablaModel = (DefaultTableModel) tblSerigraphy.getModel();
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
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
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

        btnModificar.setBackground(new java.awt.Color(0, 0, 51));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Update");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 80, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Delete");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 80, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 51));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Clean");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, -1));

        jLabelTitulo.setBackground(new java.awt.Color(0, 0, 51));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 51));
        jLabelTitulo.setText("Serigraphy Laboratory");
        jPanel1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 290));

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
        
    }//GEN-LAST:event_txtOrderActionPerformed

    private void txtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductActionPerformed
        
    }//GEN-LAST:event_txtProductActionPerformed

    private void txtDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoneActionPerformed

    }//GEN-LAST:event_txtDoneActionPerformed

    private void tblSerigraphyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSerigraphyMouseClicked
        int fila = tblSerigraphy.getSelectedRow();
        if (fila >= 0) {
        txtOrder.setText(tblSerigraphy.getValueAt(fila, 0).toString());
        txtProduct.setText(tblSerigraphy.getValueAt(fila, 1).toString());
        txtDone.setText(tblSerigraphy.getValueAt(fila, 2).toString());
        }
    }//GEN-LAST:event_tblSerigraphyMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    
    int Order = Integer.parseInt(txtOrder.getText());
    String Product = txtProduct.getText();
    int Done = Integer.parseInt(txtDone.getText());

    // Obtener la fila seleccionada
    int filaSeleccionada = tblSerigraphy.getSelectedRow();

    // Verificar si ya existe una fila con el mismo número de orden (excepto la fila seleccionada)
    SerigraphyLaboratoryDAO dao = new SerigraphyLaboratoryDAO();
    if (!dao.existeOrdenExcepto(Order, filaSeleccionada)) {
        // Si no existe, realizar la modificación en la base de datos y en la tabla
        Object[] datos = {Order, Product, Done};
        DefaultTableModel modelo = (DefaultTableModel) tblSerigraphy.getModel();
        modelo.setValueAt(Order, filaSeleccionada, 0);
        modelo.setValueAt(Product, filaSeleccionada, 1);
        modelo.setValueAt(Done, filaSeleccionada, 2);

        dao.update(Order, Product, Done);

        JOptionPane.showMessageDialog(null, "Registro Modificado");
        limpiarTablaEnDAO();
    } else {
        JOptionPane.showMessageDialog(null, "Ya existe una fila con el mismo número de orden.");
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tblSerigraphy.getSelectedRow();

    if (filaSeleccionada >= 0) {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar la fila?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Eliminar la fila directamente del DefaultTableModel
            tablaModel.removeRow(filaSeleccionada);
            // Puedes agregar aquí la lógica para eliminar la fila de la base de datos si es necesario

            // Actualizar la tabla después de eliminar
            cargarTabla();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtOrder.setText("");
        txtProduct.setText("");
        txtDone.setText("");
        tblSerigraphy.clearSelection();
        limpiarTablaEnDAO();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    private void limpiarTablaEnDao(){
        SerigraphyLaboratoryDAO dao = new SerigraphyLaboratoryDAO();
        dao.limpiarTabla();
    }
    
    private void cargarTabla(){
         // Limpia la tabla antes de cargar nuevos datos
        limpiarTablaEnDAO();

        // Obtén la lista de órdenes desde el DAO
        SerigraphyLaboratoryDAO dao = new SerigraphyLaboratoryDAO();
        List<orders> lista = dao.Listarorders();

        // Llena la tabla con los datos de la lista
        DefaultTableModel modelo = (DefaultTableModel) tblSerigraphy.getModel();
        for (orders order : lista) {
            Object[] datos = {order.getOrders(), order.getProduct(), order.getDone()};
            modelo.addRow(datos);
        }
    }

    private void limpiarTablaEnDAO() {
     
    }

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new TablaSerigraphy().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSerigraphy;
    private javax.swing.JTextField txtDone;
    private javax.swing.JTextField txtOrder;
    private javax.swing.JTextField txtProduct;
    // End of variables declaration//GEN-END:variables
}
