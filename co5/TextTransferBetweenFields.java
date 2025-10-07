import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextTransferBetweenFields extends Application {
    @Override
    public void start(Stage stage) {
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Button button = new Button("Submit");

        button.setOnAction(e -> textField2.setText(textField1.getText()));

        VBox root = new VBox(10, textField1, button, textField2);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Text Transfer");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
