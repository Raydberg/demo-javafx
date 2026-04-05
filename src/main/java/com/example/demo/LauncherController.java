package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class LauncherController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Double age;

    public void swtichToLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/views/auth/login-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void swtichToSwitchPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/views/switch/scene1.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
