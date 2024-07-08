
/**
 * Escreva uma descrição da classe calculadora aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CalculadoraCusto {
    public static double calcularCusto(Produto produto, double area) {
        int quantidade = produto.calcularQuantidade(area);
        return quantidade * produto.getPrecoUnitario();
    }
}

