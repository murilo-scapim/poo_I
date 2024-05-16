public class Humano extends Mamifero {
    private String nome;

    public Humano(){};

    public Humano(String idade, String sexo,
                  String nome){
        super(idade, sexo);
        this.nome = nome;
    }

    public void alimentar(String alimento) {
        System.out.println("Humano alimentando com" + alimento);
    }
}
