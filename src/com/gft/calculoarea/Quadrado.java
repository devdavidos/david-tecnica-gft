package com.gft.calculoarea;

public class Quadrado implements AreaCalculavel{

    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return this.getLado() * this.getLado();
    }

    @Override
    public String toString() {
        return " *** Quadrado *** " +
                "\nArea do Quadrado: " + this.calcularArea();
    }
}
