import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Esta classe representa o view do cimento e possui a função de abrir a cena que mostra o orçamento do cimento.
 */

public class Cimento extends Application {
    /**
     * Esse método `main` é o ponto de partida da aplicação e chama o método `launch` da classe `Application`, que gerencia a aplicação JavaFX.
     * launch` configura o ambiente JavaFX e chama o método `start(Stage primaryStage)` que abre o arquivo "cimento.fxml".
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * Metódo para abrir cena do Cimento.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cimento.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Calcular Cimento");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}
