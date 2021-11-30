package com.company;

public class Diretor {
    private int _tipo;
    public String nome;
    public String cpf;
    public double salario;
    public Diretor (int tipo){
        _tipo = tipo;
    }
    public double GetBonificacao(){
        if (_tipo==1){
            return salario;
        }
        else {
            return salario*0.10;
        }
    }
}
