import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Esta classe representa a classe view da tinta e possui a função de abrir que mostra o orçamento da tinta.
 */

public class Tinta extends Application {
    /**
     * Esse método `main` é o ponto de partida da aplicação e chama o método `launch` da classe `Application`, que gerencia a aplicação JavaFX.
     * launch` configura o ambiente JavaFX e chama o método `start(Stage primaryStage)` que abre o arquivo "tinta.fxml".
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * Metódo para abrir cena da Tinta.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tinta.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Tinta janela");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}
