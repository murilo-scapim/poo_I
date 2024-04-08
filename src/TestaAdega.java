import java.text.NumberFormat;
import java.util.Locale;

public class TestaAdega {
    public static void main(String[] args) {
        Bebida bebida1 = new Bebida();
        bebida1.setNome("Whisky");
        bebida1.setTeorAlcoolico(40);
        bebida1.setVolume(1000);
        bebida1.setQuantidade(5);
        bebida1.setPreco(89.90f);

        Bebida bebida2 = new Bebida("Vinho", 13, 750); // usa o construtor
        bebida2.setQuantidade(25);
        bebida2.setPreco(65.00f);

        Adega adega = new Adega();
        adega.adicionarBebida(bebida1);
        adega.adicionarBebida(bebida2);

        adega.listarBebidas();

        float valorTotal = adega.calcularValorTotal();
        Locale locale = new Locale("pt", "BR");
        System.out.println("Valor em estoque " + NumberFormat
                .getCurrencyInstance(locale).format(valorTotal));
    }
}
