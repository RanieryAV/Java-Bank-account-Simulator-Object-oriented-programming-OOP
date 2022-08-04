/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author ranie
 */
public class TelaDeposito extends javax.swing.JFrame {

    Contas acc1;
    ContaPoupanca acc2; 
    ContaEspecial acc3;
    
    /**
     * Creates new form TelaDeposito
     * @param acc1
     * @param acc2
     * @param acc3
     */
    public TelaDeposito(Contas acc1, ContaPoupanca acc2, ContaEspecial acc3) {
        this.acc1 = acc1;
        this.acc2 = acc2;
        this.acc3 = acc3;
        initComponents();
    }

    private TelaDeposito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldNumeroContaTelaDeposito = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldValorDepositoTelaDeposito = new javax.swing.JTextField();
        btnContinuarTelaDeposito = new javax.swing.JButton();
        btnVoltarTelaDeposito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Operação: Depósito");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Número da conta:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Valor de depósito:");

        btnContinuarTelaDeposito.setText("Continuar");
        btnContinuarTelaDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarTelaDepositoActionPerformed(evt);
            }
        });

        btnVoltarTelaDeposito.setText("Voltar");
        btnVoltarTelaDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTelaDepositoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNumeroContaTelaDeposito))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldValorDepositoTelaDeposito)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnContinuarTelaDeposito)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarTelaDeposito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNumeroContaTelaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldValorDepositoTelaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuarTelaDeposito)
                    .addComponent(btnVoltarTelaDeposito))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarTelaDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTelaDepositoActionPerformed
        // TODO add your handling code here:
        FaseDeOperacoes inicio = new FaseDeOperacoes(this.acc1, this.acc2, this.acc3);
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarTelaDepositoActionPerformed

    private void btnContinuarTelaDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarTelaDepositoActionPerformed
        // TODO add your handling code here:
        FaseDeOperacoes inicio = new FaseDeOperacoes(this.acc1, this.acc2, this.acc3);
        
        //int que verifica a escolha do usuário
        int verificador;
        
        //verificar se o número digitado é o da conta 1
        if(Integer.parseInt(textFieldNumeroContaTelaDeposito.getText()) == acc1.getNumero())
            {
                verificador = JOptionPane.showConfirmDialog(null, acc1.getNome()+", você deseja confirmar esta operação?", "Operação: Depósito", JOptionPane.OK_CANCEL_OPTION);
                
                if(verificador == JOptionPane.OK_OPTION)
                {
                    acc1.depositar(Double.parseDouble(textFieldValorDepositoTelaDeposito.getText()));
                    JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso!", "Operação: Depósito", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);//fecha a janela de depósito
                    inicio.setVisible(true);//volta para a fase de operações
                } else{
                    JOptionPane.showMessageDialog(null, "Operação de depósito cancelada.", "Operação: Depósito", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);//fecha a janela de depósito
                    inicio.setVisible(true);//volta para a fase de operações
                }
            }
        else //verificar se o número digitado é o da conta 2
        if(Integer.parseInt(textFieldNumeroContaTelaDeposito.getText()) == acc2.getNumero())
            {
                verificador = JOptionPane.showConfirmDialog(null, acc2.getNome()+", você deseja confirmar esta operação?", "Operação: Depósito", JOptionPane.OK_CANCEL_OPTION);
                
                if(verificador == JOptionPane.OK_OPTION)
                {
                    acc2.depositar(Double.parseDouble(textFieldValorDepositoTelaDeposito.getText()));
                    JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso!", "Operação: Depósito", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);//fecha a janela de depósito
                    inicio.setVisible(true);//volta para a fase de operações
                } else{
                    JOptionPane.showMessageDialog(null, "Operação de depósito cancelada.", "Operação: Depósito", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);//fecha a janela de depósito
                    inicio.setVisible(true);//volta para a fase de operações
                }
            }
        else //verificar se o número digitado é o da conta 3
        if(Integer.parseInt(textFieldNumeroContaTelaDeposito.getText()) == acc3.getNumero())
            {
                verificador = JOptionPane.showConfirmDialog(null, acc3.getNome()+", você deseja confirmar esta operação?", "Operação: Depósito", JOptionPane.OK_CANCEL_OPTION);
                
                if(verificador == JOptionPane.OK_OPTION)
                {
                    acc3.depositar(Double.parseDouble(textFieldValorDepositoTelaDeposito.getText()));
                    JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso!", "Operação: Depósito", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);//fecha a janela de depósito
                    inicio.setVisible(true);//volta para a fase de operações
                } else{
                    JOptionPane.showMessageDialog(null, "Operação de depósito cancelada.", "Operação: Depósito", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);//fecha a janela de depósito
                    inicio.setVisible(true);//volta para a fase de operações
                }
            }else{
                    //o número da conta digitado não corresponde a nenhuma das contas cadastradas
                    JOptionPane.showMessageDialog(null, "O número da conta digitado é inválido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                  }
    }//GEN-LAST:event_btnContinuarTelaDepositoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuarTelaDeposito;
    private javax.swing.JButton btnVoltarTelaDeposito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textFieldNumeroContaTelaDeposito;
    private javax.swing.JTextField textFieldValorDepositoTelaDeposito;
    // End of variables declaration//GEN-END:variables
}
