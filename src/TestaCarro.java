public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
       // carro.modelo = "Sport";
        carro.fabricante = "BYD";
        carro.valorDeMercado = 115.000f;
        carro.ligar();

        Proprietario proprietario = new Proprietario();
        proprietario.nome = "João";
        proprietario.cpf = "123.456.789-0";
        proprietario.idade = 30;
        proprietario.logradouro = "Rua dos Ypês";
        proprietario.bairro = "Bairro das flores";
        proprietario.cidade = "Ituverava";
        carro.proprietario = proprietario; // composição

        System.out.println(carro.fabricante);
        System.out.println(carro.modelo);
        System.out.println(carro.cor);
        System.out.println(carro.tipoDeCombustivel);
        System.out.println(carro.anoDeFabricacao);
        System.out.println(carro.valorDeMercado);
    }
}
