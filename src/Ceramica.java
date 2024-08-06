import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Esta classe representa o view do da cerâmica e possui a função de abrir a cena que mostra orçamento da cerâmica.
 */

public class Ceramica extends Application {
    /**
     * Esse método `main` é o ponto de partida da aplicação e chama o método `launch` da classe `Application`, que gerencia a aplicação JavaFX.
     * launch` configura o ambiente JavaFX e chama o método `start(Stage primaryStage)` que abre o arquivo "ceramica.fxml".
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * Metódo para abrir cena da Cerâmica.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ceramica.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Calcular Cerâmica");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}
