import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println(nome + ", seu IMC é " + imc);
    }
}
