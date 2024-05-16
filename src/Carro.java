public class Carro { // UpperCamelCase
    String fabricante; // camelCase
    String modelo;
    String cor;
    String tipoDeCombustivel;
    int anoDeFabricacao;
    float valorDeMercado;
    Proprietario proprietario; // Composição

    void ligar() {
        System.out.println("Ligando o nosso carro " + modelo);
    }
}
