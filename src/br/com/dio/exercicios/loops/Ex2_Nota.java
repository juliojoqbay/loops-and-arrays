package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int note;
        System.out.println("\nDigite a primeira nota: ");
        note = scanner.nextInt();

        while (note < 0 || note > 10) {
            System.out.println("\nNota " + note + " inválida\n");
            System.out.println("Digite a nota novamente:");
            note = scanner.nextInt();
        }

        System.out.println("\nA nota digitada foi: " + note + ".");
        System.out.println("\nAté a próxima.");
    }

}
