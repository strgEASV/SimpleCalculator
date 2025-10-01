module dk.easv.simplecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.simplecalculator to javafx.fxml;
    exports dk.easv.simplecalculator;
}