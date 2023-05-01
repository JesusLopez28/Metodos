/*
 López Rosales Jesús Alejandro
 22110104       3°O       CETI
 */
package metodos;

import javax.swing.JOptionPane;

public class FormPuntoFijo extends javax.swing.JFrame {

    public FormPuntoFijo() {
        initComponents();
        txtResultado.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbEcuacion = new javax.swing.JLabel();
        lbX0 = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        txtEcuacion = new javax.swing.JTextField();
        txtX0 = new javax.swing.JTextField();
        txtError = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbDecimales = new javax.swing.JLabel();
        txtDecimales = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Método de punto fijo");

        lbEcuacion.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbEcuacion.setText("Ecuación:");

        lbX0.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbX0.setText("Valor inicial (x0):");

        lbError.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbError.setText("Error máximo:");

        lbResultado.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbResultado.setText("Resultado:");

        txtEcuacion.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        txtX0.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        txtError.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        btnCalcular.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lbDecimales.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lbDecimales.setText("Decimales:");

        txtDecimales.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEcuacion)
                            .addComponent(lbX0)
                            .addComponent(lbError)
                            .addComponent(lbDecimales)
                            .addComponent(lbResultado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDecimales, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtError, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtX0, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEcuacion))))
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
                    .addComponent(lbX0)
                    .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCalcular))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        this.calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void limpiar() {
        // Limpiar los campos de texto
        txtEcuacion.setText("");
        txtX0.setText("");
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
        funcion = funcion.replaceAll(" ", "");
        try {
            inicial = Double.parseDouble(txtX0.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico", "Valor inicial", JOptionPane.WARNING_MESSAGE);
        }
        error = Double.parseDouble(txtError.getText());

        decimales = Integer.parseInt(txtDecimales.getText());

        if (funcion.length() != 0) {
            PuntoFijo pf = new PuntoFijo();
            txtResultado.setText(pf.puntofijo(funcion, inicial, error, decimales));
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
            java.util.logging.Logger.getLogger(FormPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDecimales;
    private javax.swing.JLabel lbEcuacion;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbX0;
    private javax.swing.JTextField txtDecimales;
    private javax.swing.JTextField txtEcuacion;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtX0;
    // End of variables declaration//GEN-END:variables
}
