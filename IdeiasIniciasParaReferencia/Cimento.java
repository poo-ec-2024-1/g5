
/**
 * Escreva uma descrição da classe s aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
class Cimento extends Produto {
    private double sacosPorMetroQuadrado = 1.57894736842;
    private double precoUnitario = 29.90;
    private String nome = "Cimento";
    
    public String getNome(){
    return nome;
    }
    
    @Override
    public int calcularQuantidade(double area) {
        return (int) Math.ceil(area * sacosPorMetroQuadrado);
    }

    @Override
    public double getPrecoUnitario() {
        return precoUnitario;
    }
}

