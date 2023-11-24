import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private int idade;
    private String endereco;
    private Pagamento pagamento;

    public Cliente(String nome, int idade, String endereco, Pagamento pagamento) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.pagamento = pagamento;
    }

    public void realizarPagamento() {
        this.pagamento.realizarPagamento();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Endereço: " + endereco;
    }
}

class Academia {
    private List<Cliente> clientes;

    public Academia() {
        clientes = new ArrayList<>(); 
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
        } else {
            System.out.println("Lista de Clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
}

