import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextDisplayAndClear extends Application {
    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        Label label = new Label();
        Button showBtn = new Button("Show");
        Button clearBtn = new Button("Clear");

        showBtn.setOnAction(e -> label.setText(textField.getText()));
        clearBtn.setOnAction(e -> {
            textField.clear();
            label.setText("");
        });

        VBox root = new VBox(10, textField, showBtn, clearBtn, label);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Text Display & Clear");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
