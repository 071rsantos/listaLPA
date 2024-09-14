package exe4;

import java.util.Scanner;

public class App {
 public static void main(String[] args) {
    double salario, salarioMin, qntSalMin; //Declaração de variavel (Double é o que indica que a variavel é um valor REAL)
    Scanner sc = new Scanner(System.in); //Declarando variavel sc para Scanner

    System.out.println("Qual seu salario?"); // Saida de dados
    salario = sc.nextDouble(); // Lendo o que o usario escreveu (EM DOUBLE) e atribuindo à variavel salario
    System.out.println("Qual o salario minimo?"); // Saida de dados
    salarioMin = sc.nextDouble(); // // Lendo o que o usario escreveu (EM DOUBLE) e atribuindo à variavel salarioMin

    qntSalMin = salario / salarioMin; //Calculando a quantidade de salarios tendo o salario e o salario minimo como parametro.

    System.out.println("Voce recebe "+qntSalMin+" salarios minimo."); // Saida de dados
    sc.close(); // fechando sc para evitar erro
 }
}
