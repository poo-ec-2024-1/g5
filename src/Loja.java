import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Esta classe representa a classe view da Loja e possui a função de abrir a cena da loja, onde dá para o usuário colocar a quantidade de produtos gerados anteriormente no orçamento e ver o valor total que deverá ser pago.
 */

public class Loja extends Application {
    /**
     * Esse método `main` é o ponto de partida da aplicação e chama o método `launch` da classe `Application`, que gerencia a aplicação JavaFX.
     * launch` configura o ambiente JavaFX e chama o método `start(Stage primaryStage)` que abre o arquivo "loja.fxml".
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Metódo para abrir cena da Loja.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loja.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Selecione seus produtos.");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}
