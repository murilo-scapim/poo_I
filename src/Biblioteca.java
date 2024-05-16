import java.util.HashMap;

public class Biblioteca {
    private HashMap<String, Livro> catalogo;

    public Biblioteca() {
        catalogo = new HashMap<>();
    }

    public void cadastrarLivro(Livro livro){
        catalogo.put(livro.getTitulo(), livro);
    }

    public void exibirLivros(){
        for (Livro livro : catalogo.values()){
            System.out.println("Título: " + livro.getTitulo() +
                    "Autor: " + livro.getAutor().getNome());
        }
    }

    public void emprestarLivro(String titulo){
        Livro livro = catalogo.get(titulo);
        if (livro != null && livro.getQuantidade() > 0){
            livro.setQuantidade(livro.getQuantidade() - 1);
            System.out.println("Livro " + livro.getTitulo() +
                    "emprestado!");
        } else {
            System.out.println("Livro não disponível!");
        }
    }
}
