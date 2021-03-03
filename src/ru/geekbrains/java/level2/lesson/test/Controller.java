package ru.geekbrains.java.level2.lesson.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private String question = "Ваш любимый фрукт?";
    private String[] answers = {
            "Банан", "Апельсин", "Мандарин", "Киви"
    };
    private String correctAnswer = "Мандарин";


    @FXML
    TextArea questArea;

    @FXML
    RadioButton answer1, answer2, answer3, answer4;

    @FXML
    ToggleGroup ans;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        questArea.setText(question);
        answer1.setText(answers[0]);
        answer2.setText(answers[1]);
        answer3.setText(answers[2]);
        answer4.setText(answers[3]);
    }

    public void tryToAnswer(ActionEvent actionEvent) {
        if (((RadioButton)ans.getSelectedToggle()).getText().equals(correctAnswer)) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Молодец", ButtonType.OK);
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Не молодец", ButtonType.OK);
            alert.showAndWait();
        }
    }


}
