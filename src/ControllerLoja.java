import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class ControllerLoja {
    @FXML
    private Label labelAdicionado;

    @FXML
    private TextField quantidadeCeramica;

    @FXML
    private TextField quantidadeCimento;

    @FXML
    private TextField quantidadeTijolo;

    @FXML
    private TextField quantidadeTinta;

    @FXML
    void adicionarCeramica(ActionEvent event) {
        String quantosCeramica = quantidadeCeramica.getText();
        labelAdicionado.setText(String.format("Foram adicionados um total de %s porcelanatos no carrinho", quantosCeramica));

    }

    @FXML
    void adicionarCimento(ActionEvent event) {
        String quantosCimento = quantidadeCimento.getText();
        labelAdicionado.setText(String.format("Foram adicionados um total de %s sacos de cimento no carrinho", quantosCimento));
    }

    @FXML
    void adicionarTijolo(ActionEvent event) {
        String quantosTijolo = quantidadeTijolo.getText();
        labelAdicionado.setText(String.format("Foram adicionados um total de %s tijolos no carrinho", quantosTijolo));
    }


    @FXML
    void adicionarTinta(ActionEvent event) {
        String quantosTinta = quantidadeTinta.getText();
        labelAdicionado.setText(String.format("Foram adicionados um total de %s latas de tinta no carrinho", quantosTinta));
    }


    @FXML
    void botaoCarrinho(ActionEvent event) {

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
