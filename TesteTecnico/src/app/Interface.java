package app;

import javax.swing.JOptionPane;

/**
 *
 * @author davym
 */
public class Interface extends javax.swing.JFrame {
    String bebida, copo, gelo, tipo, tamanho, resultado;

    public Interface() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLresultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRBcoca = new javax.swing.JRadioButton();
        jRBguarana = new javax.swing.JRadioButton();
        jRBuva = new javax.swing.JRadioButton();
        jRBlaranja = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRBp = new javax.swing.JRadioButton();
        jRBm = new javax.swing.JRadioButton();
        jRBg = new javax.swing.JRadioButton();
        jRBs = new javax.swing.JRadioButton();
        jRBn = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRBd = new javax.swing.JRadioButton();
        jRBc = new javax.swing.JRadioButton();
        jBok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faça seu pedido de bebidas", 0, 0, new java.awt.Font("Verdana", 0, 18), new java.awt.Color(204, 0, 0))); // NOI18N

        jLresultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do pedido", 0, 0, new java.awt.Font("Verdana", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Bem vindo!");

        buttonGroup1.add(jRBcoca);
        jRBcoca.setText("COCA-COLA");

        buttonGroup1.add(jRBguarana);
        jRBguarana.setText("GUARANÁ");

        buttonGroup1.add(jRBuva);
        jRBuva.setText("SUCO DE UVA");
        jRBuva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBuvaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBlaranja);
        jRBlaranja.setText("SUCO DE LARANJA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Bebidas:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tamanho:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Gelo:");

        buttonGroup2.add(jRBp);
        jRBp.setText("PEQUENO(300ml)");
        jRBp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBpActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRBm);
        jRBm.setText("MEDIO(500ml)");

        buttonGroup2.add(jRBg);
        jRBg.setText("GRANDE(700ml)");
        jRBg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBgActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRBs);
        jRBs.setText("SIM");

        buttonGroup3.add(jRBn);
        jRBn.setText("NÃO");
        jRBn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Consumo:");

        buttonGroup4.add(jRBd);
        jRBd.setText("DELIVERY");

        buttonGroup4.add(jRBc);
        jRBc.setText("COMER NO RESTAURANTE");

        jBok.setText("CONFIRMAR");
        jBok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBokActionPerformed(evt);
            }
        });

        jButton1.setText("LIMPAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLresultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRBg)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRBcoca)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBguarana))
                                    .addComponent(jRBp)
                                    .addComponent(jRBm))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jRBs)
                                            .addComponent(jRBn))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRBd)
                                            .addComponent(jRBc)
                                            .addComponent(jLabel5)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRBuva)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRBlaranja)))
                                        .addGap(0, 64, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jBok, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBcoca)
                    .addComponent(jRBguarana)
                    .addComponent(jRBuva)
                    .addComponent(jRBlaranja))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBp)
                    .addComponent(jRBs)
                    .addComponent(jRBd))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBg))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBn)
                            .addComponent(jRBc))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBok)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLresultado, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBuvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBuvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBuvaActionPerformed

    private void jRBpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBpActionPerformed

    private void jRBgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBgActionPerformed

    private void jRBnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBnActionPerformed

    private void jBokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBokActionPerformed
        jLresultado.setText(String.valueOf(jLresultado));
        if(jRBcoca.isSelected(  )){
            bebida = "COCA-COLA";
            copo = "Copo de papel";
            if(jRBp.isSelected()){
                tamanho = "PEQUENO(300ML)";
            }
            else if(jRBm.isSelected()){
                tamanho = "MÉDIO(500ML)";
            }
            else if(jRBg.isSelected()){
                tamanho = "GRANDE(700ML)";
            }
        }
        else if(jRBguarana.isSelected()){
            bebida = "GUARANÁ";
            copo = "Copo de papel";
            if(jRBp.isSelected()){
                tamanho = "PEQUENO(300ML)";
            }
            else if(jRBm.isSelected()){
                tamanho = "MÉDIO(500ML)";
            }
            else if(jRBg.isSelected()){
                tamanho = "GRANDE(700ML)";
            }
        }
        else if(jRBuva.isSelected()){
            bebida = "SUCO DE UVA";
            copo = "Copo de plastico";
            if(jRBp.isSelected()){
                tamanho = "PEQUENO(300ML)";
            }
            else if(jRBm.isSelected()){
                tamanho = "GRANDE(500ML)";
            }
        }
        else if(jRBlaranja.isSelected()){
            bebida = "SUCO DE LARANJA";
            copo = "Copo de plastico";
            if(jRBp.isSelected()){
                tamanho = "PEQUENO(300ML)";
            }
            else if(jRBm.isSelected()){
                tamanho = "GRANDE(500ML)";
            }
        }
        bebida = bebida;
        copo = copo;
        tamanho = tamanho;
        if(jRBs.isSelected()){
            gelo = "com gelo";
        }
        else if(jRBn.isSelected()){
            gelo = "sem gelo";
        }
        gelo = gelo;
        if(jRBd.isSelected()){
            tipo = "Tampa Take Out - Delivery";
        }
        else if(jRBc.isSelected()){
            tipo = "Tampa Eat In - Comer no restaurante";
        }
        tipo = tipo;
        resultado = bebida + " - " + tamanho + " " +gelo + " | " + copo + " # " + tipo;
        jLresultado.setText(bebida + " - " + tamanho + " " +gelo + " | " + copo + " # " + tipo);
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_jBokActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLresultado.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jBok;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLresultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBc;
    private javax.swing.JRadioButton jRBcoca;
    private javax.swing.JRadioButton jRBd;
    private javax.swing.JRadioButton jRBg;
    private javax.swing.JRadioButton jRBguarana;
    private javax.swing.JRadioButton jRBlaranja;
    private javax.swing.JRadioButton jRBm;
    private javax.swing.JRadioButton jRBn;
    private javax.swing.JRadioButton jRBp;
    private javax.swing.JRadioButton jRBs;
    private javax.swing.JRadioButton jRBuva;
    // End of variables declaration//GEN-END:variables
}
