import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.List;

public class ControllerCarrinho {

    double precoCimento, precoTijolo, precoPorcelanato, precoTinta;

    @FXML
    private TextArea campoCarrinho;

    @FXML
    private TextArea campoCarrinho2;

    @FXML
    private Label compraRealizada;

    @FXML
    void atualizarCarrinho(ActionEvent event) {
        Database database = new Database("produto.db");
        ProdutoRepository repo = new ProdutoRepository(database);

        // Supondo que 'loadFromId' retorna uma lista de produtos ou uma lista de quantidades
        List<Produto> produtos = repo.loadAll();

        // Limpa o campoCarrinho antes de adicionar os novos textos
        campoCarrinho.setText("");

        // Adiciona as quantidades no campoCarrinho
        for (Produto produto : produtos) {
            if(produto.get_noCarrinho()== true) {
                campoCarrinho.appendText( produto.getNome() + " - Quantidade: " + produto.getQuantidade() + "\n");
            }
        }


        // Limpa o campoCarrinho antes de adicionar os novos textos
        campoCarrinho2.setText("");

        if (produtos.get(0).getQuantidade() >= 1) {
            precoCimento = produtos.get(0).getQuantidade() * 29.90; //Cimento
            campoCarrinho2.appendText("Cimento: R$" + String.format("%.2f", precoCimento) + "\n");
        }

        if (produtos.get(1).getQuantidade() >= 1) {
            precoTijolo = produtos.get(1).getQuantidade() * 0.69; //Tijolo
            campoCarrinho2.appendText("Tijolo: R$" + String.format("%.2f", precoTijolo) + "\n");
        }

        if (produtos.get(2).getQuantidade() >= 1) {
            precoPorcelanato = produtos.get(2).getQuantidade() * 120; //Porcelanato
            campoCarrinho2.appendText("Porcelanato: R$" + String.format("%.2f", precoPorcelanato) + "\n");
        }

        if (produtos.get(3).getQuantidade() >= 1) {
            precoTinta = produtos.get(3).getQuantidade() * 109.90; //Tinta
            campoCarrinho2.appendText("Tinta: R$" + String.format("%.2f", precoTinta) + "\n");
        }

        double precoTotal = precoTijolo + precoCimento + precoTinta + precoPorcelanato;

        campoCarrinho2.appendText("\n \nValor Total da Compra: R$" + String.format("%.2f", precoTotal));


    }
    @FXML
    void botaoVoltar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inicio.fxml"));
        Parent root = loader.load();
        Scene cena = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(cena);
        stage.setTitle("Tela Inicial");
        stage.show();
    }

    @FXML
    void limparCarrinho(ActionEvent event) {
        Database database = new Database("produto.db");
        ProdutoRepository repo = new ProdutoRepository(database);

        // Carregar todos os produtos
        List<Produto> produtos = repo.loadAll();

        // Atualizar a quantidade de todos os produtos para 0 e remover do carrinho
        for (Produto produto : produtos) {
            produto.setQuantidade(0);
            produto.set_noCarrinho(false);
            repo.update(produto);
        }

        // Limpar os campos de texto na interface
        campoCarrinho.setText("");
        campoCarrinho2.setText("");
    }

    @FXML
    void comprar(ActionEvent event) {
        Database database = new Database("produto.db");
        ProdutoRepository repo = new ProdutoRepository(database);

        // Carregar todos os produtos
        List<Produto> produtos = repo.loadAll();

        // Atualizar a quantidade de todos os produtos para 0 e remover do carrinho
        for (Produto produto : produtos) {
            produto.setQuantidade(0);
            produto.set_noCarrinho(false);
            repo.update(produto);
        }

        // Limpar os campos de texto na interface
        campoCarrinho.setText("");
        campoCarrinho2.setText("");

        compraRealizada.setText("Compra realizada com sucesso!!");
    }

}