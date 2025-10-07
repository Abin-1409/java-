import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleCalculatorAddition extends Application {
    @Override
    public void start(Stage stage) {
        TextField num1 = new TextField();
        TextField num2 = new TextField();
        Button addBtn = new Button("Add");
        Label result = new Label();

        addBtn.setOnAction(e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                result.setText("Sum: " + (a + b));
            } catch (NumberFormatException ex) {
                result.setText("Please enter valid numbers");
            }
        });

        VBox root = new VBox(10, num1, num2, addBtn, result);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Simple Calculator");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
