package view4ProblemLab8;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CipherSceneController {

    private Alert mbox;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtSeed;

    @FXML
    private TextField txtSize;

    @FXML
    private Button btnGenerateAll;

    @FXML
    private Button btnGenerateSubset;

    @FXML
    private Button btnQuit;

    @FXML
    void btnGenerateAllOnAction(ActionEvent event) {
        mbox.setContentText(txtSize.getText());
        mbox.showAndWait();
    }

    @FXML
    void btnGenerateSubsetOnAction(ActionEvent event) {
        mbox.setContentText(txtSeed.getText());
        mbox.showAndWait();
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void initialize() {
        mbox = new Alert(Alert.AlertType.INFORMATION);

        assert txtSeed != null : "fx:id=\"txtSeed\" was not injected: check your FXML file 'CipherScene.fxml'.";
        assert txtSize != null : "fx:id=\"txtSize\" was not injected: check your FXML file 'CipherScene.fxml'.";
        assert btnGenerateAll != null : "fx:id=\"btnGenerateAll\" was not injected: check your FXML file 'CipherScene.fxml'.";
        assert btnGenerateSubset != null : "fx:id=\"btnGenerateSubset\" was not injected: check your FXML file 'CipherScene.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'CipherScene.fxml'.";

    }
}
