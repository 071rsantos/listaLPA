package exe10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int hInicio, mInicio, sInicio, hFim, mFim, sFim, duracaoSegundos; // Variáveis inteiras
        Scanner sc = new Scanner(System.in); // Declarando variável sc para Scanner

        // Entrada de dados
        System.out.println("Digite a hora, minutos e segundos de início da atividade: ");
        hInicio = sc.nextInt();
        mInicio = sc.nextInt();
        sInicio = sc.nextInt();

        System.out.println("Digite a hora, minutos e segundos de fim da atividade: ");
        hFim = sc.nextInt();
        mFim = sc.nextInt();
        sFim = sc.nextInt();

        // Convertendo o tempo para segundos
        int inicioEmSegundos = hInicio * 3600 + mInicio * 60 + sInicio;
        int fimEmSegundos = hFim * 3600 + mFim * 60 + sFim;

        // Calculando a diferença em segundos
        duracaoSegundos = fimEmSegundos - inicioEmSegundos;

        // Convertendo novamente para horas, minutos e segundos
        int horas = duracaoSegundos / 3600;
        duracaoSegundos %= 3600;
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;

        // Exibindo a duração
        System.out.println("Duração da atividade: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

        sc.close(); // Fechando Scanner para evitar erros
    }
}