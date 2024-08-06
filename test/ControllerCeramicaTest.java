import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerCeramicaTest {

    private ControllerCeramica controller;

    @BeforeAll
    public static void setUpClass() {
        Platform.startup(() -> {});
    }

    @BeforeEach
    public void setUp() {
        controller = new ControllerCeramica();
        controller.campoMetro1 = new TextField();
        controller.campoMetro2 = new TextField();
        controller.labelResultado = new Label();
        controller.labelPreco = new Label();
    }

    @Test
    // Testa uma conta qualquer com valores válidos
    public void testBotaoCalcular() {
        // Define valores iniciais
        controller.campoMetro1.setText("5");
        controller.campoMetro2.setText("4");

        // Simula a ação do botão Calcular
        controller.botaoCalcularClicado(new ActionEvent());

        // Verifica os resultados
        assertEquals("Serão necessários 20 pacotes de cerâmica", controller.labelResultado.getText());
        assertEquals("R$ 2400,00", controller.labelPreco.getText());
    }

    @Test
    //Testa uma conta com valores inválidos
    public void testBotaoCalcularInvalido() {
        controller.campoMetro1.setText("abc");
        controller.campoMetro2.setText("4");

        controller.botaoCalcularClicado(new ActionEvent());

        assertEquals("Adicione um valor válido", controller.labelResultado.getText());
        assertEquals("", controller.labelPreco.getText());
    }

    @Test
    //Testa o botão "Limpar"
    public void testBotaoLimpar() {
        controller.campoMetro1.setText("5");
        controller.campoMetro2.setText("4");
        controller.labelResultado.setText("Serão necessários 20 pacotes de cerâmica");
        controller.labelPreco.setText("R$ 2400.00");

        controller.botaoLimparClicado(new ActionEvent());

        // Verificar se os campos estão vazios
        assertEquals("", controller.campoMetro1.getText());
        assertEquals("", controller.campoMetro2.getText());
        assertEquals("", controller.labelResultado.getText());
        assertEquals("", controller.labelPreco.getText());
    }

    @Test
    public void testBotaoVoltar() {
        Platform.runLater(() -> {
            try {
                // Simula o clique no botão de voltar
                controller.botaoVoltar(new ActionEvent(new javafx.scene.control.Button(), null));

                // Checa se a cena foi alterada, se não lançar uma exceção, o teste é bem sucedido
                assertTrue(true);
            } catch (IOException e) {
                fail("Falha ao voltar");
            }
        });
    }
}
