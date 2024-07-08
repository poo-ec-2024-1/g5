
/**
 * Escreva uma descrição da classe Carrinho aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.ArrayList;
import java.util.List;
public class Carrinho   
{
    public List<Produto> carrinho;
    
    public Carrinho(){
        this.carrinho = new ArrayList();
    }
    
    public void mostraLista(){
        for(Produto produto : carrinho){
            System.out.println(produto.getNome());
        }
    }
    
    public double calulaPreçoTotal(double areaParede, double areaChao){
        double preçoTotal = 0;
        CalculadoraCusto calculadora = new CalculadoraCusto();
        
        for(Produto produto : carrinho){
            if(produto.getNome()=="Porcelanato"){
                preçoTotal = preçoTotal + calculadora.calcularCusto(produto,areaChao);
            }else{
                preçoTotal = preçoTotal + calculadora.calcularCusto(produto,areaParede);    
            }
        }
        System.out.println(preçoTotal);
        return preçoTotal;
    }
}
