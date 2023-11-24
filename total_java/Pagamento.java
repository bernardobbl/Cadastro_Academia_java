abstract class Pagamento {
    public abstract void realizarPagamento();
}

class PagamentoAVista extends Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento à vista realizado com sucesso!");
    }
}

class PagamentoParcelado extends Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento parcelado realizado com sucesso!");
    }
}
