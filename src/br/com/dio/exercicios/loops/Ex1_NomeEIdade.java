package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        while (true) {
            System.out.println("\nOlá. Eu quero saber seu nome e sua idade!\n");
            System.out.println("Se quiser sair do programa, aperte a tecla Zero(0)!\n");
            System.out.println("Vamos lá, então\n");
            System.out.println("Digite seu nome:\n");
            name = scanner.next();
            if (name.equals("0")) break;
            System.out.println("\nDigite sua idade:\n");
            age = scanner.nextInt();

            System.out.println("\n***** Olá, " + name.toUpperCase() + ". Você tem " + age + " de idade. *****");
        }

        System.out.println("\nFim do programa. Obrigado!");

    }
}
