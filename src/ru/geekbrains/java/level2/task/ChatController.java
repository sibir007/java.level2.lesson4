package ru.geekbrains.java.level2.task;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController {
    @FXML
    public TextArea questArea;
    @FXML
    public TextArea messArea;

    public void send(ActionEvent actionEvent) {
        questArea.appendText(messArea.getText() + "\n\n");
        messArea.clear();
    }
}
