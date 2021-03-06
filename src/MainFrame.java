/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Entrar
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        Deslizador.setValue(0);
        BarraProgreso.setValue(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Autor = new javax.swing.JLabel();
        Deslizador = new javax.swing.JSlider();
        BarraProgreso = new javax.swing.JProgressBar();
        EstadoPosicion = new javax.swing.JTextField();
        EstadoTecla = new javax.swing.JTextField();
        Valor = new javax.swing.JTextField();
        InfoValor = new javax.swing.JLabel();
        InfoEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monitor Eventos");

        Autor.setText("Hecho por Ángeles Fuentes Expósito para DIU");

        Deslizador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DeslizadorStateChanged(evt);
            }
        });
        Deslizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeslizadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeslizadorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeslizadorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DeslizadorMouseReleased(evt);
            }
        });

        EstadoPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoPosicionActionPerformed(evt);
            }
        });

        Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorActionPerformed(evt);
            }
        });

        InfoValor.setText("Valor del Deslizador");

        InfoEstado.setText("Estado del Ratón");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Autor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Deslizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BarraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InfoValor)
                            .addComponent(InfoEstado)
                            .addComponent(Valor)
                            .addComponent(EstadoTecla)
                            .addComponent(EstadoPosicion))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Deslizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(InfoEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EstadoPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstadoTecla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(InfoValor)
                .addGap(2, 2, 2)
                .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(Autor)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorActionPerformed

    private void EstadoPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoPosicionActionPerformed

    private void DeslizadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizadorMouseEntered
        // TODO add your handling code here:
        EstadoPosicion.setText("Dentro");
    }//GEN-LAST:event_DeslizadorMouseEntered

    private void DeslizadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizadorMouseExited
        // TODO add your handling code here:
        EstadoPosicion.setText("Fuera");

    }//GEN-LAST:event_DeslizadorMouseExited

    private void DeslizadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizadorMousePressed
        // TODO add your handling code here:
        EstadoTecla.setText("Presionado");

    }//GEN-LAST:event_DeslizadorMousePressed

    private void DeslizadorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizadorMouseReleased
        // TODO add your handling code here:
        EstadoTecla.setText("Liberado");

    }//GEN-LAST:event_DeslizadorMouseReleased

    private void DeslizadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DeslizadorStateChanged
        // TODO add your handling code here:
        int valor = Deslizador.getValue();
        BarraProgreso.setValue(valor);
        Valor.setText(String.valueOf(valor));
        
    }//GEN-LAST:event_DeslizadorStateChanged

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JProgressBar BarraProgreso;
    private javax.swing.JSlider Deslizador;
    private javax.swing.JTextField EstadoPosicion;
    private javax.swing.JTextField EstadoTecla;
    private javax.swing.JLabel InfoEstado;
    private javax.swing.JLabel InfoValor;
    private javax.swing.JTextField Valor;
    // End of variables declaration//GEN-END:variables
}
