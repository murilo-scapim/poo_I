public class Conta {
    private String numero;
    private float saldo;
    private float limite;
    private Titular titular; // Composição

    public Conta(){}

    public Conta(String numero){
        this.limite = 5000f;
        this.numero = numero;
    }

    void sacar(float valor) {
        float resultado;
        this.saldo -= valor;
    }

    void depositar(float valor) {
        this.saldo += valor;
    }

    void transferir(Conta destino, float valor){
       /*
        saldo -= valor;
        destino.saldo += valor;
       */
        this.sacar(valor);
        destino.depositar(valor);
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
