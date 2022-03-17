package com.gft.calculoarea;

public class Retangulo implements AreaCalculavel{

    private double largura;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.getLargura() * this.getAltura();
    }

    @Override
    public String toString() {
        return " *** Retangulo *** " +
                "\nArea do Retangulo: " + this.calcularArea();
    }
}
