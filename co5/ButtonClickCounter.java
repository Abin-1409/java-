import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonClickCounter extends Application {
    int count = 0;

    @Override
    public void start(Stage stage) {
        Button button = new Button("Click Me");
        Label label = new Label("Clicked 0 times");

        button.setOnAction(e -> label.setText("Clicked " + (++count) + " times"));

        VBox root = new VBox(10, button, label);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Button Click Counter");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
