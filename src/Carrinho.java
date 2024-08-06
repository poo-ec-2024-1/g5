import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Esta classe representa o view do carrinho e possui a função de mostrar a cena do carrinho, onde o usuário pode ver o valor de cada produto que colocou na loja e importou para o carrinho e o valor total da compra podende efetuar a compra.
 */

public class Carrinho extends Application {
    /**
     * Esse método `main` é o ponto de partida da aplicação e chama o método `launch` da classe `Application`, que gerencia a aplicação JavaFX.
     * launch` configura o ambiente JavaFX e chama o método `start(Stage primaryStage)` que abre o arquivo "carrinho.fxml".
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * Metódo para abrir cena do carrinho.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("carrinho.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Carrinho de compras.");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}
