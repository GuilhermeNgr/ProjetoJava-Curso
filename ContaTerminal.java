import java.util.Scanner;
//TODO:conhecer e importa a classe Scaner

   //Exibir as mensagens para o nosso usuario

   //Obter pela Scanner os valores digitado no terminal

   //Exibir a mensagem conta criada
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       String nome;
       int agencia;
       int numero;
       double saldo;


   System.out.println("Digite Seu Nome Completo:");
   String nomeCompleto = scanner.nextLine();

   System.out.println("Digite o Seu Numero da Agencia:");
   String NumeroAgencia = scanner.nextLine();

   System.out.println("Digite Seu Numero da Conta:");
   String NumeroConta = scanner.nextLine();

   System.out.println("Digite Seu Saldo:");
   String SaldoCliente = scanner.nextLine();

   System.out.println("Bem-vindo "+ nomeCompleto + ", Obrigado Por Confiar em Nosso Banco! Numero da agencia - " + NumeroAgencia + " Confirmado! Numero da Conta - " + NumeroConta + " Confirmado. Seu Saldo é de: " + SaldoCliente + "já está disponível para saque.");


    }
}

