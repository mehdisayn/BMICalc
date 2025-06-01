package selfprojects.bmicalc;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMICalcController
{
    @javafx.fxml.FXML
    private TextField heightTextField;
    @javafx.fxml.FXML
    private TextField weightTextField;
    @javafx.fxml.FXML
    private Label resultLabel;
    @javafx.fxml.FXML
    private Label feetResultLabel;
    @javafx.fxml.FXML
    private TextField feetTextField;
    @javafx.fxml.FXML
    private Button getButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void findButtonOnClick(ActionEvent actionEvent) {
        String heightStr = heightTextField.getText();
        String weightStr = weightTextField.getText();

        double heightVal = Double.parseDouble(heightStr);
        double weightVal = Double.parseDouble(weightStr);

        double sum = weightVal / Math.pow(heightVal, 2);

        String sumStr = Double.toString(sum);

        resultLabel.setText(" Your BMI: " + sumStr);

    }

    @Deprecated
    public void getButtonClick(ActionEvent actionEvent) {
        String feetStr = feetTextField.getText();
        double feetVal = Double.parseDouble(feetStr);
        double feetSum = feetVal * 0.3048;
        String feetSumStr = Double.toString(feetSum);
        feetResultLabel.setText(feetSumStr);
        getButton.setText("Copy");

    }

    @javafx.fxml.FXML
    public void enterKeyPress(Event event) {
    }

}