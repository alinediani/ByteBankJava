package com.company;

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaDaAline = new ContaCorrente();
        ContaCorrente contaDaAna = new ContaCorrente();
        Cliente clienteAline = new Cliente();
        Cliente clienteAna = new Cliente();
        GerenciadorBonificacao gerenciador = new GerenciadorBonificacao();
        Funcionario edison = new Funcionario(0);
        Diretor juliana = new Diretor(1);


        contaDaAline.titular = clienteAline;
        contaDaAline.agencia = 123;
        contaDaAline.conta = 23323121;
        contaDaAline.SetSaldo(4554.10);
        contaDaAline.titular.idade =22;
        contaDaAline.titular.profissao="Desenvolvedora";
        contaDaAline.titular.nome= "Aline";
        contaDaAline.titular.cpf="23232432";

        contaDaAna.titular = clienteAna;
        contaDaAna.agencia = 123;
        contaDaAna.conta = 23323122;
        contaDaAna.SetSaldo( 590);
        contaDaAna.titular.idade =16;
        contaDaAna.titular.profissao="Professora";
        contaDaAna.titular.nome= "Ana";
        contaDaAna.titular.cpf="868586954";

        edison.nome= "Edison";
        edison.cpf="43424243";
        edison.salario=8000;

        juliana.nome="Juliana";
        juliana.cpf="423456676";
        juliana.salario=15000;

        contaDaAline.Sacar(1000);
        contaDaAna.Depositar(1000);
        contaDaAline.Transferir(1000,contaDaAna);
        gerenciador.Registrar(edison);
        gerenciador.Registrar(juliana);

        System.out.println(contaDaAline.titular);
        System.out.println(contaDaAline.agencia);
        System.out.println(contaDaAline.conta);
        System.out.println(contaDaAline.GetSaldo());

        System.out.println(contaDaAna.titular);
        System.out.println(contaDaAna.agencia);
        System.out.println(contaDaAna.conta);
        System.out.println(contaDaAna.GetSaldo());

        System.out.println(gerenciador.GetTotalBonificacao());
    }
}
