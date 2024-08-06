import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerCarrinhoTest {

    private ControllerCarrinho controller;
    private List<Produto> produtos;

    @BeforeAll
    public static void setUpClass() {
        // Inicializa o ambiente JavaFX
        Platform.startup(() -> {});
    }

    @BeforeEach
    public void setUp() {
        // Inicializa o controller e os componentes da interface
        controller = new ControllerCarrinho();
        controller.campoCarrinho = new TextArea();
        controller.campoCarrinho2 = new TextArea();
        controller.compraRealizada = new Label();

        // Inicializa os produtos
        produtos = new ArrayList<>();
        produtos.add(createProduto("Cimento", 1, true));
        produtos.add(createProduto("Tijolo", 2, true));
        produtos.add(createProduto("Porcelanato", 3, true));
        produtos.add(createProduto("Tinta", 4, true));

        // Simula a carga dos produtos no repositório
        ProdutoRepository repo = new ProdutoRepository(new Database("produto.db")) {
            @Override
            public List<Produto> loadAll() {
                return produtos;
            }
        };
    }

    // Cria e inicializa instâncias de Produto
    private Produto createProduto(String nome, int quantidade, boolean noCarrinho) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.set_noCarrinho(noCarrinho);
        return produto;
    }

    @Test
    public void testAtualizarCarrinho() {
        Platform.runLater(() -> {
            try {
                // Simula o botão atualizar carrinho
                controller.atualizarCarrinho(new ActionEvent());

                String textoEsperado1 = "Cimento - Quantidade: 1\n" +
                        "Tijolo - Quantidade: 2\n" +
                        "Porcelanato - Quantidade: 3\n" +
                        "Tinta - Quantidade: 4\n";
                String textoEsperado2 = "Cimento: R$29.90\n" +
                        "Tijolo: R$1.38\n" +
                        "Porcelanato: R$360.00\n" +
                        "Tinta: R$439.60\n\n\n" +
                        "Valor Total da Compra: R$830.88";

                assertEquals(textoEsperado1, controller.campoCarrinho.getText());
                assertEquals(textoEsperado2, controller.campoCarrinho2.getText());
            } catch (Exception e) {
                fail("Falha ao atualizar o carrinho: " + e.getMessage());
            }
        });
    }

    @Test
    public void testLimparCarrinho() {
        Platform.runLater(() -> {
            try {
                // Limpa o carrinho
                controller.limparCarrinho(new ActionEvent());

                assertTrue(controller.campoCarrinho.getText().isEmpty());
                assertTrue(controller.campoCarrinho2.getText().isEmpty());
                for (Produto produto : produtos) {
                    assertEquals(0, produto.getQuantidade());
                    assertFalse(produto.get_noCarrinho());
                }
            } catch (Exception e) {
                fail("Falha ao limpar o carrinho: " + e.getMessage());
            }
        });
    }

    @Test
    public void testComprar() {
        Platform.runLater(() -> {
            try {
                // Atualiza o carrinho para simular uma compra
                controller.atualizarCarrinho(new ActionEvent());

                // Realiza a compra
                controller.comprar(new ActionEvent());

                assertTrue(controller.campoCarrinho.getText().isEmpty());
                assertTrue(controller.campoCarrinho2.getText().isEmpty());
                assertEquals("Compra realizada com sucesso!!", controller.compraRealizada.getText());
                for (Produto produto : produtos) {
                    assertEquals(0, produto.getQuantidade());
                    assertFalse(produto.get_noCarrinho());
                }
            } catch (Exception e) {
                fail("Falha ao realizar a compra");
            }
        });
    }
}
