package com.company;

public class ContaCorrente {
    Cliente cliente = new Cliente();
    public Cliente titular;
    public int agencia;
    public int conta;
    private double saldo=100;

    public void DefinirSaldo(double saldoNovo){
        if (saldoNovo < 0){
            return;
        }
        else {
            this.saldo = saldoNovo;
        }
    }

    public double ObterSaldo(){
        return saldo;
    }

    public boolean Sacar(double valor){
        if (this.saldo < valor){
            return false;
        }
        else{
            this.saldo -= valor;
            return true;
        }
    }
    public void Depositar(double valor){
        this.saldo += valor;
    }
    public boolean Transferir(double valor, ContaCorrente contaDestino){
        if (this.saldo < valor){
            return false;
        }
        else {
            contaDestino.saldo += valor;
            this.saldo -= valor;
            return true;
        }
    }
}
