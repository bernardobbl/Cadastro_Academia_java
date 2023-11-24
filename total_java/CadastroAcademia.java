import java.util.Scanner;

public class CadastroAcademia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Academia academia = new Academia();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Nome do Cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade do Cliente: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Endereço do Cliente: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Tipo de Pagamento (1 - À Vista, 2 - Parcelado): ");
                    int tipoPagamento = scanner.nextInt();
                    Pagamento pagamento = tipoPagamento == 1 ? new PagamentoAVista() : new PagamentoParcelado();

                    Cliente novoCliente = new Cliente(nome, idade, endereco, pagamento);
                    academia.cadastrarCliente(novoCliente);
                    break;
                case 2:
                    academia.listarClientes();
                    break;
                case 3:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}

