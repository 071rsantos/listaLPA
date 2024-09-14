package exe1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double c, f; //Declaração de variavel (Double é o que indica que a variavel é um valor REAL)
        Scanner sc = new Scanner(System.in); //Declarando variavel para Scanner

        System.out.println("Digite uma temperatura em centigrados: "); //Saída de dados
        c = sc.nextDouble(); // Lendo o que o usario escreveu (EM DOUBLE) e atribuindo à variavel c

        f = ((9*c)+160)/5; // Atribuindo à variavel f o valor convertido.

        System.out.println("Temperatura convertida: "+f+"F"); // Mostrando resultado na tela, concatenando o texto com a variavel F

        sc.close(); // Fechando varivel Scanner para evitar erros.
    }
}
