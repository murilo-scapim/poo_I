public class Aeronave {
    int totalDeAssentos;
    int assentosReservados;

    void reservarAssentos(int assentos) {
        assentosReservados += assentos;
    }

    int calcularAssentosDisponiveis() {
        return totalDeAssentos - assentosReservados;
    }

    void alterarTotalAssentos(int totalDeAssentos) {
        this.totalDeAssentos = totalDeAssentos;
    }
}
