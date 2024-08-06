import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class ControllerInicioTest {

    private ControllerInicio controller;

    @BeforeAll
    public static void setUpClass() {
        Platform.startup(() -> {});
    }

    @BeforeEach
    public void setUp() {
        controller = new ControllerInicio();
    }

    @Test
    public void testAcessarLoja() {
        Platform.runLater(() -> {
            try {
                Stage stage = new Stage();
                Scene scene = new Scene(new Node() {}.getParent());
                stage.setScene(scene);

                ActionEvent event = new ActionEvent(stage, null);
                controller.acessarLoja(event);

                assertTrue(true);
            } catch (IOException e) {
                fail("Falha ao acessar a loja");
            }
        });
    }

    @Test
    public void testBotaoCeramica() {
        Platform.runLater(() -> {
            try {
                Stage stage = new Stage();
                Scene scene = new Scene(new Node() {}.getParent());
                stage.setScene(scene);

                ActionEvent event = new ActionEvent(stage, null);
                controller.botaoCeramica(event);

                assertTrue(true);
            } catch (IOException e) {
                fail("Falha ao acessar 'Cerâmica'");
            }
        });
    }

    @Test
    public void testBotaoCimento() {
        Platform.runLater(() -> {
            try {
                Stage stage = new Stage();
                Scene scene = new Scene(new Node() {}.getParent());
                stage.setScene(scene);

                ActionEvent event = new ActionEvent(stage, null);
                controller.botaoCimento(event);

                assertTrue(true);
            } catch (IOException e) {
                fail("Falha ao acessar 'Cimento'");
            }
        });
    }

    @Test
    public void testBotaoTijolo() {
        Platform.runLater(() -> {
            try {
                Stage stage = new Stage();
                Scene scene = new Scene(new Node() {}.getParent());
                stage.setScene(scene);

                ActionEvent event = new ActionEvent(stage, null);
                controller.botaoTijolo(event);

                assertTrue(true);
            } catch (IOException e) {
                fail("Falha ao acessar 'Tijolo'");
            }
        });
    }

    @Test
    public void testBotaoTinta() {
        Platform.runLater(() -> {
            try {
                Stage stage = new Stage();
                Scene scene = new Scene(new Node() {}.getParent());
                stage.setScene(scene);

                ActionEvent event = new ActionEvent(stage, null);
                controller.botaoTinta(event);

                assertTrue(true);
            } catch (IOException e) {
                fail("Falha ao acessar 'Tinta'");
            }
        });
    }

    @Test
    public void testIrAoCarrinho() {
        Platform.runLater(() -> {
            try {
                Stage stage = new Stage();
                Scene scene = new Scene(new Node() {}.getParent());
                stage.setScene(scene);

                ActionEvent event = new ActionEvent(stage, null);
                controller.irAoCarrinho(event);

                assertTrue(true);
            } catch (IOException e) {
                fail("Falha ao acessar 'Carrinho'");
            }
        });
    }
}
