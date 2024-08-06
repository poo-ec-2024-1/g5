import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Esta classe representa a classe controller do inicio e possui a função de ao clicar os botões na classe view do inicio se abra as cenas dos produtos.
 */

public class ControllerInicio {


    @FXML
    void acessarLoja(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loja.fxml"));
        Parent root = loader.load();
        Scene cena = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(cena);
        stage.setTitle("Selecione seus produtos.");
        stage.show();
    }

    @FXML
    void botaoCeramica(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ceramica.fxml"));
        Parent root = loader.load();
        Scene cena = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(cena);
        stage.setTitle("Calcular Cerâmica");
        stage.show();
    }

    @FXML
    void botaoCimento(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cimento.fxml"));
        Parent root = loader.load();
        Scene cena = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(cena);
        stage.setTitle("Calcular Cimento");
        stage.show();
    }

    @FXML
    void botaoTijolo(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tijolo.fxml"));
        Parent root = loader.load();
        Scene cena = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(cena);
        stage.setTitle("Calcular Tijolos");
        stage.show();
    }

    @FXML
    void botaoTinta(ActionEvent event)  throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tinta.fxml"));
        Parent root = loader.load();
        Scene cena = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(cena);
        stage.setTitle("Calcular Tinta");
        stage.show();
    }

    @FXML
    void irAoCarrinho(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("carrinho.fxml"));
        Parent root = loader.load();
        Scene cena = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(cena);
        stage.setTitle("Carrinho de compras");
        stage.show();
    }

}
