/*
 López Rosales Jesús Alejandro
 22110104       3°O       CETI
 */
package metodos;

import javax.swing.JOptionPane;

public class FormSecante extends javax.swing.JFrame {

    public FormSecante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimpiar = new javax.swing.JButton();
        lbDecimales = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        txtDecimales = new javax.swing.JTextField();
        lbEcuacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        lbVa = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        txtEcuacion = new javax.swing.JTextField();
        txtVa = new javax.swing.JTextField();
        txtError = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lbVb = new javax.swing.JLabel();
        txtVb = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLimpiar.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbDecimales.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbDecimales.setText("Decimales:");

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Método de la Secante");

        txtDecimales.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        lbEcuacion.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbEcuacion.setText("Ecuación:");

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        lbVa.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbVa.setText("Valor A:");

        lbError.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbError.setText("Error máximo:");

        lbResultado.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbResultado.setText("Resultado:");

        txtEcuacion.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        txtVa.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        txtError.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        btnCalcular.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lbVb.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbVb.setText("Valor B:");

        txtVb.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEcuacion)
                            .addComponent(lbVa)
                            .addComponent(lbError)
                            .addComponent(lbDecimales))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDecimales, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtError, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEcuacion)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbVb)
                        .addGap(69, 69, 69)
                        .addComponent(txtVb))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbResultado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEcuacion)
                    .addComponent(txtEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVa)
                    .addComponent(txtVa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVb)
                    .addComponent(txtVb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbError)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDecimales)
                    .addComponent(txtDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCalcular)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        this.calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FormMenu principal = new FormMenu();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void limpiar() {
        // Limpiar los campos de texto
        txtEcuacion.setText("");
        txtVa.setText("");
        txtVb.setText("");
        txtError.setText("");
        txtDecimales.setText("");
        txtResultado.setText("");
        txtEcuacion.requestFocus();
    }

    private void calcular() {
        String funcion;
        Double a = 0.0;
        Double b = 0.0;
        Double error = 0.0;
        int decimales = 0;
        funcion = txtEcuacion.getText();
        funcion = funcion.replaceAll(" ", "");

        try {
            a = Double.parseDouble(txtVa.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico", "Valor inicial", JOptionPane.WARNING_MESSAGE);
        }

        try {
            b = Double.parseDouble(txtVb.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico", "Valor inicial", JOptionPane.WARNING_MESSAGE);
        }

        error = Double.parseDouble(txtError.getText());
        decimales = Integer.parseInt(txtDecimales.getText());

        if (funcion.length() != 0) {
            Secante bi = new Secante();
            txtResultado.setText(bi.metodoSecante(a, b, funcion, error, decimales));
        } else {
            JOptionPane.showMessageDialog(null, "La función no ha sido creada", "Casilla vacia ", JOptionPane.WARNING_MESSAGE);
        }
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new FormSecante().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDecimales;
    private javax.swing.JLabel lbEcuacion;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbVa;
    private javax.swing.JLabel lbVb;
    private javax.swing.JTextField txtDecimales;
    private javax.swing.JTextField txtEcuacion;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtVa;
    private javax.swing.JTextField txtVb;
    // End of variables declaration//GEN-END:variables
}
