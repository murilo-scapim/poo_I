public abstract class Mamifero {
    protected String idade;
    protected String sexo;

    public Mamifero() {
    }

    public Mamifero(String idade, String sexo){
        this.idade = idade;
        this.sexo = sexo;
    }

    public abstract void alimentar(String alimento);

    public void dormir(){
        System.out.println("Animal dormindo...");
    }
}
