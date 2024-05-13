import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nOlá, qual o seu nome?");
        String nome = scanner.next();

        System.out.println("\nPor favor, digite o número da sua Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("\nEm seguida, informe qual o número da sua Agência!");
        String agencia = scanner.next();

        System.out.println("\nInforme por fim o seu saldo!");
        double saldo = scanner.nextDouble();

        ContaTerminal.contaRegistrada(nome, numeroConta, agencia, saldo);
    }

    public  static void contaRegistrada(String nome, int numeroConta, String agencia, Double saldo) {
        System.out.println("\n\nOlá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+", e seu saldo de: R$"+saldo+" já está disponível para saque.");
    }
}