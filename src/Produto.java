import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

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