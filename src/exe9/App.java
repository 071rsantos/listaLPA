package exe9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int fitas; // Quantidade de fitas
        double valorAluguel, faturamentoAnual, ganhoComMultas, fitasNoFinalDoAno; // Variáveis do tipo double
        Scanner sc = new Scanner(System.in); // Declarando variável sc para Scanner

        System.out.println("Digite a quantidade de fitas que a locadora possui: "); // Saída de dados
        fitas = sc.nextInt(); // Lendo o valor digitado e atribuindo à variável fitas

        System.out.println("Digite o valor de cada aluguel: "); // Saída de dados
        valorAluguel = sc.nextDouble(); // Lendo o valor digitado e atribuindo à variável valorAluguel

        // Calculando faturamento anual
        faturamentoAnual = (fitas / 3) * valorAluguel * 12;
        System.out.println("Faturamento anual: R$ " + faturamentoAnual);

        // Calculando ganho com multas mensais
        ganhoComMultas = ((fitas / 3) / 10) * (valorAluguel * 0.1);
        System.out.println("Ganho com multas por mês: R$ " + ganhoComMultas);

        // Calculando a quantidade de fitas no final do ano
        fitasNoFinalDoAno = fitas - (fitas * 0.02) + (fitas * 0.1);
        System.out.println("Quantidade de fitas no final do ano: " + (int)fitasNoFinalDoAno);

        sc.close(); // Fechando Scanner para evitar erros
    }
}