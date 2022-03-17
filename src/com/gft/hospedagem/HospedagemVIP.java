package com.gft.hospedagem;

public class HospedagemVIP extends Hospedagem{

    private double valorAdicional;

    public HospedagemVIP() {
    }

    public HospedagemVIP(double valorEmReais, double valorAdicional) {
        super(valorEmReais);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    double printValor() {
        return this.getValorEmReais() + getValorAdicional();
    }

    @Override
    public String toString() {
        return " *** Hospedagem VIP *** " +
                "\nValor Diaria: R$ " + this.getValorEmReais() +
                "\nCom adicional: R$ " + this.printValor();
    }
}
