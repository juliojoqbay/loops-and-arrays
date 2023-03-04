package br.com.dio.exercicios.loops;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite um número para cálculo fatorial:\n ");
        int factorial = scanner.nextInt();

        int multiplication = 1;

        System.out.print(factorial + "! = ");
        for (int i = factorial; i >= 1; i--) {
            multiplication *= i;
        }
        System.out.println(multiplication);
    }

}
