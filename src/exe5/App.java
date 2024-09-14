package exe5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int a, m, d, dv; //Declaração de variaveis (INT para tipo INTEIRO)
        Scanner sc = new Scanner(System.in); // declarando variavel sc para Scanner

        System.out.println("Digite quantos anos, meses e dias voce tem: "); //Saida de dados
        a = sc.nextInt(); //Lendo o que foi digitado e atribuindo a variavel a
        m = sc.nextInt(); //Lendo o que foi digitado e atribuindo a variavel m
        d = sc.nextInt(); //Lendo o que foi digitado e atribuindo a variavel d

        dv = (a * 360) + (m * 30) + d; //Atribuindo a variavel dv o cauculo de dias vividos

        System.out.println("Voce viveu " +dv+ " dias."); // Mostrando na tela o resultado, concatenando texto e variavel dv

        sc.close(); // fechando sc para evitar erros
    }
}
