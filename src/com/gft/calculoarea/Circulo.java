package com.gft.calculoarea;

public class Circulo implements AreaCalculavel{

    private double pi;
    private double raio;

    public Circulo() {
    }

    public Circulo(double pi, double raio) {
        this.pi = pi;
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return this.getPi() * Math.pow(this.getRaio(),2);
    }

    @Override
    public String toString() {
        return " *** Circulo *** " +
                "\nArea do Circulo: " + this.calcularArea() ;
    }
}
