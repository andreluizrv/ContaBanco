
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);

            // Pede para inserir os valores
            System.out.println("Insira a sua conta:");
            int conta = scanner.nextInt();
            scanner.nextLine();  // Consumir a linha residual

            System.out.println("Insira a sua agencia:");
            String agencia = scanner.nextLine();

            System.out.println("Insira o seu nome:");
            String nome_Cliente = scanner.nextLine();

            System.out.println("Insira o seu saldo:");
            double saldo = scanner.nextDouble();

            // Mensagem final
            System.out.println("Olá " + nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque");
            // Fechando o Scanner
            scanner.close();
        
    }
}
