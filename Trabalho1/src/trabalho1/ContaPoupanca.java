/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

/**
 *
 * @author ranie
 */
public class ContaPoupanca extends Contas {
    double taxa;
    
    public void reajustar(double taxa){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * (taxa/100);
        this.depositar(reajuste);
    }
    
    public void reajustar(){
        double saldoAtual = this.getSaldo();
        double reajusteFixo = saldoAtual * 0.1; //0.1 = 10% (taxa fixa de 10%)
        this.depositar(reajusteFixo);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
    
    @Override
    public String tipoConta()
    {
        return("Conta-poupança");
    }
}
