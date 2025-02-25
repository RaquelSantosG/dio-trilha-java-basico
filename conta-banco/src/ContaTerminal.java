import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criar um objeto Scanner para capturar os dados do terminal
        Scanner scanner = new Scanner(System.in);
        
        // Declarar variáveis para os dados da conta
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitar e ler a agência
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine(); // Captura uma string
        
        // Solicitar e ler o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt(); // Captura um número inteiro
        
        // Limpar o buffer de entrada após o nextInt
        scanner.nextLine(); 
        
        // Solicitar e ler o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine(); // Captura uma string
        
        // Solicitar e ler o saldo
        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble(); // Captura um valor decimal
        
        // Exibir a mensagem final com os dados fornecidos
        System.out.println("\nOlá " + nomeCliente + ", O Bradesco agradece pela sua confiança, sua agência é " +
            agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
