package br.com.dio.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] consonants = new String[6];
        int consonantsQuantity = 0;


        System.out.println("\nVamos averiguar se uma letra é consoante.");
        System.out.println("\nDigite 6 letras no total:");
        System.out.println("\nVamos começar!");
        int count = 0;
        do {;
            System.out.println("\nLetra: ");
            String letter = scanner.nextLine();

            if (!(letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u"))) {
                consonants[count] = letter;
                consonantsQuantity++;
            }
            count++;
        } while (count < consonants.length);

        System.out.println("\nConsoantes: ");
        for (String consonante : consonants) {
            if (consonante != null)
                System.out.println("\n" + consonante);
        }

        System.out.println("\nQuantidade de consoantes: " + consonantsQuantity + ".");
    }

}
