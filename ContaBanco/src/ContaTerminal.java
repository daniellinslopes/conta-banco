import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agencia (xxx-x): ");
        String numeroAgencia = sc.next();

        sc.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o valor do seu saldo: ");
        double saldoConta = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %s e seu saldo R$%.2f já está disponível para saque.",
         nomeCliente, numeroAgencia, numeroConta, saldoConta);
        sc.close();
    }
}