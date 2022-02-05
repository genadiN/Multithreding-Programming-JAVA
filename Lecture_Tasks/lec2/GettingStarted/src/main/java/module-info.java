
module com.example.gettingstarted {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.gettingstarted to javafx.fxml;
    exports com.example.gettingstarted;
}