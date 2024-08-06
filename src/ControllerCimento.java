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
 * Esta classe representa a classe controller do cimento e possui a função de calcular orçamento do cimento para mostrar na classe view do cimento.
 */

public class ControllerCimento {

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
        double sacosPorMetroQuadrado = 0.98642105;
        double precoUnitario = 29.90;

        try {
            double metro1 = Double.parseDouble(campoMetro1.getText());
            double metro2 = Double.parseDouble(campoMetro2.getText());

            double quantidade = Math.ceil((metro1 * metro2) * sacosPorMetroQuadrado);
            labelResultado.setText(String.format("Serão necessários %.0f sacos de cimento.", quantidade));
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
