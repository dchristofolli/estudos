package com.github.com.dchristofolli;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("CALCULADORA");
        int primeiroNumero = teclado("Digite um número: ");
        int segundoNumero = teclado("Digite outro número: ");

        int resultadoSoma = soma(primeiroNumero, segundoNumero);
        int resultadoSubtracao = subtracao(primeiroNumero, segundoNumero);
        int resultadoMultiplicacao = multiplicacao(primeiroNumero, segundoNumero);
        int resultadoDivisao = divisao(primeiroNumero, segundoNumero);

        System.out.println("Soma: " +resultadoSoma+ "\nSubtração: " +resultadoSubtracao+ "\nMultiplicação: "
        +resultadoMultiplicacao+ "\nDivisão " +resultadoDivisao);
    }
    private static int divisao(int a, int b) {
        return a/b;
    }
    private static int multiplicacao(int a, int b) {
        return a*b;
    }
    private static int subtracao(int a, int b) {
        return a - b;
    }
    private static int soma(int a, int b) {
        return a + b;
    }
    private static int teclado(String numero) {
        System.out.print(numero);
        return (new Scanner(System.in)).nextInt();
    }
}
