package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;

public class Controller {

    @FXML
    private Button btnEnter;

    @FXML
    private TextField txtName;

    @FXML
    private Label lblOutput;
    @FXML
    public void showName(javafx.scene.input.MouseEvent mouseEvent) {
        String name = txtName.getText();
        lblOutput.setText("Hello "+ name);
    }
}
