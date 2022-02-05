module com.example.homwork2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.homwork2 to javafx.fxml;
    exports com.example.homwork2;
}