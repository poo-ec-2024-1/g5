import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerTinta {

    @FXML
    private TextField campoMetro1;

    @FXML
    private TextField campoMetro2;

    @FXML
    private Label labelResultado;

    @FXML
    private Label labelPreco;

    @FXML
    void botaoCalcularClicado(ActionEvent event) {
        double coberturaPorLata = 20.0;
        double precoUnitario = 169.0;

        try {
            double metro1 = Double.parseDouble(campoMetro1.getText());
            double metro2 = Double.parseDouble(campoMetro2.getText());

            double quantidade = Math.ceil((metro1 * metro2) / coberturaPorLata);
            labelResultado.setText(String.format("Serão necessárias %.0f latas de tinta.", quantidade));
            labelPreco.setText(String.format("R$ %.2f", precoUnitario*quantidade));
        } catch (NumberFormatException e) {
            labelResultado.setText("Adicione um valor válido");
        }
    }

    @FXML
    void botaoLimparClicado(ActionEvent event) {
        labelResultado.setText("");
        labelPreco.setText("");
        campoMetro1.setText("");
        campoMetro2.setText("");
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

}
