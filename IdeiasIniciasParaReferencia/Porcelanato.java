
/**
 * Escreva uma descrição da classe j aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
class Porcelanato extends Produto {
    private final double areaPorPorcelanato = 0.81;
    private double precoUnitario = 175.0;
    private String nome = "Porcelanato";
    
    public String getNome(){
    return nome;
    }
    
    @Override
    public int calcularQuantidade(double area) {
        return (int) Math.ceil(area / areaPorPorcelanato);
    }

    @Override
    public double getPrecoUnitario() {
        return precoUnitario;
    }
}

