public class EmissorDeComprovante {
    // Polimorfismo no parâmetro
    // varargs
    public void emitirComprovantes(Transacao... transacoes) {
        for (Transacao transacao : transacoes) {
            transacao.emitirComprovante();
        }
    }
}
