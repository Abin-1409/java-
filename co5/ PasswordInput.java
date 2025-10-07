import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswordInput extends Application {
    @Override
    public void start(Stage stage) {
        PasswordField passwordField = new PasswordField();
        Label label = new Label();

        passwordField.setOnAction(e -> label.setText("Password Entered!"));

        VBox root = new VBox(10, passwordField, label);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Password Input");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
