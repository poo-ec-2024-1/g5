
/**
 * Escreva uma descrição da classe j aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
class Tijolo extends Produto {
    private double tijolosPorMetroQuadrado = 39.0;
    private double precoUnitario = 0.69;
    private String nome = "Tijolo";
    
    public String getNome(){
    return nome;
    }
    
    @Override
    public int calcularQuantidade(double area) {
        return (int) Math.ceil(area * tijolosPorMetroQuadrado);
    }

    @Override
    public double getPrecoUnitario() {
        return precoUnitario;
    }
}


