package com.company;

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaDaAline = new ContaCorrente();
        Cliente clienteAline = new Cliente();
        Cliente clienteAna = new Cliente();


        contaDaAline.titular = clienteAline;
        contaDaAline.agencia = 123;
        contaDaAline.conta = 23323121;
        contaDaAline.SetSaldo(4554.10);

        ContaCorrente contaDaAna = new ContaCorrente();
        contaDaAna.titular = clienteAna;
        contaDaAna.agencia = 123;
        contaDaAna.conta = 23323122;
        contaDaAna.SetSaldo( 590);

        contaDaAline.Sacar(1000);
        contaDaAna.Depositar(1000);
        contaDaAline.Transferir(1000,contaDaAna);

        System.out.println(contaDaAline.titular);
        System.out.println(contaDaAline.agencia);
        System.out.println(contaDaAline.conta);
        System.out.println(contaDaAline.GetSaldo());

        System.out.println(contaDaAna.titular);
        System.out.println(contaDaAna.agencia);
        System.out.println(contaDaAna.conta);
        System.out.println(contaDaAna.GetSaldo());
    }
}
