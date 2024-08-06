import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
/**
 * Essa classe que representa um produto no sistema. Esta classe está mapeada para a
 * tabela "produtos" no banco de dados usando a biblioteca ORMLite.
 * Essa estrutura permite que a classe Produto seja
 * utilizada para armazenar dados em um banco de dados relacional, facilitando
 * operações de CRUD (Create, Read, Update, Delete) com a tabela "produtos".
 */
@DatabaseTable(tableName = "produtos")
public class Produto {

    @DatabaseField (generatedId = true)
    private int id;

    @DatabaseField
    private boolean noCarrinho;

    @DatabaseField
    public int quantidade;

    @DatabaseField
    private String nome;

    public int getId() {
        return id;
    }

    public boolean get_noCarrinho() {
        return noCarrinho;
    }

    public void set_noCarrinho(boolean noCarrinho) {
        this.noCarrinho = noCarrinho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}