public class TestaAeronave {
    public static void main(String[] args) {
        Aeronave aeronave = new Aeronave();
        aeronave.reservarAssentos(5);
        int assentos = aeronave
                .calcularAssentosDisponiveis();
        System.out.println("Quantidade de assentos disponíveis "
                + assentos );
    }
}
