package com.gft.bonificacao;

public class Test {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Fernando Pacheco");
        gerente.setIdade(38);
        gerente.setSalario(8000);

        Supervisor supervisor = new Supervisor();
        supervisor.setNome("Francisco Norato");
        supervisor.setIdade(33);
        supervisor.setSalario(4500);

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Roges Bastocellos");
        vendedor.setIdade(25);
        vendedor.setSalario(2200);


        System.out.println(gerente);
        System.out.println();
        System.out.println(supervisor);
        System.out.println();
        System.out.println(vendedor);

    }
}
