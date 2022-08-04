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
public class ContaEspecial extends Contas {
    int limite;
    double multa;
    
    public void descontar(double multa){
        sacar(this.getSaldo()*(-(multa/100)));
        
        /*
        double saldoAtual = this.getSaldo();
        double valorDescontado = saldoAtual - (multa/100);
        this.sacar(saldoAtual);
        this.depositar(valorDescontado);
        */
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    
    @Override
    public String tipoConta()
    {
        return("Conta-especial");
    }

}
