import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository
{
    private static Database database;
    private static Dao<Produto, Integer> dao;
    private List<Produto> loadedProdutos;
    private Produto loadedProduto;

    public ProdutoRepository(Database database) {
        ProdutoRepository.setDatabase(database);
        loadedProdutos = new ArrayList<Produto>();
    }

    public static void setDatabase(Database database) {
        ProdutoRepository.database = database;
        try {
            dao = DaoManager.createDao(database.getConnection(), Produto.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Produto.class);
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }

    public Produto create(Produto produto) {
        int nrows = 0;
        try {
            nrows = dao.create(produto);
            if ( nrows == 0 )
                throw new SQLException("Error: object not saved");
            this.loadedProduto = produto;
            loadedProdutos.add(produto);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return produto;
    }

    public void update(Produto produto) {
        try{
            dao.update(produto);
        }catch(SQLException e){
            System.out.println(e);
        }

    }

    public void delete(Produto produto) {
        try{
            dao.delete(produto);
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public Produto loadFromId(int id) {
        try {
            this.loadedProduto = dao.queryForId(id);
            if (this.loadedProduto != null)
                this.loadedProdutos.add(this.loadedProduto);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedProduto;
    }

    public List<Produto> loadAll() {
        try {
            this.loadedProdutos =  dao.queryForAll();
            if (this.loadedProdutos.size() != 0)
                this.loadedProduto = this.loadedProdutos.get(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedProdutos;
    }

    // getters and setters omitted...
}