package dk.easv.simplecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField input1;
    
    @FXML
    private TextField input2;
    
    @FXML
    private Label lblOperator;
    
    @FXML
    private Label resultNumLbl;
    
    private String selectedOperator = "";

    @FXML
    protected void onPlusClick() {
        selectedOperator = "+";
        lblOperator.setText("+");
    }
    
    @FXML
    protected void onMinusClick() {
        selectedOperator = "-";
        lblOperator.setText("-");
    }
    
    @FXML
    protected void onMultiplyClick() {
        selectedOperator = "*";
        lblOperator.setText("×");
    }
    
    @FXML
    protected void onDivideClick() {
        selectedOperator = "/";
        lblOperator.setText("÷");
    }
    
    @FXML
    protected void onCalculateClick() {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double result = 0;
            
            switch (selectedOperator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultNumLbl.setText("Nelze dělit nulou!");
                        return;
                    }
                    break;
                default:
                    resultNumLbl.setText("Vyberte operátor!");
                    return;
            }
            
            resultNumLbl.setText(String.format("%.2f", result));
            
        } catch (NumberFormatException e) {
            resultNumLbl.setText("Neplatné číslo!");
        }
    }
}
