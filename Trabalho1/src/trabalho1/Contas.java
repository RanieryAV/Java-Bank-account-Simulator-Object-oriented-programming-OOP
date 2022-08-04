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
public class Contas {
    private String nome;
    private int numero;
    private double saldo;
    
    //Contas c1 = new Contas();
    //Contas c2 = new Contas();
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double numero){
        this.saldo = numero;
    }
    
    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$ "+valor+" efetuado com sucesso!");
            return(true);
        } else{
            System.out.println("Erro! Saldo insuficiente para saque!");
            return(false);
        }
    }
    
    public String tipoConta()
    {
        return("Conta-comum");
    }
    
    /*
    boolean transferir(int conta1, int conta2, double valor){
        //o método transferir consiste no saque de um valor da conta1 e em um depóstio do mesmo valor na conta2
        //sacar
        if(c1.saldo >= valor){
            c1.saldo = c1.saldo - valor;
            c2.saldo = c2.saldo + valor;
            System.out.println("Transferência de R$ "+valor+" efetuado com sucesso!");
            return(true);
        } else{
            System.out.println("Erro! Saldo insuficiente para transferência!");
            return(false);
        }
        
    }*/
    
    
     
}
