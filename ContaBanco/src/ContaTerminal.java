import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário
        //Obter pela scanner os valores digitados pelo usuário
        //Exibir a mensagem final

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //cria o novo objeto scanner
        //nome do cliente
        System.out.println("Olá, seja bem vindo!\nPor favor digite seu nome e sobrenome: ");
        String nomeCliente = scanner.nextLine();
        //numero da agencia
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        //numero da conta
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        //valor do saldo
        System.out.println("Por favor, digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        //Impressão dos dados obtidos pelo usuário
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" já está disponível para saque");

    }
}
