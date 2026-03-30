package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void swtichToScene(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (
                Exception ex) {
            System.out.println(ex);
        }
    }

    public void swtichToScene2(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (
                Exception ex) {
            System.out.println(ex);
        }
    }
}
