import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random gerador = new Random();
        // Gera um número inteiro aleatório

        int numeroAgencia = gerador.nextInt(10000) + 1000;
        int numeroConta = gerador.nextInt(1000) + 100;
        double valorSaldo = gerador.nextInt(10000);

        System.out.println("Olá, bem vindo!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite seu email: ");
        String email = scanner.next();

        System.out.println("Digite seu numero de telefone: ");
        String telefone = scanner.next();

        System.out.println("Olá, " +nome + " " + sobrenome + " obrigado por abrir uma conta conosco, o número de sua conta e agência são respectivamente: " + numeroConta +" 0-"+ numeroAgencia);
        System.out.println("Confirme seus seguintes dados: ");
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("O valor do seu saldo atual é de: " + valorSaldo);
    }
}
