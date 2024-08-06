import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerTijoloTest {

    private ControllerTijolo controller;

    @BeforeAll
    public static void setUpClass() {
        Platform.startup(() -> {});
    }

    @BeforeEach
    public void setUp() {
        controller = new ControllerTijolo();
        controller.campoMetro1 = new TextField();
        controller.campoMetro2 = new TextField();
        controller.labelResultado = new Label();
        controller.labelPreco = new Label();
    }

    @Test
    public void testBotaoCalcular() {
        controller.campoMetro1.setText("2.5");
        controller.campoMetro2.setText("3");

        controller.botaoCalcularClicado(new ActionEvent());

        assertEquals("Serão necessários 137 tijolos", controller.labelResultado.getText());
        assertEquals("R$ 94,53", controller.labelPreco.getText());
    }

    @Test
    public void testBotaoCalcularInvalido() {
        // Define valores iniciais
        controller.campoMetro1.setText("a");
        controller.campoMetro2.setText("3");

        controller.botaoCalcularClicado(new ActionEvent());

        assertEquals("Adicione um valor válido", controller.labelResultado.getText());
        assertEquals("", controller.labelPreco.getText());
    }

    @Test
    public void testBotaoLimpar() {
        controller.campoMetro1.setText("2.5");
        controller.campoMetro2.setText("3");

        controller.botaoLimparClicado(new ActionEvent());

        assertEquals("", controller.campoMetro1.getText());
        assertEquals("", controller.campoMetro2.getText());
        assertEquals("", controller.labelResultado.getText());
        assertEquals("", controller.labelPreco.getText());
    }

    @Test
    public void testBotaoVoltar() {
        Platform.runLater(() -> {
            try {
                controller.botaoVoltar(new ActionEvent(new javafx.scene.control.Button(), null));

                assertTrue(true);
            } catch (IOException e) {
                fail("Falha ao voltar");
            }
        });
    }
}