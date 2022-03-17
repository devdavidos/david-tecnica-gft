package com.gft.fraseinvertida;

import java.util.Scanner;

public class FraseInvertida {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a Frase/Palavra: ");
        String frase = scan.nextLine();

        System.out.println(frase);

        StringBuilder fraseConvertida = new StringBuilder(frase);

        String outraFrase = fraseConvertida.reverse().toString();

        System.out.println(outraFrase);

        System.out.println(frase.equalsIgnoreCase(outraFrase));

    }

}
