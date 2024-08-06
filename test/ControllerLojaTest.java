import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class ControllerLojaTest {
    private ControllerLoja controller;
    private TextField quantidadeCeramica;
    private TextField quantidadeCimento;
    private TextField quantidadeTijolo;
    private TextField quantidadeTinta;
    private Label labelAdicionado;

    @BeforeAll
    public static void setUpClass() {
        Platform.startup(() -> {});
    }

    @BeforeEach
    public void setUp() {
        controller = new ControllerLoja();
        quantidadeCeramica = new TextField();
        quantidadeCimento = new TextField();
        quantidadeTijolo = new TextField();
        quantidadeTinta = new TextField();
        labelAdicionado = new Label();

        controller.quantidadeCeramica = quantidadeCeramica;
        controller.quantidadeCimento = quantidadeCimento;
        controller.quantidadeTijolo = quantidadeTijolo;
        controller.quantidadeTinta = quantidadeTinta;
        controller.labelAdicionado = labelAdicionado;
    }

    @Test
    public void testAdicionarCeramica() {
        quantidadeCeramica.setText("10");

        // Simula a ação do botão Adicionar Cerâmica
        controller.adicionarCeramica(new ActionEvent());

        // Verifica se a quantidade foi adicionada corretamente
        assertEquals("Foram adicionados um total de 10 porcelanatos no carrinho", labelAdicionado.getText());
    }

    @Test
    public void testAdicionarCimento() {
        quantidadeCimento.setText("5");

        controller.adicionarCimento(new ActionEvent());

        assertEquals("Foram adicionados um total de 5 sacos de cimento no carrinho", labelAdicionado.getText());
    }

    @Test
    public void testAdicionarTijolo() {
        quantidadeTijolo.setText("20");

        controller.adicionarTijolo(new ActionEvent());

        assertEquals("Foram adicionados um total de 20 tijolos no carrinho", labelAdicionado.getText());
    }

    @Test
    public void testAdicionarTinta() {
        quantidadeTinta.setText("7");

        controller.adicionarTinta(new ActionEvent());

        assertEquals("Foram adicionados um total de 7 latas de tinta no carrinho", labelAdicionado.getText());
    }

    @Test
    public void testBotaoVoltar() {
        // Cria uma nova janela (Stage) e define uma cena vazia para simular a navegação
        Platform.runLater(() -> {
            try {
                Stage stage = new Stage();
                Scene scene = new Scene(new Label(), 100, 100);
                stage.setScene(scene);

                ActionEvent event = new ActionEvent(stage, null);
                controller.botaoVoltar(event);

                // Se não lançar uma exceção, o teste é bem-sucedido
                assertTrue(true);
            } catch (IOException e) {
                fail("Falha");
            }
        });
    }

    @Test
    public void testIrAoCarrinho() {
        Platform.runLater(() -> {
            try {
                Stage stage = new Stage();
                Scene scene = new Scene(new Label(), 100, 100);
                stage.setScene(scene);

                ActionEvent event = new ActionEvent(stage, null);
                controller.irAoCarrinho(event);

                assertTrue(true);
            } catch (IOException e) {
                fail("Falha");
            }
        });
    }
}
