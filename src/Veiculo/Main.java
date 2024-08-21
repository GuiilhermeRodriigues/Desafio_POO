package Veiculo;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Carro e Moto
        veiculo carro = new carro();
        veiculo moto = new moto();

        // Calculando e exibindo o valor total para 10 diárias
        int numDiarias = 10;
        System.out.println("Valor total para 10 diárias com Carro: R$ " + carro.calcularValorTotal(numDiarias));
        System.out.println("Valor total para 10 diárias com Moto: R$ " + moto.calcularValorTotal(numDiarias));
    }
}