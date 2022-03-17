package com.gft.hospedagem;

public class Hospedagem {

    private double valorEmReais;

    public Hospedagem() {
    }

    public Hospedagem(double valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    public double getValorEmReais() {
        return valorEmReais;
    }

    public void setValorEmReais(double valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    double printValor(){

        return this.getValorEmReais();
    }

    @Override
    public String toString() {
        return " *** Hospedagem *** " +
                "\nValor diaria: R$ " + printValor();
    }
}
