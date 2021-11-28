package com.company;

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaDaAline = new ContaCorrente();
        contaDaAline.titular = "Aline";
        contaDaAline.agencia = 123;
        contaDaAline.conta = 23323121;
        contaDaAline.saldo = 4554.10;

        ContaCorrente contaDaAna = new ContaCorrente();
        contaDaAna.titular = "Ana";
        contaDaAna.agencia = 123;
        contaDaAna.conta = 23323122;
        contaDaAna.saldo = 590;

        contaDaAline.Sacar(1000);
        contaDaAna.Depositar(1000);

        System.out.println(contaDaAline.titular);
        System.out.println(contaDaAline.agencia);
        System.out.println(contaDaAline.conta);
        System.out.println(contaDaAline.saldo);

        System.out.println(contaDaAna.titular);
        System.out.println(contaDaAna.agencia);
        System.out.println(contaDaAna.conta);
        System.out.println(contaDaAna.saldo);
    }
}
