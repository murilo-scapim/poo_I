import java.util.ArrayList;
import java.util.List;

public class Adega {
    private List<Bebida> bebidas;

    public Adega() {
        bebidas = new ArrayList<>();
    }

    public void adicionarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void listarBebidas() {
        for (Bebida bebida : bebidas) {
            System.out.println(bebida.getNome() + ", " +
                    bebida.getVolume() + "ml, " +
                    bebida.getTeorAlcoolico() + "%");
        }
    }

    public float calcularValorTotal() {
        float valorEstoque = 0;
        for (Bebida bebida : bebidas) {
            valorEstoque += bebida.getPreco() * bebida.getQuantidade();
        }
        return valorEstoque;
    }
}
