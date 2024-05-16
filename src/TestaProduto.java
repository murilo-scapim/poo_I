import java.text.NumberFormat;
import java.util.Locale;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Leite";
        produto.quantidade = 10;
        produto.preco = 7.99f;

        Produto produto2 = new Produto();
        produto2.preco = 10.00f;
        produto.definirPreco(produto2);
        System.out.println(produto2.preco);

        float estoque = produto.preco *
                produto.quantidade;
        System.out.printf("O valor do produto %s em estoque é de R$ %.2f\n",
                produto.nome, estoque);

        Locale localBrasil = new Locale("pt",
                "BR");
        System.out.println(NumberFormat
                .getCurrencyInstance(localBrasil)
                .format(estoque));
    }
}