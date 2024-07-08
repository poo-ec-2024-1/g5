
/**
 * Escreva uma descrição da classe d aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
class Tinta extends Produto {
    private double coberturaPorLata = 90.0;
    private double precoUnitario = 169.0;
    private String nome = "Tinta";
    
    public String getNome(){
        return nome;
    }
    
    @Override
    public int calcularQuantidade(double area) {
        return (int) Math.ceil(area / coberturaPorLata);
    }

    @Override
    public double getPrecoUnitario() {
        return precoUnitario;
    }
}

