import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1500.00;
        int opcao = 0;

        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*************************");

        String menu = """
                \nDigite sua opção:
                1 - Consultar saldo
                2 - Transferência
                3 - Receber valor
                4 - Sair                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){

            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if ( opcao == 2){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo o suficiente para realizar a transferência");
                } else {
                    /*ao usar += seria o mesmo que escrever saldo = saldo - valor*/
                    saldo -=  valor;
                    System.out.println("Novo saldo: " + saldo);

                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                /*ao usar += seria o mesmo que escrever saldo = saldo + valor*/
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }

        }
    }
}
