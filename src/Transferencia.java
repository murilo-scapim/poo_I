public class Transferencia extends Transacao {
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transferencia(){
    }

    public Transferencia(String descricao,
                         double valor,
                         Conta contaOrigem,
                         Conta contaDestino) {
        super(descricao, valor);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    @Override
    public void emitirComprovante() {
        super.emitirComprovante();
        System.out.println("Origem: " + contaOrigem.getNumero());
        System.out.println("Destino: " + contaDestino.getNumero());
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }
}
