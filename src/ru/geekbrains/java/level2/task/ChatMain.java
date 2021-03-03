package ru.geekbrains.java.level2.task;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatMain extends Application {
    Parent root1;
    Parent root2;
    Scene scene1;
    Scene scene2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        root1 = FXMLLoader.load(getClass().getResource("ChatWindow.fxml"));
        scene1 = new Scene(root1, 300, 500);
        primaryStage.setScene(scene1);
        primaryStage.setResizable(false);
//        primaryStage.setMaximized(true);
//        primaryStage.setFullScreen(true);
        primaryStage.setTitle("Chat");
//        primaryStage.setIconified(true);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
