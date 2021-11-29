package com.company;

public class ContaCorrente {
    Cliente cliente = new Cliente();
    public Cliente titular;
    public int agencia;
    public int conta;
    public double saldo=100;

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
