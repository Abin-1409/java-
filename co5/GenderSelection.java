import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GenderSelection extends Application {
    @Override
    public void start(Stage stage) {
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        Label label = new Label("Select Gender");

        ToggleGroup group = new ToggleGroup();
        male.setToggleGroup(group);
        female.setToggleGroup(group);

        male.setOnAction(e -> label.setText("Selected: Male"));
        female.setOnAction(e -> label.setText("Selected: Female"));

        VBox root = new VBox(10, male, female, label);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Gender Selection");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
