package com.gft.bonificacao;

public class Supervisor extends Funcionario{

    double bonificacao() {
        return this.getSalario() + 5000.00;
    }

    @Override
    public String toString() {
        return " *** Supervisor *** " +
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() + " anos" +
                "\nSalário: R$ " + this.getSalario() +
                "\nSalário com Bonificação: R$ " + bonificacao();
    }
}
