import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Inicio extends Application {
    public static void main(String[] args) {
        launch(args);
    }

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
