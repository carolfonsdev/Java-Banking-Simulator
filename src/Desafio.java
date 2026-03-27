import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Maverick";
        String conta = "Corrente";
        double saldo = 1599.99;

        int opcao = 0;

        System.out.println("***********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo disponível: R$ " + saldo);
        System.out.println("\n***********************************");

        String menu = """
                      \n
                      **** Selecione uma opção: **** 
                      1 - Consultar saldo
                      2 - Transferir valor
                      3 - Receber valor
                      4 - Sair
                      *******************************
                      \n
                      """;
        Scanner scanner = new Scanner(System.in);

        while(opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();

            if(opcao == 1 ){
                System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja tranferir: ");
                double valor = scanner.nextDouble();
                if(valor > saldo){
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Seu novo saldo é de: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja receber: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Seu novo saldo é de: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
            }
        }
    }
}