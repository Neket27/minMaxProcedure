package app.tree;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Создаем корневой узел
        StackPane root = new StackPane();

        // Создаем сцену
        Scene scene = new Scene(root, 300, 250);

        // Устанавливаем обработчик нажатия клавиш
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.A) {
                // Обработка нажатия клавиши <
                System.out.println("Клавиша < нажата");
            }
        });

        // Устанавливаем сцену для primaryStage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Отслеживание клавиш");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
