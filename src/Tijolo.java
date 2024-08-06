import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Esta classe representa a classe view do tijolo e possui a função de abrir a cena que mostra o orçamento dos tijolos.
 */
public class Tijolo extends Application {
    /**
     * Esse método `main` é o ponto de partida da aplicação e chama o método `launch` da classe `Application`, que gerencia a aplicação JavaFX.
     * launch` configura o ambiente JavaFX e chama o método `start(Stage primaryStage)` que abre o arquivo "tijolo.fxml".
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Metódo para abrir cena do Tijolo.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tijolo.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Calcular Tijolos");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}
