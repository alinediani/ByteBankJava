package com.company;

public class ContaCorrente {
    public String titular;
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
    public boolean Depositar(double valor){
        this.saldo += valor;
        return true;
    }
}
