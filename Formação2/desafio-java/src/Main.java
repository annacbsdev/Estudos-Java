import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nome = "Anna Claudia Barros";
        String tipoConta = "Corrente";
        double saldo = 0;

        String dados;
        dados = """
                ***********************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """.formatted(nome, tipoConta, saldo);

        System.out.println(dados);

        Scanner sc = new Scanner(System.in);

        int operacao = 0;

        while (operacao != 4) {
            String mensagem = """
                
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
            System.out.println(mensagem);
            operacao = sc.nextInt();

            if (operacao == 1) {
                System.out.println("Saldo atual:" + saldo);

            } else if (operacao == 2) {
                System.out.println("Digite o valor a receber: ");
                double valorAReceber = sc.nextDouble();
                saldo += valorAReceber;
                System.out.println("Valor recebido! Novo saldo: " + saldo);

            } else if (operacao == 3) {
                System.out.println("Digite o valor a transferir: ");
                double valorATransferir = sc.nextDouble();
                if (valorATransferir > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valorATransferir;
                    System.out.println("Valor transferido! Novo saldo: " + saldo);
                }

            } else if (operacao == 4) {
                System.out.println("Obrigado por utilizar nossos serviços!");
            } else {
                System.out.println("Operação não identificada.");

            }
        }


    }
}