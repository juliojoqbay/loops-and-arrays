package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numericalQuantity;
        int number;
        int evenNumberQuantity = 0, oddNumberQuantity = 0;
        System.out.println("\nVamos analisar quantos números pares e ímpares contêm nos números digitados!");
        System.out.println("\nDigite a quantidade que você quer que seja analisada:\n");
        numericalQuantity = scanner.nextInt();

        System.out.println("\nOk, agora digite os números para serem analisados os pares e ímpares.");
        int count = 0;
        do {
            System.out.println("\nNúmero:\n ");
            number = scanner.nextInt();
            if (number % 2 == 0) {
                evenNumberQuantity++;
            } else {
                oddNumberQuantity++;
            }
            count++;
        } while (count < numericalQuantity);

        System.out.println("\nQuantidade de números pares: " + evenNumberQuantity);
        System.out.println("\nQuantidade de números ímpares: " + oddNumberQuantity);

        System.out.println("\nMuito bem. Programa finalizado! Até a próxima!");
    }
}
