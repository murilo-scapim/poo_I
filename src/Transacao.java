import java.util.Date;

public class Transacao {
    private String descricao;
    private double valor;
    private Date data;

    public Transacao(){}

    public Transacao(String descricao,
                     double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public void emitirComprovante() {
        System.out.println("=============");
        System.out.println("Comprovante");
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("Data: " + getData());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
