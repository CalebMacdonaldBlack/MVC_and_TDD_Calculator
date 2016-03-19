package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import sample.models.Calculator;

public class Controller {


    @FXML
    private Button clearEverything, multiply, divide, add, subtract, modulus, power, equals, num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9, num_0;

    @FXML
    private Label display;

    @FXML
    private void onNumberClick(MouseEvent event) {
        Button source = (Button) event.getSource();
        display.setText(Calculator.extractNumberFromIdAndAddToString(source.getId(), display.getText()));
    }

    @FXML
    private void onOperatorClick(MouseEvent event) {
        Button source = (Button) event.getSource();

        Calculator.setNum1AndOperator(display.getText(), source.getId());
        display.setText("");
    }

    @FXML
    private void onClearClick(MouseEvent event) {
        Button source = (Button) event.getSource();

        display.setText("");
    }

    @FXML
    private void onEqualsClick(MouseEvent event) {
        Button source = (Button) event.getSource();

        ;
        display.setText(Calculator.setNum2AndGetResult(display.getText()));

    }


}
