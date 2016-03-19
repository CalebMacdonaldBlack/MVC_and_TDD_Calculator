package com.gigabytedx.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import com.gigabytedx.calculator.models.Calculator;


public class Controller {


    @FXML
    private Button clearEverything, multiply, divide, add, subtract, modulus, power, equals, num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9, num_0;

    @FXML
    private Label display;

    /**
     * Event called when a number or decimal is clicked. Gets the new display with the number clicked added to it from the model
     * @param event
     */
    @FXML
    private void onNumberClick(MouseEvent event) {
        Button source = (Button) event.getSource();
        display.setText(Calculator.extractNumberFromIdAndAddToString(source.getId(), display.getText()));
    }

    /**
     * event called when an operation is clicked. Sends the number in the display and the operation id to the model
     * @param event
     */
    @FXML
    private void onOperatorClick(MouseEvent event) {
        Button source = (Button) event.getSource();

        Calculator.setNum1AndOperator(display.getText(), source.getId());
        display.setText("");
    }

    /**
     * Event called when the clear button is click. Clears the display
     * @param event
     */
    @FXML
    private void onClearClick(MouseEvent event) {
        Button source = (Button) event.getSource();

        display.setText("");
    }

    /**
     * Event called when the equals button is clicked. Passes the number in the display as the second number to the model and
     * gets the result as a formatted String. This then updates the display with that number
     * @param event
     */
    @FXML
    private void onEqualsClick(MouseEvent event) {
        Button source = (Button) event.getSource();

        ;
        display.setText(Calculator.setNum2AndGetResult(display.getText()));

    }


}
