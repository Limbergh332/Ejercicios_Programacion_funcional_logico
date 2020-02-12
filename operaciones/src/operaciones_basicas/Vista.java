package operaciones_basicas;

import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {
    
    operaciones operar = new  operaciones();
    
    double numero1,numero2;
    
    public void datos(){
        
        try{
        
        numero1 = Double.parseDouble(txtnumero1.getText());
        numero2 = Double.parseDouble(txtnumero2.getText());
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Complete los datos Correctamente");
        }
    }
    public void inicio(){
        txtnumero1.requestFocus();
        txtnumero1.selectAll();
    }
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnumero1 = new javax.swing.JTextField();
        txtnumero2 = new javax.swing.JTextField();
        btnsuma = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnmultiplicacion = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        caja = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Operaciones Básicas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel2.setText("Numero 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setText("Numero 2:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtnumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 230, -1));

        txtnumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 230, -1));

        btnsuma.setText("+");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        btnresta.setText("-");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        btnmultiplicacion.setText("*");
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnmultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        btndivision.setText("/");
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });
        getContentPane().add(btndivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("RESULTADO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 30));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));
        getContentPane().add(caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        labelResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelResultado.setText("0");
        getContentPane().add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 220, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumero1ActionPerformed

    private void txtnumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumero2ActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        inicio();
        datos();
        operar.suma(numero1, numero2);
        labelResultado.setText(String.valueOf(operar.resultado));
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        inicio();
        datos();
        operar.resta(numero1, numero2);
        labelResultado.setText(String.valueOf(operar.resultado));
        
        
        
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacionActionPerformed
        inicio();
        datos();
        operar.multiplicacion(numero1, numero2);
        labelResultado.setText(String.valueOf(operar.resultado));
    }//GEN-LAST:event_btnmultiplicacionActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
        inicio();
        datos();
        operar.division(numero1, numero2);
        labelResultado.setText(String.valueOf(operar.resultado));
    }//GEN-LAST:event_btndivisionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btnmultiplicacion;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JLabel caja;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JTextField txtnumero1;
    private javax.swing.JTextField txtnumero2;
    // End of variables declaration//GEN-END:variables
}
