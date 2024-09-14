package exe7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int t1, t2, r, td; //Declaração de variavel do tipo int (Inteiro)
        Scanner sc = new Scanner(System.in); // declarando variavel sc para Scanner

        System.out.println("Digite os dois priemieros termos da PA"); //Saida de dados
        t1 = sc.nextInt(); //Lendo o valor digitado pelo usuario e atribuindo a variavel t1
        t2 = sc.nextInt(); //Lendo o valor digitado pelo usuario e atribuindo a variavel t2

        System.out.println("Qual termo deseja descobrir? "); // Saida de dados
        td = sc.nextInt(); //Lendo o valor digitado pelo usuario e atribuindo a variavel td

        r = t2 - t1; // Calculando a razao da PA e atribuindo a variavel r

        td = td*r; // calculando termo desejado incrementando o valor na variavel td

        System.out.println("Valor do termo desejado: " +td); // saida de dados mostrando na tela a mensagem, concatenada a variavel td

        sc.close(); // fechando sc para evitar erros
    }
}
