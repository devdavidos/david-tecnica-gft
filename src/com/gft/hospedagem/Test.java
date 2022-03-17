package com.gft.hospedagem;

public class Test {
    public static void main(String[] args) {

        Hospedagem hospedagem = new Hospedagem(80);
        HospedagemVIP hospedagemVip = new HospedagemVIP(80,60);

        System.out.println(hospedagem);
        System.out.println();
        System.out.println(hospedagemVip);
    }
}
