/*
 López Rosales Jesús Alejandro
 22110104       3°O       CETI
 */
package metodos;

import javax.swing.JOptionPane;

public class FormNewtonR extends javax.swing.JFrame {

    public FormNewtonR() {
        initComponents();
        txtResultado.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEcuacion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtVa = new javax.swing.JTextField();
        lbDecimales = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        txtDecimales = new javax.swing.JTextField();
        lbEcuacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        lbVa = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEcuacion.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        btnLimpiar.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtVa.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        lbDecimales.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbDecimales.setText("Decimales:");

        txtError.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Método Newton-R");

        btnCalcular.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtDecimales.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        lbEcuacion.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbEcuacion.setText("Ecuación:");

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lbVa.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbVa.setText("Valor inicial:");

        lbError.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbError.setText("Error máximo:");

        lbResultado.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbResultado.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
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
                    .addComponent(lbError)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDecimales)
                    .addComponent(txtDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
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
        txtError.setText("");
        txtDecimales.setText("");
        txtResultado.setText("");
        txtEcuacion.requestFocus();
    }

    private void calcular() {
        String funcion;
        Double inicial = 0.0;
        Double error = 0.0;
        int decimales = 0;

        funcion = txtEcuacion.getText();
        funcion = funcion.replaceAll(" ", "");  //quitar espacios
        try {
            inicial = Double.parseDouble(txtVa.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico", "Valor inicial", JOptionPane.WARNING_MESSAGE);
        }

        error = Double.parseDouble(txtError.getText());

        decimales = Integer.parseInt(txtDecimales.getText());

        if (funcion.length() != 0) {

            Newton pf = new Newton();
            txtResultado.setText(pf.metodoNewton(inicial, funcion, error, decimales));
        } else {

            // System.out.print("hola");
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
            java.util.logging.Logger.getLogger(FormNewtonR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
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
    private javax.swing.JTextField txtDecimales;
    private javax.swing.JTextField txtEcuacion;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtVa;
    // End of variables declaration//GEN-END:variables
}
