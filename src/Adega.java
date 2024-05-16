import java.util.ArrayList;
import java.util.List;

public class Adega {
    private List<Bebida> bebidas;

    public Adega(){
        bebidas = new ArrayList<>();
    }

    public void adicionarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void consultarBebidas() {
        for (Bebida bebida : bebidas) {
            System.out.println(bebida.getNome());
            System.out.println(bebida.getTeorAlcoolico());
            System.out.println(bebida.getVolume());
        }
    }
}
