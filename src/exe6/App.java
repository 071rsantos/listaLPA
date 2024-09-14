package exe6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double n1, n2, n3, p1,p2,p3, mp; //Declarando variaveis do tipo Double (REAL)
        Scanner sc = new Scanner(System.in); // Declarando variavel sc para Scanner

        System.out.println("Digite a nota 1 e seu respectivo peso: "); // Saida de dados
        n1 = sc.nextDouble(); //Lendo o valor digitado e atribuindo a varival n1
        p1 = sc.nextDouble(); //Lendo o valor digitado e atribuindo a varival p1

        System.out.println("Digite a nota 2 e seu respectivo peso: "); // Saida de dados
        n2 = sc.nextDouble(); //Lendo o valor digitado e atribuindo a varival n2
        p2 = sc.nextDouble(); //Lendo o valor digitado e atribuindo a varival p2

        System.out.println("Digite a nota 3 e seu respectivo peso: "); // Saida de dados
        n3 = sc.nextDouble(); //Lendo o valor digitado e atribuindo a varival n3
        p3 = sc.nextDouble(); //Lendo o valor digitado e atribuindo a varival p3

        mp = (n1*p1) + (n2*p2) + (n3*p3); // Atribuindo a varivel mp o calculo de media ponderada, tendo como parametro as outras variaveis

        System.out.println("Media ponderada = "+mp); // Saida de dados, mostrando na tela o texto, concatenando com a variavel mp

        sc.close(); //Fechando sc para evitar erros.

    }
}
