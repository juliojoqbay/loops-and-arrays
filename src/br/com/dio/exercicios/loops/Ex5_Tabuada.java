package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 0 = 0
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQual tabuada você quer consultar?");
        System.out.println("\nDigite o número:\n ");
        int multiplicationTable = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println("\n"+multiplicationTable + " X " + i + " = " + (multiplicationTable * i));
        }

        System.out.println("\nEssa foi a tabuada do " + multiplicationTable + "!");
        System.out.println("\nEspero que tenha gostado!");
        System.out.println("\nIsso foi divertido. Até a próxima!");
    }

}
