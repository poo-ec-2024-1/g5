import javafx.application.Platform;
import javafx.event.ActionEvent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

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
                controller.acessarLoja(new ActionEvent(new javafx.scene.control.Button(), null));

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
                controller.botaoCeramica(new ActionEvent(new javafx.scene.control.Button(), null));

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
                controller.botaoCimento(new ActionEvent(new javafx.scene.control.Button(), null));

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
                controller.botaoTijolo(new ActionEvent(new javafx.scene.control.Button(), null));

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
                controller.botaoTinta(new ActionEvent(new javafx.scene.control.Button(), null));

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
                controller.irAoCarrinho(new ActionEvent(new javafx.scene.control.Button(), null));

                assertTrue(true);
            } catch (IOException e) {
                fail("Falha ao acessar 'Carrinho'");
            }
        });
    }
}
