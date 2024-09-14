package exe3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double valor, valorTot; //Declaração de variavel (Double é o que indica que a variavel é um valor REAL)
        Scanner sc = new Scanner(System.in); //Declarando variavel sc para Scanner

        System.out.println("Digite o valor da conta: "); // saida de dados
        valor = sc.nextDouble(); // Lendo o que o usario escreveu (EM DOUBLE) e atribuindo à variavel valor

        valorTot = valor + (valor * 0.1); //Atribuindo ao valorTot o valor da conta + 10%

        System.out.println("Valor total a ser pago com 10%: R$ " +valorTot); // Mostrando resultado na tela, concatenando o texto com a variavel valorTot

        sc.close(); //Fechando variavel para evitar erro
    }
}
