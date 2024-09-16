package exe8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int valor, notas50, notas10, notas5, notas1; // Declaração de variáveis inteiras
        Scanner sc = new Scanner(System.in); // Declarando variável sc para Scanner

        System.out.println("Digite o valor para saque: "); // Saída de dados
        valor = sc.nextInt(); // Lendo o valor digitado pelo usuário e atribuindo à variável valor

        // Cálculo da quantidade de notas
        notas50 = valor / 50; // Calcula o número de notas de 50
        valor %= 50; // Atualiza o valor restante

        notas10 = valor / 10; // Calcula o número de notas de 10
        valor %= 10; // Atualiza o valor restante

        notas5 = valor / 5; // Calcula o número de notas de 5
        valor %= 5; // Atualiza o valor restante

        notas1 = valor; // O valor restante será todo de notas de 1

        // Exibindo o resultado
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 1: " + notas1);

        sc.close(); // Fechando Scanner para evitar erros
    }
}