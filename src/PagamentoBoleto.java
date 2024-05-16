import java.util.Date;

public class PagamentoBoleto extends Transacao {
    private String cedente;
    private String linhaDigitavel;
    private Date dataVencimento;

    public PagamentoBoleto(){};

    public PagamentoBoleto(String cedente,
                           String linhaDigitavel,
                           Date dataVencimento) {
        this.cedente = cedente;
        this.linhaDigitavel = linhaDigitavel;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void emitirComprovante() {
        super.emitirComprovante();
        System.out.println("Cedente: " + this.cedente);
        System.out.println("Linha digitável: " + this.linhaDigitavel);
        System.out.println("Data de vencimento: " + this.dataVencimento);
    }

    public String getCedente() {
        return cedente;
    }

    public void setCedente(String cedente) {
        this.cedente = cedente;
    }

    public String getLinhaDigitavel() {
        return linhaDigitavel;
    }

    public void setLinhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
