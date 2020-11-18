package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public javafx.scene.control.TextArea textArea;
    public TextField textField;


    public void onClickBtn(ActionEvent actionEvent) {
        textArea.appendText(textField.getText()+ "\n");
        textField.requestFocus();
        textField.clear();


    }


}
