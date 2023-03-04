package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int greater = 0;

        int count = 0;
        do {
            System.out.println("Digito um número inteiro: ");
            number = scanner.nextInt();
            if (number > greater) greater = number;
            count++;
        } while (count < 5);

        System.out.println("O maior número dentre os cinco digitados é : " + greater);
        System.out.println("\nAté a próxima!");
    }
}
