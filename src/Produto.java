public class Produto {
    String nome;
    float preco;
    int quantidade;

    void definirPreco(Produto produto){
        produto.preco += 100;
    }
}
