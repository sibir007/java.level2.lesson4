package ru.geekbrains.java.level2.lesson.sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextArea MainTextArea;
    public TextField mesField;

    public void clickHelloBtn() {
        MainTextArea.appendText("1\n");
    };

    public void clickHelloBtn2(ActionEvent actionEvent) {
        MainTextArea.appendText(mesField.getText() + "\n");
        mesField.clear();
    }
}
