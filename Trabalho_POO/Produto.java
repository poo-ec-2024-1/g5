
/**
 * Escreva uma descrição da classe s aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

abstract class Produto {
    protected double precoUnitario;
    protected String nome;
    
    public abstract String getNome();
    public abstract int calcularQuantidade(double area);
    public abstract double getPrecoUnitario();
}



