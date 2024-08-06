import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Esta classe representa a classe view do ínicio e possui a função de abrir a cena do inicio, que consegue levar
 * a todas as outras cenas.
 */

public class Inicio extends Application {
    /**
     * Esse método `main` é o ponto de partida da aplicação e chama o método `launch` da classe `Application`, que gerencia a aplicação JavaFX.
     * launch` configura o ambiente JavaFX e chama o método `start(Stage primaryStage)` que abre o arquivo "inicio.fxml".
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * Metódo para abrir cena do Início.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("inicio.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Tela Inicial");
        primaryStage.setScene(tela);

        // Define o tamanho inicial da janela
        primaryStage.setWidth(841); // Largura do FXML
        primaryStage.setHeight(533); // Altura do FXML

        // Impede o redimensionamento
        primaryStage.setResizable(false);

        primaryStage.show();
    }
}
