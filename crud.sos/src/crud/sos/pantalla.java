
package crud.sos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pantalla extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    ArrayList<atleta> Catalogo = new ArrayList<>();
    
    public pantalla() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("nombre");
        modelo.addColumn("apellidos");
        modelo.addColumn("edad");
        modelo.addColumn("deporte");
        modelo.addColumn("fecha");
        this.jTable1.setModel(modelo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jDialog1.setMinimumSize(new java.awt.Dimension(450, 600));
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO DE FICHERO NUEVO");
        jDialog1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 360, -1));

        jLabel3.setText("NOMBRE");
        jDialog1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jLabel4.setText("APELLIDOS");
        jDialog1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jLabel5.setText("EDAD");
        jDialog1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        jLabel6.setText("DEPORTE");
        jDialog1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        jLabel7.setText("FECHA");
        jDialog1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));
        jDialog1.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, 20));
        jDialog1.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 90, 20));
        jDialog1.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 90, 20));
        jDialog1.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, 20));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 90, 20));

        jLabel9.setText("FILA");
        jDialog1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, 20));

        jLabel10.setText("COLUMNA");
        jDialog1.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 20));

        jLabel11.setText("INSERTAR");
        jDialog1.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, 20));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 80, 20));
        jDialog1.getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 70, 20));
        jDialog1.getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 70, 20));

        jButton7.setText("SALIR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, -1));

        jButton3.setText("AÑADIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jButton4.setText("MODIFICAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jButton5.setText("ELIMINAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jButton6.setText("ELIMINAR TODO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 204, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VISUALIZACIÓN DE LOS FICHEROS");
        jDialog1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 330, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jDialog1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 390, 190));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 250));
        setMinimumSize(new java.awt.Dimension(450, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRUD FICHERO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 330, 40));

        jButton1.setText("TABLA FICHERO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String []info=new String[5];
        info[0]= jTextField1.getText();
        info[1]= jTextField2.getText();
        info[2]= jTextField3.getText();
        info[3]= jTextField4.getText();
        info[4]= jTextField5.getText();
        modelo.addRow(info);

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int fila=Integer.parseInt(jTextField6.getText());
        int columna=Integer.parseInt(jTextField7.getText());
        modelo.setValueAt(jTextField8.getText(), fila, columna);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int fila=jTable1.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int fila=jTable1.getRowCount();
        for(int i=fila-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
