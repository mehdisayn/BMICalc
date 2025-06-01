module selfprojects.bmicalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens selfprojects.bmicalc to javafx.fxml;
    exports selfprojects.bmicalc;
}