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
public class TelaSaque extends javax.swing.JFrame {

    Contas acc1;
    ContaPoupanca acc2; 
    ContaEspecial acc3;
    
    /**
     * Creates new form TelaSaque
     * @param acc1
     * @param acc2
     * @param acc3
     */
    public TelaSaque(Contas acc1, ContaPoupanca acc2, ContaEspecial acc3) {
        this.acc1 = acc1;
        this.acc2 = acc2;
        this.acc3 = acc3;
        initComponents();
    }

    private TelaSaque() {
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
        jLabel3 = new javax.swing.JLabel();
        textFieldNumeroContaSaque = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldValorDoSaque = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        btnVoltarTelaSaque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Operação: Saque");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, preencha os campos abaixo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Número da conta:");

        textFieldNumeroContaSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroContaSaqueActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Valor do saque (R$):");

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnVoltarTelaSaque.setText("Voltar");
        btnVoltarTelaSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTelaSaqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 67, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldValorDoSaque))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldNumeroContaSaque)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnContinuar)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarTelaSaque)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldNumeroContaSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldValorDoSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuar)
                    .addComponent(btnVoltarTelaSaque))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        
        //controle da opção selecionada
        int verificador;
        
        //verificar se o número digitado é o da conta 1
        if(Integer.parseInt(textFieldNumeroContaSaque.getText()) == acc1.getNumero())
            {
                //verificador guarda o valor decidido pelo usuário (Sim/Não)
                verificador = JOptionPane.showConfirmDialog(null, acc1.getNome() + ", deseja confirmar esta operação?", "Operação: Saque",JOptionPane.YES_NO_OPTION);
                //Se o usuário confirmar a operação
                if(verificador == JOptionPane.YES_OPTION)
                {
                    FaseDeOperacoes inicio = new FaseDeOperacoes(this.acc1, this.acc2, this.acc3);
                    
                    //Verificar se o saldo é menor que o valor desejado para saque
                    if(acc1.getSaldo() < Double.parseDouble(textFieldValorDoSaque.getText())){
                        JOptionPane.showMessageDialog(null, "Falha na operação: Saldo insuficiente para saque!", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        acc1.sacar(Double.parseDouble(textFieldValorDoSaque.getText()));
                        JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso.", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);
                    }
                    //Com a operação concluída, fecha a tela de saque e volta para a tela de operações
                    this.setVisible(false);
                    inicio.setVisible(true);
                } else{
                    //Usuário decidiu não proseguir com a operação de saque
                    JOptionPane.showMessageDialog(null, "Operação de saque cancelada.", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);
                }
            } 
        else //verificar se o número digitado é o da conta 2
        if(Integer.parseInt(textFieldNumeroContaSaque.getText()) == acc2.getNumero())
            {
                //verificador guarda o valor decidido pelo usuário (Sim/Não)
                verificador = JOptionPane.showConfirmDialog(null, acc2.getNome() + ", deseja confirmar esta operação?", "Operação: Saque",JOptionPane.YES_NO_OPTION);
                //Se o usuário confirmar a operação
                if(verificador == JOptionPane.YES_OPTION)
                {
                    FaseDeOperacoes inicio = new FaseDeOperacoes(this.acc1, this.acc2, this.acc3);
                    
                    //Verificar se o saldo é menor que o valor desejado para saque
                    if(acc2.getSaldo() < Double.parseDouble(textFieldValorDoSaque.getText())){
                        JOptionPane.showMessageDialog(null, "Falha na operação: Saldo insuficiente para saque!", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        acc2.sacar(Double.parseDouble(textFieldValorDoSaque.getText()));
                        JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso.", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);
                    }
                    //Com a operação concluída, fecha a tela de saque e volta para a tela de operações
                    this.setVisible(false);
                    inicio.setVisible(true);
                } else{
                    //Usuário decidiu não proseguir com a operação de saque
                    JOptionPane.showMessageDialog(null, "Operação de saque cancelada.", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        else //verificar se o número digitado é o da conta 3
        if(Integer.parseInt(textFieldNumeroContaSaque.getText()) == acc3.getNumero())
            {
                //verificador guarda o valor decidido pelo usuário (Sim/Não)
                verificador = JOptionPane.showConfirmDialog(null, acc3.getNome() + ", deseja confirmar esta operação?", "Operação: Saque",JOptionPane.YES_NO_OPTION);
                //Se o usuário confirmar a operação
                if(verificador == JOptionPane.YES_OPTION)
                {
                    FaseDeOperacoes inicio = new FaseDeOperacoes(this.acc1, this.acc2, this.acc3);
                    
                    //Verificar se o saldo é menor que o valor desejado para saque
                    if(acc3.getSaldo() < Double.parseDouble(textFieldValorDoSaque.getText())){
                        //Verificar se o saldo + limite permite o saque desejado
                        if((acc3.getSaldo() + acc3.getLimite()) >= Double.parseDouble(textFieldValorDoSaque.getText()))
                        {
                            acc3.sacar(Double.parseDouble(textFieldValorDoSaque.getText()));//Saque feito usando saldo + limite
                            acc3.descontar(acc3.getMulta());//Aplicar o valor da multa informada sobre o saldo atualizado
                            JOptionPane.showMessageDialog(null, "Saque efetuado usando cheque especial.", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);
                        } else{ //caso o saque desejado seja acima do saldo + limite, o saldo é insuficiente
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente.", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);  
                            }
                    }else{
                        //Se o saldo for maior que o valor desejado, o saque prossegue
                        acc3.sacar(Double.parseDouble(textFieldValorDoSaque.getText()));
                        JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso.", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);
                        }
                    //Com a operação concluída, fecha a tela de saque e volta para a tela de operações
                    this.setVisible(false);
                    inicio.setVisible(true);
                } else{
                    //Usuário decidiu não prosseguir com a operação de saque
                    JOptionPane.showMessageDialog(null, "Operação de saque cancelada.", "Operação: Saque", JOptionPane.INFORMATION_MESSAGE);
                }
            } else{
                    //o número da conta digitado não corresponde a nenhuma das contas cadastradas
                    JOptionPane.showMessageDialog(null, "O número da conta digitado é inválido.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                  }
        
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void textFieldNumeroContaSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroContaSaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroContaSaqueActionPerformed

    private void btnVoltarTelaSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTelaSaqueActionPerformed
        // TODO add your handling code here:
        FaseDeOperacoes inicio = new FaseDeOperacoes(this.acc1, this.acc2, this.acc3);
        this.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarTelaSaqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSaque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVoltarTelaSaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textFieldNumeroContaSaque;
    private javax.swing.JTextField textFieldValorDoSaque;
    // End of variables declaration//GEN-END:variables
}
