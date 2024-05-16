public class TestaTransacao {
    public static void main(String[] args) {

        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        pagamentoBoleto.setCedente("Condomínio");
        pagamentoBoleto.setLinhaDigitavel("123456789");

        Transferencia transferencia = new Transferencia();
        transferencia.setDescricao("Pagamento da inscrição");

        Transacao boleto = new PagamentoBoleto(); // Polimorfismo

        EmissorDeComprovante emissor = new EmissorDeComprovante();
        emissor.emitirComprovantes(pagamentoBoleto, transferencia);
    }
}
