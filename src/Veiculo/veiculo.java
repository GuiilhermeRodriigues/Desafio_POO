package Veiculo;

public abstract class veiculo {
    protected double taxaDiaria;

    // Construtor que inicia a taxa diária
    public veiculo(double taxaDiaria) {
        this.taxaDiaria = taxaDiaria;
    }

    // Método abstrato que deve ser implementado pelas classes filhas
    public abstract double calcularValorTotal(int numDiarias);
}