package com.gft.bonificacao;

public class Gerente extends Funcionario{

    double bonificacao() {
        return this.getSalario() + 10000.00;
    }

    @Override
    public String toString() {
        return " *** Gerente *** " +
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() + " anos" +
                "\nSalário: R$ " + this.getSalario() +
                "\nSalário com Bonificação: R$ " + bonificacao();
    }
}
