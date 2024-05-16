public class Bebida {
    private String nome;
    private float teorAlcoolico;
    private float volume;
    private float preco;
    private int quantidade;

    public Bebida(){
    }

    public Bebida(String nome, float teorAlcoolico){
        this.nome = nome;
        this.teorAlcoolico = teorAlcoolico;
    }

    public Bebida(String nome, float teorAlcoolico,
                  float volume, float preco, int quantidade) {
        this(nome, teorAlcoolico); // chama o construtor anterior
        this.volume = volume;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTeorAlcoolico(float teorAlcoolico){
        this.teorAlcoolico = teorAlcoolico;
    }

    public String getNome() {
        return nome;
    }

    public float getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
