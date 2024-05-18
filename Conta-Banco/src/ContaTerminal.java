import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criação do objeto Scanner para ler dados do terminal147
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação e leitura dos dados
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();

        // Consumir a linha pendente após a leitura de um inteiro
        scanner.nextLine();


        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        saldo = scanner.nextDouble();

        // Construção da mensagem final usando concatenação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                        + "sua agência é " + agencia + ", conta " + numero 
                        + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibição da mensagem
        System.out.println(mensagem);

        // Fechar o objeto scanner
        scanner.close();
    }
}
