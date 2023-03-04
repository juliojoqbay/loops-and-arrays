package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[20];
        for (int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }

        System.out.println("\nNúmeros aleatórios: ");
        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }

        System.out.println("\n\nSucessores dos números aleatórios acima: ");
        for (int randomNumber : randomNumbers) {
            System.out.print((randomNumber + 1) + " ");
        }

        System.out.println("\n\nAntecessores dos números aleatórios acima: ");
        for (int randomNumber : randomNumbers) {
            System.out.print((randomNumber - 1) + " ");
        }

        System.out.println("\n\nFim do progama!");
    }

}
