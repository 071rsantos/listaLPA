package exe2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        int h, m, s; // Declaração de varialvel (int para tipo INTEIRO)
        int totSeg; // Declaração de varialvel (int para tipo INTEIRO)

        Scanner sc = new Scanner(System.in); // Declarando variavel sc para utilizar para Scanner

        System.out.println("Digite hora, minuto e segundos"); // Saída de dados
        h = sc.nextInt(); // Lendo o que o usario escreveu (EM INT) e atribuindo à variavel h
        m = sc.nextInt(); // Lendo o que o usario escreveu (EM INT) e atribuindo à variavel m
        s = sc.nextInt(); // Lendo o que o usario escreveu (EM INT) e atribuindo à variavel s

        totSeg = (h * 3600) + (m * 60) + s; // Atribuido à variavel totSeg o calculo para receber o total de segundos, utilizando as variaveis com os valores recebidos

        System.out.println("Ja se passaram: " +totSeg+ "... Segundos"); // Mostrando resultado na tela, concatenando o texto com a variavel totSeg

        sc.close(); // Fechando a variavel sc para evitar erros.
    }
}
