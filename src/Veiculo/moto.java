package Veiculo;

public class moto extends veiculo {

    // Construtor que define a taxa diária específica para Moto
    public moto() {
        super(25.0); // Taxa diária fixa para Moto
    }

    @Override
    public double calcularValorTotal(int numDiarias) {
        return taxaDiaria * numDiarias;
    }
}