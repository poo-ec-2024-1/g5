import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Esta classe representa a classe controller da cerâmica e possui a função de calcular orçamento das cerâmicas para mostrar na classe view da cerâmica.
 */

public class ControllerCeramica {

    @FXML
    public TextField campoMetro1;

    @FXML
    public TextField campoMetro2;

    @FXML
    public Label labelResultado;

    @FXML
    public Label labelPreco;

    @FXML
    void botaoCalcularClicado(ActionEvent event) {
        double areaPorPorcelanato = 1;
        double precoUnitario = 120;

        try {
            double metro1 = Double.parseDouble(campoMetro1.getText());
            double metro2 = Double.parseDouble(campoMetro2.getText());

            double quantidade = Math.ceil((metro1 * metro2) / areaPorPorcelanato);
            labelResultado.setText(String.format("Serão necessários %.0f pacotes de cerâmica", quantidade));
            labelPreco.setText(String.format("R$ %.2f", precoUnitario * quantidade));
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
