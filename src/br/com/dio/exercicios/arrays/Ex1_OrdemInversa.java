package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vector = { -5, 0, 15, 20, 8, 4 };

        System.out.println("\nVetor: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println("\n\nVetor inverso: ");
        for (int i = (vector.length - 1); i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }

        System.out.println("\n\nFim do programa!");
    }
}
