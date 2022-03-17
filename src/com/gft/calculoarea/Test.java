package com.gft.calculoarea;

public class Test {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(10);
        Retangulo retangulo = new Retangulo(10, 20);
        Circulo circulo = new Circulo(3.141592, 2);

        System.out.println(quadrado);
        System.out.println();
        System.out.println(retangulo);
        System.out.println();
        System.out.println(circulo);
    }
}
