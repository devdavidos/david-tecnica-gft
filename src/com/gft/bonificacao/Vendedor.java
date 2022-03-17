package com.gft.bonificacao;

public class Vendedor extends Funcionario{

    double bonificacao() {
        return this.getSalario() + 3000.00;
    }

    @Override
    public String toString() {
        return " *** Vendedor *** " +
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() + " anos" +
                "\nSalário: R$ " + this.getSalario() +
                "\nSalário com Bonificação: R$ " + bonificacao();
    }
}
