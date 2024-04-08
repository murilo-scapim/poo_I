public class Bebida {
    private String nome;
    private float teorAlcoolico;
    private float volume;
    private int quantidade;
    private float preco;

    public Bebida() {
    }

    public Bebida(String nome, float teorAlcoolico, float volume) {
        this.nome = nome;
        this.teorAlcoolico = teorAlcoolico;
        this.volume = volume;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public float getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public float getVolume() {
        return volume;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTeorAlcoolico(float teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
