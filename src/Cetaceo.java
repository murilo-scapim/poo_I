public class Cetaceo extends Mamifero {
    public Cetaceo(String idade, String sexo) {
        super(idade, sexo);
    }

    @Override
    public void alimentar(String alimento) {
        System.out.println("Cetáceo alimentando!");
    }
}
