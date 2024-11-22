import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome = "Julia";
        String tipoConta = "Corrente";
        int numeroEscolha = 0;
        int valor = 0;
        double saldo = 2500 + valor;


        System.out.println("\n***********************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n***********************************");

    while (numeroEscolha != 4) {
        System.out.println("""
                ----- Menu -----
                1-  Consultar saldo
                2 - Receber Dinheiro
                3 - transferir Valor
                4 - Sair
                """);
        numeroEscolha = leitura.nextInt();

        if (numeroEscolha == 1) {

            System.out.println("Você tem " + saldo);
        } else if (numeroEscolha == 2) {
            System.out.println("Qual valor você quer adicionar? seu total da conta atualmente é: " + saldo);
            valor = leitura.nextInt();
            saldo += valor;
            System.out.println("Seu total na conta é: " + saldo);
        } else if (numeroEscolha == 3) {
            System.out.println("Qual valor você quer transferir? seu total da conta atualmente é: " + saldo);
            valor = leitura.nextInt();
            saldo -= valor;
                if (valor >= saldo){
                    System.out.println("Não tem saldo sulficiente");
                } else {
                    System.out.println("Seu total na conta é: " + saldo);
                }
        } else if (numeroEscolha == 4) {
            System.out.println("Obrigador por tudo!");
            break;
        } else {
            System.out.println("Essa opção não existe!");
        }

    }
    }
}