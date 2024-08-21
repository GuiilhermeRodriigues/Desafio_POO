package Veiculo;

public class carro extends veiculo {

    // Construtor que define a taxa diária específica para Carro
    public carro() {
        super(50.0); // Taxa diária fixa para Carro
    }

    public carro(double taxaDiaria) {
        super(taxaDiaria);
    }
// Metodo implementado que vem da classe "Pai"
    @Override
    public double calcularValorTotal(int numDiarias) {
        return taxaDiaria * numDiarias;
    }
}