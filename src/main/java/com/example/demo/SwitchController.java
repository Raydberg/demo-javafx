package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void swtichToScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/views/switch/scene1.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void swtichToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/views/switch/scene2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
